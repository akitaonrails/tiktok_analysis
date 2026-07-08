package X;

/* JADX INFO: renamed from: X.1BdJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.settings.CommentFilterRepoImpl", f = "CommentFilterRepoImpl.kt", l = {27}, m = "refreshSettings-IoAF18A")
public final class C2209231BdJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2209171BdD LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209231BdJ(C2209171BdD c2209171BdD, InterfaceC1364105Vn<? super C2209231BdJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c2209171BdD;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentFilterRepoImpl@785b.refreshSettings$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLJJLI.LJIIIZ(this);
        if (objLJIIIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("CommentFilterRepoImpl@785b.refreshSettings$1");
            return objLJIIIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIIIZ);
        C1C7U.LIZIZ("CommentFilterRepoImpl@785b.refreshSettings$1");
        return c189200o6M1boximpl;
    }
}
