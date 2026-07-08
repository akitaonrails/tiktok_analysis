package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingFrontFragment;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionFAQSetting;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823840xYs extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingFrontFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823840xYs(PcsOnboardingFrontFragment pcsOnboardingFrontFragment) {
        super(0);
        this.LL = pcsOnboardingFrontFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Gson gson = C1822270xWL.LIZ;
        String servicePlusToolsAccessTerm = LiveSubscriptionFAQSetting.INSTANCE.getValue().getServicePlusToolsAccessTerm(this.LL.JS().DQ2().getShowEntrance());
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, servicePlusToolsAccessTerm);
        }
        return Unit.LIZ;
    }
}
