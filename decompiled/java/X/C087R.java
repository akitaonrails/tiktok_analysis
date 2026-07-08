package X;

import Y.ACallableS12S0010000_3;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.087R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C087R {
    public static final C087R LIZ = new C087R();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1626));
    public static final Object LIZJ = new Object();

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZJ() {
        synchronized (LIZJ) {
            try {
                C15O7.LIZIZ(new ACallableS12S0010000_3(1), C823050WQl.LIZLLL(), null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean LIZIZ(String str) {
        boolean z;
        if (str == null) {
            return true;
        }
        synchronized (LIZJ) {
            try {
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(curUserId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                LIZ.getClass();
                Keva kevaLIZ = LIZ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("cm_cache_dirty_");
                sbLIZ2.append(strLIZIZ);
                z = kevaLIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public static void LIZLLL(String str) {
        synchronized (LIZJ) {
            if (str != null) {
                try {
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append('_');
                    sbLIZ.append(curUserId);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    LIZ.getClass();
                    Keva kevaLIZ = LIZ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cm_cache_dirty_");
                    sbLIZ2.append(strLIZIZ);
                    kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), false);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
