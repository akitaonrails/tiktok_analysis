package X;

import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;

/* JADX INFO: renamed from: X.0lCM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.service.CommentServiceImpl", f = "CommentServiceImpl.kt", l = {1395}, m = "fetchCommentListV2")
public final class C1348600lCM extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommentServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1348600lCM(CommentServiceImpl commentServiceImpl, InterfaceC1364105Vn<? super C1348600lCM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = commentServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentServiceImpl@82e3.fetchCommentListV2$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJJJI = this.LLILLJJLI.LJJJJI(null, 0, null, null, null, null, null, null, null, null, false, null, null, this);
        C1C7U.LIZIZ("CommentServiceImpl@82e3.fetchCommentListV2$1");
        return objLJJJJI;
    }
}
