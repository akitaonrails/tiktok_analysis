package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import jv6.a;

/* JADX INFO: renamed from: X.08EI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EI {
    public static C08EJ LIZ(C1BLC c1blc) {
        C08EJ c08ej;
        Object c098200Yq;
        new C08EJ(false, "verifier not executed");
        int i = 0;
        do {
            if (!c1blc.LJ()) {
                c08ej = new C08EJ(false, "task.isInstalled=false");
            } else if (c1blc instanceof C1BLX) {
                c08ej = new C08EJ(true, "language split installed");
            } else if (c1blc instanceof C1BLP) {
                C08EG c08eg = C08EG.LIZ;
                String str = c1blc.LIZ;
                c08eg.getClass();
                try {
                    c098200Yq = C08EG.LIZJ(C08EG.LIZ(str));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("load metadata failed for ");
                    sbLIZ.append(str);
                    sbLIZ.append(": ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
                    sbLIZ.append(": ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    c098200Yq = new C08EJ(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                c08ej = (C08EJ) c098200Yq;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("skip verification for ");
                sbLIZ2.append(c1blc.getClass().getSimpleName());
                c08ej = new C08EJ(true, C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (c08ej.LIZ) {
                return c08ej;
            }
            if (i >= 4) {
                break;
            }
            a.install(C08EH.LIZ());
            try {
                Thread.sleep(200L);
                i++;
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                C786410Ut5.u3().interrupt();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("verify interrupted. package=");
                sbLIZ3.append(c1blc.LIZIZ);
                sbLIZ3.append(" module=");
                sbLIZ3.append(c1blc.LIZ);
                return new C08EJ(false, C2188811AlT.LIZIZ(sbLIZ3));
            }
        } while (i < 5);
        return c08ej;
    }
}
