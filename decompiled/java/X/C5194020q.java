package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.020q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5194020q extends Message<C5194020q, C02OT> {
    public static final ProtoAdapter<C5194020q> ADAPTER = new ProtoAdapter<C5194020q>() { // from class: X.020r
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5194020q decode(ProtoReader protoReader) {
            C5194020q c5194020q = new C5194020q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c5194020q.product_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c5194020q.sku_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c5194020q.status = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c5194020q.product_name = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c5194020q.packed_sku_sale_props.add(C02GO.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                c5194020q.sale_props_str = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c5194020q.stock = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                c5194020q.low_stock_warning = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5194020q.purchase_limit = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5194020q.price = C023Q.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5194020q.image = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c5194020q.sku_amount = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c5194020q.button.add(C2263631Dir.ADAPTER.decode(protoReader));
                                break;
                            case 14:
                                c5194020q.link = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                c5194020q.jump_banner.add(C2263661Diu.ADAPTER.decode(protoReader));
                                break;
                            case 16:
                                c5194020q.reverse_status_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c5194020q.promotion_logos.add(C551002Cu.ADAPTER.decode(protoReader));
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c5194020q.activity_info = C615002aa.ADAPTER.decode(protoReader);
                                break;
                            case 19:
                                c5194020q.cart_item_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c5194020q.kol_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 21:
                                c5194020q.entrance_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 22:
                                c5194020q.chain_key = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 23:
                                c5194020q.source_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                c5194020q.promotion_view = C609202Ze.ADAPTER.decode(protoReader);
                                break;
                            case 25:
                                c5194020q.extra.putAll(this.LIZ.decode(protoReader));
                                break;
                            case 26:
                                c5194020q.purchase_notice = C694102nL.ADAPTER.decode(protoReader);
                                break;
                            case 27:
                                c5194020q.quantity_property = C629602cw.ADAPTER.decode(protoReader);
                                break;
                            case 28:
                                c5194020q.reverse_status_en_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 29:
                                c5194020q.reverse_highlight_color = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 30:
                                c5194020q.buyer_action_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 31:
                                c5194020q.reverse_main_order_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 32:
                                c5194020q.reverse_order_status = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                c5194020q.fulfillment_status = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                c5194020q.reverse_action_type = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 35:
                                c5194020q.user_right = C5292024k.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                c5194020q.minimum_buy_quantity = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 37:
                                c5194020q.promotion_limit_quantity = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 38:
                                c5194020q.product_platform_level1 = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 39:
                                c5194020q.seller_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 40:
                                c5194020q.bundle_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 41:
                                c5194020q.aggregation_key = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 42:
                                c5194020q.aggregation_count = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 43:
                                c5194020q.sku_card_style = C02WZ.ADAPTER.decode(protoReader);
                                break;
                            case 44:
                                c5194020q.gift_info = C740602uq.ADAPTER.decode(protoReader);
                                break;
                            case 45:
                                c5194020q.unavailable_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 46:
                                c5194020q.biz_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 47:
                                c5194020q.display_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 48:
                                c5194020q.is_single_sku = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 49:
                                c5194020q.reverse_policy = C740902ut.ADAPTER.decode(protoReader);
                                break;
                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                c5194020q.compensation_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 51:
                                c5194020q.aftersale_desc = C736202u8.ADAPTER.decode(protoReader);
                                break;
                            case 52:
                                c5194020q.channel_reserve_key = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 53:
                                c5194020q.quick_write_review_area = C1DAJ.ADAPTER.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case 55:
                                        c5194020q.product_rating = ProtoAdapter.FLOAT.decode(protoReader);
                                        break;
                                    case 56:
                                        c5194020q.sales_volume = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 57:
                                        c5194020q.is_addon_free_shipping = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    case 58:
                                        c5194020q.purchase_limit_type = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 59:
                                        c5194020q.purchase_limit_toast = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 60:
                                        c5194020q.best_voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 61:
                                        c5194020q.button_top_desc = C1COU.ADAPTER.decode(protoReader);
                                        break;
                                    case BaseNotice.CREATOR /* 62 */:
                                        c5194020q.platform_link_based_item = C02X3.ADAPTER.decode(protoReader);
                                        break;
                                    case 63:
                                        c5194020q.unique_key = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 64:
                                        c5194020q.master_sku_keys.add(ProtoAdapter.STRING.decode(protoReader));
                                        break;
                                    case 65:
                                        c5194020q.sku_card_tag.add(C694402nO.ADAPTER.decode(protoReader));
                                        break;
                                    case 66:
                                        c5194020q.quantity_control_info = C028M.ADAPTER.decode(protoReader);
                                        break;
                                    case 67:
                                        c5194020q.bcm_standard_track = C02RJ.ADAPTER.decode(protoReader);
                                        break;
                                    case 68:
                                        c5194020q.gift_shop_from_text = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 69:
                                        c5194020q.sns_display_info = C02CK.ADAPTER.decode(protoReader);
                                        break;
                                    case 70:
                                        c5194020q.sns_info = C02AZ.ADAPTER.decode(protoReader);
                                        break;
                                    case 71:
                                        c5194020q.compliance_labels.add(C029C.ADAPTER.decode(protoReader));
                                        break;
                                    case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                        c5194020q.promotion_selling_point.add(C02B1.ADAPTER.decode(protoReader));
                                        break;
                                    case 73:
                                        c5194020q.product_sales_and_rating_prompt = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 74:
                                        c5194020q.prompt_type = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 75:
                                        c5194020q.product_sales = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 76:
                                        c5194020q.insurance_module = C5337026d.ADAPTER.decode(protoReader);
                                        break;
                                    case 77:
                                        c5194020q.insurance_entrance_list.add(C2263661Diu.ADAPTER.decode(protoReader));
                                        break;
                                    case 78:
                                        c5194020q.single_price = C022E.ADAPTER.decode(protoReader);
                                        break;
                                    case 79:
                                        c5194020q.range_price = C023I.ADAPTER.decode(protoReader);
                                        break;
                                    case 80:
                                        c5194020q.price_protection_module = C1COR.ADAPTER.decode(protoReader);
                                        break;
                                    case 81:
                                        c5194020q.sku_review_status = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 82:
                                        c5194020q.order_service = C2229541COa.ADAPTER.decode(protoReader);
                                        break;
                                    case 83:
                                        c5194020q.product_safety_module = C544202Ae.ADAPTER.decode(protoReader);
                                        break;
                                    case 84:
                                        c5194020q.repurchase_module = C1DAM.ADAPTER.decode(protoReader);
                                        break;
                                    case 85:
                                        c5194020q.important_notification = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 86:
                                        c5194020q.product_sale_modes.add(ProtoAdapter.INT32.decode(protoReader));
                                        break;
                                    case 87:
                                        c5194020q.sku_card_layout_type = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 88:
                                        c5194020q.sku_image_tags.add(C692402n4.ADAPTER.decode(protoReader));
                                        break;
                                    case 89:
                                        c5194020q.sku_group_key = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 90:
                                        c5194020q.addon_product_promotion_info_list.add(C02X0.ADAPTER.decode(protoReader));
                                        break;
                                    case 91:
                                        c5194020q.combo_sub_sku_expression = C02F8.ADAPTER.decode(protoReader);
                                        break;
                                    case 92:
                                        c5194020q.best_voucher_instance_key = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 93:
                                        c5194020q.add_to_cart_info = C735902u5.ADAPTER.decode(protoReader);
                                        break;
                                    case 94:
                                        c5194020q.available_status = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    case 95:
                                        c5194020q.warning_alert = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 96:
                                        c5194020q.product_logos.add(C679802l2.ADAPTER.decode(protoReader));
                                        break;
                                    case 97:
                                        c5194020q.promotion_sku_group_info = C2225061C6u.ADAPTER.decode(protoReader);
                                        break;
                                    default:
                                        switch (iNextTag) {
                                            case 100:
                                                c5194020q.sku_card_extend_info = C555602Eo.ADAPTER.decode(protoReader);
                                                break;
                                            case 101:
                                                c5194020q.sku_card_extend_info_for_order_query = C2223671C1l.ADAPTER.decode(protoReader);
                                                break;
                                            case 102:
                                                c5194020q.selected_shipping_insurance_info = AnonymousClass0226.ADAPTER.decode(protoReader);
                                                break;
                                            case 103:
                                                c5194020q.similar_products_recommendation_info = C1CAR.ADAPTER.decode(protoReader);
                                                break;
                                            default:
                                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c5194020q.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5194020q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5194020q c5194020q) {
            C5194020q c5194020q2 = c5194020q;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5194020q2.product_id) + protoAdapter.encodedSizeWithTag(2, c5194020q2.sku_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5194020q2.status) + protoAdapter.encodedSizeWithTag(4, c5194020q2.product_name) + C02GO.ADAPTER.asRepeated().encodedSizeWithTag(5, c5194020q2.packed_sku_sale_props) + protoAdapter.encodedSizeWithTag(6, c5194020q2.sale_props_str) + protoAdapter2.encodedSizeWithTag(7, c5194020q2.stock) + protoAdapter.encodedSizeWithTag(8, c5194020q2.low_stock_warning) + protoAdapter2.encodedSizeWithTag(9, c5194020q2.purchase_limit) + C023Q.ADAPTER.encodedSizeWithTag(10, c5194020q2.price) + C02U1.ADAPTER.encodedSizeWithTag(11, c5194020q2.image) + protoAdapter2.encodedSizeWithTag(12, c5194020q2.sku_amount) + C2263631Dir.ADAPTER.asRepeated().encodedSizeWithTag(13, c5194020q2.button) + protoAdapter.encodedSizeWithTag(14, c5194020q2.link);
            ProtoAdapter<C2263661Diu> protoAdapter3 = C2263661Diu.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(15, c5194020q2.jump_banner) + protoAdapter.encodedSizeWithTag(16, c5194020q2.reverse_status_text) + C551002Cu.ADAPTER.asRepeated().encodedSizeWithTag(17, c5194020q2.promotion_logos) + C615002aa.ADAPTER.encodedSizeWithTag(18, c5194020q2.activity_info) + protoAdapter.encodedSizeWithTag(19, c5194020q2.cart_item_id) + protoAdapter.encodedSizeWithTag(20, c5194020q2.kol_id) + protoAdapter.encodedSizeWithTag(21, c5194020q2.entrance_info) + protoAdapter.encodedSizeWithTag(22, c5194020q2.chain_key) + protoAdapter.encodedSizeWithTag(23, c5194020q2.source_info) + C609202Ze.ADAPTER.encodedSizeWithTag(24, c5194020q2.promotion_view) + this.LIZ.encodedSizeWithTag(25, c5194020q2.extra) + C694102nL.ADAPTER.encodedSizeWithTag(26, c5194020q2.purchase_notice) + C629602cw.ADAPTER.encodedSizeWithTag(27, c5194020q2.quantity_property) + protoAdapter.encodedSizeWithTag(28, c5194020q2.reverse_status_en_text) + protoAdapter2.encodedSizeWithTag(29, c5194020q2.reverse_highlight_color) + protoAdapter.encodedSizeWithTag(30, c5194020q2.buyer_action_text) + protoAdapter.encodedSizeWithTag(31, c5194020q2.reverse_main_order_id) + protoAdapter.encodedSizeWithTag(32, c5194020q2.reverse_order_status) + protoAdapter.encodedSizeWithTag(33, c5194020q2.fulfillment_status) + protoAdapter.encodedSizeWithTag(34, c5194020q2.reverse_action_type) + C5292024k.ADAPTER.encodedSizeWithTag(35, c5194020q2.user_right) + protoAdapter2.encodedSizeWithTag(36, c5194020q2.minimum_buy_quantity) + protoAdapter2.encodedSizeWithTag(37, c5194020q2.promotion_limit_quantity) + protoAdapter2.encodedSizeWithTag(38, c5194020q2.product_platform_level1) + protoAdapter.encodedSizeWithTag(39, c5194020q2.seller_id) + protoAdapter.encodedSizeWithTag(40, c5194020q2.bundle_id) + protoAdapter.encodedSizeWithTag(41, c5194020q2.aggregation_key) + protoAdapter2.encodedSizeWithTag(42, c5194020q2.aggregation_count) + C02WZ.ADAPTER.encodedSizeWithTag(43, c5194020q2.sku_card_style) + C740602uq.ADAPTER.encodedSizeWithTag(44, c5194020q2.gift_info) + protoAdapter.encodedSizeWithTag(45, c5194020q2.unavailable_text) + protoAdapter2.encodedSizeWithTag(46, c5194020q2.biz_type) + protoAdapter2.encodedSizeWithTag(47, c5194020q2.display_type);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(48, c5194020q2.is_single_sku) + C740902ut.ADAPTER.encodedSizeWithTag(49, c5194020q2.reverse_policy) + protoAdapter.encodedSizeWithTag(50, c5194020q2.compensation_desc) + C736202u8.ADAPTER.encodedSizeWithTag(51, c5194020q2.aftersale_desc) + protoAdapter.encodedSizeWithTag(52, c5194020q2.channel_reserve_key) + C1DAJ.ADAPTER.encodedSizeWithTag(53, c5194020q2.quick_write_review_area) + ProtoAdapter.FLOAT.encodedSizeWithTag(55, c5194020q2.product_rating) + protoAdapter.encodedSizeWithTag(56, c5194020q2.sales_volume) + protoAdapter4.encodedSizeWithTag(57, c5194020q2.is_addon_free_shipping) + protoAdapter2.encodedSizeWithTag(58, c5194020q2.purchase_limit_type) + protoAdapter.encodedSizeWithTag(59, c5194020q2.purchase_limit_toast) + protoAdapter.encodedSizeWithTag(60, c5194020q2.best_voucher_type_id) + C1COU.ADAPTER.encodedSizeWithTag(61, c5194020q2.button_top_desc) + C02X3.ADAPTER.encodedSizeWithTag(62, c5194020q2.platform_link_based_item) + protoAdapter.encodedSizeWithTag(63, c5194020q2.unique_key) + protoAdapter.asRepeated().encodedSizeWithTag(64, c5194020q2.master_sku_keys) + C694402nO.ADAPTER.asRepeated().encodedSizeWithTag(65, c5194020q2.sku_card_tag) + C028M.ADAPTER.encodedSizeWithTag(66, c5194020q2.quantity_control_info) + C02RJ.ADAPTER.encodedSizeWithTag(67, c5194020q2.bcm_standard_track) + protoAdapter.encodedSizeWithTag(68, c5194020q2.gift_shop_from_text) + C02CK.ADAPTER.encodedSizeWithTag(69, c5194020q2.sns_display_info) + C02AZ.ADAPTER.encodedSizeWithTag(70, c5194020q2.sns_info) + C029C.ADAPTER.asRepeated().encodedSizeWithTag(71, c5194020q2.compliance_labels) + C02B1.ADAPTER.asRepeated().encodedSizeWithTag(72, c5194020q2.promotion_selling_point) + protoAdapter.encodedSizeWithTag(73, c5194020q2.product_sales_and_rating_prompt) + protoAdapter2.encodedSizeWithTag(74, c5194020q2.prompt_type) + protoAdapter2.encodedSizeWithTag(75, c5194020q2.product_sales) + C5337026d.ADAPTER.encodedSizeWithTag(76, c5194020q2.insurance_module) + protoAdapter3.asRepeated().encodedSizeWithTag(77, c5194020q2.insurance_entrance_list) + C022E.ADAPTER.encodedSizeWithTag(78, c5194020q2.single_price) + C023I.ADAPTER.encodedSizeWithTag(79, c5194020q2.range_price) + C1COR.ADAPTER.encodedSizeWithTag(80, c5194020q2.price_protection_module) + protoAdapter2.encodedSizeWithTag(81, c5194020q2.sku_review_status) + C2229541COa.ADAPTER.encodedSizeWithTag(82, c5194020q2.order_service) + C544202Ae.ADAPTER.encodedSizeWithTag(83, c5194020q2.product_safety_module) + C1DAM.ADAPTER.encodedSizeWithTag(84, c5194020q2.repurchase_module) + protoAdapter.encodedSizeWithTag(85, c5194020q2.important_notification) + protoAdapter2.asRepeated().encodedSizeWithTag(86, c5194020q2.product_sale_modes) + protoAdapter2.encodedSizeWithTag(87, c5194020q2.sku_card_layout_type) + C692402n4.ADAPTER.asRepeated().encodedSizeWithTag(88, c5194020q2.sku_image_tags) + protoAdapter.encodedSizeWithTag(89, c5194020q2.sku_group_key) + C02X0.ADAPTER.asRepeated().encodedSizeWithTag(90, c5194020q2.addon_product_promotion_info_list) + C02F8.ADAPTER.encodedSizeWithTag(91, c5194020q2.combo_sub_sku_expression) + protoAdapter.encodedSizeWithTag(92, c5194020q2.best_voucher_instance_key) + C735902u5.ADAPTER.encodedSizeWithTag(93, c5194020q2.add_to_cart_info) + protoAdapter2.encodedSizeWithTag(94, c5194020q2.available_status) + protoAdapter.encodedSizeWithTag(95, c5194020q2.warning_alert) + C679802l2.ADAPTER.asRepeated().encodedSizeWithTag(96, c5194020q2.product_logos) + C2225061C6u.ADAPTER.encodedSizeWithTag(97, c5194020q2.promotion_sku_group_info) + C555602Eo.ADAPTER.encodedSizeWithTag(100, c5194020q2.sku_card_extend_info) + C2223671C1l.ADAPTER.encodedSizeWithTag(101, c5194020q2.sku_card_extend_info_for_order_query) + AnonymousClass0226.ADAPTER.encodedSizeWithTag(102, c5194020q2.selected_shipping_insurance_info) + C1CAR.ADAPTER.encodedSizeWithTag(103, c5194020q2.similar_products_recommendation_info) + protoAdapter.encodedSizeWithTag(200, c5194020q2.da_info) + c5194020q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5194020q c5194020q) {
        }
    };
    public C615002aa activity_info;
    public C735902u5 add_to_cart_info;
    public List<C02X0> addon_product_promotion_info_list;
    public C736202u8 aftersale_desc;
    public Integer aggregation_count;
    public String aggregation_key;
    public Integer available_status;
    public C02RJ bcm_standard_track;
    public String best_voucher_instance_key;
    public String best_voucher_type_id;
    public Integer biz_type;
    public String bundle_id;
    public List<C2263631Dir> button;
    public C1COU button_top_desc;
    public String buyer_action_text;
    public String cart_item_id;
    public String chain_key;
    public String channel_reserve_key;
    public C02F8 combo_sub_sku_expression;
    public String compensation_desc;
    public List<C029C> compliance_labels;
    public String da_info;
    public Integer display_type;
    public String entrance_info;
    public Map<String, String> extra;
    public String fulfillment_status;
    public C740602uq gift_info;
    public String gift_shop_from_text;
    public C02U1 image;
    public String important_notification;
    public List<C2263661Diu> insurance_entrance_list;
    public C5337026d insurance_module;
    public Boolean is_addon_free_shipping;
    public Boolean is_single_sku;
    public List<C2263661Diu> jump_banner;
    public String kol_id;
    public String link;
    public String low_stock_warning;
    public List<String> master_sku_keys;
    public Integer minimum_buy_quantity;
    public C2229541COa order_service;
    public List<C02GO> packed_sku_sale_props;
    public C02X3 platform_link_based_item;
    public C023Q price;
    public C1COR price_protection_module;
    public String product_id;
    public List<C679802l2> product_logos;
    public String product_name;
    public Integer product_platform_level1;
    public Float product_rating;
    public C544202Ae product_safety_module;
    public List<Integer> product_sale_modes;
    public Integer product_sales;
    public String product_sales_and_rating_prompt;
    public Integer promotion_limit_quantity;
    public List<C551002Cu> promotion_logos;
    public List<C02B1> promotion_selling_point;
    public C2225061C6u promotion_sku_group_info;
    public C609202Ze promotion_view;
    public Integer prompt_type;
    public Integer purchase_limit;
    public String purchase_limit_toast;
    public Integer purchase_limit_type;
    public C694102nL purchase_notice;
    public C028M quantity_control_info;
    public C629602cw quantity_property;
    public C1DAJ quick_write_review_area;
    public C023I range_price;
    public C1DAM repurchase_module;
    public String reverse_action_type;
    public Integer reverse_highlight_color;
    public String reverse_main_order_id;
    public String reverse_order_status;
    public C740902ut reverse_policy;
    public String reverse_status_en_text;
    public String reverse_status_text;
    public String sale_props_str;
    public String sales_volume;
    public AnonymousClass0226 selected_shipping_insurance_info;
    public String seller_id;
    public C1CAR similar_products_recommendation_info;
    public C022E single_price;
    public Integer sku_amount;
    public C555602Eo sku_card_extend_info;
    public C2223671C1l sku_card_extend_info_for_order_query;
    public Integer sku_card_layout_type;
    public C02WZ sku_card_style;
    public List<C694402nO> sku_card_tag;
    public String sku_group_key;
    public String sku_id;
    public List<C692402n4> sku_image_tags;
    public Integer sku_review_status;
    public C02CK sns_display_info;
    public C02AZ sns_info;
    public String source_info;
    public Integer status;
    public Integer stock;
    public String unavailable_text;
    public String unique_key;
    public C5292024k user_right;
    public String warning_alert;

    @Override // com.squareup.wire.Message
    public C02OT newBuilder() {
        return null;
    }

    public C5194020q() {
        super(ADAPTER, ByteString.EMPTY);
        this.packed_sku_sale_props = C1516540pZE.LJIIIIZZ();
        this.button = C1516540pZE.LJIIIIZZ();
        this.jump_banner = C1516540pZE.LJIIIIZZ();
        this.promotion_logos = C1516540pZE.LJIIIIZZ();
        this.extra = new LinkedHashMap();
        this.master_sku_keys = C1516540pZE.LJIIIIZZ();
        this.sku_card_tag = C1516540pZE.LJIIIIZZ();
        this.compliance_labels = C1516540pZE.LJIIIIZZ();
        this.promotion_selling_point = C1516540pZE.LJIIIIZZ();
        this.insurance_entrance_list = C1516540pZE.LJIIIIZZ();
        this.product_sale_modes = C1516540pZE.LJIIIIZZ();
        this.sku_image_tags = C1516540pZE.LJIIIIZZ();
        this.addon_product_promotion_info_list = C1516540pZE.LJIIIIZZ();
        this.product_logos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
