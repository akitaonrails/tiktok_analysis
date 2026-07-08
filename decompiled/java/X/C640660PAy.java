package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.metrics.lcp.SearchLcpLoadTimeTracker$onCompleteWithStatus$1$1", f = "SearchLcpLoadTimeTracker.kt", l = {}, m = "invokeSuspend")
public final class C640660PAy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0P8S LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0PG5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C640660PAy(C0P8S c0p8s, long j, C0PG5 c0pg5, InterfaceC1364105Vn<? super C640660PAy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0p8s;
        this.LLILLJJLI = j;
        this.LLILLL = c0pg5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C640660PAy(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLcpLoadTimeTracker@b0f5.onCompleteWithStatus$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchLcpLoadTimeTracker@b0f5.onCompleteWithStatus$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
