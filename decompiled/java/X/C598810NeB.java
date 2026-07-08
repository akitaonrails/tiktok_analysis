package X;

/* JADX INFO: renamed from: X.0NeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager", f = "PopCardRefreshManager.kt", l = {426}, m = "requestPop")
public final class C598810NeB extends AbstractC23140094w {
    public C259800zU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C598800NeA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598810NeB(C598800NeA c598800NeA, InterfaceC1364105Vn<? super C598810NeB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c598800NeA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopCardRefreshManager@9ff3.requestPop$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, null, null, false, this);
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPop$1");
        return objLIZIZ;
    }
}
