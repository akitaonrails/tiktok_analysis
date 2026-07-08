package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.048a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10482048a extends C04CK {
    public C10482048a() {
        super("tiktokec_confirm_cart_result", "lib_track_builtin_lane_business");
    }

    @Override // X.AbstractC1748790vbp
    public final C1748850vbv LIZ() {
        return new C1748850vbv(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]), new C1748840vbu("source_button", new C1747940vaS[0]), new C1748840vbu("button_type", new C1747940vaS[0]), new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("previous_page", new C1747940vaS[0]), new C1748840vbu("author_id", new C1747940vaS[0]), new C1748840vbu("cart_form", new C1747940vaS[0]), new C1748840vbu("source_content_id", new C1747940vaS[0]), new C1748840vbu("enter_from_info", new C1747940vaS[0]), new C1748840vbu("product_id", new C1747940vaS[0]), new C1748840vbu("sku_id", new C1747940vaS[0]), new C1748840vbu("is_single_sku", new C1747940vaS[0]), new C1748840vbu("product_source", new C1747940vaS[0]), new C1748840vbu("source_from", new C1747940vaS[0]), new C1748840vbu("source", new C1747940vaS[0]), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("page_show_type", new C1747940vaS[0]), new C1748840vbu("source_page_type", new C1747940vaS[0]), new C1748840vbu("product_type", new C1747940vaS[0]), new C1748840vbu("original_price", new C1747940vaS[0]), new C1748840vbu("sales_price", new C1747940vaS[0]), new C1748840vbu("sale_price", new C1747940vaS[0]), new C1748840vbu("follow_status", new C1747940vaS[0]), new C1748840vbu("campaign_id", new C1747940vaS[0]), new C1748840vbu("campaign_type", new C1747940vaS[0]), new C1748840vbu("campaign_user_tag", new C1747940vaS[0]), new C1748840vbu("campaign_channel", new C1747940vaS[0]), new C1748840vbu("campaign_cost_role", new C1747940vaS[0]), new C1748840vbu("btm", new C1747940vaS[0]), new C1748840vbu("btm_pre", new C1747940vaS[0]), new C1748840vbu("btm_ppre", new C1747940vaS[0]), new C1748840vbu("btm_show_id", new C1747940vaS[0]), new C1748840vbu("bundle_id", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal"))), new C1748840vbu("is_discounted_bundle_deal", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal"))), new C1748840vbu("add_sku_num", new C1747940vaS[0]), new C1748840vbu("bundle_add_fail_reason", new C1747940vaS[0]), new C1748840vbu("fail_reason", new C1747940vaS[0]), new C1748840vbu("sku_num_before", new C1747940vaS[0]), new C1748840vbu("sku_num_after", new C1747940vaS[0]), new C1748840vbu("cart_item_id", new C1747940vaS[0]), new C1748840vbu("source_module", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("rec_params", new C1747940vaS[0]), new C1748840vbu("request_id", new C1747940vaS[0]), new C1748840vbu("first_source_page", new C1747940vaS[0]), new C1748840vbu("first_track_id", new C1747940vaS[0]), new C1748840vbu("parent_track_id", new C1747940vaS[0]), new C1748840vbu("parent_product_id", new C1747940vaS[0]), new C1748840vbu("track_id", new C1747940vaS[0]), new C1748840vbu("parent_request_id", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("is_success", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("search_entrance", new C1747940vaS[0]), new C1748840vbu("search_id", new C1747940vaS[0]), new C1748840vbu("search_result_id", new C1747940vaS[0]), new C1748840vbu("search_keyword", new C1747940vaS[0]), new C1748840vbu("search_pre_product_id", new C1747940vaS[0]), new C1748840vbu("last_from_group_id", new C1747940vaS[0]), new C1748840vbu("is_inner", new C1747940vaS[0]), new C1748840vbu("inner_search_id", new C1747940vaS[0]), new C1748840vbu("rank_inner", new C1747940vaS[0]), new C1748840vbu("is_slide", new C1747940vaS[0]), new C1748840vbu("slide_rank", new C1747940vaS[0]), new C1748840vbu("checkout_type", new C1747940vaS[0]), new C1748840vbu("is_platform_product", new C1747940vaS[0]), new C1748840vbu("sale_modes", new C1747940vaS[0]), new C1748840vbu("seller_product_id", new C1747940vaS[0]), new C1748840vbu("platform_product_id", new C1747940vaS[0]), new C1748840vbu("seller_sku_id", new C1747940vaS[0]), new C1748840vbu("platform_sku_id", new C1747940vaS[0]), new C1748840vbu("seller_seller_id", new C1747940vaS[0]), new C1748840vbu("seller_shop_id", new C1747940vaS[0]), new C1748840vbu("platform_seller_id", new C1747940vaS[0]), new C1748840vbu("platform_shop_id", new C1747940vaS[0]), new C1748840vbu("delivery_flag_sku", new C1747940vaS[0]));
    }

    @Override // X.AbstractC1748750vbl
    public final void LJII(LaneParams laneParams, LaneParams laneParams2) {
        if (Intrinsics.LJFF(laneParams.get("source_page_type"), "buy_together")) {
            laneParams.put("parent_track_id", laneParams2.get("track_id"));
            laneParams.put("parent_request_id", laneParams2.get("request_id"));
            laneParams.put("parent_product_id", laneParams2.get("product_id"));
        }
    }
}
