package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.SMBServiceSwitchInfoResponse;
import webcast.api.sub.SupportedServiceInfo;

/* JADX INFO: renamed from: X.0moY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$getServiceSwitchInfo$1$1", f = "PcsOnboardingVM.kt", l = {643}, m = "invokeSuspend")
public final class C1410720moY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingVM LLILLJJLI;
    public final /* synthetic */ List<SupportedServiceInfo> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;
    public final /* synthetic */ SMBServiceSwitchInfoResponse.ResponseData LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1410720moY(PcsOnboardingVM pcsOnboardingVM, List<SupportedServiceInfo> list, boolean z, Function1<? super Throwable, Unit> function1, SMBServiceSwitchInfoResponse.ResponseData responseData, InterfaceC1364105Vn<? super C1410720moY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingVM;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = function1;
        this.LLILZLL = responseData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410720moY(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.getServiceSwitchInfo$1$1");
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
            C1121890fIh.LIZ("getServiceSwitchInfo SUCCESS");
            this.LLILLJJLI.setState(new C1410830moj(this.LLILLL, this.LLILZ));
            C1121890fIh.LIZ("getServiceSwitchInfo ServiceSwitchInfoResult");
            this.LLILLJJLI.LLILZ.LIZJ(new C1411020mp2(this.LLILLL, true, this.LLILZ, true));
            C1121890fIh.LIZ("getServiceSwitchInfo getServiceSwitchInfoInternal");
            PcsOnboardingVM pcsOnboardingVM = this.LLILLJJLI;
            Function1<Throwable, Unit> function1 = this.LLILZIL;
            SMBServiceSwitchInfoResponse.ResponseData responseData = this.LLILZLL;
            this.LL = 1;
            if (pcsOnboardingVM.HQ2(function1, responseData, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingVM@2b82.getServiceSwitchInfo$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.getServiceSwitchInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
