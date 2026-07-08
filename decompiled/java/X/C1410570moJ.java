package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;
import webcast.api.sub.SMBServiceSwitchInfoResponse;

/* JADX INFO: renamed from: X.0moJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$getServiceSwitchInfoInternal$result$1$1", f = "PcsOnboardingVM.kt", l = {677}, m = "invokeSuspend")
public final class C1410570moJ extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<SMBServiceSwitchInfoResponse.ResponseData>>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410570moJ(PcsOnboardingVM pcsOnboardingVM, InterfaceC1364105Vn<? super C1410570moJ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410570moJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<SMBServiceSwitchInfoResponse.ResponseData>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.getServiceSwitchInfoInternal$result$1$1");
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
            this.LL = 1;
            obj = interfaceC518660KVs.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingVM@2b82.getServiceSwitchInfoInternal$result$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.getServiceSwitchInfoInternal$result$1$1");
        return obj;
    }
}
