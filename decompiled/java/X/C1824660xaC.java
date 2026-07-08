package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingFormFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824660xaC extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingFormFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824660xaC(PcsOnboardingFormFragment pcsOnboardingFormFragment) {
        super(0);
        this.LL = pcsOnboardingFormFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PcsOnboardingFormFragment pcsOnboardingFormFragment = this.LL;
        if (pcsOnboardingFormFragment.LLLJ) {
            String showEntrance = pcsOnboardingFormFragment.JS().DQ2().getShowEntrance();
            Gson gson = C1822270xWL.LIZ;
            String strLIZLLL = C1822270xWL.LIZLLL(this.LL.LLLL, showEntrance, "aweme://roma_redirect/?spark_page=smb_lead_form_creation_halfscreen");
            PcsOnboardingFormFragment pcsOnboardingFormFragment2 = this.LL;
            pcsOnboardingFormFragment2.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnboardingFormIntroductionPage ");
            sbLIZ.append("click_set_up");
            sbLIZ.append(" current_step_index=");
            sbLIZ.append(pcsOnboardingFormFragment2.JS().LLJJ);
            sbLIZ.append(", current_step_type=");
            SMBOptInStep sMBOptInStep = pcsOnboardingFormFragment2.JS().LLJILLL;
            sbLIZ.append(pcsOnboardingFormFragment2.zT(sMBOptInStep != null ? sMBOptInStep.type : 0));
            C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            this.LL.vT("set");
            this.LL.LLLLIIIILLL.LIZLLL(strLIZLLL.hashCode(), showEntrance, C2097608Jq.LJ());
            PcsOnboardingFormFragment pcsOnboardingFormFragment3 = this.LL;
            pcsOnboardingFormFragment3.LLLLII = null;
            long j = pcsOnboardingFormFragment3.LLLL;
            C1824740xaK c1824740xaK = new C1824740xaK(pcsOnboardingFormFragment3);
            String strLIZLLL2 = C1822270xWL.LIZLLL(j, showEntrance, "aweme://roma_redirect/?spark_page=smb_lead_form_creation_halfscreen");
            Context contextLIZ = C176600m4.LIZ();
            if (contextLIZ != null) {
                if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledLynxPreload()) {
                    ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextLIZ, strLIZLLL2, new C1122230fJF(strLIZLLL2, c1824740xaK));
                } else {
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, strLIZLLL2);
                }
            }
        }
        return Unit.LIZ;
    }
}
