package X;

import android.app.NotificationChannel;

/* JADX INFO: renamed from: X.0VrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810780VrI {
    public static String LIZ(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static String LIZIZ(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static boolean LIZJ(NotificationChannel notificationChannel) {
        return notificationChannel.isImportantConversation();
    }

    public static void LIZLLL(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }
}
