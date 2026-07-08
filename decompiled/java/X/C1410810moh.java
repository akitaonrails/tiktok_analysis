package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0moh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM", f = "PcsOnboardingVM.kt", l = {1037}, m = "requestOptinQualificationInternal")
public final class C1410810moh extends AbstractC23140094w {
    public Function1 LL;
    public SMBOptInQualificationResponse.ResponseData LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PcsOnboardingVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410810moh(PcsOnboardingVM pcsOnboardingVM, InterfaceC1364105Vn<? super C1410810moh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = pcsOnboardingVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestOptinQualificationInternal$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objUQ2 = this.LLILZ.UQ2(null, null, null, this);
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestOptinQualificationInternal$1");
        return objUQ2;
    }
}
