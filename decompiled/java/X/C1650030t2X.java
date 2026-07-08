package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS266S0000000_25;
import lnn.q;

/* JADX INFO: renamed from: X.0t2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1650030t2X extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    public final q LLILZLL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        try {
            this.LLILZLL.ez2();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P0;
    }

    public C1650030t2X(C1DRG c1drg) {
        LJ(AFwS266S0000000_25.get$arr$(452));
        this.LLILZLL = (q) c1drg.LJII(q.class, null);
    }

    public C1650030t2X(q qVar) {
        LJ(AFwS266S0000000_25.get$arr$(452));
        this.LLILZLL = qVar;
    }
}
