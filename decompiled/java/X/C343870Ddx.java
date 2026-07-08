package X;

import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;

/* JADX INFO: renamed from: X.0Ddx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel", f = "UserRecommendListViewModel.kt", l = {37}, m = "onLoadMore")
public final class C343870Ddx extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ UserRecommendListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343870Ddx(UserRecommendListViewModel userRecommendListViewModel, InterfaceC1364105Vn<? super C343870Ddx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = userRecommendListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserRecommendListViewModel@914f.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("UserRecommendListViewModel@914f.onLoadMore$1");
        return objOnLoadMore;
    }
}
