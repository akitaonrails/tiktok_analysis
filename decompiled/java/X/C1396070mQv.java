package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;

/* JADX INFO: renamed from: X.0mQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.OfflineCommentDataSource", f = "OfflineCommentDataSource.kt", l = {235, 164}, m = "writeThrough")
public final class C1396070mQv extends AbstractC23140094w {
    public Object LL;
    public CommentItemList LLILLJJLI;
    public InterfaceC383701eN LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1396050mQt LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1396070mQv(C1396050mQt c1396050mQt, InterfaceC1364105Vn<? super C1396070mQv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1396050mQt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentDataSource@a92b.writeThrough$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILZIL.LJIIJJI(null, null, this);
        C1C7U.LIZIZ("OfflineCommentDataSource@a92b.writeThrough$1");
        return objLJIIJJI;
    }
}
