package X;

import androidx.databinding.ViewDataBinding;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment$collectDMStatus$1$1$1", f = "PcsOnboardingStepFragment.kt", l = {629}, m = "invokeSuspend")
public final class C860180Xom extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PcsOnboardingStepFragment<ViewDataBinding> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860180Xom(PcsOnboardingStepFragment<ViewDataBinding> pcsOnboardingStepFragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C860180Xom> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingStepFragment;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860180Xom(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0950 anonymousClass0950 = this.LLILLJJLI.JS().LLILZIL;
            final PcsOnboardingStepFragment<ViewDataBinding> pcsOnboardingStepFragment = this.LLILLJJLI;
            final Function0<Unit> function0 = this.LLILLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Xop
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    AbstractC878300Ycu abstractC878300Ycu = (AbstractC878300Ycu) obj2;
                    if (abstractC878300Ycu instanceof C860220Xoq) {
                        if (((C860220Xoq) abstractC878300Ycu).LIZ) {
                            C197039127h c197039127h = pcsOnboardingStepFragment.LLLFF;
                            if (c197039127h != null) {
                                c197039127h.setLoading(false);
                            }
                            pcsOnboardingStepFragment.JS().LLIZ = true;
                            function0.invoke();
                        } else {
                            C197039127h c197039127h2 = pcsOnboardingStepFragment.LLLFF;
                            if (c197039127h2 != null) {
                                c197039127h2.setLoading(false);
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0950.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
