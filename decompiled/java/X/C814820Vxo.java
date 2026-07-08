package X;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: renamed from: X.0Vxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C814820Vxo {
    public static Notification.MessagingStyle LIZ(Person person) {
        return new Notification.MessagingStyle(person);
    }

    public static Notification.MessagingStyle LIZIZ(Notification.MessagingStyle messagingStyle, boolean z) {
        return messagingStyle.setGroupConversation(z);
    }
}
