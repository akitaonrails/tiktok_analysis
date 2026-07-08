package X;

import com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner.PoiCampaignSharedViewModel;

/* JADX INFO: renamed from: X.0hIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.content.poicampaign.mainpage.map.inner.PoiCampaignSharedViewModel", f = "PoiCampaignSharedViewModel.kt", l = {93}, m = "onLoadMore")
public final class C1198440hIA extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiCampaignSharedViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1198440hIA(PoiCampaignSharedViewModel poiCampaignSharedViewModel, InterfaceC1364105Vn<? super C1198440hIA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = poiCampaignSharedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiCampaignSharedViewModel@e683.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(this);
        C1C7U.LIZIZ("PoiCampaignSharedViewModel@e683.onLoadMore$1");
        return objBQ2;
    }
}
