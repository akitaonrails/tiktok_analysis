package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: X.0Vvf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813490Vvf {
    public static Notification.Builder LIZIZ(Notification.Builder builder, Icon icon) {
        return builder.setLargeIcon(icon);
    }

    public static Notification.Builder LIZJ(Notification.Builder builder, Object obj) {
        return builder.setSmallIcon((Icon) obj);
    }

    public static Notification.Action.Builder LIZ(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }
}
