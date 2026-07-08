package X;

import android.content.Context;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0T48, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T48 {
    public static Pair LIZ(Context context, boolean z) {
        int iLIZIZ;
        if (z) {
            iLIZIZ = (int) (((double) ((C1389340mG4.LIZJ(context, null).LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2))) / 2.3d);
        } else {
            iLIZIZ = ((C1389340mG4.LIZJ(context, null).LIZIZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) / 2;
        }
        return new Pair(Integer.valueOf(iLIZIZ), Integer.valueOf((int) (iLIZIZ * 1.3333334f)));
    }
}
