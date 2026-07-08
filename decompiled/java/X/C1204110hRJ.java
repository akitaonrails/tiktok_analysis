package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;

/* JADX INFO: renamed from: X.0hRJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel", f = "NearbyContainerViewModel.kt", l = {303}, m = "loadMoreFeed")
public final class C1204110hRJ extends AbstractC23140094w {
    public C1203960hR4 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ NearbyContainerViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204110hRJ(NearbyContainerViewModel nearbyContainerViewModel, InterfaceC1364105Vn<? super C1204110hRJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = nearbyContainerViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContainerViewModel@5125.loadMoreFeed$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILLL.EQ2(0L, null, this);
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.loadMoreFeed$1");
        return objEQ2;
    }
}
