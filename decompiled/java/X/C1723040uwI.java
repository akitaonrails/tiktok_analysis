package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723040uwI {
    public static final int LIZ(int i, String str) {
        int iN3;
        if (str != null && str.length() != 0) {
            try {
                iN3 = C786410Ut5.n3(C20642515q3.LJFF(), str, "raw", C20642515q3.LIZ().getPackageName());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (iN3 != 0) {
                return iN3;
            }
            return i;
        }
        return i;
    }
}
