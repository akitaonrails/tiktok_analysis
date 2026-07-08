package X;

import com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel;

/* JADX INFO: renamed from: X.0gtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.recommendfeature.detail.vm.PoiRecommendFeatureDetailSharedViewModel", f = "PoiRecommendFeatureDetailSharedViewModel.kt", l = {226}, m = "onLoadMore")
public final class C1183100gtQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiRecommendFeatureDetailSharedViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1183100gtQ(PoiRecommendFeatureDetailSharedViewModel poiRecommendFeatureDetailSharedViewModel, InterfaceC1364105Vn<? super C1183100gtQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiRecommendFeatureDetailSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRecommendFeatureDetailSharedViewModel@4cfe.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiRecommendFeatureDetailSharedViewModel@4cfe.onLoadMore$1");
        return objCQ2;
    }
}
