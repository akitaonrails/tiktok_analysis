package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0moS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$requestBasicInfoEdit$1", f = "PcsOnboardingVM.kt", l = {956}, m = "invokeSuspend")
public final class C1410660moS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PcsOnboardingVM LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410660moS(PcsOnboardingVM pcsOnboardingVM, String str, InterfaceC1364105Vn<? super C1410660moS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pcsOnboardingVM;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1410660moS c1410660moS = new C1410660moS(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1410660moS.LLILLJJLI = obj;
        return c1410660moS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("PcsOnboardingVM@2b82.requestBasicInfoEdit$1");
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
                String str = this.LLILZ;
                String showEntrance = pcsOnboardingVM.DQ2().getShowEntrance();
                C1410630moP c1410630moP = new C1410630moP(pcsOnboardingVM, str, null);
                this.LL = 1;
                obj = C1808280x9m.LIZ.LIZLLL(showEntrance, "/sub/smb/basic_info/edit/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c1410630moP, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestBasicInfoEdit$1");
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
        this.LLILLL.LLILZ.LIZJ(new C860230Xor(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.requestBasicInfoEdit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
