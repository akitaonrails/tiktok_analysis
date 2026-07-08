package X;

/* JADX INFO: renamed from: X.1BdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.CommentFilterRepoImpl", f = "CommentFilterRepoImpl.kt", l = {116}, m = "setFilterAllExpiredStatus-gIAlu-s")
public final class C2209181BdE extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2209171BdD LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209181BdE(C2209171BdD c2209171BdD, InterfaceC1364105Vn<? super C2209181BdE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2209171BdD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentFilterRepoImpl@785b.setFilterAllExpiredStatus$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(null, this);
        if (objLJII == C099R.LJFF()) {
            C1C7U.LIZIZ("CommentFilterRepoImpl@785b.setFilterAllExpiredStatus$1");
            return objLJII;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJII);
        C1C7U.LIZIZ("CommentFilterRepoImpl@785b.setFilterAllExpiredStatus$1");
        return c189200o6M1boximpl;
    }
}
