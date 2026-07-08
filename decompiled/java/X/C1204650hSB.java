package X;

import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel;

/* JADX INFO: renamed from: X.0hSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel", f = "NearbyFeedInnerSharedViewModel.kt", l = {289}, m = "loadMoreInnerFeed")
public final class C1204650hSB extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ NearbyFeedInnerSharedViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204650hSB(NearbyFeedInnerSharedViewModel nearbyFeedInnerSharedViewModel, InterfaceC1364105Vn<? super C1204650hSB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = nearbyFeedInnerSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyFeedInnerSharedViewModel@5e7c.loadMoreInnerFeed$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.CQ2(0L, this);
        C1C7U.LIZIZ("NearbyFeedInnerSharedViewModel@5e7c.loadMoreInnerFeed$1");
        return objCQ2;
    }
}
