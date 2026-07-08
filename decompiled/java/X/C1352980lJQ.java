package X;

/* JADX INFO: renamed from: X.0lJQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.comment.repository.CommentListRepository$operator$1", f = "CommentListRepository.kt", l = {31}, m = "fetchCommentList")
public final class C1352980lJQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1352990lJR LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352980lJQ(C1352990lJR c1352990lJR, InterfaceC1364105Vn<? super C1352980lJQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1352990lJR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentListRepository@1736.operator$1$fetchCommentList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objH = this.LLILLJJLI.H(null, this);
        C1C7U.LIZIZ("CommentListRepository@1736.operator$1$fetchCommentList$1");
        return objH;
    }
}
