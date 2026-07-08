package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingFrontFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558950qfd extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsOnboardingFrontFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558950qfd(PcsOnboardingFrontFragment pcsOnboardingFrontFragment) {
        super(1);
        this.LL = pcsOnboardingFrontFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1558940qfc());
        return Unit.LIZ;
    }
}
