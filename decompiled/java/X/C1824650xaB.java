package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingWelcomeMessageFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824650xaB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingWelcomeMessageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824650xaB(PcsOnboardingWelcomeMessageFragment pcsOnboardingWelcomeMessageFragment) {
        super(0);
        this.LL = pcsOnboardingWelcomeMessageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String string = this.LL.getString(2131853165);
        String strAT = this.LL.AT();
        SMBOptInStep sMBOptInStep = this.LL.JS().LLJILLL;
        long j = sMBOptInStep != null ? sMBOptInStep.skuId : 0L;
        String showEntrance = this.LL.JS().DQ2().getShowEntrance();
        Gson gson = C1822270xWL.LIZ;
        String strLJII = C1822270xWL.LJII(this.LL.JS().LLJJI, string, strAT, j, showEntrance, "aweme://roma_redirect/?spark_page=smb_lynx_universal_component&page_type=welcome");
        PcsOnboardingWelcomeMessageFragment pcsOnboardingWelcomeMessageFragment = this.LL;
        pcsOnboardingWelcomeMessageFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingWelcomeMessageIntroductionPage ");
        sbLIZ.append("click_set_up");
        sbLIZ.append(" current_step_index=");
        sbLIZ.append(pcsOnboardingWelcomeMessageFragment.JS().LLJJ);
        sbLIZ.append(", current_step_type=");
        SMBOptInStep sMBOptInStep2 = pcsOnboardingWelcomeMessageFragment.JS().LLJILLL;
        sbLIZ.append(pcsOnboardingWelcomeMessageFragment.zT(sMBOptInStep2 != null ? sMBOptInStep2.type : 0));
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.vT("set");
        this.LL.LLLL.LIZLLL(strLJII.hashCode(), showEntrance, C2097608Jq.LJ());
        PcsOnboardingWelcomeMessageFragment pcsOnboardingWelcomeMessageFragment2 = this.LL;
        pcsOnboardingWelcomeMessageFragment2.LLLJL = null;
        int i = pcsOnboardingWelcomeMessageFragment2.JS().LLJJI;
        C1824750xaL c1824750xaL = new C1824750xaL(this.LL);
        String strLJII2 = C1822270xWL.LJII(i, string, strAT, j, showEntrance, "aweme://roma_redirect/?spark_page=smb_lynx_universal_component&page_type=welcome");
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledLynxPreload()) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextLIZ, strLJII2, new C1122270fJJ(strLJII2, c1824750xaL));
            } else {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, strLJII2);
            }
        }
        return Unit.LIZ;
    }
}
