package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0moU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM$triggerAIDMForOnboarding$1", f = "PcsOnboardingVM.kt", l = {730}, m = "invokeSuspend")
public final class C1410680moU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PcsOnboardingVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410680moU(PcsOnboardingVM pcsOnboardingVM, InterfaceC1364105Vn<? super C1410680moU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pcsOnboardingVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1410680moU c1410680moU = new C1410680moU(this.LLILLL, interfaceC1364105Vn);
        c1410680moU.LLILLJJLI = obj;
        return c1410680moU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingVM@2b82.triggerAIDMForOnboarding$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
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
                C1410690moV c1410690moV = new C1410690moV(pcsOnboardingVM, null);
                this.LL = 1;
                obj = C1808280x9m.LIZ.LIZLLL(showEntrance, "/sub/smb/ai_dm/trigger/", C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c1410690moV, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PcsOnboardingVM@2b82.triggerAIDMForOnboarding$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((C470590Icr) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingVM@2b82.triggerAIDMForOnboarding$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
