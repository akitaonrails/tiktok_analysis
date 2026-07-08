package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQT, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel$fetchOnboardingClickData$1", f = "TakoOnboardingViewModel.kt", l = {42, 43}, m = "invokeSuspend")
public final class C0NQT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ TakoOnboardingViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQT(String str, String str2, int i, TakoOnboardingViewModel takoOnboardingViewModel, InterfaceC1364105Vn<? super C0NQT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
        this.LLILZIL = takoOnboardingViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1863980ybc c1863980ybc = C1863980ybc.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            int i2 = this.LLILZ;
            this.LL = 1;
            obj = c1863980ybc.LJIJI(str, str2, i2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C0NQU c0nqu = new C0NQU(this.LLILZIL, (TakoOnBoardingResponse) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c0nqu) == objLJFF) {
            C1C7U.LIZIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
