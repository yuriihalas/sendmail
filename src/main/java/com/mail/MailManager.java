package com.mail;

import javax.mail.Session;
import java.util.Properties;

public class MailManager {
    public static void main(String[] args) {
        String emailReceiver = "galasayra123213@gmail.com";
        Properties props = new Properties();
        props.put("mail.smtp.host", "localhost"); //SMTP Host
        Session session = Session.getInstance(props);

        MailUtil.sendEmail(session, emailReceiver, "Final battle", "Hello form Mr.Nobody");
    }
}
