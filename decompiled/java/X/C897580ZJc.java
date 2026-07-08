package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.ActivityStatusServiceController$init$1$onStop$1", f = "ActivityStatusServiceController.kt", l = {}, m = "invokeSuspend")
public final class C897580ZJc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C897570ZJb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897580ZJc(C897570ZJb c897570ZJb, InterfaceC1364105Vn<? super C897580ZJc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c897570ZJb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897580ZJc(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusServiceController@605d.init$1$onStop$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LIZIZ();
        if (!this.LL.LIZJ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ActivityStatusServiceController@605d.init$1$onStop$1");
            return unit;
        }
        this.LL.LIZJ.LIZLLL("enter_background", EnumC595840NYo.ALL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusServiceController@605d.init$1$onStop$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
