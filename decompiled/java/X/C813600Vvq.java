package X;

import android.app.Notification;

/* JADX INFO: renamed from: X.0Vvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813600Vvq {
    public static Notification.Action.Builder LIZ(Notification.Action.Builder builder, boolean z) {
        return builder.setAuthenticationRequired(z);
    }

    public static Notification.Builder LIZIZ(Notification.Builder builder, int i) {
        return builder.setForegroundServiceBehavior(i);
    }
}
