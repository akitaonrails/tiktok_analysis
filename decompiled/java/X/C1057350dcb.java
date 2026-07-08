package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0dcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057350dcb {
    public static int LIZ(Context context) {
        double dLIZJ;
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        int iLJIILLIIL = C497740JfY.LJIILLIIL();
        if (context != null) {
            iLJIIZILJ = C418440Gaw.LIZLLL(context);
            iLJIILLIIL = C418440Gaw.LIZJ(context);
        }
        double d = iLJIIZILJ;
        double d2 = iLJIILLIIL;
        int iMax = (int) Math.max(d, d2);
        double dMin = ((int) Math.min(d, d2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(144));
        double d3 = ((double) iMax) * 0.5d;
        if (dMin < d3) {
            dLIZJ = C13LZ.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(660.0f))), dMin, d3);
        } else {
            dLIZJ = C13LZ.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(660.0f))), d3, dMin);
        }
        return (int) dLIZJ;
    }
}
