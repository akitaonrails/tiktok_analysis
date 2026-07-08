package X;

import androidx.databinding.ViewDataBinding;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment$collectDMStatus$1$1", f = "PcsOnboardingStepFragment.kt", l = {}, m = "invokeSuspend")
public final class C860190Xon extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PcsOnboardingStepFragment<ViewDataBinding> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860190Xon(PcsOnboardingStepFragment<ViewDataBinding> pcsOnboardingStepFragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C860190Xon> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingStepFragment;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C860190Xon c860190Xon = new C860190Xon(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c860190Xon.LL = obj;
        return c860190Xon;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, C099V.UNDISPATCHED, new C860180Xom(this.LLILLJJLI, this.LLILLL, null), 1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingStepFragment@3925.collectDMStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
