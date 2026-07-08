package X;

import com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel;

/* JADX INFO: renamed from: X.0OA2, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.revisit.vm.PoiRevisitViewModel", f = "PoiRevisitViewModel.kt", l = {239}, m = "fetchPoiCardListData")
public final class C0OA2 extends AbstractC23140094w {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiRevisitViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OA2(PoiRevisitViewModel poiRevisitViewModel, InterfaceC1364105Vn<? super C0OA2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiRevisitViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRevisitViewModel@2086.fetchPoiCardListData$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(null, this);
        C1C7U.LIZIZ("PoiRevisitViewModel@2086.fetchPoiCardListData$1");
        return objVQ2;
    }
}
