package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1138504cp extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsOnboardingStatefulStepFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138504cp(PcsOnboardingStatefulStepFragment pcsOnboardingStatefulStepFragment) {
        super(1);
        this.LL = pcsOnboardingStatefulStepFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1138404co());
        return Unit.LIZ;
    }
}
