package X;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0VwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813810VwB {
    public static List<StatusBarNotification> LIZ(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        if (activeNotifications == null) {
            return new ArrayList();
        }
        return Arrays.asList(activeNotifications);
    }

    public static int LIZIZ(NotificationManager notificationManager) {
        return notificationManager.getCurrentInterruptionFilter();
    }
}
