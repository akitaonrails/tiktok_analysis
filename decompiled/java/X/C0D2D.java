package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D2D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.network.fetcher.UcpAsyncFetcher$fetch$1$1", f = "UcpAsyncFetcher.kt", l = {}, m = "invokeSuspend")
public final class C0D2D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0D27<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D2D(C0D27<T> c0d27, InterfaceC1364105Vn<? super C0D2D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0d27;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0D2D(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UcpAsyncFetcher@b048.fetch$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UcpAsyncFetcher@b048.fetch$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
