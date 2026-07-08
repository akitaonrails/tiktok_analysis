package X;

import android.app.Notification;
import android.content.LocusId;

/* JADX INFO: renamed from: X.0Vve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813480Vve {
    public static Notification.Builder LIZ(Notification.Builder builder, boolean z) {
        return builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static Notification.Builder LIZIZ(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        return builder.setBubbleMetadata(bubbleMetadata);
    }

    public static Notification.Action.Builder LIZJ(Notification.Action.Builder builder, boolean z) {
        return builder.setContextual(z);
    }

    public static Notification.Builder LIZLLL(Notification.Builder builder, Object obj) {
        return builder.setLocusId((LocusId) obj);
    }
}
