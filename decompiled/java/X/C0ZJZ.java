package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.ActivityStatusServiceController$init$1$onDestroy$1", f = "ActivityStatusServiceController.kt", l = {}, m = "invokeSuspend")
public final class C0ZJZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C897570ZJb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZJZ(C897570ZJb c897570ZJb, InterfaceC1364105Vn<? super C0ZJZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c897570ZJb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZJZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusServiceController@605d.init$1$onDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LIZIZ();
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJ().LJII();
        this.LL.LIZIZ.LIZIZ();
        if (!this.LL.LIZJ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ActivityStatusServiceController@605d.init$1$onDestroy$1");
            return unit;
        }
        this.LL.LIZJ.LIZLLL("app_kill", EnumC595840NYo.ALL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusServiceController@605d.init$1$onDestroy$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
