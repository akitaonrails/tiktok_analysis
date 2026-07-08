package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingContinueFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04dM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1141804dM extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsOnboardingContinueFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141804dM(PcsOnboardingContinueFragment pcsOnboardingContinueFragment) {
        super(1);
        this.LL = pcsOnboardingContinueFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1141704dL());
        return Unit.LIZ;
    }
}
