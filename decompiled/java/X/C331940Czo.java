package X;

/* JADX INFO: renamed from: X.0Czo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.source.review.ReviewRealDataSource", f = "ReviewRealDataSource.kt", l = {23}, m = "fetchReviews-0E7RQCE")
public final class C331940Czo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C331930Czn LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C331940Czo(C331930Czn c331930Czn, InterfaceC1364105Vn<? super C331940Czo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c331930Czn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReviewRealDataSource@d099.fetchReviews$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("ReviewRealDataSource@d099.fetchReviews$1");
        return c189200o6M1boximpl;
    }
}
