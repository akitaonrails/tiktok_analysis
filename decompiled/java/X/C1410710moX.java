package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.GetSMBOptInProgressResponse;

/* JADX INFO: renamed from: X.0moX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$getSmbOptInProgress$1$1", f = "PcsOnboardingVM.kt", l = {794}, m = "invokeSuspend")
public final class C1410710moX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingVM LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ List<SMBOptInStep> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;
    public final /* synthetic */ GetSMBOptInProgressResponse.ResponseData LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1410710moX(PcsOnboardingVM pcsOnboardingVM, boolean z, List<SMBOptInStep> list, Function1<? super Throwable, Unit> function1, GetSMBOptInProgressResponse.ResponseData responseData, InterfaceC1364105Vn<? super C1410710moX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingVM;
        this.LLILLL = z;
        this.LLILZ = list;
        this.LLILZIL = function1;
        this.LLILZLL = responseData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410710moX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.getSmbOptInProgress$1$1");
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
            this.LLILLJJLI.setState(new C1410840mok(this.LLILZ));
            PcsOnboardingVM pcsOnboardingVM = this.LLILLJJLI;
            pcsOnboardingVM.LLJJIJIL = this.LLILLL;
            pcsOnboardingVM.WQ2(this.LLILZ);
            this.LLILLJJLI.LLILZ.LIZJ(new C1411010mp1(true, this.LLILZ, true));
            PcsOnboardingVM pcsOnboardingVM2 = this.LLILLJJLI;
            Function1<Throwable, Unit> function1 = this.LLILZIL;
            GetSMBOptInProgressResponse.ResponseData responseData = this.LLILZLL;
            this.LL = 1;
            if (pcsOnboardingVM2.IQ2(function1, responseData, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingVM@2b82.getSmbOptInProgress$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.getSmbOptInProgress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
