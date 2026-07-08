package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingChatBuilderFragment;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xa7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824610xa7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingChatBuilderFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824610xa7(PcsOnboardingChatBuilderFragment pcsOnboardingChatBuilderFragment) {
        super(0);
        this.LL = pcsOnboardingChatBuilderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.AT("click_continue");
        C1824200xZS.LIZ("click", this.LL.JS().DQ2().getShowEntrance(), "continue");
        Gson gson = C1822270xWL.LIZ;
        this.LL.LLLLIIL.LIZLLL(C1822270xWL.LIZJ(this.LL.JS().DQ2().getShowEntrance(), this.LL.JS().xQ2() + 1, this.LL.JS().KQ2(), this.LL.JS().DQ2().getAnchorId(), this.LL.JS().DQ2().getAnchorId(), this.LL.JS().DQ2().getShowEntrance()).hashCode(), this.LL.JS().DQ2().getShowEntrance(), C2097608Jq.LJ());
        String strLIZJ = C1822270xWL.LIZJ(this.LL.JS().DQ2().getShowEntrance(), this.LL.JS().xQ2() + 1, this.LL.JS().KQ2(), this.LL.JS().DQ2().getAnchorId(), this.LL.JS().DQ2().getAnchorId(), this.LL.JS().DQ2().getShowEntrance());
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, strLIZJ);
        }
        return Unit.LIZ;
    }
}
