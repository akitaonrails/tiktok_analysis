package X;

import android.view.View;

/* JADX INFO: renamed from: X.0ETu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365280ETu {
    public static final boolean LIZ(int i, int i2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (i < i3 || i > i3 + width || i2 < i4 || i2 > i4 + height) {
            return false;
        }
        return true;
    }
}
