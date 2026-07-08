package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247810iZn {
    public static Boolean LIZ;
    public static Integer LIZIZ;
    public static Integer LIZJ;

    public static boolean LIZIZ(Context context) {
        if (LIZ == null && context != null) {
            LIZ = Boolean.valueOf(C14KI.LJI(context));
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSmallScreen:");
        sbLIZ.append(LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        return Intrinsics.LJFF(LIZ, Boolean.TRUE);
    }

    public static int LIZ(int i, int i2, Context context) {
        int iLIZIZ;
        int iLIZIZ2;
        if (LIZJ == null) {
            LIZJ = Integer.valueOf(C14KQ.LJIIIIZZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(152)));
        }
        Integer num = LIZJ;
        if (num != null) {
            iLIZIZ = num.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
        }
        int iLIZIZ3 = iLIZIZ - (i * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        if (i2 >= 2 && (iLIZIZ3 = iLIZIZ3 / 2) > (iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(150)))) {
            return iLIZIZ2;
        }
        return iLIZIZ3;
    }
}
