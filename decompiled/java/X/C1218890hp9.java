package X;

import com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFYPViewModel;

/* JADX INFO: renamed from: X.0hp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.viewmodels.LandscapeFYPViewModel", f = "LandscapeFYPViewModel.kt", l = {117}, m = "onLoadMore")
public final class C1218890hp9 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LandscapeFYPViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218890hp9(LandscapeFYPViewModel landscapeFYPViewModel, InterfaceC1364105Vn<? super C1218890hp9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = landscapeFYPViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandscapeFYPViewModel@aed5.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("LandscapeFYPViewModel@aed5.onLoadMore$1");
        return objOnLoadMore;
    }
}
