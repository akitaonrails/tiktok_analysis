package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0gvs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184620gvs extends C09AY implements Function1<C20248814Kw, Unit> {
    public final /* synthetic */ ViewGroup LL;
    public final /* synthetic */ PoiDetailFoodHeaderAssem LLILLJJLI;
    public final /* synthetic */ PoiListApi.PoiDetailResponse LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ PoiReviewsApi.PoiReviewSummaryModel LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184620gvs(ViewGroup viewGroup, PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, boolean z, String str, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel) {
        super(1);
        this.LL = viewGroup;
        this.LLILLJJLI = poiDetailFoodHeaderAssem;
        this.LLILLL = poiDetailResponse;
        this.LLILZ = z;
        this.LLILZIL = str;
        this.LLILZLL = poiReviewSummaryModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20248814Kw c20248814Kw) {
        C20248814Kw c20248814Kw2 = c20248814Kw;
        c20248814Kw2.LIZ = new AwS546S0100000_2(this.LL, 737);
        c20248814Kw2.LIZIZ(new C1184610gvr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        return Unit.LIZ;
    }
}
