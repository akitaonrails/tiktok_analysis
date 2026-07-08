package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingSuggestedQuestionsFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824640xaA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingSuggestedQuestionsFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824640xaA(PcsOnboardingSuggestedQuestionsFragment pcsOnboardingSuggestedQuestionsFragment) {
        super(0);
        this.LL = pcsOnboardingSuggestedQuestionsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Gson gson = C1822270xWL.LIZ;
        List listLJFF = C1822270xWL.LJFF(this.LL.LLLLII);
        String string = this.LL.getString(2131855850);
        SMBOptInStep sMBOptInStep = this.LL.JS().LLJILLL;
        long j = sMBOptInStep != null ? sMBOptInStep.skuId : 0L;
        String showEntrance = this.LL.JS().DQ2().getShowEntrance();
        String strLJI = C1822270xWL.LJI(string, listLJFF, this.LL.JS().LLJJI, j, showEntrance, "aweme://roma_redirect/?spark_page=smb_lynx_universal_component&page_type=suggested_qna");
        PcsOnboardingSuggestedQuestionsFragment pcsOnboardingSuggestedQuestionsFragment = this.LL;
        pcsOnboardingSuggestedQuestionsFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingSuggestedQuestionsIntroductionPage ");
        sbLIZ.append("click_set_up");
        sbLIZ.append(" current_step_index=");
        sbLIZ.append(pcsOnboardingSuggestedQuestionsFragment.JS().LLJJ);
        sbLIZ.append(", current_step_type=");
        SMBOptInStep sMBOptInStep2 = pcsOnboardingSuggestedQuestionsFragment.JS().LLJILLL;
        sbLIZ.append(pcsOnboardingSuggestedQuestionsFragment.zT(sMBOptInStep2 != null ? sMBOptInStep2.type : 0));
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        this.LL.vT("set");
        this.LL.LLLLIIL.LIZLLL(strLJI.hashCode(), showEntrance, C2097608Jq.LJ());
        PcsOnboardingSuggestedQuestionsFragment pcsOnboardingSuggestedQuestionsFragment2 = this.LL;
        pcsOnboardingSuggestedQuestionsFragment2.LLLLIIIILLL = null;
        int i = pcsOnboardingSuggestedQuestionsFragment2.JS().LLJJI;
        C743670TFd c743670TFd = new C743670TFd(this.LL);
        String strLJI2 = C1822270xWL.LJI(string, listLJFF, i, j, showEntrance, "aweme://roma_redirect/?spark_page=smb_lynx_universal_component&page_type=suggested_qna");
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            if (LivePcsOnboardingPerfOptSetting.INSTANCE.enabledLynxPreload()) {
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(contextLIZ, strLJI2, new C1122250fJH(strLJI2, c743670TFd));
            } else {
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, strLJI2);
            }
        }
        return Unit.LIZ;
    }
}
