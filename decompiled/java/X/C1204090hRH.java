package X;

import com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel;

/* JADX INFO: renamed from: X.0hRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.nearby.container.vm.NearbyContainerViewModel", f = "NearbyContainerViewModel.kt", l = {346}, m = "fetchDataChunk")
public final class C1204090hRH extends AbstractC23140094w {
    public C1203960hR4 LL;
    public Object LLILLJJLI;
    public C118300cf LLILLL;
    public AnonymousClass0954 LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ NearbyContainerViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204090hRH(NearbyContainerViewModel nearbyContainerViewModel, InterfaceC1364105Vn<? super C1204090hRH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = nearbyContainerViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NearbyContainerViewModel@5125.fetchDataChunk$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILZLL.zQ2(null, this);
        C1C7U.LIZIZ("NearbyContainerViewModel@5125.fetchDataChunk$1");
        return objZQ2;
    }
}
