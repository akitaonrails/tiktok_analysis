package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LO, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mediachoose.LayoutCutOptimizedChosenHandler$compile$1$6", f = "LayoutCutOptimizedChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09LO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C536280L1m LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LO(C536280L1m c536280L1m, InterfaceC1364105Vn<? super C09LO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c536280L1m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayoutCutOptimizedChosenHandler@633a.compile$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LayoutCutOptimizedChosenHandler@633a.compile$1$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
