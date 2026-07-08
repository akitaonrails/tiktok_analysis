package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpOptConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700260uLY implements InterfaceC1755080vly {
    public final List<AbstractC1700220uLU> LIZ = new ArrayList();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(5));
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC1755080vly
    public final void LIZ() {
        this.LIZJ = true;
    }

    @Override // X.InterfaceC1755080vly
    public final void LIZIZ(AbstractC1700300uLc abstractC1700300uLc) {
    }

    @Override // X.InterfaceC1755080vly
    public final void LIZJ(Function0<Unit> function0) {
    }

    public final void LIZLLL(AbstractC1700220uLU abstractC1700220uLU) {
        if (((PdpOptConfig) C1700310uLd.LIZIZ.getValue()).lazyShowAfterRender && !this.LIZLLL) {
            synchronized (this) {
                try {
                    ((ArrayList) this.LIZ).add(abstractC1700220uLU);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        abstractC1700220uLU.LIZ();
    }
}
