package X;

/* JADX INFO: renamed from: X.0NeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager", f = "PopCardRefreshManager.kt", l = {468}, m = "requestPopRefresh")
public final class C598840NeE extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C598800NeA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598840NeE(C598800NeA c598800NeA, InterfaceC1364105Vn<? super C598840NeE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c598800NeA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopCardRefreshManager@9ff3.requestPopRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(0, null, null, null, null, this, false);
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestPopRefresh$1");
        return objLIZJ;
    }
}
