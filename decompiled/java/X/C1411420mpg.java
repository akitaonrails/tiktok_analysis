package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.google.gson.Gson;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411420mpg extends C09AY implements Function2<SMBOptInStep, String, String> {
    public final /* synthetic */ PcsOnboardingVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411420mpg(PcsOnboardingVM pcsOnboardingVM) {
        super(2);
        this.LL = pcsOnboardingVM;
    }

    @Override // kotlin.jvm.functions.Function2
    public final String invoke(SMBOptInStep sMBOptInStep, String str) {
        Gson gson = C1822270xWL.LIZ;
        return C1822270xWL.LIZLLL(sMBOptInStep.skuId, this.LL.DQ2().getShowEntrance(), str);
    }
}
