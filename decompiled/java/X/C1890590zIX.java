package X;

import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;

/* JADX INFO: renamed from: X.0zIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {311}, m = "fetchListInternal")
public final class C1890590zIX extends AbstractC23140094w {
    public ExploreFeedRequestOverride LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890590zIX(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, InterfaceC1364105Vn<? super C1890590zIX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = exploreTopicGeneralFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.fetchListInternal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLL.xQ2(null, this);
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.fetchListInternal$1");
        return objXQ2;
    }
}
