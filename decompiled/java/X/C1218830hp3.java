package X;

import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel;

/* JADX INFO: renamed from: X.0hp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFeedViewModel", f = "LandscapeFeedViewModel.kt", l = {65, 66}, m = "onLoadMore")
public final class C1218830hp3 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LandscapeFeedViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218830hp3(LandscapeFeedViewModel landscapeFeedViewModel, InterfaceC1364105Vn<? super C1218830hp3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = landscapeFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeFeedViewModel@c3fe.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("LandscapeFeedViewModel@c3fe.onLoadMore$1");
        return objOnLoadMore;
    }
}
