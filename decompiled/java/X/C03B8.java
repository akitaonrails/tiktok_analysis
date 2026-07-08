package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.03B8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03B8 {
    public static final void LIZ(Drawable drawable, C03B4 c03b4) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (drawable != null) {
            if (c03b4.LIZ != null) {
                intrinsicWidth = C0H9I.LIZ(r0.intValue());
            } else {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (c03b4.LIZIZ != null) {
                intrinsicHeight = C0H9I.LIZ(r0.intValue());
            } else {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }
}
