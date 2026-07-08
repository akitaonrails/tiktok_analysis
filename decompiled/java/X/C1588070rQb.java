package X;

import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;

/* JADX INFO: renamed from: X.0rQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel", f = "FriendsV3FeedListViewModel.kt", l = {804}, m = "onLoadLatest$suspendImpl")
public final class C1588070rQb extends AbstractC23140094w {
    public FriendsV3FeedListViewModel LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FriendsV3FeedListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588070rQb(FriendsV3FeedListViewModel friendsV3FeedListViewModel, InterfaceC1364105Vn<? super C1588070rQb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = friendsV3FeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3FeedListViewModel@293.onLoadLatest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objEQ2 = FriendsV3FeedListViewModel.EQ2(this.LLILLL, null, this);
        C1C7U.LIZIZ("FriendsV3FeedListViewModel@293.onLoadLatest$1");
        return objEQ2;
    }
}
