package X;

import android.app.Notification;

/* JADX INFO: renamed from: X.0Vxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C814790Vxl {
    public static Notification.MessagingStyle LIZIZ(CharSequence charSequence) {
        return new Notification.MessagingStyle(charSequence);
    }

    public static Notification.MessagingStyle LIZ(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static Notification.MessagingStyle LIZJ(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }
}
