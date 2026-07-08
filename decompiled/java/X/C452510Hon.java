package X;

/* JADX INFO: renamed from: X.0Hon, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.DatabaseCache", f = "TypingRecommendationCacheImpl.kt", l = {164}, m = "get-0E7RQCE")
public final class C452510Hon extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C452490Hol LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452510Hon(C452490Hol c452490Hol, InterfaceC1364105Vn<? super C452510Hon> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c452490Hol;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DatabaseCache@9104.get$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("DatabaseCache@9104.get$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("DatabaseCache@9104.get$1");
        return c189200o6M1boximpl;
    }
}
