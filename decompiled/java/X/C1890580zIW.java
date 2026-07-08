package X;

import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;

/* JADX INFO: renamed from: X.0zIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {210}, m = "fetchList")
public final class C1890580zIW extends AbstractC23140094w {
    public C15TH LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890580zIW(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, InterfaceC1364105Vn<? super C1890580zIW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = exploreTopicGeneralFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.fetchList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.wQ2(null, this);
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.fetchList$1");
        return objWQ2;
    }
}
