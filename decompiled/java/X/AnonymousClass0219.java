package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.0219, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0219 extends Message<AnonymousClass0219, C02PC> {
    public static final ProtoAdapter<AnonymousClass0219> ADAPTER = new ProtoAdapter<AnonymousClass0219>() { // from class: X.021A
        public final ProtoAdapter<Map<String, C671102jd>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C671102jd.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0219 decode(ProtoReader protoReader) {
            AnonymousClass0219 anonymousClass0219 = new AnonymousClass0219();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                anonymousClass0219.title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                anonymousClass0219.desc_detail = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                anonymousClass0219.desc_video = C028A.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                anonymousClass0219.images.add(C02U1.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                anonymousClass0219.specifications.add(C02FH.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                anonymousClass0219.sold_count = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 7:
                                anonymousClass0219.price = AnonymousClass0234.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                anonymousClass0219.purchase_notice = C694102nL.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                anonymousClass0219.category_name = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                anonymousClass0219.has_size_chart = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                anonymousClass0219.size_guide = C027X.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                anonymousClass0219.voucher_reminder = C611402a0.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                anonymousClass0219.is_gift = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 14:
                                anonymousClass0219.pre_order_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 15:
                                anonymousClass0219.sales_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 16:
                                anonymousClass0219.combined_sales_volume = C02TS.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                anonymousClass0219.min_price = AnonymousClass0234.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                anonymousClass0219.dynamic_selling_points_base = C02CA.ADAPTER.decode(protoReader);
                                break;
                            case 19:
                                anonymousClass0219.show_free_shipping_tag = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                anonymousClass0219.global_shipping_tag = AnonymousClass0241.ADAPTER.decode(protoReader);
                                break;
                            case 21:
                                anonymousClass0219.desc_detailv2 = C744502vT.ADAPTER.decode(protoReader);
                                break;
                            case 22:
                                anonymousClass0219.price_additional.add(AnonymousClass0241.ADAPTER.decode(protoReader));
                                break;
                            case 23:
                                anonymousClass0219.promotion_extra_info = C545702At.ADAPTER.decode(protoReader);
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                anonymousClass0219.product_price_info = C2252231DDh.ADAPTER.decode(protoReader);
                                break;
                            case 25:
                                anonymousClass0219.header_video = C028A.ADAPTER.decode(protoReader);
                                break;
                            case 26:
                                anonymousClass0219.product_highlight = C732102tT.ADAPTER.decode(protoReader);
                                break;
                            case 27:
                                anonymousClass0219.desc_detailv3 = C1C6W.ADAPTER.decode(protoReader);
                                break;
                            case 28:
                                anonymousClass0219.global_shipping_tag_ec_richtext = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 29:
                                anonymousClass0219.price_v2.add(C5433029v.ADAPTER.decode(protoReader));
                                break;
                            case 30:
                                anonymousClass0219.default_selected_purchase_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 31:
                                anonymousClass0219.is_price_hidden = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 32:
                                anonymousClass0219.price_desc_detail = C561302Gt.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                anonymousClass0219.bnpl_display_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                anonymousClass0219.price_detail = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 35:
                                anonymousClass0219.category_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                anonymousClass0219.price_after_coupon_config = C652002gY.ADAPTER.decode(protoReader);
                                break;
                            case 37:
                                anonymousClass0219.ab_2_image_list.putAll(this.LIZ.decode(protoReader));
                                break;
                            case 38:
                                anonymousClass0219.is_bundle = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 39:
                                anonymousClass0219.is_header_find_similar_hidden = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 40:
                                anonymousClass0219.is_gallery_find_similar_hidden = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 41:
                                anonymousClass0219.aigc_header_video = C028A.ADAPTER.decode(protoReader);
                                break;
                            case 42:
                                anonymousClass0219.size_rec_sku = C651702gV.ADAPTER.decode(protoReader);
                                break;
                            case 43:
                                anonymousClass0219.category2_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        anonymousClass0219.header_images_da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0219;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0219 anonymousClass0219) {
            AnonymousClass0219 anonymousClass02192 = anonymousClass0219;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02192.title) + protoAdapter.encodedSizeWithTag(2, anonymousClass02192.desc_detail);
            ProtoAdapter<C028A> protoAdapter2 = C028A.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02192.desc_video) + C02U1.ADAPTER.asRepeated().encodedSizeWithTag(4, anonymousClass02192.images) + C02FH.ADAPTER.asRepeated().encodedSizeWithTag(5, anonymousClass02192.specifications);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, anonymousClass02192.sold_count);
            ProtoAdapter<AnonymousClass0234> protoAdapter4 = AnonymousClass0234.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(7, anonymousClass02192.price) + C694102nL.ADAPTER.encodedSizeWithTag(8, anonymousClass02192.purchase_notice) + protoAdapter.encodedSizeWithTag(9, anonymousClass02192.category_name);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(10, anonymousClass02192.has_size_chart) + C027X.ADAPTER.encodedSizeWithTag(11, anonymousClass02192.size_guide) + C611402a0.ADAPTER.encodedSizeWithTag(12, anonymousClass02192.voucher_reminder) + protoAdapter5.encodedSizeWithTag(13, anonymousClass02192.is_gift) + protoAdapter3.encodedSizeWithTag(14, anonymousClass02192.pre_order_type) + protoAdapter3.encodedSizeWithTag(15, anonymousClass02192.sales_type) + C02TS.ADAPTER.encodedSizeWithTag(16, anonymousClass02192.combined_sales_volume) + protoAdapter4.encodedSizeWithTag(17, anonymousClass02192.min_price) + C02CA.ADAPTER.encodedSizeWithTag(18, anonymousClass02192.dynamic_selling_points_base) + protoAdapter5.encodedSizeWithTag(19, anonymousClass02192.show_free_shipping_tag);
            ProtoAdapter<AnonymousClass0241> protoAdapter6 = AnonymousClass0241.ADAPTER;
            return iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(20, anonymousClass02192.global_shipping_tag) + C744502vT.ADAPTER.encodedSizeWithTag(21, anonymousClass02192.desc_detailv2) + protoAdapter6.asRepeated().encodedSizeWithTag(22, anonymousClass02192.price_additional) + C545702At.ADAPTER.encodedSizeWithTag(23, anonymousClass02192.promotion_extra_info) + C2252231DDh.ADAPTER.encodedSizeWithTag(24, anonymousClass02192.product_price_info) + protoAdapter2.encodedSizeWithTag(25, anonymousClass02192.header_video) + C732102tT.ADAPTER.encodedSizeWithTag(26, anonymousClass02192.product_highlight) + C1C6W.ADAPTER.encodedSizeWithTag(27, anonymousClass02192.desc_detailv3) + C5431029t.ADAPTER.encodedSizeWithTag(28, anonymousClass02192.global_shipping_tag_ec_richtext) + C5433029v.ADAPTER.asRepeated().encodedSizeWithTag(29, anonymousClass02192.price_v2) + protoAdapter3.encodedSizeWithTag(30, anonymousClass02192.default_selected_purchase_type) + protoAdapter5.encodedSizeWithTag(31, anonymousClass02192.is_price_hidden) + C561302Gt.ADAPTER.encodedSizeWithTag(32, anonymousClass02192.price_desc_detail) + protoAdapter.encodedSizeWithTag(33, anonymousClass02192.bnpl_display_info) + protoAdapter.encodedSizeWithTag(34, anonymousClass02192.price_detail) + protoAdapter.encodedSizeWithTag(35, anonymousClass02192.category_id) + C652002gY.ADAPTER.encodedSizeWithTag(36, anonymousClass02192.price_after_coupon_config) + this.LIZ.encodedSizeWithTag(37, anonymousClass02192.ab_2_image_list) + protoAdapter5.encodedSizeWithTag(38, anonymousClass02192.is_bundle) + protoAdapter5.encodedSizeWithTag(39, anonymousClass02192.is_header_find_similar_hidden) + protoAdapter5.encodedSizeWithTag(40, anonymousClass02192.is_gallery_find_similar_hidden) + protoAdapter2.encodedSizeWithTag(41, anonymousClass02192.aigc_header_video) + C651702gV.ADAPTER.encodedSizeWithTag(42, anonymousClass02192.size_rec_sku) + protoAdapter.encodedSizeWithTag(43, anonymousClass02192.category2_id) + protoAdapter.encodedSizeWithTag(200, anonymousClass02192.header_images_da_info) + anonymousClass02192.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0219 anonymousClass0219) {
        }
    };
    public Map<String, C671102jd> ab_2_image_list;
    public C028A aigc_header_video;
    public String bnpl_display_info;
    public String category2_id;
    public String category_id;
    public String category_name;
    public C02TS combined_sales_volume;
    public Integer default_selected_purchase_type;
    public String desc_detail;
    public C744502vT desc_detailv2;
    public C1C6W desc_detailv3;
    public C028A desc_video;
    public C02CA dynamic_selling_points_base;
    public AnonymousClass0241 global_shipping_tag;
    public C5431029t global_shipping_tag_ec_richtext;
    public Boolean has_size_chart;
    public String header_images_da_info;
    public C028A header_video;
    public List<C02U1> images;
    public Boolean is_bundle;
    public Boolean is_gallery_find_similar_hidden;
    public Boolean is_gift;
    public Boolean is_header_find_similar_hidden;
    public Boolean is_price_hidden;
    public AnonymousClass0234 min_price;
    public Integer pre_order_type;
    public AnonymousClass0234 price;
    public List<AnonymousClass0241> price_additional;
    public C652002gY price_after_coupon_config;
    public C561302Gt price_desc_detail;
    public String price_detail;
    public List<C5433029v> price_v2;
    public C732102tT product_highlight;
    public C2252231DDh product_price_info;
    public C545702At promotion_extra_info;
    public C694102nL purchase_notice;
    public Integer sales_type;
    public Boolean show_free_shipping_tag;
    public C027X size_guide;
    public C651702gV size_rec_sku;
    public Integer sold_count;
    public List<C02FH> specifications;
    public String title;
    public C611402a0 voucher_reminder;

    @Override // com.squareup.wire.Message
    public C02PC newBuilder() {
        return null;
    }

    public AnonymousClass0219() {
        super(ADAPTER, ByteString.EMPTY);
        this.images = C1516540pZE.LJIIIIZZ();
        this.specifications = C1516540pZE.LJIIIIZZ();
        this.price_additional = C1516540pZE.LJIIIIZZ();
        this.price_v2 = C1516540pZE.LJIIIIZZ();
        this.ab_2_image_list = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
