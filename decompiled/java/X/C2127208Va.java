package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Va, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkBystander$pathHandlerList$2$1", f = "ECAPIInterceptorNetworkBystander.kt", l = {}, m = "invokeSuspend")
public final class C2127208Va extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2127208Va(InterfaceC1364105Vn<? super C2127208Va> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2127208Va(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECAPIInterceptorNetworkBystander@205a.pathHandlerList$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2131308Wp.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAPIInterceptorNetworkBystander@205a.pathHandlerList$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2127208Va(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
