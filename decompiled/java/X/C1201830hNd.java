package X;

import com.ss.android.ugc.nearby.roaming.RegionSearchViewModel;

/* JADX INFO: renamed from: X.0hNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.roaming.RegionSearchViewModel", f = "RegionSearchViewModel.kt", l = {43}, m = "onLoadMore")
public final class C1201830hNd extends AbstractC23140094w {
    public C1201850hNf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ RegionSearchViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201830hNd(RegionSearchViewModel regionSearchViewModel, InterfaceC1364105Vn<? super C1201830hNd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = regionSearchViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionSearchViewModel@e768.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(null, this);
        C1C7U.LIZIZ("RegionSearchViewModel@e768.onLoadMore$1");
        return objOnLoadMore;
    }
}
