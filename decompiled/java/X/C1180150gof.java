package X;

import com.ss.android.ugc.aweme.poi.recommendfeature.list.vm.PoiRecommendFeatureListViewModel;

/* JADX INFO: renamed from: X.0gof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.recommendfeature.list.vm.PoiRecommendFeatureListViewModel", f = "PoiRecommendFeatureListViewModel.kt", l = {114}, m = "onLoadMore")
public final class C1180150gof extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiRecommendFeatureListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1180150gof(PoiRecommendFeatureListViewModel poiRecommendFeatureListViewModel, InterfaceC1364105Vn<? super C1180150gof> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiRecommendFeatureListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiRecommendFeatureListViewModel@890f.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiRecommendFeatureListViewModel@890f.onLoadMore$1");
        return objWQ2;
    }
}
