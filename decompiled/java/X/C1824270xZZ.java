package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingConfigFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824270xZZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingConfigFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824270xZZ(PcsOnboardingConfigFragment pcsOnboardingConfigFragment) {
        super(0);
        this.LL = pcsOnboardingConfigFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.AT("create_now");
        this.LL.JS().LLJJIJIIJIL = "recommended";
        String showEntrance = this.LL.JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(this.LL.JS().EQ2())));
        C1824200xZS.LJII("click", showEntrance, this.LL.JS().LQ2(), this.LL.JS().LLJJIJIIJIL, zLJJJI ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(this.LL.JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(this.LL.JS().EQ2()))) ? 1 : 0, "create_now");
        if (this.LL.JS().wQ2(this.LL.JS().LLILZLL + 1 == 1)) {
            this.LL.gT();
        } else {
            this.LL.hT();
            this.LL.DT();
        }
        return Unit.LIZ;
    }
}
