package X;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.List;

/* JADX INFO: renamed from: X.0Vqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C810550Vqv {
    public static String LJI(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    public static String LJII(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static List<NotificationChannelGroup> LJIIIZ(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannelGroups();
    }

    public static List<NotificationChannel> LJIIJ(NotificationManager notificationManager) {
        return notificationManager.getNotificationChannels();
    }

    public static void LIZ(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void LIZIZ(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static void LIZJ(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static void LIZLLL(NotificationManager notificationManager, List<NotificationChannel> list) {
        notificationManager.createNotificationChannels(list);
    }

    public static void LJ(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void LJFF(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static NotificationChannel LJIIIIZZ(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannel(str);
    }
}
