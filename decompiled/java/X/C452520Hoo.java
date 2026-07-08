package X;

/* JADX INFO: renamed from: X.0Hoo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.TypingRecommendationDBCacheImpl", f = "TypingRecommendationCacheImpl.kt", l = {41}, m = "get-0E7RQCE")
public final class C452520Hoo extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C452530Hop LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452520Hoo(C452530Hop c452530Hop, InterfaceC1364105Vn<? super C452520Hoo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c452530Hop;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TypingRecommendationDBCacheImpl@fa1c.get$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLJJLI.LJIILJJIL(null, null, this);
        if (objLJIILJJIL == C099R.LJFF()) {
            C1C7U.LIZIZ("TypingRecommendationDBCacheImpl@fa1c.get$1");
            return objLJIILJJIL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIILJJIL);
        C1C7U.LIZIZ("TypingRecommendationDBCacheImpl@fa1c.get$1");
        return c189200o6M1boximpl;
    }
}
