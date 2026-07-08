package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09LK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mediachoose.LayoutCutOptimizedChosenHandler$compile$1$2", f = "LayoutCutOptimizedChosenHandler.kt", l = {}, m = "invokeSuspend")
public final class C09LK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09LK(Function0<Unit> function0, InterfaceC1364105Vn<? super C09LK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09LK(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("LayoutCutOptimizedChosenHandler@633a.compile$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("LayoutCutOptimizedChosenHandler@633a.compile$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
