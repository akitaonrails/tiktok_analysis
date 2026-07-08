package X;

import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;

/* JADX INFO: renamed from: X.0lA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel", f = "CommentPollViewModel.kt", l = {287}, m = "cancelVote")
public final class C1347170lA3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommentPollViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347170lA3(CommentPollViewModel commentPollViewModel, InterfaceC1364105Vn<? super C1347170lA3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = commentPollViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPollViewModel@efbf.cancelVote$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(0, 0L, null, this);
        C1C7U.LIZIZ("CommentPollViewModel@efbf.cancelVote$1");
        return objVQ2;
    }
}
