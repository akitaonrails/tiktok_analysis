package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import multiverse.data.proto.BcmStandardEvent;
import okio.ByteString;

/* JADX INFO: renamed from: X.020x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5201020x extends Message<C5201020x, C02P4> {
    public static final ProtoAdapter<C5201020x> ADAPTER = new ProtoAdapter<C5201020x>() { // from class: X.020w
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5201020x decode(ProtoReader protoReader) {
            C5201020x c5201020x = new C5201020x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c5201020x.sku_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c5201020x.sku_sale_props.add(C02GO.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                c5201020x.sale_prop_value_ids = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c5201020x.stock = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                c5201020x.low_stock_warning = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c5201020x.purchase_limit = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                c5201020x.price = C023Q.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c5201020x.sku_warning_tags = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5201020x.need_icon = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5201020x.voucher_info = C646702fh.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5201020x.add_to_cart_button = C598402Va.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c5201020x.warehouse_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c5201020x.promotion_view = C609202Ze.ADAPTER.decode(protoReader);
                                break;
                            case 14:
                                c5201020x.purchase_notice = C694102nL.ADAPTER.decode(protoReader);
                                break;
                            case 15:
                                c5201020x.quantity_property = C629602cw.ADAPTER.decode(protoReader);
                                break;
                            case 16:
                                c5201020x.buy_button = C02CS.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c5201020x.link = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c5201020x.purchase_notice_list.add(C694102nL.ADAPTER.decode(protoReader));
                                break;
                            case 19:
                                c5201020x.minimum_buy_quantity = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c5201020x.promotion_limit_quantity = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 21:
                                c5201020x.promotion_key_list.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 22:
                                c5201020x.deduction_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 23:
                                c5201020x.status = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                c5201020x.unavailable_info_id = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 25:
                                c5201020x.pre_order_info = C641702et.ADAPTER.decode(protoReader);
                                break;
                            case 26:
                                c5201020x.exposed_voucher_type_ids.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 27:
                                c5201020x.pdp_button_area_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 28:
                                c5201020x.platform_promotion_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 29:
                                c5201020x.seller_promotion_id_list.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 30:
                                c5201020x.need_refresh = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 31:
                                c5201020x.sku_name = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 32:
                                c5201020x.sku_original_image = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                c5201020x.show_waist_banner = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                c5201020x.price_desc_detail = C561302Gt.ADAPTER.decode(protoReader);
                                break;
                            case 35:
                                c5201020x.disclaimer_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                c5201020x.promotion_limit_quantity_v2 = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 37:
                                c5201020x.sku_supply = C02XC.ADAPTER.decode(protoReader);
                                break;
                            case 38:
                                c5201020x.bcm_standard_track = BcmStandardEvent.ADAPTER.decode(protoReader);
                                break;
                            case 39:
                                c5201020x.counter_description = C680402l8.ADAPTER.decode(protoReader);
                                break;
                            case 40:
                                c5201020x.price_v2.add(C555702Ep.ADAPTER.decode(protoReader));
                                break;
                            case 41:
                                c5201020x.pdp_button_area_id_v2.add(C601202Wc.ADAPTER.decode(protoReader));
                                break;
                            case 42:
                                c5201020x.purchase_limit_toast = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 43:
                                c5201020x.is_support_try_on = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 44:
                                c5201020x.bnpl_display_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 45:
                                c5201020x.sku_next_request_scene.add(C590802Sc.ADAPTER.decode(protoReader));
                                break;
                            case 46:
                                c5201020x.price_detail = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 47:
                                c5201020x.buy_button_interest_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 48:
                                c5201020x.button_dynamic_data.putAll(this.LIZ.decode(protoReader));
                                break;
                            case 49:
                                c5201020x.price_after_coupon_config = C652002gY.ADAPTER.decode(protoReader);
                                break;
                            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                c5201020x.quantity_promotion_notice_info = C02EE.ADAPTER.decode(protoReader);
                                break;
                            case 51:
                                c5201020x.sku_selling_points.add(C694802nS.ADAPTER.decode(protoReader));
                                break;
                            case 52:
                                c5201020x.sku_logistics_info = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 53:
                                c5201020x.sku_panel_waist_banner = C027P.ADAPTER.decode(protoReader);
                                break;
                            case 54:
                                c5201020x.selling_points = C714602qe.ADAPTER.decode(protoReader);
                                break;
                            case 55:
                                c5201020x.is_hot_sale = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 56:
                                c5201020x.is_collected = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5201020x.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5201020x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5201020x c5201020x) {
            C5201020x c5201020x2 = c5201020x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5201020x2.sku_id) + C02GO.ADAPTER.asRepeated().encodedSizeWithTag(2, c5201020x2.sku_sale_props) + protoAdapter.encodedSizeWithTag(3, c5201020x2.sale_prop_value_ids);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5201020x2.stock) + protoAdapter.encodedSizeWithTag(5, c5201020x2.low_stock_warning) + protoAdapter2.encodedSizeWithTag(6, c5201020x2.purchase_limit) + C023Q.ADAPTER.encodedSizeWithTag(7, c5201020x2.price) + protoAdapter.encodedSizeWithTag(8, c5201020x2.sku_warning_tags);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c5201020x2.need_icon) + C646702fh.ADAPTER.encodedSizeWithTag(10, c5201020x2.voucher_info) + C598402Va.ADAPTER.encodedSizeWithTag(11, c5201020x2.add_to_cart_button) + protoAdapter.encodedSizeWithTag(12, c5201020x2.warehouse_id) + C609202Ze.ADAPTER.encodedSizeWithTag(13, c5201020x2.promotion_view);
            ProtoAdapter<C694102nL> protoAdapter4 = C694102nL.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(14, c5201020x2.purchase_notice) + C629602cw.ADAPTER.encodedSizeWithTag(15, c5201020x2.quantity_property) + C02CS.ADAPTER.encodedSizeWithTag(16, c5201020x2.buy_button) + protoAdapter.encodedSizeWithTag(17, c5201020x2.link) + protoAdapter4.asRepeated().encodedSizeWithTag(18, c5201020x2.purchase_notice_list) + protoAdapter2.encodedSizeWithTag(19, c5201020x2.minimum_buy_quantity) + protoAdapter2.encodedSizeWithTag(20, c5201020x2.promotion_limit_quantity) + protoAdapter.asRepeated().encodedSizeWithTag(21, c5201020x2.promotion_key_list) + protoAdapter.encodedSizeWithTag(22, c5201020x2.deduction_text) + protoAdapter2.encodedSizeWithTag(23, c5201020x2.status) + protoAdapter2.encodedSizeWithTag(24, c5201020x2.unavailable_info_id) + C641702et.ADAPTER.encodedSizeWithTag(25, c5201020x2.pre_order_info) + protoAdapter.asRepeated().encodedSizeWithTag(26, c5201020x2.exposed_voucher_type_ids) + protoAdapter.encodedSizeWithTag(27, c5201020x2.pdp_button_area_id) + protoAdapter.encodedSizeWithTag(28, c5201020x2.platform_promotion_id) + protoAdapter.asRepeated().encodedSizeWithTag(29, c5201020x2.seller_promotion_id_list) + protoAdapter3.encodedSizeWithTag(30, c5201020x2.need_refresh) + protoAdapter.encodedSizeWithTag(31, c5201020x2.sku_name) + C02U1.ADAPTER.encodedSizeWithTag(32, c5201020x2.sku_original_image) + protoAdapter3.encodedSizeWithTag(33, c5201020x2.show_waist_banner) + C561302Gt.ADAPTER.encodedSizeWithTag(34, c5201020x2.price_desc_detail) + protoAdapter.encodedSizeWithTag(35, c5201020x2.disclaimer_text) + protoAdapter2.encodedSizeWithTag(36, c5201020x2.promotion_limit_quantity_v2) + C02XC.ADAPTER.encodedSizeWithTag(37, c5201020x2.sku_supply) + BcmStandardEvent.ADAPTER.encodedSizeWithTag(38, c5201020x2.bcm_standard_track) + C680402l8.ADAPTER.encodedSizeWithTag(39, c5201020x2.counter_description) + C555702Ep.ADAPTER.asRepeated().encodedSizeWithTag(40, c5201020x2.price_v2) + C601202Wc.ADAPTER.asRepeated().encodedSizeWithTag(41, c5201020x2.pdp_button_area_id_v2) + protoAdapter.encodedSizeWithTag(42, c5201020x2.purchase_limit_toast) + protoAdapter3.encodedSizeWithTag(43, c5201020x2.is_support_try_on) + protoAdapter.encodedSizeWithTag(44, c5201020x2.bnpl_display_info) + C590802Sc.ADAPTER.asRepeated().encodedSizeWithTag(45, c5201020x2.sku_next_request_scene) + protoAdapter.encodedSizeWithTag(46, c5201020x2.price_detail) + protoAdapter.encodedSizeWithTag(47, c5201020x2.buy_button_interest_id) + this.LIZ.encodedSizeWithTag(48, c5201020x2.button_dynamic_data) + C652002gY.ADAPTER.encodedSizeWithTag(49, c5201020x2.price_after_coupon_config) + C02EE.ADAPTER.encodedSizeWithTag(50, c5201020x2.quantity_promotion_notice_info) + C694802nS.ADAPTER.asRepeated().encodedSizeWithTag(51, c5201020x2.sku_selling_points) + C5431029t.ADAPTER.encodedSizeWithTag(52, c5201020x2.sku_logistics_info) + C027P.ADAPTER.encodedSizeWithTag(53, c5201020x2.sku_panel_waist_banner) + C714602qe.ADAPTER.encodedSizeWithTag(54, c5201020x2.selling_points) + protoAdapter3.encodedSizeWithTag(55, c5201020x2.is_hot_sale) + protoAdapter3.encodedSizeWithTag(56, c5201020x2.is_collected) + protoAdapter.encodedSizeWithTag(255, c5201020x2.da_info) + c5201020x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5201020x c5201020x) {
        }
    };
    public C598402Va add_to_cart_button;
    public BcmStandardEvent bcm_standard_track;
    public String bnpl_display_info;
    public Map<String, String> button_dynamic_data;
    public C02CS buy_button;
    public String buy_button_interest_id;
    public C680402l8 counter_description;
    public String da_info;
    public String deduction_text;
    public String disclaimer_text;
    public List<String> exposed_voucher_type_ids;
    public Boolean is_collected;
    public Boolean is_hot_sale;
    public Boolean is_support_try_on;
    public String link;
    public String low_stock_warning;
    public Integer minimum_buy_quantity;
    public Boolean need_icon;
    public Boolean need_refresh;
    public String pdp_button_area_id;
    public List<C601202Wc> pdp_button_area_id_v2;
    public String platform_promotion_id;
    public C641702et pre_order_info;
    public C023Q price;
    public C652002gY price_after_coupon_config;
    public C561302Gt price_desc_detail;
    public String price_detail;
    public List<C555702Ep> price_v2;
    public List<String> promotion_key_list;
    public Integer promotion_limit_quantity;
    public Integer promotion_limit_quantity_v2;
    public C609202Ze promotion_view;
    public Integer purchase_limit;
    public String purchase_limit_toast;
    public C694102nL purchase_notice;
    public List<C694102nL> purchase_notice_list;
    public C02EE quantity_promotion_notice_info;
    public C629602cw quantity_property;
    public String sale_prop_value_ids;
    public List<String> seller_promotion_id_list;
    public C714602qe selling_points;
    public Boolean show_waist_banner;
    public String sku_id;
    public C5431029t sku_logistics_info;
    public String sku_name;
    public List<C590802Sc> sku_next_request_scene;
    public C02U1 sku_original_image;
    public C027P sku_panel_waist_banner;
    public List<C02GO> sku_sale_props;
    public List<C694802nS> sku_selling_points;
    public C02XC sku_supply;
    public String sku_warning_tags;
    public Integer status;
    public Integer stock;
    public Integer unavailable_info_id;
    public C646702fh voucher_info;
    public String warehouse_id;

    @Override // com.squareup.wire.Message
    public C02P4 newBuilder() {
        return null;
    }

    public C5201020x() {
        super(ADAPTER, ByteString.EMPTY);
        this.sku_sale_props = C1516540pZE.LJIIIIZZ();
        this.purchase_notice_list = C1516540pZE.LJIIIIZZ();
        this.promotion_key_list = C1516540pZE.LJIIIIZZ();
        this.exposed_voucher_type_ids = C1516540pZE.LJIIIIZZ();
        this.seller_promotion_id_list = C1516540pZE.LJIIIIZZ();
        this.price_v2 = C1516540pZE.LJIIIIZZ();
        this.pdp_button_area_id_v2 = C1516540pZE.LJIIIIZZ();
        this.sku_next_request_scene = C1516540pZE.LJIIIIZZ();
        this.button_dynamic_data = new LinkedHashMap();
        this.sku_selling_points = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
