package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1824320xZe extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ PcsOnboardingMultiSKUFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1824320xZe(PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment) {
        super(1);
        this.LL = pcsOnboardingMultiSKUFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        int errorCode;
        C501520Jle c501520Jle;
        Throwable th2 = th;
        PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment = this.LL;
        if ((th2 instanceof C501520Jle) && (c501520Jle = (C501520Jle) th2) != null) {
            errorCode = c501520Jle.getErrorCode();
        } else {
            errorCode = -1;
        }
        boolean z = this.LL.JS().LLJJIJIL;
        int iKQ2 = this.LL.JS().KQ2();
        pcsOnboardingMultiSKUFragment.getClass();
        PcsOnboardingMultiSKUFragment.rT(errorCode, iKQ2, false, z);
        this.LL.JS().XQ2(th2, new C1824410xZn(this.LL));
        return Unit.LIZ;
    }
}
