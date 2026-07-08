package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingFormFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824740xaK extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PcsOnboardingFormFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824740xaK(PcsOnboardingFormFragment pcsOnboardingFormFragment) {
        super(1);
        this.LL = pcsOnboardingFormFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        this.LL.LLLLII = String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zBooleanValue)) ? 1 : 0);
        return Unit.LIZ;
    }
}
