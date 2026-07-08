package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;

/* JADX INFO: renamed from: X.0rby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel", f = "FeedSkylightListViewModel.kt", l = {277}, m = "onLoadMore")
public final class C1595120rby extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FeedSkylightListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595120rby(FeedSkylightListViewModel feedSkylightListViewModel, InterfaceC1364105Vn<? super C1595120rby> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = feedSkylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightListViewModel@458.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.onLoadMore$1");
        return objOnLoadMore;
    }
}
