package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.interceptor.LegacyTaskBridgeInterceptor$intercept$5", f = "LegacyTaskBridgeInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C345310DgH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C345190Dg5 LL;
    public final /* synthetic */ C345340DgK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345310DgH(C345190Dg5 c345190Dg5, C345340DgK c345340DgK, InterfaceC1364105Vn<? super C345310DgH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c345190Dg5;
        this.LLILLJJLI = c345340DgK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C345310DgH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LegacyTaskBridgeInterceptor@278c.intercept$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC345200Dg6 causer = this.LL.getCauser();
        C1DRG c1drg = this.LLILLJJLI.LLILLL;
        this.LL.getReason();
        causer.LIZIZ(c1drg);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LegacyTaskBridgeInterceptor@278c.intercept$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
