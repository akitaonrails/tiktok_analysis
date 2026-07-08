package X;

import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;

/* JADX INFO: renamed from: X.0lA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel", f = "CommentPollViewModel.kt", l = {268}, m = "castVote")
public final class C1347180lA4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommentPollViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347180lA4(CommentPollViewModel commentPollViewModel, InterfaceC1364105Vn<? super C1347180lA4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = commentPollViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPollViewModel@efbf.castVote$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(0, 0L, null, this);
        C1C7U.LIZIZ("CommentPollViewModel@efbf.castVote$1");
        return objWQ2;
    }
}
