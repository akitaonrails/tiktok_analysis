package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AWZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AWZ extends C09AY implements Function0<C1AYR> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AWZ(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1AYR invoke() {
        if (Intrinsics.LJFF(this.LL.LL.LIZLLL, "live_voice")) {
            C1AXM c1axm = this.LL;
            AtomicBoolean atomicBoolean = c1axm.LLJJJIL;
            C2177031AIb c2177031AIb = c1axm.LL;
            return new C1AYX(atomicBoolean, c2177031AIb.LJIIIIZZ, c2177031AIb.LIZ, c1axm.LJJLL(), this.LL.LJLJI(), this.LL.LL.LIZIZ);
        }
        if (this.LL.LL.LIZIZ == 4 && LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting.INSTANCE.enable()) {
            C1AXM c1axm2 = this.LL;
            AtomicBoolean atomicBoolean2 = c1axm2.LLJJJIL;
            C2177031AIb c2177031AIb2 = c1axm2.LL;
            return new C1AYX(atomicBoolean2, c2177031AIb2.LJIIIIZZ, c2177031AIb2.LIZ, c1axm2.LJJLL(), this.LL.LJLJI(), this.LL.LL.LIZIZ);
        }
        C1AXM c1axm3 = this.LL;
        AtomicBoolean atomicBoolean3 = c1axm3.LLJJJIL;
        C2177031AIb c2177031AIb3 = c1axm3.LL;
        return new C1AYR(atomicBoolean3, c2177031AIb3.LJIIIIZZ, c2177031AIb3.LIZ, c1axm3.LJJLL(), this.LL.LJLJI(), this.LL.LL.LIZIZ);
    }
}
