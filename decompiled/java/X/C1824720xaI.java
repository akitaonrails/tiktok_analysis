package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingKYBFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824720xaI extends C09AY implements Function0<String> {
    public final /* synthetic */ PcsOnboardingKYBFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824720xaI(PcsOnboardingKYBFragment pcsOnboardingKYBFragment) {
        super(0);
        this.LL = pcsOnboardingKYBFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        SMBOptInStep sMBOptInStep = this.LL.JS().LLJILLL;
        if (sMBOptInStep == null || sMBOptInStep.type != 8 || sMBOptInStep.isMandatory) {
            return null;
        }
        return this.LL.getString(2131856121);
    }
}
