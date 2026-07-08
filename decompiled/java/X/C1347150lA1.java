package X;

import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;

/* JADX INFO: renamed from: X.0lA1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel", f = "CommentPollViewModel.kt", l = {177}, m = "confirmPublish")
public final class C1347150lA1 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1347140lA0 LLILZ;
    public C259800zU LLILZIL;
    public int LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ CommentPollViewModel LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1347150lA1(CommentPollViewModel commentPollViewModel, InterfaceC1364105Vn<? super C1347150lA1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = commentPollViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPollViewModel@efbf.confirmPublish$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLJ.xQ2(0, null, null, null, this);
        C1C7U.LIZIZ("CommentPollViewModel@efbf.confirmPublish$1");
        return objXQ2;
    }
}
