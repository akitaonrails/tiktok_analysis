package X;

import com.ss.android.ugc.now.interaction.assem.CommentListVM;
import com.ss.android.ugc.now.interaction.model.CommentCursor;

/* JADX INFO: renamed from: X.0lJG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.now.interaction.assem.CommentListVM", f = "CommentListVM.kt", l = {134}, m = "fetchCommentList")
public final class C1352880lJG extends AbstractC23140094w {
    public CommentCursor LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CommentListVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352880lJG(CommentListVM commentListVM, InterfaceC1364105Vn<? super C1352880lJG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = commentListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentListVM@76ac.fetchCommentList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZIL.vQ2(null, null, null, this);
        C1C7U.LIZIZ("CommentListVM@76ac.fetchCommentList$1");
        return objVQ2;
    }
}
