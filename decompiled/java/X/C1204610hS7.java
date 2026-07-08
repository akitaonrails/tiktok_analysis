package X;

import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel;

/* JADX INFO: renamed from: X.0hS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedSharedViewModel", f = "NearbyFeedSharedViewModel.kt", l = {724, 454}, m = "onLoadMore")
public final class C1204610hS7 extends AbstractC23140094w {
    public C07WA LL;
    public InterfaceC383701eN LLILLJJLI;
    public C1203960hR4 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ NearbyFeedSharedViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204610hS7(NearbyFeedSharedViewModel nearbyFeedSharedViewModel, InterfaceC1364105Vn<? super C1204610hS7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = nearbyFeedSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("NearbyFeedSharedViewModel@5001.onLoadMore$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILZIL.onLoadMore(null, this);
        C1C7U.LIZIZ("NearbyFeedSharedViewModel@5001.onLoadMore$1");
        return objOnLoadMore;
    }
}
