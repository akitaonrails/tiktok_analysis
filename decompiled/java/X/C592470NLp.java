package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nows.router.NowsHostDfRouteInterceptor$onInterceptRoute$2", f = "NowsHostDfRouteInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C592470NLp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C592470NLp(InterfaceC1364105Vn<? super C592470NLp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592470NLp(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NowsHostDfRouteInterceptor@9d70.onInterceptRoute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20191713zX.LIZ.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NowsHostDfRouteInterceptor@9d70.onInterceptRoute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C592470NLp(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
