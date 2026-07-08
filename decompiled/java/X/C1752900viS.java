package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BCMStandardTrack;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedExtra;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0viS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752900viS extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1752920viU LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Feed LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752900viS(C1752920viU c1752920viU, int i, int i2, Feed feed, Map<String, ? extends Object> map, int i3) {
        super(1);
        this.LL = c1752920viU;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = feed;
        this.LLILZIL = map;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        String str;
        Object obj2;
        Object obj3;
        BCMStandardTrack bCMStandardTrack;
        Map<String, String> trackParam;
        Map<String, Object> map;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("click_area", "atc_button");
        laneParams2.plusAssign("request_id", this.LL.LLILZ);
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LL.LLILLL.LLJI;
        if (pdpEnterParam == null || (map = pdpEnterParam.trackParams) == null || (obj = map.get("enter_from")) == null) {
            obj = "homepage_mall";
        }
        laneParams2.plusAssign("enter_from", obj);
        laneParams2.plusAssign("is_free_shipping", Integer.valueOf(this.LLILLJJLI));
        laneParams2.plusAssign("source_previous_page", "product_detail");
        laneParams2.plusAssign("source_page_type", "pdp_shop_recommend");
        laneParams2.plusAssign("entrance_form", "horizontal_goods_card");
        laneParams2.plusAssign("item_order", Integer.valueOf(this.LLILLL + 1));
        FeedExtra feedExtra = this.LLILZ.extra;
        String str2 = null;
        if (feedExtra != null) {
            str = feedExtra.recommendInfo;
        } else {
            str = null;
        }
        laneParams2.plusAssign("rec_params", str);
        Map<String, Object> map2 = this.LLILZIL;
        if (map2 != null) {
            obj2 = map2.get("product_source");
        } else {
            obj2 = null;
        }
        laneParams2.plusAssign("product_source", obj2);
        Map<String, Object> map3 = this.LLILZIL;
        if (map3 != null) {
            obj3 = map3.get("sales_price");
        } else {
            obj3 = null;
        }
        laneParams2.plusAssign("sales_price", obj3);
        laneParams2.plusAssign("button_type", "add_to_cart");
        laneParams2.plusAssign("button_name", "add_to_cart");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LLILZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LLILLL + 1);
        laneParams2.plusAssign("track_id", C2188811AlT.LIZIZ(sbLIZ));
        ShopProductData shopProductData = this.LLILZ.shopProduct;
        if (shopProductData != null) {
            str2 = shopProductData.id;
        }
        laneParams2.plusAssign("product_id", str2);
        String str3 = "skip_pdp";
        laneParams2.plusAssign("purchase_path", "skip_pdp");
        if (this.LLILZLL > 1) {
            str3 = "pass_sku";
        }
        laneParams2.plusAssign("pdp_path", str3);
        laneParams2.plusAssign("entrance_info", "");
        laneParams2.plusAssign("original_price", "");
        laneParams2.plusAssign("sale_price", "");
        laneParams2.withParamsGroup(this.LL.LLILLL.LLILZIL.LIZJ(new C817803Hk("c2791.d8830", Integer.valueOf(this.LLILLL))));
        ShopProductData shopProductData2 = this.LLILZ.shopProduct;
        if (shopProductData2 != null && (bCMStandardTrack = shopProductData2.standardEvent) != null && (trackParam = bCMStandardTrack.getTrackParam()) != null) {
            for (Map.Entry<String, String> entry : trackParam.entrySet()) {
                laneParams2.put(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }
}
