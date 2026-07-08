package X;

/* JADX INFO: renamed from: X.0D0P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallRecommendationLoader", f = "WaterfallRecommendationLoader.kt", l = {73, 82}, m = "fetchSeeds-0E7RQCE")
public final class C0D0P extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0D0O LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0P(C0D0O c0d0o, InterfaceC1364105Vn<? super C0D0P> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0d0o;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("WaterfallRecommendationLoader@fa8a.fetchSeeds$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("WaterfallRecommendationLoader@fa8a.fetchSeeds$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("WaterfallRecommendationLoader@fa8a.fetchSeeds$1");
        return c189200o6M1boximpl;
    }
}
