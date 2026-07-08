package X;

/* JADX INFO: renamed from: X.0D0A, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository", f = "RecommendRepository.kt", l = {185}, m = "fetchSeedsWithCache-0E7RQCE")
public final class C0D0A extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D0E LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0A(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D0A> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d0e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendRepository@cb16.fetchSeedsWithCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(null, null, this);
        if (objLJIIIIZZ == C099R.LJFF()) {
            C1C7U.LIZIZ("RecommendRepository@cb16.fetchSeedsWithCache$1");
            return objLJIIIIZZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIIZZ);
        C1C7U.LIZIZ("RecommendRepository@cb16.fetchSeedsWithCache$1");
        return c189200o6M1boximpl;
    }
}
