package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.jvm.functions.Function1;
import webcast.api.smb.GetSMBOptInProgressResponse;

/* JADX INFO: renamed from: X.0mog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM", f = "PcsOnboardingVM.kt", l = {818}, m = "getSmbOptInProgressInternal")
public final class C1410800mog extends AbstractC23140094w {
    public Function1 LL;
    public GetSMBOptInProgressResponse.ResponseData LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PcsOnboardingVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410800mog(PcsOnboardingVM pcsOnboardingVM, InterfaceC1364105Vn<? super C1410800mog> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = pcsOnboardingVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.getSmbOptInProgressInternal$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objIQ2 = this.LLILZ.IQ2(null, null, this);
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.getSmbOptInProgressInternal$1");
        return objIQ2;
    }
}
