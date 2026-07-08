package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingMultiSKUAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825300xbE extends C09AY implements Function0<IPcsOnboardingBottomFunctionAbility> {
    public final /* synthetic */ PcsOnboardingMultiSKUAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825300xbE(PcsOnboardingMultiSKUAssem pcsOnboardingMultiSKUAssem) {
        super(0);
        this.LL = pcsOnboardingMultiSKUAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IPcsOnboardingBottomFunctionAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IPcsOnboardingBottomFunctionAbility.class, null);
    }
}
