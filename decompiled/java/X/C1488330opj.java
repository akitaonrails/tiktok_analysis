package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: X.0opj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488330opj {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(C1488350opl c1488350opl, Map map, C1488470opx c1488470opx) {
        Object c098200Yq;
        C1488320opi c1488320opi = new C1488320opi(c1488350opl, map, c1488470opx);
        while (true) {
            try {
                int i = c1488320opi.LIZLLL;
                C1489750os1 c1489750os1 = c1488320opi.LIZ.LIZ;
                if (i >= c1489750os1.LIZIZ) {
                    break;
                }
                c1488320opi.LIZLLL = i + 1;
                c1488320opi.LJIJI(c1489750os1.LIZIZ(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        if (c1488320opi.LJ.LIZ.size() == 1) {
            ArrayList<Object> arrayList = c1488320opi.LJ.LIZ;
            c098200Yq = arrayList.remove(arrayList.size() - 1);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                return null;
            }
            return c098200Yq;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execute end, but stack size is not 1: ");
        sbLIZ.append(c1488320opi.LJ.LIZ.size());
        throw new C1488370opn("eval_invalid_stack", C2188811AlT.LIZIZ(sbLIZ));
    }
}
