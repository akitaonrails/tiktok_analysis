package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.SMBServiceSwitchInfoResponse;

/* JADX INFO: renamed from: X.0mof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM", f = "PcsOnboardingVM.kt", l = {673}, m = "getServiceSwitchInfoInternal")
public final class C1410790mof extends AbstractC23140094w {
    public Function1 LL;
    public SMBServiceSwitchInfoResponse.ResponseData LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PcsOnboardingVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410790mof(PcsOnboardingVM pcsOnboardingVM, InterfaceC1364105Vn<? super C1410790mof> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = pcsOnboardingVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.getServiceSwitchInfoInternal$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILZ.HQ2(null, null, this);
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.getServiceSwitchInfoInternal$1");
        return objHQ2;
    }
}
