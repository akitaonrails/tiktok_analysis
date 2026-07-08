package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180661AWa extends C09AY implements Function0<C2180891AWx> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2180661AWa(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C2180891AWx invoke() {
        C2180891AWx c2180891AWx;
        if (Intrinsics.LJFF(this.LL.LL.LIZLLL, "live_voice")) {
            C1AXO c1axoLJLJJLL = this.LL.LJLJJLL();
            C1AYR c1ayrLJJLIIJ = this.LL.LJJLIIJ();
            C1AXM c1axm = this.LL;
            C2177031AIb c2177031AIb = c1axm.LL;
            return new C2180901AWy(c1axoLJLJJLL, c1ayrLJJLIIJ, c2177031AIb.LIZ, c2177031AIb.LJFF, c2177031AIb.LIZLLL, c1axm.LLLLIIIILLL, c1axm.LLLJ);
        }
        if (this.LL.LL.LIZIZ == 4 && LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting.INSTANCE.enable()) {
            C1AXO c1axoLJLJJLL2 = this.LL.LJLJJLL();
            C1AYR c1ayrLJJLIIJ2 = this.LL.LJJLIIJ();
            C1AXM c1axm2 = this.LL;
            C2177031AIb c2177031AIb2 = c1axm2.LL;
            c2180891AWx = new C2180901AWy(c1axoLJLJJLL2, c1ayrLJJLIIJ2, c2177031AIb2.LIZ, c2177031AIb2.LJFF, c2177031AIb2.LIZLLL, c1axm2.LLLLIIIILLL, c1axm2.LLLJ);
        } else {
            C1AXO c1axoLJLJJLL3 = this.LL.LJLJJLL();
            C1AYR c1ayrLJJLIIJ3 = this.LL.LJJLIIJ();
            C1AXM c1axm3 = this.LL;
            C2177031AIb c2177031AIb3 = c1axm3.LL;
            c2180891AWx = new C2180891AWx(c1axoLJLJJLL3, c1ayrLJJLIIJ3, c2177031AIb3.LIZ, c2177031AIb3.LJFF, c2177031AIb3.LIZLLL, c1axm3.LLLLIIIILLL, c1axm3.LLLJ);
        }
        c2180891AWx.setId(R.id.ysl);
        return c2180891AWx;
    }
}
