package X;

import com.ss.android.ugc.aweme.compliance.privacy.friendlist.SimpleFriendsListPage;

/* JADX INFO: renamed from: X.0Oct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.friendlist.SimpleFriendsListPage$FriendsListViewModel", f = "SimpleFriendsListPage.kt", l = {304}, m = "onLoadMore")
public final class C623490Oct extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SimpleFriendsListPage.FriendsListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623490Oct(SimpleFriendsListPage.FriendsListViewModel friendsListViewModel, InterfaceC1364105Vn<? super C623490Oct> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = friendsListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SimpleFriendsListPage$FriendsListViewModel@fae2.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("SimpleFriendsListPage$FriendsListViewModel@fae2.onLoadMore$1");
        return objWQ2;
    }
}
