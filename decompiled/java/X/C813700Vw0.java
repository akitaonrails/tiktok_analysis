package X;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: X.0Vw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C813700Vw0 {
    public static void LIZ(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    public static void LIZIZ(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    public static void LIZJ(Notification.BigPictureStyle bigPictureStyle, boolean z) {
        bigPictureStyle.showBigPictureWhenCollapsed(z);
    }
}
