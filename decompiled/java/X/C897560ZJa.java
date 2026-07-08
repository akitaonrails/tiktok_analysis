package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.core.ActivityStatusServiceController$init$1$onStart$1", f = "ActivityStatusServiceController.kt", l = {}, m = "invokeSuspend")
public final class C897560ZJa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C897570ZJb LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C897560ZJa(C897570ZJb c897570ZJb, InterfaceC1364105Vn<? super C897560ZJa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c897570ZJb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C897560ZJa(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("ActivityStatusServiceController@605d.init$1$onStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ.LIZIZ();
        if (!this.LL.LJI.getAndSet(true)) {
            str = "app_launch";
        } else {
            str = "enter_foreground";
        }
        if (C1689706jX.LIZ()) {
            this.LL.LIZJ.LJ(str, EnumC595840NYo.FETCH);
        }
        if (!this.LL.LIZIZ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ActivityStatusServiceController@605d.init$1$onStart$1");
            return unit;
        }
        if (!this.LL.LJI.getAndSet(true)) {
            this.LL.LIZJ.LJ(str, EnumC595840NYo.ALL);
        } else {
            this.LL.LIZJ.LJ(str, EnumC595840NYo.ALL);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusServiceController@605d.init$1$onStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
