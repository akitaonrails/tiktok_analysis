package X;

import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;

/* JADX INFO: renamed from: X.0y9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {640, 645, 651}, m = "onLoadMore$suspendImpl")
public final class C1846480y9O extends AbstractC23140094w {
    public ExploreTopicGeneralFeedListViewModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846480y9O(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, InterfaceC1364105Vn<? super C1846480y9O> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = exploreTopicGeneralFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objFQ2 = ExploreTopicGeneralFeedListViewModel.FQ2(this.LLILLL, this);
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onLoadMore$1");
        return objFQ2;
    }
}
