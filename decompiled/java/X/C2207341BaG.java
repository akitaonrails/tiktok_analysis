package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1BaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207341BaG {
    /* JADX WARN: Type inference failed for: r0v16, types: [X.1BaM, X.1BaV] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1BaM, X.1BaV] */
    public static Object LIZ(C2207331BaF c2207331BaF) {
        boolean z;
        ?? r0;
        C2207431BaP c2207431BaPLIZIZ = C2207431BaP.LIZIZ();
        ?? r1 = c2207431BaPLIZIZ.LIZ;
        if ((r1 == 0 || !r1.LIZJ(c2207331BaF.LL)) && !c2207431BaPLIZIZ.LIZIZ.LIZJ(c2207331BaF.LL)) {
            z = false;
        } else {
            z = true;
        }
        Object objLIZ = null;
        if (z) {
            if (!c2207331BaF.LLILZLL) {
                C2207451BaR c2207451BaRLIZJ = C2207431BaP.LIZIZ().LIZJ(c2207331BaF);
                if (c2207451BaRLIZJ != null && (r0 = c2207451BaRLIZJ.LIZIZ) != 0) {
                    objLIZ = r0.LIZ(c2207451BaRLIZJ);
                }
            } else {
                objLIZ = C2207431BaP.LIZIZ().LIZ(c2207331BaF);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("not support this capability!");
            sbLIZ.append(c2207331BaF.LL);
            C2188811AlT.LIZIZ(sbLIZ);
            C2207231Ba5.LIZ(5);
        }
        C2207311BaD c2207311BaD = C2207281BaA.LIZ;
        c2207311BaD.getClass();
        C2207231Ba5.LIZ(3);
        c2207311BaD.LIZIZ.lock();
        try {
            c2207311BaD.LJ.remove(c2207331BaF);
            ((HashMap) c2207311BaD.LIZJ).remove(c2207331BaF.LL);
            c2207311BaD.LIZIZ.unlock();
            return objLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2207311BaD.LIZIZ.unlock();
            throw th;
        }
    }
}
