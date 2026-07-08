package X;

import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;

/* JADX INFO: renamed from: X.0lA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel", f = "CommentPollViewModel.kt", l = {314}, m = "deletePoll")
public final class C1347160lA2 extends AbstractC23140094w {
    public Object LL;
    public C1075920e6Y LLILLJJLI;
    public C013C LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ CommentPollViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347160lA2(CommentPollViewModel commentPollViewModel, InterfaceC1364105Vn<? super C1347160lA2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = commentPollViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPollViewModel@efbf.deletePoll$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZLL.yQ2(0L, null, this);
        C1C7U.LIZIZ("CommentPollViewModel@efbf.deletePoll$1");
        return objYQ2;
    }
}
