package X;

import com.ss.android.ugc.aweme.ecommerce.ug.promotion.fetcher.EcUgGetDecisionFetcher;

/* JADX INFO: renamed from: X.05GS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.promotion.fetcher.EcUgGetDecisionFetcher", f = "EcUgGetDecisionFetcher.kt", l = {25}, m = "fetchDiversionConfig")
public final class C05GS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EcUgGetDecisionFetcher LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GS(EcUgGetDecisionFetcher ecUgGetDecisionFetcher, InterfaceC1364105Vn<? super C05GS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = ecUgGetDecisionFetcher;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgGetDecisionFetcher@2f00.fetchDiversionConfig$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFetchDiversionConfig = this.LLILLJJLI.fetchDiversionConfig(null, null, null, null, this);
        C1C7U.LIZIZ("EcUgGetDecisionFetcher@2f00.fetchDiversionConfig$1");
        return objFetchDiversionConfig;
    }
}
