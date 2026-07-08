package X;

import android.app.Notification;
import android.media.AudioAttributes;
import android.net.Uri;

/* JADX INFO: renamed from: X.0Vvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813450Vvb {
    public static Notification.Builder LIZ(Notification.Builder builder, String str) {
        return builder.addPerson(str);
    }

    public static Notification.Builder LIZIZ(Notification.Builder builder, String str) {
        return builder.setCategory(str);
    }

    public static Notification.Builder LIZJ(Notification.Builder builder, int i) {
        return builder.setColor(i);
    }

    public static Notification.Builder LIZLLL(Notification.Builder builder, Notification notification) {
        return builder.setPublicVersion(notification);
    }

    public static Notification.Builder LJFF(Notification.Builder builder, int i) {
        return builder.setVisibility(i);
    }

    public static Notification.Builder LJ(Notification.Builder builder, Uri uri, Object obj) {
        return builder.setSound(uri, (AudioAttributes) obj);
    }
}
