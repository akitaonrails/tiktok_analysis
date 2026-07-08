package X;

/* JADX INFO: renamed from: X.0D08, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository", f = "RecommendRepository.kt", l = {105}, m = "fetchRecommendationSeeds-yxL6bBk")
public final class C0D08 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D08(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D08> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendRepository@cb16.fetchRecommendationSeeds$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, null, null, null, this);
        if (objLJI == C099R.LJFF()) {
            C1C7U.LIZIZ("RecommendRepository@cb16.fetchRecommendationSeeds$1");
            return objLJI;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJI);
        C1C7U.LIZIZ("RecommendRepository@cb16.fetchRecommendationSeeds$1");
        return c189200o6M1boximpl;
    }
}
