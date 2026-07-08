package X;

import android.os.Build;

/* JADX INFO: renamed from: X.06Qz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1607106Qz {
    public static final int LIZ(C19EG c19eg) {
        int iLIZ;
        int iLIZJ;
        if (Build.VERSION.SDK_INT >= 35) {
            iLIZ = C497820Jfg.LIZ(c19eg) - C497820Jfg.LIZJ(c19eg);
            iLIZJ = C1710306mr.LIZ(c19eg);
        } else {
            if (C14KI.LJ(c19eg) > 0) {
                return C497820Jfg.LIZ(c19eg);
            }
            iLIZ = C497820Jfg.LIZ(c19eg);
            iLIZJ = C497820Jfg.LIZJ(c19eg);
        }
        return iLIZ - iLIZJ;
    }
}
