package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.assem.PcsOnboardingMultiSKUAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825310xbF extends C09AY implements Function1<AbstractC1825450xbT, Unit> {
    public final /* synthetic */ PcsOnboardingMultiSKUAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825310xbF(PcsOnboardingMultiSKUAssem pcsOnboardingMultiSKUAssem) {
        super(1);
        this.LL = pcsOnboardingMultiSKUAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1825450xbT abstractC1825450xbT) {
        IPcsOnboardingBottomFunctionAbility iPcsOnboardingBottomFunctionAbility = (IPcsOnboardingBottomFunctionAbility) this.LL.LLJJIII.getValue();
        if (iPcsOnboardingBottomFunctionAbility != null) {
            iPcsOnboardingBottomFunctionAbility.iR();
        }
        return Unit.LIZ;
    }
}
