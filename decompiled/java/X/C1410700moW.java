package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0moW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$requestOptinQualification$1$1", f = "PcsOnboardingVM.kt", l = {997}, m = "invokeSuspend")
public final class C1410700moW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingVM LLILLJJLI;
    public final /* synthetic */ SMBOptInQualificationResponse.ResponseData LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1410700moW(PcsOnboardingVM pcsOnboardingVM, SMBOptInQualificationResponse.ResponseData responseData, Function1<? super Throwable, Unit> function1, InterfaceC1364105Vn<? super C1410700moW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingVM;
        this.LLILLL = responseData;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410700moW(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestOptinQualification$1$1");
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
            this.LLILLJJLI.setState(new C1410850mol(this.LLILLL));
            this.LLILLJJLI.YQ2(this.LLILLL);
            this.LLILLJJLI.LLILZ.LIZJ(new C1411030mp3(true, this.LLILLL, true));
            PcsOnboardingVM pcsOnboardingVM = this.LLILLJJLI;
            String showEntrance = pcsOnboardingVM.DQ2().getShowEntrance();
            Function1<Throwable, Unit> function1 = this.LLILZ;
            SMBOptInQualificationResponse.ResponseData responseData = this.LLILLL;
            this.LL = 1;
            if (pcsOnboardingVM.UQ2(showEntrance, function1, responseData, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestOptinQualification$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestOptinQualification$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
