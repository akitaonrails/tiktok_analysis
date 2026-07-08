package X;

import com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel;

/* JADX INFO: renamed from: X.0Ddw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel", f = "UserRecommendListViewModel.kt", l = {55}, m = "onRefresh")
public final class C343860Ddw extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UserRecommendListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C343860Ddw(UserRecommendListViewModel userRecommendListViewModel, InterfaceC1364105Vn<? super C343860Ddw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = userRecommendListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserRecommendListViewModel@914f.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("UserRecommendListViewModel@914f.onRefresh$1");
        return objOnRefresh;
    }
}
