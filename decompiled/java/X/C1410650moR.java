package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0moR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$updateDMStatus$1", f = "PcsOnboardingVM.kt", l = {753}, m = "invokeSuspend")
public final class C1410650moR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PcsOnboardingVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410650moR(PcsOnboardingVM pcsOnboardingVM, InterfaceC1364105Vn<? super C1410650moR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pcsOnboardingVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1410650moR c1410650moR = new C1410650moR(this.LLILLL, interfaceC1364105Vn);
        c1410650moR.LLILLJJLI = obj;
        return c1410650moR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PcsOnboardingVM@2b82.updateDMStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        boolean z = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PcsOnboardingVM pcsOnboardingVM = this.LLILLL;
                String showEntrance = pcsOnboardingVM.DQ2().getShowEntrance();
                C1410620moO c1410620moO = new C1410620moO(pcsOnboardingVM, null);
                this.LL = 1;
                obj = C1808280x9m.LIZ.LIZLLL(showEntrance, "/sub/upsell/update_dm_status/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c1410620moO, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PcsOnboardingVM@2b82.updateDMStatus$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        BaseResponse baseResponse = (BaseResponse) obj2;
        if (baseResponse == null || baseResponse.statusCode != 0) {
            z = false;
        }
        this.LLILLL.LLILZ.LIZJ(new C860220Xoq(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.updateDMStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
