package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.lockup.SeaPdpInfoViewHolder;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS16S1201000_1;
import kotlin.jvm.internal.AwS1S1211000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04Gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1070604Gq implements InterfaceC1071204Gw {
    public final HashSet<String> LIZ = new HashSet<>();
    public final HashMap<String, String> LIZIZ = new HashMap<>();
    public final PageFinder LIZJ;
    public final /* synthetic */ SeaPdpInfoViewHolder LIZLLL;

    public C1070604Gq(SeaPdpInfoViewHolder seaPdpInfoViewHolder) {
        this.LIZLLL = seaPdpInfoViewHolder;
        this.LIZJ = PageFinder.via(seaPdpInfoViewHolder.itemView);
    }

    @Override // X.InterfaceC1071204Gw
    public final void LIZIZ(C426350Gnh c426350Gnh, List list, String str) {
        String string;
        String string2;
        String string3;
        Object obj;
        Object obj2;
        Object obj3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList = (ArrayList) list;
        int i = 0;
        for (Object obj4 : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                PromotionLabel promotionLabel = (PromotionLabel) obj4;
                Integer numValueOf = Integer.valueOf(i);
                Map<String, Object> map = promotionLabel.daInfo;
                if (map == null || (obj3 = map.get("promotion_tag_id")) == null || (string = obj3.toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put(numValueOf, string);
                Integer numValueOf2 = Integer.valueOf(i);
                Map<String, Object> map2 = promotionLabel.daInfo;
                if (map2 == null || (obj2 = map2.get("promotion_tag_type")) == null || (string2 = obj2.toString()) == null) {
                    string2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap2.put(numValueOf2, string2);
                Integer numValueOf3 = Integer.valueOf(i);
                Map<String, Object> map3 = promotionLabel.daInfo;
                if (map3 == null || (obj = map3.get("instance_key")) == null || (string3 = obj.toString()) == null || a0.LJJJIL(string3)) {
                    string3 = "-1";
                }
                linkedHashMap3.put(numValueOf3, string3);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LIZIZ.put("promotion_tag_id", C1741890vQh.LJIIIIZZ(linkedHashMap));
        this.LIZIZ.put("promotion_tag_type", C1741890vQh.LJIIIIZZ(linkedHashMap2));
        this.LIZIZ.put("promotion_tag_cnt", String.valueOf(arrayList.size()));
        this.LIZIZ.put("instance_key", C1741890vQh.LJIIIIZZ(linkedHashMap3));
        C1748720vbi.LJI(c426350Gnh, new C10515049h(), AFwS185S0000000_1.get$arr$(154), "c5400.d0", this.LIZJ, new AwS86S1200000_1(this.LIZLLL, str, this, 16));
    }

    @Override // X.InterfaceC1071204Gw
    public final void LIZJ(C426350Gnh c426350Gnh, List list, boolean z, String str) {
        String str2;
        PromotionLabel promotionLabel = (PromotionLabel) C13LP.LJJJLL(list);
        if (promotionLabel != null && (str2 = promotionLabel.schema) != null) {
            C1748720vbi.LJ(c426350Gnh, new C10516049i(), "c5400.d0", this.LIZJ, new AwS86S1200000_1(this.LIZLLL, str, this, 15));
            if (z) {
                this.LIZLLL.d6().LLLLLJIL.LIZJ(c426350Gnh.getContext(), str2, null, "coupon");
            }
        }
    }

    @Override // X.InterfaceC1071204Gw
    public final void LIZLLL(View view, int i, PromotionLabel promotionLabel, String str) {
        String string;
        String str2 = promotionLabel.schema;
        if (str2 != null && str2.length() != 0) {
            C04GO c04go = this.LIZLLL.d6().LLLLLJIL;
            Context context = view.getContext();
            String str3 = promotionLabel.schema;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = promotionLabel.idStr;
            String str5 = promotionLabel.instanceKey;
            if (str4 == null) {
                string = null;
            } else {
                n nVar = new n();
                nVar.LJJIIJ("voucher_type_id", str4);
                if (str5 != null) {
                    nVar.LJJIIJ("instance_key", str5);
                }
                string = nVar.toString();
            }
            c04go.LIZJ(context, str3, string, "coupon");
            C04CK c04ck = new C04CK() { // from class: X.049l
                @Override // X.AbstractC1748790vbp
                public final C1748850vbv LIZ() {
                    C323580CmK c323580CmK = new C323580CmK(161);
                    c323580CmK.LIZ(new C1748840vbu("EVENT_ORIGIN_FEATURE", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("page_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("source_page_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("entrance_form", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("source_content_id", new C1747940vaS(new C1748000vaY("", ""))));
                    c323580CmK.LIZ(new C1748840vbu("enter_from_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("enter_from", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("enter_from_merge", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("product_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("product_source", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("source", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("entrance_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("ttf_page_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("previous_page", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_text", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("follow_status", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sub_page_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("area", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_valid", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("invalid_reason_code", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("promotion_tag_order", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("promotion_tag_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("promotion_tag_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("has_rate", new C1747940vaS(new C1748000vaY("page_name", "product_detail")), new C1747940vaS(new C1748000vaY("page_name", "product_review"))));
                    c323580CmK.LIZ(new C1748840vbu("is_fullscreen", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("rate", new C1747940vaS(new C1748000vaY("page_name", "product_detail")), new C1747940vaS(new C1748000vaY("page_name", "product_review"))));
                    c323580CmK.LIZ(new C1748840vbu("review_cnt", new C1747940vaS(new C1748000vaY("page_name", "product_detail")), new C1747940vaS(new C1748000vaY("page_name", "product_review"))));
                    c323580CmK.LIZ(new C1748840vbu("fitness_info", new C1747940vaS(new C1748000vaY("page_name", "product_detail")), new C1747940vaS(new C1748000vaY("page_name", "product_review"))));
                    c323580CmK.LIZ(new C1748840vbu("bundle_id", new C1747940vaS(new C1748000vaY("module_name", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("is_discounted_bundle_deal", new C1747940vaS(new C1748000vaY("module_name", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("coupon_id", new C1747940vaS(new C1748000vaY("module_name", "discounts")), new C1747940vaS(new C1748000vaY("module_name", "voucher_sticky_bottom")), new C1747940vaS(new C1748000vaY("module_name", "bottom_voucher_remind"))));
                    c323580CmK.LIZ(new C1748840vbu("coupon_type_id", new C1747940vaS(new C1748000vaY("module_name", "discounts")), new C1747940vaS(new C1748000vaY("module_name", "buy_together")), new C1747940vaS(new C1748000vaY("module_name", "voucher_sticky_bottom")), new C1747940vaS(new C1748000vaY("module_name", "bottom_voucher_remind"))));
                    c323580CmK.LIZ(new C1748840vbu("coupon_type_info", new C1747940vaS(new C1748000vaY("module_name", "discounts")), new C1747940vaS(new C1748000vaY("module_name", "buy_together")), new C1747940vaS(new C1748000vaY("module_name", "voucher_sticky_bottom")), new C1747940vaS(new C1748000vaY("module_name", "bottom_voucher_remind"))));
                    c323580CmK.LIZ(new C1748840vbu("coupon_type", new C1747940vaS(new C1748000vaY("module_name", "discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("coupon_cost_role", new C1747940vaS(new C1748000vaY("module_name", "discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("discount_amount", new C1747940vaS(new C1748000vaY("module_name", "discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("module_item_cnt", new C1747940vaS(new C1748000vaY("module_name", "discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("is_new_user_tag", new C1747940vaS(new C1748000vaY("module_name", "discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("is_coupon_available", new C1747940vaS(new C1748000vaY("module_name", "platform_discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("click_area", new C1747940vaS(new C1748000vaY("module_name", "sku")), new C1747940vaS(new C1748000vaY("module_name", "address")), new C1747940vaS(new C1748000vaY("module_name", "promotion")), new C1747940vaS(new C1748000vaY("module_name", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "order_summary")), new C1747940vaS(new C1748000vaY("module_name", "logistics")), new C1747940vaS(new C1748000vaY("module_name", "platform_discounts")), new C1747940vaS(new C1748000vaY("module_name", "user_trust")), new C1747940vaS(new C1748000vaY("module_name", "impression_tag")), new C1747940vaS(new C1748000vaY("module_name", "shop_review_entrance"))));
                    c323580CmK.LIZ(new C1748840vbu("click_type", new C1747940vaS(new C1748000vaY("module_name", "sku")), new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"))));
                    c323580CmK.LIZ(new C1748840vbu("author_id", new C1747940vaS(new C1748000vaY("page_name", "product_detail")), new C1747940vaS(new C1748000vaY("module_type", "user_rights")), new C1747940vaS(new C1748000vaY("page_name", "product_review"))));
                    c323580CmK.LIZ(new C1748840vbu("rights_content", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("page_show_type", new C1747940vaS(new C1748000vaY("page_name", "product_detail")), new C1747940vaS(new C1748000vaY("page_name", "product_review"))));
                    c323580CmK.LIZ(new C1748840vbu("is_photo_show", new C1747940vaS(new C1748000vaY("module_name", "sku"))));
                    c323580CmK.LIZ(new C1748840vbu("jump_link", new C1747940vaS(new C1748000vaY("module_name", "flash_sale")), new C1747940vaS(new C1748000vaY("module_name", "new_user_deal")), new C1747940vaS(new C1748000vaY("module_name", "commerce_resource"))));
                    c323580CmK.LIZ(new C1748840vbu("has_icon", new C1747940vaS(new C1748000vaY("module_name", "flash_sale")), new C1747940vaS(new C1748000vaY("module_name", "new_user_deal")), new C1747940vaS(new C1748000vaY("module_name", "commerce_resource"))));
                    c323580CmK.LIZ(new C1748840vbu("module_title", new C1747940vaS(new C1748000vaY("module_name", "flash_sale")), new C1747940vaS(new C1748000vaY("module_name", "new_user_deal")), new C1747940vaS(new C1748000vaY("module_name", "commerce_resource"))));
                    c323580CmK.LIZ(new C1748840vbu("module_describe", new C1747940vaS(new C1748000vaY("module_name", "flash_sale")), new C1747940vaS(new C1748000vaY("module_name", "new_user_deal")), new C1747940vaS(new C1748000vaY("module_name", "commerce_resource"))));
                    c323580CmK.LIZ(new C1748840vbu("source_page", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("first_source_page", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("campaign_id", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "buy_together")), new C1747940vaS(new C1748000vaY("module_name", "promotion")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("campaign_type", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "buy_together")), new C1747940vaS(new C1748000vaY("module_name", "promotion")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("campaign_channel", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "promotion")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("campaign_zone", new C1747940vaS(new C1748000vaY("module_name", "platform_discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("campaign_user_tag", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "promotion")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("campaign_cost_role", new C1747940vaS(new C1748000vaY("source_page_type", "bundle_deal")), new C1747940vaS(new C1748000vaY("module_name", "promotion")), new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("other_campaign", new C1747940vaS(new C1748000vaY("module_name", "discounts"), new C1748000vaY("coupon_cost_role", "seller"))));
                    c323580CmK.LIZ(new C1748840vbu("module_type", new C1747940vaS(new C1748000vaY("module_type", "user_rights")), new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"), new C1748000vaY("module_type", "select")), new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"), new C1748000vaY("module_type", "register"))));
                    c323580CmK.LIZ(new C1748840vbu("is_valid", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("invalid_reason", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("is_default", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("is_selected", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("is_address_deliverable", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("parent_source_page_type", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("source_previous_page", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("source_button", new C1747940vaS(new C1748000vaY("module_name", "address"))));
                    c323580CmK.LIZ(new C1748840vbu("shop_review_cnt", new C1747940vaS(new C1748000vaY("module_name", "shop_review_entrance"))));
                    c323580CmK.LIZ(new C1748840vbu("rank", new C1747940vaS(new C1748000vaY("module_name", "address")), new C1747940vaS(new C1748000vaY("module_name", "logistics")), new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater")), new C1747940vaS(new C1748000vaY("module_name", "skc_selection")), new C1747940vaS(new C1748000vaY("module_name", "size_selection")), new C1747940vaS(new C1748000vaY("module_name", "order"))));
                    c323580CmK.LIZ(new C1748840vbu("skc_id", new C1747940vaS(new C1748000vaY("module_name", "skc_selection"))));
                    c323580CmK.LIZ(new C1748840vbu("first_skc_id", new C1747940vaS(new C1748000vaY("module_name", "skc_selection"))));
                    c323580CmK.LIZ(new C1748840vbu("size_id", new C1747940vaS(new C1748000vaY("module_name", "size_selection"))));
                    c323580CmK.LIZ(new C1748840vbu("shop_review_cnt", new C1747940vaS(new C1748000vaY("module_name", "shop_review_entrance"))));
                    c323580CmK.LIZ(new C1748840vbu("first_source_page", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("summary_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("order_summary_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("rights_cnt", new C1747940vaS(new C1748000vaY("module_name", "user_rights")), new C1747940vaS(new C1748000vaY("module_name", "user_rights_bottom"))));
                    c323580CmK.LIZ(new C1748840vbu("rights_content", new C1747940vaS(new C1748000vaY("module_name", "user_rights")), new C1747940vaS(new C1748000vaY("module_name", "user_rights_bottom"))));
                    c323580CmK.LIZ(new C1748840vbu("module_show_type", new C1747940vaS(new C1748000vaY("module_name", "user_rights")), new C1747940vaS(new C1748000vaY("module_name", "user_rights_bottom"))));
                    c323580CmK.LIZ(new C1748840vbu("shop_id", new C1747940vaS(new C1748000vaY("module_name", "seller_detail"))));
                    c323580CmK.LIZ(new C1748840vbu("photo_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("first_photo_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sale_prop_status", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("deduction_text", new C1747940vaS(new C1748000vaY("module_name", "discount_reminder"))));
                    c323580CmK.LIZ(new C1748840vbu("text", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_discount_cnt", new C1747940vaS(new C1748000vaY("module_name", "seller_discounts"))));
                    c323580CmK.LIZ(new C1748840vbu("impression_tag_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("est_delivery_day_min", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("shipping_price", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("shipping_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("shipping_currency", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("free_shipping_condition", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("click_area", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("ship_from", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("est_delivery_day_max", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("photo_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("video_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sku_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("delivery_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("ranking_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("ranking_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("ranking_num", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("user_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_clickable", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("delivery_info", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("bonus_guide", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("earn_bonus", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("redeem_bonus", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_option_cnt", new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"))));
                    c323580CmK.LIZ(new C1748840vbu("installment_cnt", new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"))));
                    c323580CmK.LIZ(new C1748840vbu("total_payment", new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"))));
                    c323580CmK.LIZ(new C1748840vbu("service_fee", new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"))));
                    c323580CmK.LIZ(new C1748840vbu("currency", new C1747940vaS(new C1748000vaY("module_name", "tiktok_paylater"))));
                    c323580CmK.LIZ(new C1748840vbu("total_product_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_next_day_delivery", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("logo_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("seller_logo_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("edt_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_coupon_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("module_discount_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("entrance_zone", new C1747940vaS(new C1748000vaY("module_name", "add_on_reminder"))));
                    c323580CmK.LIZ(new C1748840vbu("more_required_amt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("delivery_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("delivery_option", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("shop_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sku_num", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("item_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("gift_sku_num", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("gift_item_num", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("video_type", new C1747940vaS(new C1748000vaY("module_name", "product_video"))));
                    c323580CmK.LIZ(new C1748840vbu("sub_module_name", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("btm", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("btm_pre", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("btm_ppre", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("btm_show_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("checkout_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("applied_discount_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("discount_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("request_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("track_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_platform_product", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sale_modes", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("seller_product_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("platform_product_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("seller_sku_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("platform_sku_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("seller_seller_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("seller_shop_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("platform_seller_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("platform_shop_id", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_goda_bff", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("rights_content", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("cost_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("coupon_amount", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("coupon_cnt", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("has_sku_recommend_tag", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("sku_recommend_tag_type", new C1747940vaS[0]));
                    c323580CmK.LIZ(new C1748840vbu("is_single_sku", new C1747940vaS(new C1748000vaY("module_name", "promotions"))));
                    c323580CmK.LIZIZ(C048U.LIZ);
                    return new C1748850vbv((C1748840vbu[]) c323580CmK.LIZLLL(new C1748840vbu[c323580CmK.LIZJ()]));
                }
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("c5400.d12047_i");
            sbLIZ.append(i);
            C1748720vbi.LJ(view, c04ck, C2188811AlT.LIZIZ(sbLIZ), this.LIZJ, new AwS16S1201000_1(i, this.LIZLLL, str, promotionLabel, 3));
        }
    }

    @Override // X.InterfaceC1071204Gw
    public final void LIZ(View view, int i, PromotionLabel promotionLabel, boolean z, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(promotionLabel.idStr);
        sbLIZ.append('_');
        sbLIZ.append(promotionLabel.type);
        sbLIZ.append('_');
        sbLIZ.append(promotionLabel.instanceKey);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ.contains(strLIZIZ)) {
            return;
        }
        this.LIZ.add(strLIZIZ);
        C10518049k c10518049k = new C10518049k();
        AwS86S1000000_1 awS86S1000000_1 = new AwS86S1000000_1(strLIZIZ, 16);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("c5400.d12047_i");
        sbLIZ2.append(i);
        C1748720vbi.LJI(view, c10518049k, awS86S1000000_1, C2188811AlT.LIZIZ(sbLIZ2), this.LIZJ, new AwS1S1211000_1(i, z, this.LIZLLL, str, promotionLabel, 0));
    }
}
