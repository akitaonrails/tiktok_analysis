package X;

import android.app.Notification;
import android.net.Uri;

/* JADX INFO: renamed from: X.0Vxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C814810Vxn {
    public static Notification.MessagingStyle.Message LIZ(CharSequence charSequence, long j, CharSequence charSequence2) {
        return new Notification.MessagingStyle.Message(charSequence, j, charSequence2);
    }

    public static Notification.MessagingStyle.Message LIZIZ(Notification.MessagingStyle.Message message, String str, Uri uri) {
        return message.setData(str, uri);
    }
}
