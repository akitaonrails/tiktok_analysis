package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0Vvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813520Vvi {
    public static Notification.Action LIZLLL(Notification.Action.Builder builder) {
        return builder.build();
    }

    public static String LJFF(Notification notification) {
        return notification.getGroup();
    }

    public static Notification.Builder LIZ(Notification.Builder builder, Notification.Action action) {
        return builder.addAction(action);
    }

    public static Notification.Action.Builder LIZIZ(Notification.Action.Builder builder, Bundle bundle) {
        return builder.addExtras(bundle);
    }

    public static Notification.Action.Builder LIZJ(Notification.Action.Builder builder, RemoteInput remoteInput) {
        return builder.addRemoteInput(remoteInput);
    }

    public static Notification.Builder LJI(Notification.Builder builder, String str) {
        return builder.setGroup(str);
    }

    public static Notification.Builder LJII(Notification.Builder builder, boolean z) {
        return builder.setGroupSummary(z);
    }

    public static Notification.Builder LJIIIIZZ(Notification.Builder builder, boolean z) {
        return builder.setLocalOnly(z);
    }

    public static Notification.Builder LJIIIZ(Notification.Builder builder, String str) {
        return builder.setSortKey(str);
    }

    public static Notification.Action.Builder LJ(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        return new Notification.Action.Builder(i, charSequence, pendingIntent);
    }
}
