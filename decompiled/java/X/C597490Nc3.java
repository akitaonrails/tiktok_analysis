package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.screen.trigger.ScreenTimeDashboardTrigger$onAppEnterForeground$1", f = "ScreenTimeDashboardTrigger.kt", l = {}, m = "invokeSuspend")
public final class C597490Nc3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C15ZI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597490Nc3(C15ZI c15zi, InterfaceC1364105Vn<? super C597490Nc3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c15zi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C597490Nc3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenTimeDashboardTrigger@90b6.onAppEnterForeground$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenTimeDashboardTrigger@90b6.onAppEnterForeground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
