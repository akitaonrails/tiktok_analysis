package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;

/* JADX INFO: renamed from: X.0OAR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel", f = "TopicSearchViewModel.kt", l = {BaseNotice.RECOMMEND_LIVE, 51, 74}, m = "onLoadMore")
public final class C0OAR extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TopicSearchViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OAR(TopicSearchViewModel topicSearchViewModel, InterfaceC1364105Vn<? super C0OAR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = topicSearchViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicSearchViewModel@6c86.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("TopicSearchViewModel@6c86.onLoadMore$1");
        return objOnLoadMore;
    }
}
