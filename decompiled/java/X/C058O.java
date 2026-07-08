package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.058O, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mob.RecordMobHelper$appendPerfParams$1", f = "RecordMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C058O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0LAB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058O(C0LAB c0lab, InterfaceC1364105Vn<? super C058O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0lab;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C058O(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordMobHelper@7fcc.appendPerfParams$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", this.LL.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordMobHelper@7fcc.appendPerfParams$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
