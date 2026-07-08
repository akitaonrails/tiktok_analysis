package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingFrontFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingFrontFragment$initObserver$1$1", f = "PcsOnboardingFrontFragment.kt", l = {}, m = "invokeSuspend")
public final class C860160Xok extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PcsOnboardingFrontFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860160Xok(PcsOnboardingFrontFragment pcsOnboardingFrontFragment, InterfaceC1364105Vn<? super C860160Xok> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingFrontFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C860160Xok c860160Xok = new C860160Xok(this.LLILLJJLI, interfaceC1364105Vn);
        c860160Xok.LL = obj;
        return c860160Xok;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingFrontFragment@83e6.initObserver$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, C099V.UNDISPATCHED, new C860170Xol(this.LLILLJJLI, null), 1);
        this.LLILLJJLI.zT();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingFrontFragment@83e6.initObserver$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
