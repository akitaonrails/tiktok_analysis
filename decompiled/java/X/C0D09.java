package X;

/* JADX INFO: renamed from: X.0D09, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository", f = "RecommendRepository.kt", l = {119}, m = "fetchRecommendationSeedsByShopId-0E7RQCE")
public final class C0D09 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D09(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D09> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RecommendRepository@cb16.fetchRecommendationSeedsByShopId$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, null, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("RecommendRepository@cb16.fetchRecommendationSeedsByShopId$1");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("RecommendRepository@cb16.fetchRecommendationSeedsByShopId$1");
        return c189200o6M1boximpl;
    }
}
