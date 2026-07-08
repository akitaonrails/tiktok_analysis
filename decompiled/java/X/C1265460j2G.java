package X;

import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel;

/* JADX INFO: renamed from: X.0j2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowerListViewModel", f = "FollowerListViewModel.kt", l = {103}, m = "onLoadMore")
public final class C1265460j2G extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FollowerListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265460j2G(FollowerListViewModel followerListViewModel, InterfaceC1364105Vn<? super C1265460j2G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = followerListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowerListViewModel@be58.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0, this);
        C1C7U.LIZIZ("FollowerListViewModel@be58.onLoadMore$1");
        return objOnLoadMore;
    }
}
