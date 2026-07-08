package X;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xoo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment$collectDMStatus$1", f = "PcsOnboardingStepFragment.kt", l = {627}, m = "invokeSuspend")
public final class C860200Xoo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingStepFragment<ViewDataBinding> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860200Xoo(PcsOnboardingStepFragment<ViewDataBinding> pcsOnboardingStepFragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C860200Xoo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingStepFragment;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860200Xoo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1");
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
            PcsOnboardingStepFragment<ViewDataBinding> pcsOnboardingStepFragment = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C860190Xon c860190Xon = new C860190Xon(pcsOnboardingStepFragment, this.LLILLL, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(pcsOnboardingStepFragment, state, c860190Xon, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
