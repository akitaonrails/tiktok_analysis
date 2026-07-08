package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.capability.MixSparkAbility$preloadScrollSparkViews$3", f = "MixSparkAbility.kt", l = {}, m = "invokeSuspend")
public final class C602050NjP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1540620qC4 LL;
    public final /* synthetic */ List<C679540Ql6> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C602050NjP(C1540620qC4 c1540620qC4, List<C679540Ql6> list, InterfaceC1364105Vn<? super C602050NjP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1540620qC4;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C602050NjP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixSparkAbility@64fa.preloadScrollSparkViews$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1540620qC4 c1540620qC4 = this.LL;
        List<C679540Ql6> list = this.LLILLJJLI;
        C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
        c1540620qC4.LJIILLIIL(list, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixSparkAbility@64fa.preloadScrollSparkViews$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
