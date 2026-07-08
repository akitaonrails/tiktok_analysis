package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment$initObserver$2", f = "PcsOnboardingMultiSKUFragment.kt", l = {224}, m = "invokeSuspend")
public final class C1354405Ru extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingMultiSKUFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354405Ru(PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment, InterfaceC1364105Vn<? super C1354405Ru> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingMultiSKUFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354405Ru(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2");
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
            PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1354505Rv c1354505Rv = new C1354505Rv(pcsOnboardingMultiSKUFragment, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(pcsOnboardingMultiSKUFragment, state, c1354505Rv, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
