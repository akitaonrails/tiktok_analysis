package X;

import com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel;

/* JADX INFO: renamed from: X.0hSA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.feedcard.vm.NearbyFeedInnerSharedViewModel", f = "NearbyFeedInnerSharedViewModel.kt", l = {306}, m = "innerFetchData")
public final class C1204640hSA extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NearbyFeedInnerSharedViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204640hSA(NearbyFeedInnerSharedViewModel nearbyFeedInnerSharedViewModel, InterfaceC1364105Vn<? super C1204640hSA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = nearbyFeedInnerSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyFeedInnerSharedViewModel@5e7c.innerFetchData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(0L, this);
        C1C7U.LIZIZ("NearbyFeedInnerSharedViewModel@5e7c.innerFetchData$1");
        return objBQ2;
    }
}
