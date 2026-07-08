package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.sub.SMBOptInRequest;
import webcast.api.sub.SMBOptInResponse;

/* JADX INFO: renamed from: X.0moz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$requestSmbOptIn$1$result$1$1", f = "PcsOnboardingVM.kt", l = {876}, m = "invokeSuspend")
public final class C1410990moz extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<SMBOptInResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingVM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410990moz(PcsOnboardingVM pcsOnboardingVM, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C1410990moz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingVM;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410990moz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<SMBOptInResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestSmbOptIn$1$result$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC518660KVs interfaceC518660KVs = this.LLILLJJLI.LL;
            SMBOptInRequest sMBOptInRequest = new SMBOptInRequest();
            boolean z = this.LLILLL;
            boolean z2 = this.LLILZ;
            boolean z3 = this.LLILZIL;
            boolean z4 = this.LLILZLL;
            PcsOnboardingVM pcsOnboardingVM = this.LLILLJJLI;
            sMBOptInRequest.enableDm = z;
            sMBOptInRequest.enableDmEveryoneCanSend = z;
            sMBOptInRequest.enableForm = z2;
            sMBOptInRequest.enableCourse = z3;
            sMBOptInRequest.enableBooking = z4;
            sMBOptInRequest.selectedIdentity = pcsOnboardingVM.LLILZLL + 1;
            this.LL = 1;
            obj = interfaceC518660KVs.requestSmbOptIn(sMBOptInRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestSmbOptIn$1$result$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestSmbOptIn$1$result$1$1");
        return obj;
    }
}
