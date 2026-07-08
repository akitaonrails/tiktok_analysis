package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingConfigFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824330xZf extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsOnboardingConfigFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824330xZf(PcsOnboardingConfigFragment pcsOnboardingConfigFragment) {
        super(1);
        this.LL = pcsOnboardingConfigFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        int errorCode;
        C501520Jle c501520Jle;
        Throwable th2 = th;
        PcsOnboardingConfigFragment pcsOnboardingConfigFragment = this.LL;
        if ((th2 instanceof C501520Jle) && (c501520Jle = (C501520Jle) th2) != null) {
            errorCode = c501520Jle.getErrorCode();
        } else {
            errorCode = -1;
        }
        pcsOnboardingConfigFragment.getClass();
        PcsOnboardingConfigFragment.CT(errorCode, false);
        this.LL.JS().XQ2(th2, new C1824400xZm(this.LL));
        return Unit.LIZ;
    }
}
