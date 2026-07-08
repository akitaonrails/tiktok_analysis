package X;

import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;

/* JADX INFO: renamed from: X.0OAP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM", f = "TopicRecommendListVM.kt", l = {123, 152}, m = "onLoadMore")
public final class C0OAP extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TopicRecommendListVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OAP(TopicRecommendListVM topicRecommendListVM, InterfaceC1364105Vn<? super C0OAP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = topicRecommendListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicRecommendListVM@c776.onLoadMore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILZ.onLoadMore(null, this);
        C1C7U.LIZIZ("TopicRecommendListVM@c776.onLoadMore$1");
        return objWQ2;
    }
}
