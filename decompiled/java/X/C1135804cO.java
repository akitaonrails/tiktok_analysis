package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingConfigFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1135804cO extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsOnboardingConfigFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135804cO(PcsOnboardingConfigFragment pcsOnboardingConfigFragment) {
        super(1);
        this.LL = pcsOnboardingConfigFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1135704cN());
        return Unit.LIZ;
    }
}
