package X;

import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;

/* JADX INFO: renamed from: X.0hKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel", f = "PoiClaimPoiListViewModel.kt", l = {127, 139}, m = "sendRequest")
public final class C1200060hKm extends AbstractC23140094w {
    public C1200100hKq LL;
    public C1197720hH0 LLILLJJLI;
    public C259800zU LLILLL;
    public C259800zU LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ PoiClaimPoiListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200060hKm(PoiClaimPoiListViewModel poiClaimPoiListViewModel, InterfaceC1364105Vn<? super C1200060hKm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = poiClaimPoiListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiClaimPoiListViewModel@5469.sendRequest$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZLL.yQ2(null, this);
        C1C7U.LIZIZ("PoiClaimPoiListViewModel@5469.sendRequest$1");
        return objYQ2;
    }
}
