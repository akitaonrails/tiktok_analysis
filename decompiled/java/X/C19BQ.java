package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.19BQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19BQ extends C19BO {
    public final /* synthetic */ C19BN LJIIJJI;

    public static final boolean LJFF(float f) {
        return f >= 1.0f;
    }

    @Override // X.C19BO
    public final void LIZIZ() {
    }

    @Override // X.C19BO
    public final void LIZJ() {
        this.LJIIJJI.LIZ();
    }

    @Override // X.C19BO
    public final void LIZ() {
        Object c098200Yq;
        try {
            super.LIZ();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19BN.LIZLLL.LJ(C13SZ.LIZIZ(thM5exceptionOrNullimpl));
        }
    }

    public C19BQ(C19BN c19bn) {
        this.LJIIJJI = c19bn;
    }
}
