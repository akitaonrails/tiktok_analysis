package X;

/* JADX INFO: renamed from: X.0mQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentDataSource", f = "OfflineCommentDataSource.kt", l = {235, 155, 160}, m = "applyInteractionToSnapshot")
public final class C1396080mQw extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1396050mQt LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396080mQw(C1396050mQt c1396050mQt, InterfaceC1364105Vn<? super C1396080mQw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1396050mQt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OfflineCommentDataSource@a92b.applyInteractionToSnapshot$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(0, null, null, this);
        C1C7U.LIZIZ("OfflineCommentDataSource@a92b.applyInteractionToSnapshot$1");
        return objLIZ;
    }
}
