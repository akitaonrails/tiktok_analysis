package X;

import com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel;

/* JADX INFO: renamed from: X.0rQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.text.viewmodel.FriendsV3TextFeedListViewModel", f = "FriendsV3TextFeedListViewModel.kt", l = {73}, m = "refreshTextHistory")
public final class C1588060rQa extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FriendsV3TextFeedListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1588060rQa(FriendsV3TextFeedListViewModel friendsV3TextFeedListViewModel, InterfaceC1364105Vn<? super C1588060rQa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsV3TextFeedListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendsV3TextFeedListViewModel@fed4.refreshTextHistory$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objQQ2 = this.LLILLJJLI.QQ2(this);
        C1C7U.LIZIZ("FriendsV3TextFeedListViewModel@fed4.refreshTextHistory$1");
        return objQQ2;
    }
}
