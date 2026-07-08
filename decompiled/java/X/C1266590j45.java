package X;

import Y.ARunnableS120S0100000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0j45, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266590j45 implements InterfaceC1267040j4o {
    public final /* synthetic */ C1266350j3h LIZ;

    public C1266590j45(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    public final void LIZ(C1266600j46 c1266600j46) {
        synchronized (this.LIZ.LLLIL) {
            try {
                this.LIZ.LLLILZ.remove(c1266600j46);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1283100jUi.LIZIZ(this.LIZ.LL, new ARunnableS120S0100000_20(this, c1266600j46, 375));
    }
}
