package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xa5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824590xa5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsOnboardingStepFragment<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824590xa5(PcsOnboardingStepFragment<T> pcsOnboardingStepFragment) {
        super(0);
        this.LL = pcsOnboardingStepFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Gson gson = C1822270xWL.LIZ;
        C1822270xWL.LJIIIZ(this.LL.JS().DQ2(), false);
        this.LL.eT();
        return Unit.LIZ;
    }
}
