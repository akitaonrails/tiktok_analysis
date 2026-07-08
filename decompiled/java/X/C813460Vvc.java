package X;

import android.app.Notification;
import android.content.Context;

/* JADX INFO: renamed from: X.0Vvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813460Vvc {
    public static Notification.Builder LIZ(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder LIZIZ(Notification.Builder builder, int i) {
        return builder.setBadgeIconType(i);
    }

    public static Notification.Builder LIZJ(Notification.Builder builder, boolean z) {
        return builder.setColorized(z);
    }

    public static Notification.Builder LIZLLL(Notification.Builder builder, int i) {
        return builder.setGroupAlertBehavior(i);
    }

    public static Notification.Builder LJ(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder LJFF(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder LJI(Notification.Builder builder, long j) {
        return builder.setTimeoutAfter(j);
    }
}
