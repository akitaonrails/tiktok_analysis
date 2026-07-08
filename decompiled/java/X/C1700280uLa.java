package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.PdpOptConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uLa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700280uLa implements InterfaceC1755080vly {
    public static final /* synthetic */ int LJ = 0;
    public final List<AbstractC1700300uLc> LIZ = new ArrayList();
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(445));
    public boolean LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC1755080vly
    public final void LIZ() {
        this.LIZLLL = true;
    }

    @Override // X.InterfaceC1755080vly
    public final void LIZIZ(AbstractC1700300uLc abstractC1700300uLc) {
        if (!this.LIZJ && ((PdpOptConfig) C1700310uLd.LIZIZ.getValue()).lazyShowAfterRender) {
            synchronized (this) {
                try {
                    ((ArrayList) this.LIZ).add(abstractC1700300uLc);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        abstractC1700300uLc.LIZ();
    }

    @Override // X.InterfaceC1755080vly
    public final void LIZJ(final Function0<Unit> function0) {
        LIZIZ(new AbstractC1700300uLc() { // from class: X.0uLb
            @Override // X.AbstractC1700300uLc
            public final void LIZ() {
                function0.invoke();
            }
        });
    }
}
