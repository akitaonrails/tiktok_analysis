package X;

import android.view.View;

/* JADX INFO: renamed from: X.0Gpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427740Gpw {
    public static final int LIZ(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                return size;
            }
            return i2;
        }
        return Math.min(size, i2);
    }
}
