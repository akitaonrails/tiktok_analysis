package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.150U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150U {
    public final C150V LIZ() {
        C150V c150v = C150V.LIZJ;
        if (c150v == null) {
            synchronized (this) {
                try {
                    c150v = C150V.LIZJ;
                    if (c150v == null) {
                        c150v = new C150V();
                        C150V.LIZJ = c150v;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c150v;
    }
}
