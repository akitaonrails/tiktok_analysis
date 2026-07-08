package X;

/* JADX INFO: renamed from: X.0CzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.PDPDataRepository", f = "PDPDataRepository.kt", l = {331}, m = "enrichRecommendationItem-gIAlu-s")
public final class C331750CzV extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C331730CzT LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331750CzV(C331730CzT c331730CzT, InterfaceC1364105Vn<? super C331750CzV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c331730CzT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PDPDataRepository@79c7.enrichRecommendationItem$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("PDPDataRepository@79c7.enrichRecommendationItem$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("PDPDataRepository@79c7.enrichRecommendationItem$1");
        return c189200o6M1boximpl;
    }
}
