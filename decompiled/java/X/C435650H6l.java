package X;

import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0H6l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435650H6l {
    public static ViewGroup.MarginLayoutParams LIZ(int i, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 4) != 0) {
            i3 = 0;
        }
        if ((i6 & 16) != 0) {
            i4 = 0;
        }
        if ((i6 & 32) != 0) {
            i5 = 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i, i2);
        marginLayoutParams.setMarginStart(i3);
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        if (i4 != 0) {
            marginLayoutParams.setMarginStart(i4);
        }
        if (i5 != 0) {
            marginLayoutParams.topMargin = i5;
        }
        return marginLayoutParams;
    }
}
