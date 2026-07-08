package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1159204gA extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PcsOnboardingMultiSKUFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1159204gA(PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment) {
        super(1);
        this.LL = pcsOnboardingMultiSKUFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1159104g9());
        return Unit.LIZ;
    }
}
