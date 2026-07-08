package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.042c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10328042c extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ C1054104Ah LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10328042c(C1054104Ah c1054104Ah) {
        super(1);
        this.LL = c1054104Ah;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        Object obj;
        List<Integer> listLJJLJ;
        SEACCIPaymentModule sEACCIPaymentModule;
        Object obj2;
        String string;
        LaneParams laneParams2 = laneParams;
        if (this.LL.LIZIZ.get("previous_page") != null) {
            laneParams2.put("previous_page", this.LL.LIZIZ.get("previous_page"));
        }
        laneParams2.put("original_price", this.LL.LIZIZ.get("original_price"));
        laneParams2.put("sale_price", this.LL.LIZIZ.get("sale_price"));
        laneParams2.put("shop_id", this.LL.LIZIZ.get("shop_id"));
        laneParams2.put("product_type", this.LL.LIZIZ.get("product_type"));
        laneParams2.put("is_ad", this.LL.LIZIZ.get("is_ad"));
        laneParams2.put("source_page_type", this.LL.LIZIZ.get("source_page_type"));
        laneParams2.put("entrance_form", this.LL.LIZIZ.get("entrance_form"));
        Object obj3 = this.LL.LIZIZ.get("source_content_id");
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan = null;
        if (obj3 == null) {
            Map<String, Object> map = this.LL.LIZ.trackParams;
            if (map != null) {
                obj3 = map.get("source_content_id");
            } else {
                obj3 = null;
            }
        }
        laneParams2.put("source_content_id", obj3);
        laneParams2.put("enter_from_info", this.LL.LIZIZ.get("enter_from_info"));
        Map<String, Object> map2 = this.LL.LIZ.trackParams;
        if (map2 != null) {
            obj = map2.get("product_id");
        } else {
            obj = null;
        }
        laneParams2.put("product_id", obj);
        laneParams2.put("author_id", this.LL.LIZIZ.get("author_id"));
        laneParams2.put("product_source", this.LL.LIZIZ.get("product_source"));
        laneParams2.put("source", this.LL.LIZIZ.get("source"));
        laneParams2.put("entrance_info", this.LL.LIZIZ.get("entrance_info"));
        laneParams2.put("campaign_id", this.LL.LIZIZ.get("campaign_id"));
        laneParams2.put("campaign_user_tag", this.LL.LIZIZ.get("campaign_user_tag"));
        laneParams2.put("campaign_type", this.LL.LIZIZ.get("campaign_type"));
        laneParams2.put("campaign_channel", this.LL.LIZIZ.get("campaign_channel"));
        laneParams2.put("flashsale_status", this.LL.LIZIZ.get("flashsale_status"));
        laneParams2.put("is_single_sku", this.LL.LIZIZ.get("is_single_sku"));
        laneParams2.put("track_id", this.LL.LIZIZ.get("track_id"));
        laneParams2.put("request_id", this.LL.LIZIZ.get("request_id"));
        laneParams2.put("page_show_type", this.LL.LIZIZ.get("page_show_type"));
        laneParams2.put("anchor_show_type", this.LL.LIZIZ.get("anchor_show_type"));
        Object obj4 = this.LL.LIZIZ.get("enter_from_info");
        String str = "";
        if (obj4 == null) {
            obj4 = "";
        }
        laneParams2.put("enter_from", obj4);
        laneParams2.put("default_list_name", this.LL.LIZIZ.get("default_list_name"));
        Object obj5 = this.LL.LIZIZ.get("origin_source_page");
        if (obj5 == null) {
            obj5 = this.LL.LIZIZ.get("source_page_type");
        }
        laneParams2.put("origin_source_page", obj5);
        laneParams2.put("search_id", this.LL.LIZIZ.get("search_id"));
        laneParams2.put("search_result_id", this.LL.LIZIZ.get("search_result_id"));
        laneParams2.put("search_entrance", this.LL.LIZIZ.get("search_entrance"));
        laneParams2.put("source_module", this.LL.LIZIZ.get("source_module"));
        laneParams2.put("seller_logo_type", this.LL.LIZIZ.get("seller_logo_type"));
        laneParams2.put("logo_type", this.LL.LIZIZ.get("logo_type"));
        laneParams2.put("first_source_page", this.LL.LIZIZ.get("first_source_page"));
        laneParams2.put("first_track_id", this.LL.LIZIZ.get("first_track_id"));
        laneParams2.put("product_category", this.LL.LIZIZ.get("product_category"));
        laneParams2.put("search_result_id", this.LL.LIZIZ.get("search_result_id"));
        laneParams2.put("entrance_form", this.LL.LIZIZ.get("entrance_form"));
        laneParams2.put("enter_from_merge", this.LL.LIZIZ.get("enter_from_merge"));
        laneParams2.put("list_item_id", this.LL.LIZIZ.get("list_item_id"));
        laneParams2.put("is_goda_bff", this.LL.LIZIZ.get("is_goda_bff"));
        laneParams2.put("is_platform_product", this.LL.LIZIZ.get("is_platform_product"));
        laneParams2.put("sale_modes", this.LL.LIZIZ.get("sale_modes"));
        laneParams2.put("platform_product_id", this.LL.LIZIZ.get("platform_product_id"));
        laneParams2.put("seller_product_id", this.LL.LIZIZ.get("seller_product_id"));
        laneParams2.put("platform_seller_id", this.LL.LIZIZ.get("platform_seller_id"));
        laneParams2.put("platform_shop_id", this.LL.LIZIZ.get("platform_shop_id"));
        laneParams2.put("seller_seller_id", this.LL.LIZIZ.get("seller_seller_id"));
        laneParams2.put("seller_shop_id", this.LL.LIZIZ.get("seller_shop_id"));
        laneParams2.put("seller_sku_id", this.LL.LIZIZ.get("seller_sku_id"));
        laneParams2.put("platform_sku_id", this.LL.LIZIZ.get("platform_sku_id"));
        laneParams2.put("trackParams", this.LL.LIZ.trackParams);
        Map<String, Object> map3 = this.LL.LIZ.trackParams;
        if (map3 != null && (obj2 = map3.get("follow_status")) != null && (string = obj2.toString()) != null) {
            str = string;
        }
        laneParams2.plusAssign("follow_status", str);
        if (laneParams2.get((Object) "first_track_id") == null && !Intrinsics.LJFF(laneParams2.get((Object) "source_page_type"), "maybe_you_like") && !Intrinsics.LJFF(laneParams2.get((Object) "source_page_type"), "pdp_shop_recommend") && !Intrinsics.LJFF(laneParams2.get((Object) "source_page_type"), "buy_together")) {
            laneParams2.put("first_track_id", laneParams2.get((Object) "track_id"));
        }
        if (laneParams2.get((Object) "first_source_page") == null && !Intrinsics.LJFF(laneParams2.get((Object) "source_page_type"), "maybe_you_like") && !Intrinsics.LJFF(laneParams2.get((Object) "source_page_type"), "pdp_shop_recommend") && !Intrinsics.LJFF(laneParams2.get((Object) "source_page_type"), "buy_together")) {
            laneParams2.put("first_source_page", laneParams2.get((Object) "source_page_type"));
        }
        C1017603yQ c1017603yQ = InterfaceC1018003yU.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LL.LIZ;
        c1017603yQ.getClass();
        laneParams2.put("traffic_source", Integer.valueOf(C1017603yQ.LIZ(pdpEnterParam)));
        int i = C1742080vR0.LIZ;
        int[] iArrLJFF = C1742080vR0.LJFF(this.LL.LIZ.trackParams);
        if (iArrLJFF != null) {
            listLJJLJ = C13LQ.LJJLJ(iArrLJFF);
        } else {
            listLJJLJ = null;
        }
        laneParams2.put("traffic_source_list", listLJJLJ);
        if (this.LL.LIZIZ.containsKey("origin_product_id")) {
            laneParams2.put("origin_product_id", this.LL.LIZIZ.get("origin_product_id"));
        }
        ProductPackStruct productPackStruct = this.LL.LJIIL;
        if (productPackStruct != null && (sEACCIPaymentModule = productPackStruct.seaCciPaymentModule) != null) {
            seaPaymentInstallmentPlan = sEACCIPaymentModule.cciTopWidget;
        }
        for (Map.Entry entry : ((LinkedHashMap) C10473047r.LIZ(seaPaymentInstallmentPlan)).entrySet()) {
            laneParams2.put(entry.getKey(), entry.getValue());
        }
        return Unit.LIZ;
    }
}
