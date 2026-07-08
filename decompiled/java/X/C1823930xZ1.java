package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingFrontFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823930xZ1 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsOnboardingFrontFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823930xZ1(PcsOnboardingFrontFragment pcsOnboardingFrontFragment) {
        super(1);
        this.LL = pcsOnboardingFrontFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.NS();
        this.LL.JS().XQ2(th, new C1823980xZ6(this.LL));
        return Unit.LIZ;
    }
}
