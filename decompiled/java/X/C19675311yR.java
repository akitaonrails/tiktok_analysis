package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.Extra;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendProduct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecom.data.BcmStandardTrackEvent;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11yR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19675311yR extends C09AY implements Function1<SysRecommendFeedItem, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ PhotoSearchEnterParams LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ SysRecommendFeedItem LLILZ;
    public final /* synthetic */ SysRecommendModel LLILZIL;
    public final /* synthetic */ InterfaceC1631630sYr<SysRecommendModel, SysRecommendFeedItem, Integer, String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19675311yR(AwS407S0200000_6 awS407S0200000_6, PhotoSearchEnterParams photoSearchEnterParams, int i, SysRecommendFeedItem sysRecommendFeedItem, SysRecommendModel sysRecommendModel, C19775812Yy c19775812Yy) {
        super(1);
        this.LL = awS407S0200000_6;
        this.LLILLJJLI = photoSearchEnterParams;
        this.LLILLL = i;
        this.LLILZ = sysRecommendFeedItem;
        this.LLILZIL = sysRecommendModel;
        this.LLILZLL = c19775812Yy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SysRecommendFeedItem sysRecommendFeedItem) {
        String str;
        BcmStandardTrackEvent bcmStandardTrackEvent;
        String str2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        IEcomSearchService iEcomSearchService = (IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class);
        if (iEcomSearchService != null) {
            iEcomSearchService.LJI("source_module", "rec_photo_search_guidance_outer_maybe_you_like_module");
        }
        if (sysRecommendFeedItem != null) {
            this.LLILZLL.invoke(this.LLILZIL, sysRecommendFeedItem, Integer.valueOf(this.LLILLL), "photo_search_guidance");
        }
        this.LL.invoke();
        PhotoSearchEnterParams photoSearchEnterParams = this.LLILLJJLI;
        Pair[] pairArr = new Pair[2];
        String str3 = "";
        if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
            str = "";
        }
        pairArr[0] = new Pair("current_page", str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("goods_");
        sbLIZ.append(this.LLILLL + 1);
        pairArr[1] = new Pair("click_type", C2188811AlT.LIZIZ(sbLIZ));
        C675940QfI.LIZJ("photo_search_guidance_click", photoSearchEnterParams, new AwS608S0100000_29(C2097608Jq.LJIIJ(pairArr), (Map<String, String>) 513));
        PhotoSearchEnterParams photoSearchEnterParams2 = this.LLILLJJLI;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("product_id", this.LLILZ.id), new Pair("item_order", String.valueOf(this.LLILLL + 1)));
        SysRecommendProduct sysRecommendProduct = this.LLILZ.product;
        BcmStandardTrackEvent bcmStandardTrackEvent2 = null;
        if (sysRecommendProduct != null) {
            bcmStandardTrackEvent = sysRecommendProduct.bcmStandardTrackEvent;
        } else {
            bcmStandardTrackEvent = null;
        }
        C675940QfI.LIZJ("photo_search_guidance_product_click", photoSearchEnterParams2, new AwS376S0200000_10(mapLJIIJ, (Map<String, String>) bcmStandardTrackEvent, (BcmStandardTrackEvent) 76));
        PhotoSearchEnterParams photoSearchEnterParams3 = this.LLILLJJLI;
        Pair[] pairArr2 = new Pair[8];
        pairArr2[0] = new Pair("page_name", "photo_search_guidance");
        pairArr2[1] = new Pair("source_page_type", "photo_search_guidance");
        pairArr2[2] = new Pair("source_module", "rec_photo_search_guidance_outer_maybe_you_like_module");
        pairArr2[3] = new Pair("item_order", String.valueOf(this.LLILLL + 1));
        pairArr2[4] = new Pair("product_id", this.LLILZ.id);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LLILZIL.requestId);
        sbLIZ2.append('_');
        sbLIZ2.append(this.LLILZ.id);
        sbLIZ2.append('_');
        sbLIZ2.append(this.LLILLL + 1);
        pairArr2[5] = new Pair("track_id", C2188811AlT.LIZIZ(sbLIZ2));
        String str4 = this.LLILZIL.requestId;
        if (str4 == null) {
            str4 = "";
        }
        pairArr2[6] = new Pair("request_id", str4);
        Extra extra = this.LLILZ.extra;
        if (extra != null && (str2 = extra.recommendInfo) != null) {
            str3 = str2;
        }
        pairArr2[7] = new Pair("rec_params", str3);
        Map mapLJIIJ2 = C2097608Jq.LJIIJ(pairArr2);
        SysRecommendProduct sysRecommendProduct2 = this.LLILZ.product;
        if (sysRecommendProduct2 != null) {
            bcmStandardTrackEvent2 = sysRecommendProduct2.bcmStandardTrackEvent;
        }
        C19676011yY.LIZIZ(photoSearchEnterParams3, mapLJIIJ2, bcmStandardTrackEvent2);
        return Unit.LIZ;
    }
}
