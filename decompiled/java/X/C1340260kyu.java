package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0kyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340260kyu {
    public static int LIZ(View view) {
        return C0HD5.LIZ(view, 8);
    }

    public static Pair LIZIZ(int i, int i2, View view) {
        int i3;
        if (view != null && i != 0 && i2 != 0) {
            int iLIZ = C0HD5.LIZ(view, 112);
            int iLIZ2 = C0HD5.LIZ(view, 150);
            float f = iLIZ;
            float f2 = iLIZ2;
            float f3 = f / f2;
            float f4 = f2 / f;
            float f5 = i / i2;
            if (f5 < f3) {
                i3 = iLIZ2;
            } else if (f3 <= f5 && f5 <= f4) {
                if (i < i2) {
                    i3 = (int) (f / f5);
                } else {
                    i3 = iLIZ;
                    iLIZ = (int) (f * f5);
                }
            } else {
                i3 = iLIZ;
                iLIZ = iLIZ2;
            }
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C277060AtU.LIZ.getValue()).intValue())));
            if (iLIZIZ > 0) {
                iLIZ = (int) (iLIZIZ * (iLIZ / i3));
                i3 = iLIZIZ;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZ;
                layoutParams.height = LIZ(view) + i3;
            }
            return new Pair(Integer.valueOf(iLIZ), Integer.valueOf(i3));
        }
        return new Pair(-1, -1);
    }
}
