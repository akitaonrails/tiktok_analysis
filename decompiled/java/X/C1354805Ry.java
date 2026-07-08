package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingContinueFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingContinueFragment$initObserver$1$1", f = "PcsOnboardingContinueFragment.kt", l = {}, m = "invokeSuspend")
public final class C1354805Ry extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PcsOnboardingContinueFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354805Ry(PcsOnboardingContinueFragment pcsOnboardingContinueFragment, InterfaceC1364105Vn<? super C1354805Ry> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingContinueFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1354805Ry c1354805Ry = new C1354805Ry(this.LLILLJJLI, interfaceC1364105Vn);
        c1354805Ry.LL = obj;
        return c1354805Ry;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingContinueFragment@88e4.initObserver$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, C099V.UNDISPATCHED, new C1354905Rz(this.LLILLJJLI, null), 1);
        this.LLILLJJLI.GT();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingContinueFragment@88e4.initObserver$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
