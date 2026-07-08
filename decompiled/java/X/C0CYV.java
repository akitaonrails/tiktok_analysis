package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.routing.CommonFlowRouteAction$callSafeEnv$1$1", f = "CommonFlowRouteAction.kt", l = {}, m = "invokeSuspend")
public final class C0CYV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CYV(DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C0CYV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CYV(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommonFlowRouteAction@d4c5.callSafeEnv$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.hide();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommonFlowRouteAction@d4c5.callSafeEnv$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
