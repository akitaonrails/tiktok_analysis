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
import okio.ByteString;

/* JADX INFO: renamed from: X.0210, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0210 extends Message<AnonymousClass0210, C581602Oo> {
    public static final ProtoAdapter<AnonymousClass0210> ADAPTER = new ProtoAdapter<AnonymousClass0210>() { // from class: X.0211
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0210 decode(ProtoReader protoReader) {
            AnonymousClass0210 anonymousClass0210 = new AnonymousClass0210();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0210.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0210.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0210.avatar = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0210.product_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0210.rating = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0210.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0210.im_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0210.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0210.seller_location = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0210.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0210.shop_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0210.phone_contact = C554202Ea.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0210.store_label = C02ZZ.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0210.follow_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0210.voucher_label = C752202wi.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            anonymousClass0210.seller_label = C692102n1.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            anonymousClass0210.avatar_light = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            anonymousClass0210.avatar_dark = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            anonymousClass0210.shop_recommend = C02F9.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            anonymousClass0210.is_hide = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            anonymousClass0210.seller_detail_infos.add(C551302Cx.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            anonymousClass0210.exp_rate_percentile = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            anonymousClass0210.exp_rate_top_display = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            anonymousClass0210.rate_display_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 25:
                            anonymousClass0210.show_rate_not_applicable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 26:
                            anonymousClass0210.shop_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            anonymousClass0210.slogan_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 28:
                            anonymousClass0210.unread_message_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 29:
                            anonymousClass0210.seller_selling_point = C560602Gm.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            anonymousClass0210.im_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            anonymousClass0210.im_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 32:
                            anonymousClass0210.shop_performance = C02AW.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            anonymousClass0210.rating_value = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            anonymousClass0210.is_new_ses_experience = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 35:
                            anonymousClass0210.about_this_shop_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            anonymousClass0210.about_this_shop_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            anonymousClass0210.shop_background = C599602Vm.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            anonymousClass0210.visit_shop_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 39:
                            anonymousClass0210.enable_new_shop_entrance = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            anonymousClass0210.official_creator_live_info = C1C6J.ADAPTER.decode(protoReader);
                            break;
                        case 41:
                            anonymousClass0210.platform_seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 42:
                            anonymousClass0210.sold_item_description = C02UY.ADAPTER.decode(protoReader);
                            break;
                        case 43:
                            anonymousClass0210.shop_identity_experiment = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 44:
                            anonymousClass0210.shop_performance_info = C02G6.ADAPTER.decode(protoReader);
                            break;
                        case 45:
                            anonymousClass0210.sales_info = C551302Cx.ADAPTER.decode(protoReader);
                            break;
                        case 46:
                            anonymousClass0210.shop_ab.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 47:
                            anonymousClass0210.shop_benefit = C696402ni.ADAPTER.decode(protoReader);
                            break;
                        case 48:
                            anonymousClass0210.half_pdp_shop_entrance_experiment = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 49:
                            anonymousClass0210.half_pdp_store_identity_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            anonymousClass0210.shop_card_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 51:
                            anonymousClass0210.view_shop_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 52:
                            anonymousClass0210.seller_user_info = C5318025k.ADAPTER.decode(protoReader);
                            break;
                        case 53:
                            anonymousClass0210.follow_voucher = C761602yE.ADAPTER.decode(protoReader);
                            break;
                        case 54:
                            anonymousClass0210.pdp_enable_shop_follow_voucher = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 55:
                            anonymousClass0210.enable_nav_bar_shop_avatar = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 56:
                            anonymousClass0210.enable_shop_follow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 57:
                            anonymousClass0210.live_info = C02WT.ADAPTER.decode(protoReader);
                            break;
                        case 58:
                            anonymousClass0210.shop_identity_experiment_pdp_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 59:
                            anonymousClass0210.shop_live_info = C1C6J.ADAPTER.decode(protoReader);
                            break;
                        case 60:
                            anonymousClass0210.shop_card_new_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 61:
                            anonymousClass0210.top_rated_info = C1DAV.ADAPTER.decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            anonymousClass0210.selling_point_infos.add(C692702n7.ADAPTER.decode(protoReader));
                            break;
                        case 63:
                            anonymousClass0210.shop_guide_info = C751302wZ.ADAPTER.decode(protoReader);
                            break;
                        case 64:
                            anonymousClass0210.bbc_seller_info = C751602wc.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0210;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0210 anonymousClass0210) {
            AnonymousClass0210 anonymousClass02102 = anonymousClass0210;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02102.seller_id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02102.name);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02102.avatar);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, anonymousClass02102.product_count) + protoAdapter.encodedSizeWithTag(5, anonymousClass02102.rating) + protoAdapter.encodedSizeWithTag(6, anonymousClass02102.link) + protoAdapter.encodedSizeWithTag(7, anonymousClass02102.im_schema) + protoAdapter3.encodedSizeWithTag(8, anonymousClass02102.status) + protoAdapter.encodedSizeWithTag(9, anonymousClass02102.seller_location) + protoAdapter3.encodedSizeWithTag(10, anonymousClass02102.type) + protoAdapter.encodedSizeWithTag(11, anonymousClass02102.shop_link) + C554202Ea.ADAPTER.encodedSizeWithTag(12, anonymousClass02102.phone_contact) + C02ZZ.ADAPTER.encodedSizeWithTag(13, anonymousClass02102.store_label);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(14, anonymousClass02102.follow_count) + C752202wi.ADAPTER.encodedSizeWithTag(15, anonymousClass02102.voucher_label) + C692102n1.ADAPTER.encodedSizeWithTag(16, anonymousClass02102.seller_label) + protoAdapter2.encodedSizeWithTag(17, anonymousClass02102.avatar_light) + protoAdapter2.encodedSizeWithTag(18, anonymousClass02102.avatar_dark) + C02F9.ADAPTER.encodedSizeWithTag(19, anonymousClass02102.shop_recommend);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(20, anonymousClass02102.is_hide);
            ProtoAdapter<C551302Cx> protoAdapter6 = C551302Cx.ADAPTER;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + protoAdapter6.asRepeated().encodedSizeWithTag(21, anonymousClass02102.seller_detail_infos) + protoAdapter3.encodedSizeWithTag(22, anonymousClass02102.exp_rate_percentile) + protoAdapter.encodedSizeWithTag(23, anonymousClass02102.exp_rate_top_display) + protoAdapter3.encodedSizeWithTag(24, anonymousClass02102.rate_display_style) + protoAdapter5.encodedSizeWithTag(25, anonymousClass02102.show_rate_not_applicable) + C029C.ADAPTER.encodedSizeWithTag(26, anonymousClass02102.shop_icon) + protoAdapter.encodedSizeWithTag(27, anonymousClass02102.slogan_text) + protoAdapter4.encodedSizeWithTag(28, anonymousClass02102.unread_message_count) + C560602Gm.ADAPTER.encodedSizeWithTag(29, anonymousClass02102.seller_selling_point) + protoAdapter.encodedSizeWithTag(30, anonymousClass02102.im_button_text) + protoAdapter3.encodedSizeWithTag(31, anonymousClass02102.im_type) + C02AW.ADAPTER.encodedSizeWithTag(32, anonymousClass02102.shop_performance) + ProtoAdapter.FLOAT.encodedSizeWithTag(33, anonymousClass02102.rating_value) + protoAdapter5.encodedSizeWithTag(34, anonymousClass02102.is_new_ses_experience) + protoAdapter.encodedSizeWithTag(35, anonymousClass02102.about_this_shop_link);
            ProtoAdapter<C5431029t> protoAdapter7 = C5431029t.ADAPTER;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + protoAdapter7.encodedSizeWithTag(36, anonymousClass02102.about_this_shop_rich_text) + C599602Vm.ADAPTER.encodedSizeWithTag(37, anonymousClass02102.shop_background) + protoAdapter7.encodedSizeWithTag(38, anonymousClass02102.visit_shop_text) + protoAdapter5.encodedSizeWithTag(39, anonymousClass02102.enable_new_shop_entrance);
            ProtoAdapter<C1C6J> protoAdapter8 = C1C6J.ADAPTER;
            return iEncodedSizeWithTag7 + protoAdapter8.encodedSizeWithTag(40, anonymousClass02102.official_creator_live_info) + protoAdapter.encodedSizeWithTag(41, anonymousClass02102.platform_seller_id) + C02UY.ADAPTER.encodedSizeWithTag(42, anonymousClass02102.sold_item_description) + protoAdapter3.encodedSizeWithTag(43, anonymousClass02102.shop_identity_experiment) + C02G6.ADAPTER.encodedSizeWithTag(44, anonymousClass02102.shop_performance_info) + protoAdapter6.encodedSizeWithTag(45, anonymousClass02102.sales_info) + this.LIZ.encodedSizeWithTag(46, anonymousClass02102.shop_ab) + C696402ni.ADAPTER.encodedSizeWithTag(47, anonymousClass02102.shop_benefit) + protoAdapter3.encodedSizeWithTag(48, anonymousClass02102.half_pdp_shop_entrance_experiment) + protoAdapter7.encodedSizeWithTag(49, anonymousClass02102.half_pdp_store_identity_text) + protoAdapter.encodedSizeWithTag(50, anonymousClass02102.shop_card_title) + protoAdapter.encodedSizeWithTag(51, anonymousClass02102.view_shop_button_text) + C5318025k.ADAPTER.encodedSizeWithTag(52, anonymousClass02102.seller_user_info) + C761602yE.ADAPTER.encodedSizeWithTag(53, anonymousClass02102.follow_voucher) + protoAdapter5.encodedSizeWithTag(54, anonymousClass02102.pdp_enable_shop_follow_voucher) + protoAdapter5.encodedSizeWithTag(55, anonymousClass02102.enable_nav_bar_shop_avatar) + protoAdapter5.encodedSizeWithTag(56, anonymousClass02102.enable_shop_follow) + C02WT.ADAPTER.encodedSizeWithTag(57, anonymousClass02102.live_info) + protoAdapter3.encodedSizeWithTag(58, anonymousClass02102.shop_identity_experiment_pdp_style) + protoAdapter8.encodedSizeWithTag(59, anonymousClass02102.shop_live_info) + protoAdapter3.encodedSizeWithTag(60, anonymousClass02102.shop_card_new_style) + C1DAV.ADAPTER.encodedSizeWithTag(61, anonymousClass02102.top_rated_info) + C692702n7.ADAPTER.asRepeated().encodedSizeWithTag(62, anonymousClass02102.selling_point_infos) + C751302wZ.ADAPTER.encodedSizeWithTag(63, anonymousClass02102.shop_guide_info) + C751602wc.ADAPTER.encodedSizeWithTag(64, anonymousClass02102.bbc_seller_info) + anonymousClass02102.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0210 anonymousClass0210) {
        }
    };
    public String about_this_shop_link;
    public C5431029t about_this_shop_rich_text;
    public C02U1 avatar;
    public C02U1 avatar_dark;
    public C02U1 avatar_light;
    public C751602wc bbc_seller_info;
    public Boolean enable_nav_bar_shop_avatar;
    public Boolean enable_new_shop_entrance;
    public Boolean enable_shop_follow;
    public Integer exp_rate_percentile;
    public String exp_rate_top_display;
    public Long follow_count;
    public C761602yE follow_voucher;
    public Integer half_pdp_shop_entrance_experiment;
    public C5431029t half_pdp_store_identity_text;
    public String im_button_text;
    public String im_schema;
    public Integer im_type;
    public Boolean is_hide;
    public Boolean is_new_ses_experience;
    public String link;
    public C02WT live_info;
    public String name;
    public C1C6J official_creator_live_info;
    public Boolean pdp_enable_shop_follow_voucher;
    public C554202Ea phone_contact;
    public String platform_seller_id;
    public Integer product_count;
    public Integer rate_display_style;
    public String rating;
    public Float rating_value;
    public C551302Cx sales_info;
    public List<C551302Cx> seller_detail_infos;
    public String seller_id;
    public C692102n1 seller_label;
    public String seller_location;
    public C560602Gm seller_selling_point;
    public C5318025k seller_user_info;
    public List<C692702n7> selling_point_infos;
    public Map<String, String> shop_ab;
    public C599602Vm shop_background;
    public C696402ni shop_benefit;
    public Integer shop_card_new_style;
    public String shop_card_title;
    public C751302wZ shop_guide_info;
    public C029C shop_icon;
    public Integer shop_identity_experiment;
    public Integer shop_identity_experiment_pdp_style;
    public String shop_link;
    public C1C6J shop_live_info;
    public C02AW shop_performance;
    public C02G6 shop_performance_info;
    public C02F9 shop_recommend;
    public Boolean show_rate_not_applicable;
    public String slogan_text;
    public C02UY sold_item_description;
    public Integer status;
    public C02ZZ store_label;
    public C1DAV top_rated_info;
    public Integer type;
    public Long unread_message_count;
    public String view_shop_button_text;
    public C5431029t visit_shop_text;
    public C752202wi voucher_label;

    @Override // com.squareup.wire.Message
    public C581602Oo newBuilder() {
        return null;
    }

    public AnonymousClass0210() {
        super(ADAPTER, ByteString.EMPTY);
        this.seller_detail_infos = C1516540pZE.LJIIIIZZ();
        this.shop_ab = new LinkedHashMap();
        this.selling_point_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
