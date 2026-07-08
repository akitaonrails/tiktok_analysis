package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0INu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465640INu {
    public static int LIZ(Context context) {
        if (context == null) {
            return 0;
        }
        int iLJIIJ = C12ES.LJIIJ(context);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
        if (iLJIIIIZZ >= iLJIIJ) {
            return iLJIIIIZZ;
        }
        return iLJIIJ;
    }

    public static int LIZIZ(Context context) {
        if (context == null) {
            return 0;
        }
        int iLJIIJ = C12ES.LJIIJ(context);
        int iLJIIIIZZ = C12ES.LJIIIIZZ(context);
        if (iLJIIIIZZ <= iLJIIJ) {
            return iLJIIIIZZ;
        }
        return iLJIIJ;
    }

    public static int LIZJ(float f, Context context) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
