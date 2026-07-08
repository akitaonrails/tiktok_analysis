package X;

import com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel;

/* JADX INFO: renamed from: X.0hKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.claim.vm.PoiClaimPoiListViewModel", f = "PoiClaimPoiListViewModel.kt", l = {89}, m = "onRefresh")
public final class C1200070hKn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiClaimPoiListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1200070hKn(PoiClaimPoiListViewModel poiClaimPoiListViewModel, InterfaceC1364105Vn<? super C1200070hKn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiClaimPoiListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiClaimPoiListViewModel@5469.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("PoiClaimPoiListViewModel@5469.onRefresh$1");
        return objOnRefresh;
    }
}
