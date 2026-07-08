package X;

/* JADX INFO: renamed from: X.0D06, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository", f = "RecommendRepository.kt", l = {250}, m = "enrichRecommendationItem-gIAlu-s")
public final class C0D06 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D06(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D06> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendRepository@cb16.enrichRecommendationItem$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        if (objLIZLLL == C099R.LJFF()) {
            C1C7U.LIZIZ("RecommendRepository@cb16.enrichRecommendationItem$1");
            return objLIZLLL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZLLL);
        C1C7U.LIZIZ("RecommendRepository@cb16.enrichRecommendationItem$1");
        return c189200o6M1boximpl;
    }
}
