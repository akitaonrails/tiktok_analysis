package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.SMBOptInResponse;

/* JADX INFO: renamed from: X.0mp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$requestSmbOptIn$1", f = "PcsOnboardingVM.kt", l = {872}, m = "invokeSuspend")
public final class C1411000mp0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PcsOnboardingVM LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1411000mp0(PcsOnboardingVM pcsOnboardingVM, Function1<? super Throwable, Unit> function1, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1364105Vn<? super C1411000mp0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pcsOnboardingVM;
        this.LLILZ = function1;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = z4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1411000mp0 c1411000mp0 = new C1411000mp0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1411000mp0.LLILLJJLI = obj;
        return c1411000mp0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object obj2;
        boolean z;
        List<SMBOptInStep> list;
        boolean z2;
        String str;
        RequestError requestError;
        SMBOptInResponse.ResponseData responseData;
        SMBOptInResponse.ResponseData responseData2;
        boolean z3;
        Object objLIZLLL = obj;
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestSmbOptIn$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                PcsOnboardingVM pcsOnboardingVM = this.LLILLL;
                boolean z4 = this.LLILZIL;
                boolean z5 = this.LLILZLL;
                boolean z6 = this.LLIZ;
                boolean z7 = this.LLIZLLLIL;
                String showEntrance = pcsOnboardingVM.DQ2().getShowEntrance();
                if (z7) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1410990moz c1410990moz = new C1410990moz(pcsOnboardingVM, z4, z5, z6, z3, null);
                this.LL = 1;
                objLIZLLL = C1808280x9m.LIZ.LIZLLL(showEntrance, "/sub/smb/opt_in/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c1410990moz, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestSmbOptIn$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) objLIZLLL;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = null;
        } else {
            obj2 = c098200Yq;
        }
        BaseResponse baseResponse = (BaseResponse) obj2;
        if (baseResponse != null && baseResponse.statusCode == 0) {
            z = true;
        } else {
            z = false;
        }
        if (baseResponse == null || (responseData2 = (SMBOptInResponse.ResponseData) baseResponse.data) == null || (list = responseData2.optInSteps) == null) {
            list = C13BV.INSTANCE;
        }
        if (baseResponse != null && (responseData = (SMBOptInResponse.ResponseData) baseResponse.data) != null) {
            z2 = responseData.skipFormSetup;
        } else {
            z2 = false;
        }
        if (z) {
            this.LLILLL.setState(new C1410980moy(list));
            this.LLILLL.getClass();
            InterfaceC1106030et7.o8.LIZJ("");
            InterfaceC1106030et7.p8.LIZJ(C13BV.INSTANCE);
            if (!((ArrayList) C1411040mp4.LIZJ(list, this.LLILLL.LLJJIII)).isEmpty()) {
                PcsOnboardingVM pcsOnboardingVM2 = this.LLILLL;
                pcsOnboardingVM2.LLJJ = 0;
                pcsOnboardingVM2.LLJILLL = (SMBOptInStep) ListProtector.get(C1411040mp4.LIZJ(list, pcsOnboardingVM2.LLJJIII), 0);
                this.LLILLL.WQ2(list);
            }
            this.LLILLL.LLJJIJIL = z2;
        } else {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                if (baseResponse == null || (requestError = baseResponse.LJ) == null || (str = requestError.message) == null) {
                    str = "requestSmbOptIn failed";
                }
                thM5exceptionOrNullimpl = new Throwable(str);
            }
            this.LLILZ.invoke(thM5exceptionOrNullimpl);
        }
        this.LLILLL.LLILZ.LIZJ(new C878290Yct(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestSmbOptIn$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
