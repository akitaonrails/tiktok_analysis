package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingContinueFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824280xZa extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingContinueFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824280xZa(PcsOnboardingContinueFragment pcsOnboardingContinueFragment) {
        super(0);
        this.LL = pcsOnboardingContinueFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PcsOnboardingContinueFragment pcsOnboardingContinueFragment = this.LL;
        pcsOnboardingContinueFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingContinuationPage click click_position=");
        sbLIZ.append("continue_to_set");
        sbLIZ.append(", show_entrance=");
        String showEntrance = pcsOnboardingContinueFragment.JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1824200xZS.LJI("click", this.LL.JS().DQ2().getShowEntrance(), "continue_to_set");
        C510160Jza c510160JzaES = this.LL.ES();
        if (c510160JzaES != null) {
            c510160JzaES.LIZJ();
        }
        this.LL.FT();
        return Unit.LIZ;
    }
}
