package X;

/* JADX INFO: renamed from: X.0mQx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentDataSource", f = "OfflineCommentDataSource.kt", l = {102}, m = "applyPendingOfflineDigg")
public final class C1396090mQx extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1396050mQt LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396090mQx(C1396050mQt c1396050mQt, InterfaceC1364105Vn<? super C1396090mQx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1396050mQt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentDataSource@a92b.applyPendingOfflineDigg$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("OfflineCommentDataSource@a92b.applyPendingOfflineDigg$1");
        return objLIZIZ;
    }
}
