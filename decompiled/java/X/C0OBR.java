package X;

import com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel;

/* JADX INFO: renamed from: X.0OBR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.viewmodel.FollowingListViewModel", f = "FollowingListViewModel.kt", l = {81}, m = "onRefresh")
public final class C0OBR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FollowingListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OBR(FollowingListViewModel followingListViewModel, InterfaceC1364105Vn<? super C0OBR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = followingListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingListViewModel@13fb.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("FollowingListViewModel@13fb.onRefresh$1");
        return objOnRefresh;
    }
}
