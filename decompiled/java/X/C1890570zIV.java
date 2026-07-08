package X;

import com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel;

/* JADX INFO: renamed from: X.0zIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.vm.ExploreTopicGeneralFeedListViewModel", f = "ExploreTopicGeneralFeedListViewModel.kt", l = {565}, m = "onRefresh$suspendImpl")
public final class C1890570zIV extends AbstractC23140094w {
    public ExploreTopicGeneralFeedListViewModel LL;
    public C15TH LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ExploreTopicGeneralFeedListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1890570zIV(ExploreTopicGeneralFeedListViewModel exploreTopicGeneralFeedListViewModel, InterfaceC1364105Vn<? super C1890570zIV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = exploreTopicGeneralFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onRefresh$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objGQ2 = ExploreTopicGeneralFeedListViewModel.GQ2(this.LLILZ, this);
        C1C7U.LIZIZ("ExploreTopicGeneralFeedListViewModel@1fa4.onRefresh$1");
        return objGQ2;
    }
}
