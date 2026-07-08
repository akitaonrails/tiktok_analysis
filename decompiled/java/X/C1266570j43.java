package X;

import Y.ARunnableS89S0200000_20;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0j43, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1266570j43 implements InterfaceC1267050j4p {
    public final /* synthetic */ C1266350j3h LIZ;

    public C1266570j43(C1266350j3h c1266350j3h) {
        this.LIZ = c1266350j3h;
    }

    public final void LIZ(C1266560j42 c1266560j42) {
        synchronized (this.LIZ.LLLIL) {
            try {
                this.LIZ.LLLILZJ.remove(c1266560j42);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZ.LLILZLL.LIZ.mPushBase.getClass();
        C1283100jUi.LIZIZ(this.LIZ.LL, new ARunnableS89S0200000_20(this, c1266560j42, 218));
    }
}
