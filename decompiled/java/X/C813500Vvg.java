package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

/* JADX INFO: renamed from: X.0Vvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813500Vvg {
    public static Parcelable LIZ(Icon icon) {
        return icon;
    }

    public static void LIZJ(Notification.Builder builder, Icon icon) {
        builder.setLargeIcon(icon);
    }

    public static Notification.Action.Builder LIZIZ(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(icon, charSequence, pendingIntent);
    }
}
