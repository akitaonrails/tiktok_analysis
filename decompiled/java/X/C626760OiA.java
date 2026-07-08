package X;

import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;

/* JADX INFO: renamed from: X.0OiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM", f = "TopicReviewListVM.kt", l = {68}, m = "onLoadMore")
public final class C626760OiA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TopicReviewListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626760OiA(TopicReviewListVM topicReviewListVM, InterfaceC1364105Vn<? super C626760OiA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = topicReviewListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicReviewListVM@98b3.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0L, this);
        C1C7U.LIZIZ("TopicReviewListVM@98b3.onLoadMore$1");
        return objOnLoadMore;
    }
}
