package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.AbsABValueOptimizer;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0CAW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CAW extends AbsABValueOptimizer {
    public static final C0CAW LJII = new C0CAW();

    @Override // com.ss.android.ugc.aweme.ab.AbsABValueOptimizer
    public final String LIZIZ() {
        return "frist_brush";
    }

    @Override // com.ss.android.ugc.aweme.ab.AbsABValueOptimizer
    public final boolean LIZJ() {
        return ((Boolean) C274300Ap2.LIZJ.getValue()).booleanValue();
    }

    public final void LJII() {
        Object c098200Yq;
        try {
            Iterator<AbsABValueOptimizer.ABInfo> it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                C0C5A.LIZJ().LJI(it2.next().key);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m8isSuccessimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
