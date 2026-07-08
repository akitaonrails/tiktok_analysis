package X;

import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS57S1300000_18;
import kotlin.jvm.internal.AwS61S0010000_18;

/* JADX INFO: renamed from: X.0gvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184610gvr extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ PoiDetailFoodHeaderAssem LL;
    public final /* synthetic */ PoiListApi.PoiDetailResponse LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ PoiReviewsApi.PoiReviewSummaryModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184610gvr(PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, boolean z, String str, PoiReviewsApi.PoiReviewSummaryModel poiReviewSummaryModel) {
        super(2);
        this.LL = poiDetailFoodHeaderAssem;
        this.LLILLJJLI = poiDetailResponse;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = poiReviewSummaryModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = this.LL;
        poiDetailFoodHeaderAssem.vq(poiDetailFoodHeaderAssem.LLJJI, this.LLILLJJLI, "all_review", new AwS61S0010000_18(this.LLILLL, 6), new AwS57S1300000_18(this.LLILZ, this.LLILLJJLI, this.LLILZIL, this.LL, 2));
        return Unit.LIZ;
    }
}
