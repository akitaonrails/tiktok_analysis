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

/* JADX INFO: renamed from: X.020m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5190020m extends Message<C5190020m, C585802Qe> {
    public static final ProtoAdapter<C5190020m> ADAPTER = new ProtoAdapter<C5190020m>() { // from class: X.020n
        public final ProtoAdapter<Map<String, C597102Un>> LIZ;
        public final ProtoAdapter<Map<String, C029C>> LIZIZ;
        public final ProtoAdapter<Map<String, C02YH>> LIZJ;
        public final ProtoAdapter<Map<String, C553502Dt>> LIZLLL;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, C597102Un.ADAPTER);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, C029C.ADAPTER);
            this.LIZJ = ProtoAdapter.newMapAdapter(protoAdapter, C02YH.ADAPTER);
            this.LIZLLL = ProtoAdapter.newMapAdapter(protoAdapter, C553502Dt.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5190020m decode(ProtoReader protoReader) {
            C5190020m c5190020m = new C5190020m();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5190020m.shop_orders.add(C02OV.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c5190020m.summary = C02YH.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5190020m.shipping_address = C021N.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5190020m.exception_ux = C023J.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5190020m.address_input_item = C5277023v.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5190020m.payment_methods = C5197020t.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5190020m.voucher_info = C763702yZ.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5190020m.order_secret = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5190020m.schema_info = C02FP.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5190020m.announcements.add(C5253022x.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5190020m.bottom_notice = C614402aU.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5190020m.privacy_policy_statement = AnonymousClass0241.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5190020m.place_order_button_text = C652602ge.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c5190020m.top_notice = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c5190020m.button_pop_tips = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c5190020m.shop_orders_new.add(C022G.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5190020m.platform_promotion = C021J.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5190020m.version = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c5190020m.layout.putAll(this.LIZ.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5190020m.addon_order = C022B.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c5190020m.auto_claimed_vouchers.add(C761602yE.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            c5190020m.request_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c5190020m.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5190020m.extra_fee_statement = C715402qm.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c5190020m.sku_common_config = C5236022g.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c5190020m.toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c5190020m.promotion_da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 28:
                            c5190020m.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            c5190020m.create_order_info_from_bill = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 30:
                            c5190020m.pre_risk_param = C2274651E1n.ADAPTER.decode(protoReader);
                            break;
                        case 31:
                            c5190020m.policy_data = C631402dE.ADAPTER.decode(protoReader);
                            break;
                        case 32:
                            c5190020m.logistic_data = C549902Cj.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c5190020m.all_promotion = C718102rD.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c5190020m.cpf_info = C561902Gz.ADAPTER.decode(protoReader);
                            break;
                        case 35:
                            c5190020m.debug_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c5190020m.user_trust_module = C708902pj.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            c5190020m.starling_texts = C5219021p.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            c5190020m.payment_summary.add(AnonymousClass0281.ADAPTER.decode(protoReader));
                            break;
                        case 39:
                            c5190020m.buyer_protection_program = C547802Bo.ADAPTER.decode(protoReader);
                            break;
                        case 40:
                            c5190020m.bill_info_server_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 41:
                            c5190020m.address_secret_info = C728202sq.ADAPTER.decode(protoReader);
                            break;
                        case 42:
                            c5190020m.place_order_block_panel = C02CV.ADAPTER.decode(protoReader);
                            break;
                        case 43:
                            c5190020m.order_group.add(C021W.ADAPTER.decode(protoReader));
                            break;
                        case 44:
                            c5190020m.osp_button_info = C02QP.ADAPTER.decode(protoReader);
                            break;
                        case 45:
                            c5190020m.debug_info_v2 = C1C1B.ADAPTER.decode(protoReader);
                            break;
                        case 46:
                            c5190020m.settings = C5252022w.ADAPTER.decode(protoReader);
                            break;
                        case 47:
                            c5190020m.addon_panel_info = AnonymousClass0227.ADAPTER.decode(protoReader);
                            break;
                        case 48:
                            c5190020m.osp_button_banner_info = C601802Wi.ADAPTER.decode(protoReader);
                            break;
                        case 49:
                            c5190020m.email_authorization_info = C027R.ADAPTER.decode(protoReader);
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            c5190020m.express_checkout_info = C745602ve.ADAPTER.decode(protoReader);
                            break;
                        case 51:
                            c5190020m.add_note_statement = C547802Bo.ADAPTER.decode(protoReader);
                            break;
                        case 52:
                            c5190020m.retention_dialog_info = C02D2.ADAPTER.decode(protoReader);
                            break;
                        case 53:
                            c5190020m.user_right_module_info = C5341026h.ADAPTER.decode(protoReader);
                            break;
                        case 54:
                            c5190020m.user_benefit_draw_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 55:
                            c5190020m.osp_place_order_button = C5223021t.ADAPTER.decode(protoReader);
                            break;
                        case 56:
                            c5190020m.fulfillment_group_display_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 57:
                            c5190020m.identity_info = C5422029k.ADAPTER.decode(protoReader);
                            break;
                        case 58:
                            c5190020m.top_banners.add(AnonymousClass0289.ADAPTER.decode(protoReader));
                            break;
                        case 59:
                            c5190020m.under_age_confirm_dialog = C02GR.ADAPTER.decode(protoReader);
                            break;
                        case 60:
                            c5190020m.platform_right = C547202Bi.ADAPTER.decode(protoReader);
                            break;
                        case 61:
                            c5190020m.sku_selection = AnonymousClass0235.ADAPTER.decode(protoReader);
                            break;
                        case BaseNotice.CREATOR /* 62 */:
                            c5190020m.one_step_express_icon.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case 63:
                            c5190020m.pudo_shipping_address = C021N.ADAPTER.decode(protoReader);
                            break;
                        case 64:
                            c5190020m.mini_checkout_popup_list.add(C557302Ff.ADAPTER.decode(protoReader));
                            break;
                        case 65:
                            c5190020m.use_user_selection = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 66:
                            c5190020m.top_user_trust_infos.add(C02EF.ADAPTER.decode(protoReader));
                            break;
                        case 67:
                            c5190020m.donation_display_module = C02QZ.ADAPTER.decode(protoReader);
                            break;
                        case 68:
                            c5190020m.addition_summary.putAll(this.LIZJ.decode(protoReader));
                            break;
                        case 69:
                            c5190020m.addition_payment_summary.putAll(this.LIZLLL.decode(protoReader));
                            break;
                        case 70:
                            c5190020m.leading_elevator_bar = C02VX.ADAPTER.decode(protoReader);
                            break;
                        case 71:
                            c5190020m.bottom_cashback_banner = C02VU.ADAPTER.decode(protoReader);
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            c5190020m.page_header_carousel = C554602Ee.ADAPTER.decode(protoReader);
                            break;
                        case 73:
                            c5190020m.refundable_sample_module = C02DZ.ADAPTER.decode(protoReader);
                            break;
                        case 74:
                            c5190020m.privacy_popup = C02FK.ADAPTER.decode(protoReader);
                            break;
                        case 75:
                            c5190020m.bonus_module = C02Z2.ADAPTER.decode(protoReader);
                            break;
                        case 76:
                            c5190020m.digital_delivery = C645002fQ.ADAPTER.decode(protoReader);
                            break;
                        case 77:
                            c5190020m.change_info = C602102Wl.ADAPTER.decode(protoReader);
                            break;
                        case 78:
                            c5190020m.right_guidance_module = C02D3.ADAPTER.decode(protoReader);
                            break;
                        case 79:
                            c5190020m.age_confirm_module = C02EG.ADAPTER.decode(protoReader);
                            break;
                        case 80:
                            c5190020m.first_load_da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 81:
                            c5190020m.terms_and_conditions_module = C2224941C6i.ADAPTER.decode(protoReader);
                            break;
                        case 82:
                            c5190020m.navigation_module = C724302sD.ADAPTER.decode(protoReader);
                            break;
                        case 83:
                            c5190020m.promotion_module = C717802rA.ADAPTER.decode(protoReader);
                            break;
                        case 84:
                            c5190020m.warning_alert = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 85:
                            c5190020m.bottom_abnormal_banner = C642602f2.ADAPTER.decode(protoReader);
                            break;
                        case 86:
                            c5190020m.outside_selling_points_bubble = C02TX.ADAPTER.decode(protoReader);
                            break;
                        case 87:
                            c5190020m.prescription_module = C2225091C6x.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 199:
                                    c5190020m.cost_da_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 200:
                                    c5190020m.begin_render_chunk = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 201:
                                    c5190020m.last_chunk = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5190020m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5190020m c5190020m) {
            C5190020m c5190020m2 = c5190020m;
            int iEncodedSizeWithTag = C02OV.ADAPTER.asRepeated().encodedSizeWithTag(1, c5190020m2.shop_orders) + C02YH.ADAPTER.encodedSizeWithTag(2, c5190020m2.summary);
            ProtoAdapter<C021N> protoAdapter = C021N.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c5190020m2.shipping_address) + C023J.ADAPTER.encodedSizeWithTag(4, c5190020m2.exception_ux) + C5277023v.ADAPTER.encodedSizeWithTag(5, c5190020m2.address_input_item) + C5197020t.ADAPTER.encodedSizeWithTag(6, c5190020m2.payment_methods) + C763702yZ.ADAPTER.encodedSizeWithTag(7, c5190020m2.voucher_info);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(8, c5190020m2.order_secret) + C02FP.ADAPTER.encodedSizeWithTag(9, c5190020m2.schema_info) + C5253022x.ADAPTER.asRepeated().encodedSizeWithTag(10, c5190020m2.announcements) + C614402aU.ADAPTER.encodedSizeWithTag(11, c5190020m2.bottom_notice) + AnonymousClass0241.ADAPTER.encodedSizeWithTag(12, c5190020m2.privacy_policy_statement) + C652602ge.ADAPTER.encodedSizeWithTag(13, c5190020m2.place_order_button_text) + protoAdapter2.encodedSizeWithTag(14, c5190020m2.top_notice) + protoAdapter2.encodedSizeWithTag(15, c5190020m2.button_pop_tips) + C022G.ADAPTER.asRepeated().encodedSizeWithTag(16, c5190020m2.shop_orders_new) + C021J.ADAPTER.encodedSizeWithTag(17, c5190020m2.platform_promotion) + protoAdapter2.encodedSizeWithTag(18, c5190020m2.version) + this.LIZ.encodedSizeWithTag(19, c5190020m2.layout) + C022B.ADAPTER.encodedSizeWithTag(20, c5190020m2.addon_order) + C761602yE.ADAPTER.asRepeated().encodedSizeWithTag(21, c5190020m2.auto_claimed_vouchers) + protoAdapter2.encodedSizeWithTag(22, c5190020m2.request_id) + protoAdapter2.encodedSizeWithTag(23, c5190020m2.da_info) + C715402qm.ADAPTER.encodedSizeWithTag(24, c5190020m2.extra_fee_statement) + C5236022g.ADAPTER.encodedSizeWithTag(25, c5190020m2.sku_common_config) + protoAdapter2.encodedSizeWithTag(26, c5190020m2.toast) + protoAdapter2.encodedSizeWithTag(27, c5190020m2.promotion_da_info);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(28, c5190020m2.type) + protoAdapter2.encodedSizeWithTag(29, c5190020m2.create_order_info_from_bill) + C2274651E1n.ADAPTER.encodedSizeWithTag(30, c5190020m2.pre_risk_param) + C631402dE.ADAPTER.encodedSizeWithTag(31, c5190020m2.policy_data) + C549902Cj.ADAPTER.encodedSizeWithTag(32, c5190020m2.logistic_data) + C718102rD.ADAPTER.encodedSizeWithTag(33, c5190020m2.all_promotion) + C561902Gz.ADAPTER.encodedSizeWithTag(34, c5190020m2.cpf_info) + protoAdapter2.encodedSizeWithTag(35, c5190020m2.debug_info) + C708902pj.ADAPTER.encodedSizeWithTag(36, c5190020m2.user_trust_module) + C5219021p.ADAPTER.encodedSizeWithTag(37, c5190020m2.starling_texts) + AnonymousClass0281.ADAPTER.asRepeated().encodedSizeWithTag(38, c5190020m2.payment_summary);
            ProtoAdapter<C547802Bo> protoAdapter4 = C547802Bo.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(39, c5190020m2.buyer_protection_program) + protoAdapter2.encodedSizeWithTag(40, c5190020m2.bill_info_server_params) + C728202sq.ADAPTER.encodedSizeWithTag(41, c5190020m2.address_secret_info) + C02CV.ADAPTER.encodedSizeWithTag(42, c5190020m2.place_order_block_panel) + C021W.ADAPTER.asRepeated().encodedSizeWithTag(43, c5190020m2.order_group) + C02QP.ADAPTER.encodedSizeWithTag(44, c5190020m2.osp_button_info) + C1C1B.ADAPTER.encodedSizeWithTag(45, c5190020m2.debug_info_v2) + C5252022w.ADAPTER.encodedSizeWithTag(46, c5190020m2.settings) + AnonymousClass0227.ADAPTER.encodedSizeWithTag(47, c5190020m2.addon_panel_info) + C601802Wi.ADAPTER.encodedSizeWithTag(48, c5190020m2.osp_button_banner_info) + C027R.ADAPTER.encodedSizeWithTag(49, c5190020m2.email_authorization_info) + C745602ve.ADAPTER.encodedSizeWithTag(50, c5190020m2.express_checkout_info) + protoAdapter4.encodedSizeWithTag(51, c5190020m2.add_note_statement) + C02D2.ADAPTER.encodedSizeWithTag(52, c5190020m2.retention_dialog_info) + C5341026h.ADAPTER.encodedSizeWithTag(53, c5190020m2.user_right_module_info) + protoAdapter2.encodedSizeWithTag(54, c5190020m2.user_benefit_draw_schema) + C5223021t.ADAPTER.encodedSizeWithTag(55, c5190020m2.osp_place_order_button) + protoAdapter3.encodedSizeWithTag(56, c5190020m2.fulfillment_group_display_type) + C5422029k.ADAPTER.encodedSizeWithTag(57, c5190020m2.identity_info) + AnonymousClass0289.ADAPTER.asRepeated().encodedSizeWithTag(58, c5190020m2.top_banners) + C02GR.ADAPTER.encodedSizeWithTag(59, c5190020m2.under_age_confirm_dialog) + C547202Bi.ADAPTER.encodedSizeWithTag(60, c5190020m2.platform_right) + AnonymousClass0235.ADAPTER.encodedSizeWithTag(61, c5190020m2.sku_selection) + this.LIZIZ.encodedSizeWithTag(62, c5190020m2.one_step_express_icon) + protoAdapter.encodedSizeWithTag(63, c5190020m2.pudo_shipping_address) + C557302Ff.ADAPTER.asRepeated().encodedSizeWithTag(64, c5190020m2.mini_checkout_popup_list) + protoAdapter2.encodedSizeWithTag(65, c5190020m2.use_user_selection) + C02EF.ADAPTER.asRepeated().encodedSizeWithTag(66, c5190020m2.top_user_trust_infos) + C02QZ.ADAPTER.encodedSizeWithTag(67, c5190020m2.donation_display_module) + this.LIZJ.encodedSizeWithTag(68, c5190020m2.addition_summary) + this.LIZLLL.encodedSizeWithTag(69, c5190020m2.addition_payment_summary) + C02VX.ADAPTER.encodedSizeWithTag(70, c5190020m2.leading_elevator_bar) + C02VU.ADAPTER.encodedSizeWithTag(71, c5190020m2.bottom_cashback_banner) + C554602Ee.ADAPTER.encodedSizeWithTag(72, c5190020m2.page_header_carousel) + C02DZ.ADAPTER.encodedSizeWithTag(73, c5190020m2.refundable_sample_module) + C02FK.ADAPTER.encodedSizeWithTag(74, c5190020m2.privacy_popup) + C02Z2.ADAPTER.encodedSizeWithTag(75, c5190020m2.bonus_module) + C645002fQ.ADAPTER.encodedSizeWithTag(76, c5190020m2.digital_delivery) + C602102Wl.ADAPTER.encodedSizeWithTag(77, c5190020m2.change_info) + C02D3.ADAPTER.encodedSizeWithTag(78, c5190020m2.right_guidance_module) + C02EG.ADAPTER.encodedSizeWithTag(79, c5190020m2.age_confirm_module) + protoAdapter2.encodedSizeWithTag(80, c5190020m2.first_load_da_info) + C2224941C6i.ADAPTER.encodedSizeWithTag(81, c5190020m2.terms_and_conditions_module) + C724302sD.ADAPTER.encodedSizeWithTag(82, c5190020m2.navigation_module) + C717802rA.ADAPTER.encodedSizeWithTag(83, c5190020m2.promotion_module) + protoAdapter2.encodedSizeWithTag(84, c5190020m2.warning_alert) + C642602f2.ADAPTER.encodedSizeWithTag(85, c5190020m2.bottom_abnormal_banner) + C02TX.ADAPTER.encodedSizeWithTag(86, c5190020m2.outside_selling_points_bubble) + C2225091C6x.ADAPTER.encodedSizeWithTag(87, c5190020m2.prescription_module) + protoAdapter2.encodedSizeWithTag(199, c5190020m2.cost_da_info);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag5 + protoAdapter5.encodedSizeWithTag(200, c5190020m2.begin_render_chunk) + protoAdapter5.encodedSizeWithTag(201, c5190020m2.last_chunk) + c5190020m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5190020m c5190020m) {
        }
    };
    public C547802Bo add_note_statement;
    public Map<String, C553502Dt> addition_payment_summary;
    public Map<String, C02YH> addition_summary;
    public C022B addon_order;
    public AnonymousClass0227 addon_panel_info;
    public C5277023v address_input_item;
    public C728202sq address_secret_info;
    public C02EG age_confirm_module;
    public C718102rD all_promotion;
    public List<C5253022x> announcements;
    public List<C761602yE> auto_claimed_vouchers;
    public Boolean begin_render_chunk;
    public String bill_info_server_params;
    public C02Z2 bonus_module;
    public C642602f2 bottom_abnormal_banner;
    public C02VU bottom_cashback_banner;
    public C614402aU bottom_notice;
    public String button_pop_tips;
    public C547802Bo buyer_protection_program;
    public C602102Wl change_info;
    public String cost_da_info;
    public C561902Gz cpf_info;
    public String create_order_info_from_bill;
    public String da_info;
    public String debug_info;
    public C1C1B debug_info_v2;
    public C645002fQ digital_delivery;
    public C02QZ donation_display_module;
    public C027R email_authorization_info;
    public C023J exception_ux;
    public C745602ve express_checkout_info;
    public C715402qm extra_fee_statement;
    public String first_load_da_info;
    public Integer fulfillment_group_display_type;
    public C5422029k identity_info;
    public Boolean last_chunk;
    public Map<String, C597102Un> layout;
    public C02VX leading_elevator_bar;
    public C549902Cj logistic_data;
    public List<C557302Ff> mini_checkout_popup_list;
    public C724302sD navigation_module;
    public Map<String, C029C> one_step_express_icon;
    public List<C021W> order_group;
    public String order_secret;
    public C601802Wi osp_button_banner_info;
    public C02QP osp_button_info;
    public C5223021t osp_place_order_button;
    public C02TX outside_selling_points_bubble;
    public C554602Ee page_header_carousel;
    public C5197020t payment_methods;
    public List<AnonymousClass0281> payment_summary;
    public C02CV place_order_block_panel;
    public C652602ge place_order_button_text;
    public C021J platform_promotion;
    public C547202Bi platform_right;
    public C631402dE policy_data;
    public C2274651E1n pre_risk_param;
    public C2225091C6x prescription_module;
    public AnonymousClass0241 privacy_policy_statement;
    public C02FK privacy_popup;
    public String promotion_da_info;
    public C717802rA promotion_module;
    public C021N pudo_shipping_address;
    public C02DZ refundable_sample_module;
    public String request_id;
    public C02D2 retention_dialog_info;
    public C02D3 right_guidance_module;
    public C02FP schema_info;
    public C5252022w settings;
    public C021N shipping_address;
    public List<C02OV> shop_orders;
    public List<C022G> shop_orders_new;
    public C5236022g sku_common_config;
    public AnonymousClass0235 sku_selection;
    public C5219021p starling_texts;
    public C02YH summary;
    public C2224941C6i terms_and_conditions_module;
    public String toast;
    public List<AnonymousClass0289> top_banners;
    public String top_notice;
    public List<C02EF> top_user_trust_infos;
    public Integer type;
    public C02GR under_age_confirm_dialog;
    public String use_user_selection;
    public String user_benefit_draw_schema;
    public C5341026h user_right_module_info;
    public C708902pj user_trust_module;
    public String version;
    public C763702yZ voucher_info;
    public String warning_alert;

    @Override // com.squareup.wire.Message
    public C585802Qe newBuilder() {
        return null;
    }

    public C5190020m() {
        super(ADAPTER, ByteString.EMPTY);
        this.shop_orders = C1516540pZE.LJIIIIZZ();
        this.announcements = C1516540pZE.LJIIIIZZ();
        this.shop_orders_new = C1516540pZE.LJIIIIZZ();
        this.layout = new LinkedHashMap();
        this.auto_claimed_vouchers = C1516540pZE.LJIIIIZZ();
        this.payment_summary = C1516540pZE.LJIIIIZZ();
        this.order_group = C1516540pZE.LJIIIIZZ();
        this.top_banners = C1516540pZE.LJIIIIZZ();
        this.one_step_express_icon = new LinkedHashMap();
        this.mini_checkout_popup_list = C1516540pZE.LJIIIIZZ();
        this.top_user_trust_infos = C1516540pZE.LJIIIIZZ();
        this.addition_summary = new LinkedHashMap();
        this.addition_payment_summary = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
