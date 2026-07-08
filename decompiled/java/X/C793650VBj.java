package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793650VBj {
    public volatile boolean LIZ;
    public C0VSJ LIZIZ;

    public final synchronized void LIZ() {
        C0VSJ c0vsj;
        if (this.LIZ) {
            return;
        }
        try {
            c0vsj = new C0VSJ(C793630VBh.LIZLLL(), "header");
            this.LIZIZ = c0vsj;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("header store init error ");
            sbLIZ.append(th.toString());
            C792910V8n.LIZIZ("APM", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c0vsj.exists()) {
            this.LIZ = true;
            return;
        } else {
            this.LIZIZ.mkdirs();
            this.LIZ = true;
            return;
        }
    }
}
