package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0moT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$requestServiceOptForm$1", f = "PcsOnboardingVM.kt", l = {924}, m = "invokeSuspend")
public final class C1410670moT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<Throwable, Unit> LLILLL;
    public final /* synthetic */ PcsOnboardingVM LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ List<Integer> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1410670moT(Function1<? super Throwable, Unit> function1, PcsOnboardingVM pcsOnboardingVM, long j, List<Integer> list, InterfaceC1364105Vn<? super C1410670moT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = pcsOnboardingVM;
        this.LLILZIL = j;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1410670moT c1410670moT = new C1410670moT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1410670moT.LLILLJJLI = obj;
        return c1410670moT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        Object obj2;
        String str;
        RequestError requestError;
        Object objLIZLLL = obj;
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestServiceOptForm$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                PcsOnboardingVM pcsOnboardingVM = this.LLILZ;
                long j = this.LLILZIL;
                List<Integer> list = this.LLILZLL;
                String showEntrance = pcsOnboardingVM.DQ2().getShowEntrance();
                C1410640moQ c1410640moQ = new C1410640moQ(pcsOnboardingVM, j, list, null);
                this.LL = 1;
                objLIZLLL = C1808280x9m.LIZ.LIZLLL(showEntrance, "/sub/smb/service_opt/form/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c1410640moQ, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestServiceOptForm$1");
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
        if (baseResponse == null || baseResponse.statusCode != 0) {
            z = false;
        }
        if (!z) {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                if (baseResponse == null || (requestError = baseResponse.LJ) == null || (str = requestError.message) == null) {
                    str = "requestServiceOptForm failed";
                }
                thM5exceptionOrNullimpl = new Throwable(str);
            }
            this.LLILLL.invoke(thM5exceptionOrNullimpl);
        }
        this.LLILZ.LLILZ.LIZJ(new C860240Xos(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestServiceOptForm$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
