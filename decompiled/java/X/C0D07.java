package X;

/* JADX INFO: renamed from: X.0D07, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository", f = "RecommendRepository.kt", l = {222}, m = "doFetch-gIAlu-s")
public final class C0D07 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D0E LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D07(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D07> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d0e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecommendRepository@cb16.doFetch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("RecommendRepository@cb16.doFetch$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("RecommendRepository@cb16.doFetch$1");
        return c189200o6M1boximpl;
    }
}
