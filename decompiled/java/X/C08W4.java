package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08W4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preloader.condition.ECAPIInterceptorNetworkHandler$reportApiInterceptorEvent$1", f = "ECAPIInterceptorNetworkHandler.kt", l = {}, m = "invokeSuspend")
public final class C08W4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08W4(String str, long j, String str2, InterfaceC1364105Vn<? super C08W4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08W4(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECAPIInterceptorNetworkHandler@853.reportApiInterceptorEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C1505950pI9.LIZ;
        C1505950pI9.LIZJ(this.LLILLJJLI, this.LL, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECAPIInterceptorNetworkHandler@853.reportApiInterceptorEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
