package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509410pNj {
    public static String LIZ(C1510130pOt c1510130pOt) {
        boolean z;
        try {
            String strLIZLLL = c1510130pOt.LIZLLL("group_id");
            if (strLIZLLL != null) {
                if (strLIZLLL.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return strLIZLLL;
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static int LIZIZ(C1510130pOt c1510130pOt) {
        if (c1510130pOt != null && c1510130pOt.LIZ("duration") != null) {
            try {
                int iLIZIZ = c1510130pOt.LIZIZ("duration");
                if (1 <= iLIZIZ && iLIZIZ < 60000001) {
                    return iLIZIZ;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return 0;
    }
}
