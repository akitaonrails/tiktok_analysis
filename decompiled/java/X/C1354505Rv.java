package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful.PcsOnboardingMultiSKUFragment$initObserver$2$1", f = "PcsOnboardingMultiSKUFragment.kt", l = {}, m = "invokeSuspend")
public final class C1354505Rv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PcsOnboardingMultiSKUFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354505Rv(PcsOnboardingMultiSKUFragment pcsOnboardingMultiSKUFragment, InterfaceC1364105Vn<? super C1354505Rv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pcsOnboardingMultiSKUFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1354505Rv c1354505Rv = new C1354505Rv(this.LLILLJJLI, interfaceC1364105Vn);
        c1354505Rv.LL = obj;
        return c1354505Rv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, C099V.UNDISPATCHED, new C1354605Rw(this.LLILLJJLI, null), 1);
        this.LLILLJJLI.sT();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsOnboardingMultiSKUFragment@814c.initObserver$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
