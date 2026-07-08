package X;

import android.app.Notification;
import android.widget.RemoteViews;

/* JADX INFO: renamed from: X.0Vvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813470Vvd {
    public static Notification.Action.Builder LIZ(Notification.Action.Builder builder, boolean z) {
        return builder.setAllowGeneratedReplies(z);
    }

    public static Notification.Builder LIZIZ(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    public static Notification.Builder LIZJ(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    public static Notification.Builder LIZLLL(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    public static Notification.Builder LJ(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
