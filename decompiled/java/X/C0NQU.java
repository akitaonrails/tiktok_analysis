package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoOnBoardingResponse;
import com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0NQU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.onboarding.vm.TakoOnboardingViewModel$fetchOnboardingClickData$1$1", f = "TakoOnboardingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0NQU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoOnboardingViewModel LL;
    public final /* synthetic */ TakoOnBoardingResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQU(TakoOnboardingViewModel takoOnboardingViewModel, TakoOnBoardingResponse takoOnBoardingResponse, InterfaceC1364105Vn<? super C0NQU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoOnboardingViewModel;
        this.LLILLJJLI = takoOnBoardingResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoOnboardingViewModel takoOnboardingViewModel = this.LL;
        TakoOnBoardingResponse takoOnBoardingResponse = this.LLILLJJLI;
        takoOnboardingViewModel.getClass();
        takoOnboardingViewModel.setStateImmediate(new AwS606S0100000_27(takoOnBoardingResponse, 375));
        Iterator<Function0<Unit>> it2 = this.LL.LL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoOnboardingViewModel@e0ae.fetchOnboardingClickData$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
