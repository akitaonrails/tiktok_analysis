package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.0LdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547350LdN {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z) {
        C547360LdO.LIZ.getClass();
        if (!z && C547360LdO.LIZIZ) {
            return;
        }
        synchronized (C547360LdO.LIZLLL) {
            try {
                if (C547360LdO.LIZJ) {
                    return;
                }
                if (!z && C547360LdO.LIZIZ) {
                    return;
                }
                C547360LdO.LIZJ = true;
                try {
                    C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ensureRegistered: ");
                    sbLIZ.append(z);
                    c547140Ld2.LIZJ("AIGCConfigRegistrarResolver", C2188811AlT.LIZIZ(sbLIZ));
                    C547360LdO.LIZ();
                    C547360LdO.LIZJ = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C547360LdO.LIZJ = false;
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static Object LIZIZ(Object obj, String str, Object obj2) {
        LIZ(false);
        if (((List) C299350BoL.LIZIZ.getValue()).contains(str) || obj == null) {
            return obj2;
        }
        return obj;
    }
}
