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

/* JADX INFO: renamed from: X.020t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5197020t extends Message<C5197020t, C02OG> {
    public static final ProtoAdapter<C5197020t> ADAPTER = new ProtoAdapter<C5197020t>() { // from class: X.020s
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;
        public final ProtoAdapter<Map<String, String>> LIZJ;
        public final ProtoAdapter<Map<String, Boolean>> LIZLLL;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZLLL = ProtoAdapter.newMapAdapter(protoAdapter, ProtoAdapter.BOOL);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5197020t decode(ProtoReader protoReader) {
            C5197020t c5197020t = new C5197020t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    switch (iNextTag) {
                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                            c5197020t.stored_method_show_count = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                            c5197020t.payment_policy = C639602eY.ADAPTER.decode(protoReader);
                                            break;
                                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                            c5197020t.encode_key = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 14:
                                            c5197020t.shipping_address = C023N.ADAPTER.decode(protoReader);
                                            break;
                                        case 15:
                                            c5197020t.pipo_host = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 16:
                                            c5197020t.methods_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                            c5197020t.methods_photos = C639002eS.ADAPTER.decode(protoReader);
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                            c5197020t.country_code = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 19:
                                            c5197020t.merchant_name = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                            c5197020t.recommend_payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                                            break;
                                        case 21:
                                            c5197020t.certification = C02VO.ADAPTER.decode(protoReader);
                                            break;
                                        case 22:
                                            c5197020t.payment_guarantee_info = C553402Ds.ADAPTER.decode(protoReader);
                                            break;
                                        case 23:
                                            c5197020t.payment_card_rules.add(C02DN.ADAPTER.decode(protoReader));
                                            break;
                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                            c5197020t.payment_page_title = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 25:
                                            c5197020t.secure_payment = C578602Nk.ADAPTER.decode(protoReader);
                                            break;
                                        case 26:
                                            c5197020t.consultation_id = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 27:
                                            c5197020t.recommend_method_show_count = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 28:
                                            c5197020t.unavailable_cardbin_list.add(C560702Gn.ADAPTER.decode(protoReader));
                                            break;
                                        case 29:
                                            c5197020t.payment_banner = C02CR.ADAPTER.decode(protoReader);
                                            break;
                                        case 30:
                                            c5197020t.cashier_button_info = C629002cq.ADAPTER.decode(protoReader);
                                            break;
                                        case 31:
                                            c5197020t.credit_info = C022J.ADAPTER.decode(protoReader);
                                            break;
                                        case 32:
                                            c5197020t.cci_cashier_display_type = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                            c5197020t.settings = AnonymousClass0290.ADAPTER.decode(protoReader);
                                            break;
                                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                            c5197020t.sale_region = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 35:
                                            c5197020t.abnormal_card_bin_list.add(C02DM.ADAPTER.decode(protoReader));
                                            break;
                                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                            c5197020t.top_security_text = C544002Ac.ADAPTER.decode(protoReader);
                                            break;
                                        case 37:
                                            c5197020t.cashier_loading_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 38:
                                            c5197020t.is_use_section = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        case 39:
                                            c5197020t.payment_method_sections.add(C609002Zc.ADAPTER.decode(protoReader));
                                            break;
                                        case 40:
                                            c5197020t.recommend_payment_method_sections.add(C609002Zc.ADAPTER.decode(protoReader));
                                            break;
                                        case 41:
                                            c5197020t.title_tips = C649602gA.ADAPTER.decode(protoReader);
                                            break;
                                        case 42:
                                            c5197020t.order_type = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 43:
                                            c5197020t.exception = C023J.ADAPTER.decode(protoReader);
                                            break;
                                        case 44:
                                            c5197020t.is_fold_recommend_payment_methods = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        case 45:
                                            c5197020t.pull_cashier_if_not_select = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        case 46:
                                            c5197020t.force_save = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        case 47:
                                            c5197020t.new_order_type = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 48:
                                            c5197020t.payment_param.putAll(this.LIZ.decode(protoReader));
                                            break;
                                        case 49:
                                            c5197020t.pay_track_info = C595602Ty.ADAPTER.decode(protoReader);
                                            break;
                                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                            c5197020t.method_photos_with_pm_code.add(C02H3.ADAPTER.decode(protoReader));
                                            break;
                                        case 51:
                                            c5197020t.combine_payment_info = C553102Dp.ADAPTER.decode(protoReader);
                                            break;
                                        case 52:
                                            c5197020t.error_info = C02X6.ADAPTER.decode(protoReader);
                                            break;
                                        case 53:
                                            c5197020t.independent_pricing_param.putAll(this.LIZIZ.decode(protoReader));
                                            break;
                                        case 54:
                                            c5197020t.exist_cci_pi = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        case 55:
                                            c5197020t.elevator_bars.add(C5423029l.ADAPTER.decode(protoReader));
                                            break;
                                        case 56:
                                            c5197020t.experiment_info.putAll(this.LIZJ.decode(protoReader));
                                            break;
                                        case 57:
                                            c5197020t.pop_ups.add(C02GQ.ADAPTER.decode(protoReader));
                                            break;
                                        case 58:
                                            c5197020t.button_info_with_scene.add(C594602To.ADAPTER.decode(protoReader));
                                            break;
                                        case 59:
                                            c5197020t.retain_infos.add(C023M.ADAPTER.decode(protoReader));
                                            break;
                                        case 60:
                                            c5197020t.independent_payment_button_infos.add(C1DC1.ADAPTER.decode(protoReader));
                                            break;
                                        case 61:
                                            c5197020t.payment_announcement = C1C6Q.ADAPTER.decode(protoReader);
                                            break;
                                        case BaseNotice.CREATOR /* 62 */:
                                            c5197020t.backup_payment_info = C549602Cg.ADAPTER.decode(protoReader);
                                            break;
                                        case 63:
                                            c5197020t.material_collection_info = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 64:
                                            c5197020t.coupon_filter_rule.putAll(this.LIZLLL.decode(protoReader));
                                            break;
                                        default:
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                            break;
                                    }
                                } else {
                                    c5197020t.bank_card_rules.add(C02BD.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c5197020t.stored_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c5197020t.recommend_payment_method = C5193020p.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c5197020t.payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5197020t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5197020t c5197020t) {
            C5197020t c5197020t2 = c5197020t;
            ProtoAdapter<C5193020p> protoAdapter = C5193020p.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, c5197020t2.payment_methods) + protoAdapter.encodedSizeWithTag(2, c5197020t2.recommend_payment_method) + protoAdapter.asRepeated().encodedSizeWithTag(3, c5197020t2.stored_methods) + C02BD.ADAPTER.asRepeated().encodedSizeWithTag(4, c5197020t2.bank_card_rules);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(11, c5197020t2.stored_method_show_count) + C639602eY.ADAPTER.encodedSizeWithTag(12, c5197020t2.payment_policy);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(13, c5197020t2.encode_key) + C023N.ADAPTER.encodedSizeWithTag(14, c5197020t2.shipping_address) + protoAdapter3.encodedSizeWithTag(15, c5197020t2.pipo_host) + protoAdapter3.encodedSizeWithTag(16, c5197020t2.methods_text) + C639002eS.ADAPTER.encodedSizeWithTag(17, c5197020t2.methods_photos) + protoAdapter3.encodedSizeWithTag(18, c5197020t2.country_code) + protoAdapter3.encodedSizeWithTag(19, c5197020t2.merchant_name) + protoAdapter.asRepeated().encodedSizeWithTag(20, c5197020t2.recommend_payment_methods) + C02VO.ADAPTER.encodedSizeWithTag(21, c5197020t2.certification) + C553402Ds.ADAPTER.encodedSizeWithTag(22, c5197020t2.payment_guarantee_info) + C02DN.ADAPTER.asRepeated().encodedSizeWithTag(23, c5197020t2.payment_card_rules) + protoAdapter3.encodedSizeWithTag(24, c5197020t2.payment_page_title) + C578602Nk.ADAPTER.encodedSizeWithTag(25, c5197020t2.secure_payment) + protoAdapter3.encodedSizeWithTag(26, c5197020t2.consultation_id) + protoAdapter2.encodedSizeWithTag(27, c5197020t2.recommend_method_show_count) + C560702Gn.ADAPTER.asRepeated().encodedSizeWithTag(28, c5197020t2.unavailable_cardbin_list) + C02CR.ADAPTER.encodedSizeWithTag(29, c5197020t2.payment_banner) + C629002cq.ADAPTER.encodedSizeWithTag(30, c5197020t2.cashier_button_info) + C022J.ADAPTER.encodedSizeWithTag(31, c5197020t2.credit_info) + protoAdapter2.encodedSizeWithTag(32, c5197020t2.cci_cashier_display_type) + AnonymousClass0290.ADAPTER.encodedSizeWithTag(33, c5197020t2.settings) + protoAdapter3.encodedSizeWithTag(34, c5197020t2.sale_region) + C02DM.ADAPTER.asRepeated().encodedSizeWithTag(35, c5197020t2.abnormal_card_bin_list) + C544002Ac.ADAPTER.encodedSizeWithTag(36, c5197020t2.top_security_text) + protoAdapter3.encodedSizeWithTag(37, c5197020t2.cashier_loading_text);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(38, c5197020t2.is_use_section);
            ProtoAdapter<C609002Zc> protoAdapter5 = C609002Zc.ADAPTER;
            return iEncodedSizeWithTag4 + protoAdapter5.asRepeated().encodedSizeWithTag(39, c5197020t2.payment_method_sections) + protoAdapter5.asRepeated().encodedSizeWithTag(40, c5197020t2.recommend_payment_method_sections) + C649602gA.ADAPTER.encodedSizeWithTag(41, c5197020t2.title_tips) + protoAdapter2.encodedSizeWithTag(42, c5197020t2.order_type) + C023J.ADAPTER.encodedSizeWithTag(43, c5197020t2.exception) + protoAdapter4.encodedSizeWithTag(44, c5197020t2.is_fold_recommend_payment_methods) + protoAdapter4.encodedSizeWithTag(45, c5197020t2.pull_cashier_if_not_select) + protoAdapter4.encodedSizeWithTag(46, c5197020t2.force_save) + protoAdapter2.encodedSizeWithTag(47, c5197020t2.new_order_type) + this.LIZ.encodedSizeWithTag(48, c5197020t2.payment_param) + C595602Ty.ADAPTER.encodedSizeWithTag(49, c5197020t2.pay_track_info) + C02H3.ADAPTER.asRepeated().encodedSizeWithTag(50, c5197020t2.method_photos_with_pm_code) + C553102Dp.ADAPTER.encodedSizeWithTag(51, c5197020t2.combine_payment_info) + C02X6.ADAPTER.encodedSizeWithTag(52, c5197020t2.error_info) + this.LIZIZ.encodedSizeWithTag(53, c5197020t2.independent_pricing_param) + protoAdapter4.encodedSizeWithTag(54, c5197020t2.exist_cci_pi) + C5423029l.ADAPTER.asRepeated().encodedSizeWithTag(55, c5197020t2.elevator_bars) + this.LIZJ.encodedSizeWithTag(56, c5197020t2.experiment_info) + C02GQ.ADAPTER.asRepeated().encodedSizeWithTag(57, c5197020t2.pop_ups) + C594602To.ADAPTER.asRepeated().encodedSizeWithTag(58, c5197020t2.button_info_with_scene) + C023M.ADAPTER.asRepeated().encodedSizeWithTag(59, c5197020t2.retain_infos) + C1DC1.ADAPTER.asRepeated().encodedSizeWithTag(60, c5197020t2.independent_payment_button_infos) + C1C6Q.ADAPTER.encodedSizeWithTag(61, c5197020t2.payment_announcement) + C549602Cg.ADAPTER.encodedSizeWithTag(62, c5197020t2.backup_payment_info) + protoAdapter3.encodedSizeWithTag(63, c5197020t2.material_collection_info) + this.LIZLLL.encodedSizeWithTag(64, c5197020t2.coupon_filter_rule) + c5197020t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5197020t c5197020t) {
        }
    };
    public List<C02DM> abnormal_card_bin_list;
    public C549602Cg backup_payment_info;
    public List<C02BD> bank_card_rules;
    public List<C594602To> button_info_with_scene;
    public C629002cq cashier_button_info;
    public String cashier_loading_text;
    public Integer cci_cashier_display_type;
    public C02VO certification;
    public C553102Dp combine_payment_info;
    public String consultation_id;
    public String country_code;
    public Map<String, Boolean> coupon_filter_rule;
    public C022J credit_info;
    public List<C5423029l> elevator_bars;
    public String encode_key;
    public C02X6 error_info;
    public C023J exception;
    public Boolean exist_cci_pi;
    public Map<String, String> experiment_info;
    public Boolean force_save;
    public List<C1DC1> independent_payment_button_infos;
    public Map<String, String> independent_pricing_param;
    public Boolean is_fold_recommend_payment_methods;
    public Boolean is_use_section;
    public String material_collection_info;
    public String merchant_name;
    public List<C02H3> method_photos_with_pm_code;
    public C639002eS methods_photos;
    public String methods_text;
    public Integer new_order_type;
    public Integer order_type;
    public C595602Ty pay_track_info;
    public C1C6Q payment_announcement;
    public C02CR payment_banner;
    public List<C02DN> payment_card_rules;
    public C553402Ds payment_guarantee_info;
    public List<C609002Zc> payment_method_sections;
    public List<C5193020p> payment_methods;
    public String payment_page_title;
    public Map<String, String> payment_param;
    public C639602eY payment_policy;
    public String pipo_host;
    public List<C02GQ> pop_ups;
    public Boolean pull_cashier_if_not_select;
    public Integer recommend_method_show_count;
    public C5193020p recommend_payment_method;
    public List<C609002Zc> recommend_payment_method_sections;
    public List<C5193020p> recommend_payment_methods;
    public List<C023M> retain_infos;
    public String sale_region;
    public C578602Nk secure_payment;
    public AnonymousClass0290 settings;
    public C023N shipping_address;
    public Integer stored_method_show_count;
    public List<C5193020p> stored_methods;
    public C649602gA title_tips;
    public C544002Ac top_security_text;
    public List<C560702Gn> unavailable_cardbin_list;

    @Override // com.squareup.wire.Message
    public C02OG newBuilder() {
        return null;
    }

    public C5197020t() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_methods = C1516540pZE.LJIIIIZZ();
        this.stored_methods = C1516540pZE.LJIIIIZZ();
        this.bank_card_rules = C1516540pZE.LJIIIIZZ();
        this.recommend_payment_methods = C1516540pZE.LJIIIIZZ();
        this.payment_card_rules = C1516540pZE.LJIIIIZZ();
        this.unavailable_cardbin_list = C1516540pZE.LJIIIIZZ();
        this.abnormal_card_bin_list = C1516540pZE.LJIIIIZZ();
        this.payment_method_sections = C1516540pZE.LJIIIIZZ();
        this.recommend_payment_method_sections = C1516540pZE.LJIIIIZZ();
        this.payment_param = new LinkedHashMap();
        this.method_photos_with_pm_code = C1516540pZE.LJIIIIZZ();
        this.independent_pricing_param = new LinkedHashMap();
        this.elevator_bars = C1516540pZE.LJIIIIZZ();
        this.experiment_info = new LinkedHashMap();
        this.pop_ups = C1516540pZE.LJIIIIZZ();
        this.button_info_with_scene = C1516540pZE.LJIIIIZZ();
        this.retain_infos = C1516540pZE.LJIIIIZZ();
        this.independent_payment_button_infos = C1516540pZE.LJIIIIZZ();
        this.coupon_filter_rule = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
