package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingFormFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824770xaN extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsOnboardingFormFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824770xaN(PcsOnboardingFormFragment pcsOnboardingFormFragment) {
        super(1);
        this.LL = pcsOnboardingFormFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.JS().XQ2(th, new C1824960xag(this.LL));
        return Unit.LIZ;
    }
}
