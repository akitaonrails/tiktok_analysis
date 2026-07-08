package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingConfigFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xZY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824260xZY extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingConfigFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824260xZY(PcsOnboardingConfigFragment pcsOnboardingConfigFragment) {
        super(0);
        this.LL = pcsOnboardingConfigFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.AT("customised_showcase");
        this.LL.JS().LLJJIJIIJIL = "custom";
        String showEntrance = this.LL.JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(this.LL.JS().EQ2())));
        String strLQ2 = this.LL.JS().LQ2();
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(this.LL.JS().EQ2())));
        C1824200xZS.LJII("click", showEntrance, strLQ2, this.LL.JS().LLJJIJIIJIL, zLJJJI ? 1 : 0, zLJJJI2 ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(this.LL.JS().EQ2()))) ? 1 : 0, "customised_showcase");
        PcsOnboardingConfigFragment pcsOnboardingConfigFragment = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance2 = this.LL.JS().DQ2().getShowEntrance();
        if (showEntrance2 == null) {
            showEntrance2 = "";
        }
        sbLIZ.append(showEntrance2);
        pcsOnboardingConfigFragment.QS(R.id.pky, R.id.a2r, null, null, C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
