package X;

import android.graphics.Rect;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0SL5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SL5 {
    public static final boolean LIZ(C0SL3 c0sl3) {
        Rect rect;
        if (c0sl3.LIZ == ImageView.ScaleType.FIT_CENTER && (rect = c0sl3.LJ) != null && rect.height() < c0sl3.LIZJ) {
            return true;
        }
        return false;
    }

    public static final Rect LIZIZ(int i, Rect rect) {
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        int i6 = i5 - i;
        if (i3 < i6) {
            i5 = i6;
        }
        return new Rect(i2, i3, i4, i5);
    }

    public static final Rect LIZJ(int i, Rect rect) {
        return new Rect(rect.left, rect.top - i, rect.right, rect.bottom - i);
    }
}
