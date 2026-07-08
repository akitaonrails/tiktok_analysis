package X;

/* JADX INFO: renamed from: X.0NeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.refresh.PopCardRefreshManager", f = "PopCardRefreshManager.kt", l = {399}, m = "requestFlipCard")
public final class C598830NeD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C598800NeA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598830NeD(C598800NeA c598800NeA, InterfaceC1364105Vn<? super C598830NeD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c598800NeA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopCardRefreshManager@9ff3.requestFlipCard$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, null, this);
        C1C7U.LIZIZ("PopCardRefreshManager@9ff3.requestFlipCard$1");
        return objLIZ;
    }
}
