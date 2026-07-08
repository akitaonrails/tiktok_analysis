package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;

/* JADX INFO: renamed from: X.0hRI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel", f = "NearbyContainerViewModel.kt", l = {708, 712}, m = "fetchData")
public final class C1204100hRI extends AbstractC23140094w {
    public C1203960hR4 LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ NearbyContainerViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204100hRI(NearbyContainerViewModel nearbyContainerViewModel, InterfaceC1364105Vn<? super C1204100hRI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = nearbyContainerViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContainerViewModel@5125.fetchData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZ.yQ2(0L, null, this);
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.fetchData$1");
        return objYQ2;
    }
}
