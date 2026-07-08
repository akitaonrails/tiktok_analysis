package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.utils.TakoButtonPerformanceMob$post$1", f = "TakoButtonPerformanceMob.kt", l = {}, m = "invokeSuspend")
public final class C2166908eJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2379309Tz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2166908eJ(C2379309Tz c2379309Tz, InterfaceC1364105Vn<? super C2166908eJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2379309Tz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2166908eJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoButtonPerformanceMob@65d8.post$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(this.LL.LIZIZ, "t1");
        c2344009Gk.LIZLLL(this.LL.LIZLLL, "t2");
        c2344009Gk.LIZLLL(this.LL.LJFF, "t3");
        C20684815ws.LJIILLIIL("search_middle_tako_button_perf", c2344009Gk.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoButtonPerformanceMob@65d8.post$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
