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
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.020p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5193020p extends Message<C5193020p, C578802Nm> {
    public static final ProtoAdapter<C5193020p> ADAPTER = new ProtoAdapter<C5193020p>() { // from class: X.020o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5193020p decode(ProtoReader protoReader) {
            C5193020p c5193020p = new C5193020p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5193020p.payment_method_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5193020p.display_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5193020p.payment_method_first_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5193020p.payment_method_second_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5193020p.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5193020p.icon_url_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5193020p.starling_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5193020p.elements.add(AnonymousClass0230.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5193020p.max_limited_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5193020p.min_limited_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5193020p.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5193020p.pci_sensitive = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5193020p.sub_payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (iNextTag) {
                                case 15:
                                    c5193020p.is_deeplink = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 16:
                                    c5193020p.package_name = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    c5193020p.extra_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    switch (iNextTag) {
                                        case 21:
                                            c5193020p.save_display_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 22:
                                            c5193020p.save_notification_url = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 23:
                                            c5193020p.schema = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                            c5193020p.is_need_install_app = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        default:
                                            switch (iNextTag) {
                                                case 51:
                                                    c5193020p.masked_identity = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 52:
                                                    c5193020p.is_primary = ProtoAdapter.BOOL.decode(protoReader);
                                                    break;
                                                case 53:
                                                    c5193020p.payment_method_token = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                default:
                                                    switch (iNextTag) {
                                                        case 56:
                                                            c5193020p.needed_elements.add(AnonymousClass0230.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 57:
                                                            c5193020p.availability = C554402Ec.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 58:
                                                            c5193020p.balance = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 59:
                                                            c5193020p.bind_info = C028B.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 60:
                                                            c5193020p.prompt = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 61:
                                                            c5193020p.order_payment_tips = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case BaseNotice.CREATOR /* 62 */:
                                                            c5193020p.supported_pay_commute_types.add(C639302eV.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 63:
                                                            c5193020p.unfold_strategy = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 64:
                                                            c5193020p.display_name_tags.add(ProtoAdapter.STRING.decode(protoReader));
                                                            break;
                                                        case 65:
                                                            c5193020p.installment_info = C022C.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 66:
                                                            c5193020p.support_card_list.add(ProtoAdapter.STRING.decode(protoReader));
                                                            break;
                                                        case 67:
                                                            c5193020p.is_choose_recommend = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 68:
                                                            c5193020p.should_reload_billinfo = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 69:
                                                            c5193020p.explanation_url = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 70:
                                                            c5193020p.payment_label = C551702Db.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 71:
                                                            c5193020p.ccdc_card_tip = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                                            c5193020p.extra_fee_statement = C715402qm.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 73:
                                                            c5193020p.payment_tips = C02B0.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 74:
                                                            c5193020p.exception = C023J.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 75:
                                                            c5193020p.promotion_info.add(AnonymousClass0220.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 76:
                                                            c5193020p.payment_banner = C02CR.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 77:
                                                            c5193020p.missing_elements.add(AnonymousClass0230.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 78:
                                                            c5193020p.default_save = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 79:
                                                            c5193020p.installment_info_list.add(C022C.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 80:
                                                            c5193020p.ccdc_icon_urls.add(C02HC.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 81:
                                                            c5193020p.ccdc_safe_tip = C02VO.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 82:
                                                            c5193020p.additional_tips.add(C02B0.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 83:
                                                            c5193020p.save_security_info.add(C599102Vh.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 84:
                                                            c5193020p.cashier_sheet.add(C02GM.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 85:
                                                            c5193020p.payment_subtitle = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 86:
                                                            c5193020p.installation_tips = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 87:
                                                            c5193020p.payment_service_fee_info = C548002Bq.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 88:
                                                            c5193020p.checkout_button_icon_url = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 89:
                                                            c5193020p.dark_checkout_button_icon_url = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 90:
                                                            c5193020p.checkout_button_icon_color = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 91:
                                                            c5193020p.dark_checkout_button_icon_color = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 92:
                                                            c5193020p.events_for_client = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 93:
                                                            c5193020p.pop_up_needed_elements.add(AnonymousClass0230.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 94:
                                                            c5193020p.hybrid_payment_info = C660102hr.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 95:
                                                            c5193020p.new_payment_method_title = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 96:
                                                            c5193020p.binding_tip.add(ProtoAdapter.STRING.decode(protoReader));
                                                            break;
                                                        case 97:
                                                            c5193020p.new_bind_card_flow = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 98:
                                                            c5193020p.sub_icon_urls.add(C02HC.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 99:
                                                            c5193020p.half_screen_title_key = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 100:
                                                            c5193020p.sub_display_name = C5431029t.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 101:
                                                            c5193020p.pay_redirect_nav_bar = C02HC.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 102:
                                                            c5193020p.recurring_payment_info = C027W.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 103:
                                                            c5193020p.is_verified = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 104:
                                                            c5193020p.verify_date = ProtoAdapter.INT64.decode(protoReader);
                                                            break;
                                                        case 105:
                                                            c5193020p.can_appeal = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 106:
                                                            c5193020p.appeal_status = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 107:
                                                            c5193020p.payment_price_version_id = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 108:
                                                            c5193020p.payment_unit_id = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 109:
                                                            c5193020p.needs_independent_pricing = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 110:
                                                            c5193020p.is_installment = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 111:
                                                            c5193020p.card_bin = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 112:
                                                            c5193020p.disable_braintree_sdk = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 113:
                                                            c5193020p.needs_secondary_query_installment = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 114:
                                                            c5193020p.is_need_pre_bind_verify = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 115:
                                                            c5193020p.tooltip = C650502gJ.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 116:
                                                            c5193020p.last_four = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 117:
                                                            c5193020p.support_donation = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 118:
                                                            c5193020p.is_client_bind = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 119:
                                                            c5193020p.is_expand = ProtoAdapter.BOOL.decode(protoReader);
                                                            break;
                                                        case 120:
                                                            c5193020p.additional_clarification = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 121:
                                                            c5193020p.page_button_info = C594602To.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 122:
                                                            c5193020p.balance_str = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 123:
                                                            c5193020p.anchored_payment_info = C660102hr.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 124:
                                                            c5193020p.bnpl_and_hybrid_payment_interaction_style = ProtoAdapter.INT32.decode(protoReader);
                                                            break;
                                                        case 125:
                                                            c5193020p.remain_amount_tips = C02B0.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 126:
                                                            c5193020p.appeal_id = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 127:
                                                            c5193020p.popup_info = C552102Df.ADAPTER.decode(protoReader);
                                                            break;
                                                        case 128:
                                                            c5193020p.da_info = ProtoAdapter.STRING.decode(protoReader);
                                                            break;
                                                        case 129:
                                                            c5193020p.save_security_section.add(C02CY.ADAPTER.decode(protoReader));
                                                            break;
                                                        case 130:
                                                            c5193020p.deferred_apple_pay_params = C1CJI.ADAPTER.decode(protoReader);
                                                            break;
                                                        default:
                                                            switch (iNextTag) {
                                                                case 135:
                                                                    c5193020p.balance_tips = C02B0.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 136:
                                                                    c5193020p.card_tips = C02B0.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 137:
                                                                    c5193020p.sub_asset_info.add(C660402hu.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 138:
                                                                    c5193020p.is_expand_sub_payment_method = ProtoAdapter.BOOL.decode(protoReader);
                                                                    break;
                                                                case 139:
                                                                    c5193020p.pay_availability = C744802vW.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 140:
                                                                    c5193020p.single_payment_info = C660102hr.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 141:
                                                                    c5193020p.fund_source = ProtoAdapter.INT64.decode(protoReader);
                                                                    break;
                                                                case 142:
                                                                    c5193020p.fund_token = ProtoAdapter.STRING.decode(protoReader);
                                                                    break;
                                                                case 143:
                                                                    c5193020p.co_brands.add(C693002nA.ADAPTER.decode(protoReader));
                                                                    break;
                                                                case 144:
                                                                    c5193020p.balance_amount = C614702aX.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 145:
                                                                    c5193020p.payment_limit_tips = C02B0.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 146:
                                                                    c5193020p.recovery_marketing_info = C551102Cv.ADAPTER.decode(protoReader);
                                                                    break;
                                                                case 147:
                                                                    c5193020p.card_type = ProtoAdapter.INT64.decode(protoReader);
                                                                    break;
                                                                case 148:
                                                                    c5193020p.bank_code = ProtoAdapter.STRING.decode(protoReader);
                                                                    break;
                                                                default:
                                                                    switch (iNextTag) {
                                                                        case 150:
                                                                            c5193020p.not_instant_discount_promotion_info.add(AnonymousClass0220.ADAPTER.decode(protoReader));
                                                                            break;
                                                                        case 151:
                                                                            c5193020p.pocket_name = ProtoAdapter.STRING.decode(protoReader);
                                                                            break;
                                                                        case 152:
                                                                            c5193020p.is_need_refresh = ProtoAdapter.BOOL.decode(protoReader);
                                                                            break;
                                                                        default:
                                                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5193020p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5193020p c5193020p) {
            C5193020p c5193020p2 = c5193020p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5193020p2.payment_method_id) + protoAdapter.encodedSizeWithTag(2, c5193020p2.display_name) + protoAdapter.encodedSizeWithTag(3, c5193020p2.payment_method_first_type) + protoAdapter.encodedSizeWithTag(4, c5193020p2.payment_method_second_type) + protoAdapter.encodedSizeWithTag(5, c5193020p2.icon_url) + protoAdapter.encodedSizeWithTag(6, c5193020p2.icon_url_dark) + protoAdapter.encodedSizeWithTag(7, c5193020p2.starling_key);
            ProtoAdapter<AnonymousClass0230> protoAdapter2 = AnonymousClass0230.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(8, c5193020p2.elements) + protoAdapter.encodedSizeWithTag(9, c5193020p2.max_limited_amount) + protoAdapter.encodedSizeWithTag(10, c5193020p2.min_limited_amount) + protoAdapter.encodedSizeWithTag(11, c5193020p2.currency);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(12, c5193020p2.pci_sensitive) + C5193020p.ADAPTER.asRepeated().encodedSizeWithTag(13, c5193020p2.sub_payment_methods) + protoAdapter3.encodedSizeWithTag(15, c5193020p2.is_deeplink) + protoAdapter.encodedSizeWithTag(16, c5193020p2.package_name) + protoAdapter.encodedSizeWithTag(17, c5193020p2.extra_info) + protoAdapter.encodedSizeWithTag(21, c5193020p2.save_display_text) + protoAdapter.encodedSizeWithTag(22, c5193020p2.save_notification_url) + protoAdapter.encodedSizeWithTag(23, c5193020p2.schema) + protoAdapter3.encodedSizeWithTag(24, c5193020p2.is_need_install_app) + protoAdapter.encodedSizeWithTag(51, c5193020p2.masked_identity) + protoAdapter3.encodedSizeWithTag(52, c5193020p2.is_primary) + protoAdapter.encodedSizeWithTag(53, c5193020p2.payment_method_token) + protoAdapter2.asRepeated().encodedSizeWithTag(56, c5193020p2.needed_elements) + C554402Ec.ADAPTER.encodedSizeWithTag(57, c5193020p2.availability) + protoAdapter.encodedSizeWithTag(58, c5193020p2.balance) + C028B.ADAPTER.encodedSizeWithTag(59, c5193020p2.bind_info) + protoAdapter.encodedSizeWithTag(60, c5193020p2.prompt) + protoAdapter.encodedSizeWithTag(61, c5193020p2.order_payment_tips) + C639302eV.ADAPTER.asRepeated().encodedSizeWithTag(62, c5193020p2.supported_pay_commute_types) + protoAdapter.encodedSizeWithTag(63, c5193020p2.unfold_strategy) + protoAdapter.asRepeated().encodedSizeWithTag(64, c5193020p2.display_name_tags);
            ProtoAdapter<C022C> protoAdapter4 = C022C.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(65, c5193020p2.installment_info) + protoAdapter.asRepeated().encodedSizeWithTag(66, c5193020p2.support_card_list) + protoAdapter3.encodedSizeWithTag(67, c5193020p2.is_choose_recommend) + protoAdapter3.encodedSizeWithTag(68, c5193020p2.should_reload_billinfo) + protoAdapter.encodedSizeWithTag(69, c5193020p2.explanation_url) + C551702Db.ADAPTER.encodedSizeWithTag(70, c5193020p2.payment_label) + protoAdapter.encodedSizeWithTag(71, c5193020p2.ccdc_card_tip) + C715402qm.ADAPTER.encodedSizeWithTag(72, c5193020p2.extra_fee_statement);
            ProtoAdapter<C02B0> protoAdapter5 = C02B0.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(73, c5193020p2.payment_tips) + C023J.ADAPTER.encodedSizeWithTag(74, c5193020p2.exception);
            ProtoAdapter<AnonymousClass0220> protoAdapter6 = AnonymousClass0220.ADAPTER;
            int iEncodedSizeWithTag6 = iEncodedSizeWithTag5 + protoAdapter6.asRepeated().encodedSizeWithTag(75, c5193020p2.promotion_info) + C02CR.ADAPTER.encodedSizeWithTag(76, c5193020p2.payment_banner) + protoAdapter2.asRepeated().encodedSizeWithTag(77, c5193020p2.missing_elements) + protoAdapter3.encodedSizeWithTag(78, c5193020p2.default_save) + protoAdapter4.asRepeated().encodedSizeWithTag(79, c5193020p2.installment_info_list);
            ProtoAdapter<C02HC> protoAdapter7 = C02HC.ADAPTER;
            int iEncodedSizeWithTag7 = iEncodedSizeWithTag6 + protoAdapter7.asRepeated().encodedSizeWithTag(80, c5193020p2.ccdc_icon_urls) + C02VO.ADAPTER.encodedSizeWithTag(81, c5193020p2.ccdc_safe_tip) + protoAdapter5.asRepeated().encodedSizeWithTag(82, c5193020p2.additional_tips) + C599102Vh.ADAPTER.asRepeated().encodedSizeWithTag(83, c5193020p2.save_security_info) + C02GM.ADAPTER.asRepeated().encodedSizeWithTag(84, c5193020p2.cashier_sheet) + protoAdapter.encodedSizeWithTag(85, c5193020p2.payment_subtitle) + protoAdapter.encodedSizeWithTag(86, c5193020p2.installation_tips) + C548002Bq.ADAPTER.encodedSizeWithTag(87, c5193020p2.payment_service_fee_info) + protoAdapter.encodedSizeWithTag(88, c5193020p2.checkout_button_icon_url) + protoAdapter.encodedSizeWithTag(89, c5193020p2.dark_checkout_button_icon_url) + protoAdapter.encodedSizeWithTag(90, c5193020p2.checkout_button_icon_color) + protoAdapter.encodedSizeWithTag(91, c5193020p2.dark_checkout_button_icon_color) + protoAdapter.encodedSizeWithTag(92, c5193020p2.events_for_client) + protoAdapter2.asRepeated().encodedSizeWithTag(93, c5193020p2.pop_up_needed_elements);
            ProtoAdapter<C660102hr> protoAdapter8 = C660102hr.ADAPTER;
            int iEncodedSizeWithTag8 = iEncodedSizeWithTag7 + protoAdapter8.encodedSizeWithTag(94, c5193020p2.hybrid_payment_info) + protoAdapter.encodedSizeWithTag(95, c5193020p2.new_payment_method_title) + protoAdapter.asRepeated().encodedSizeWithTag(96, c5193020p2.binding_tip) + protoAdapter3.encodedSizeWithTag(97, c5193020p2.new_bind_card_flow) + protoAdapter7.asRepeated().encodedSizeWithTag(98, c5193020p2.sub_icon_urls) + protoAdapter.encodedSizeWithTag(99, c5193020p2.half_screen_title_key) + C5431029t.ADAPTER.encodedSizeWithTag(100, c5193020p2.sub_display_name) + protoAdapter7.encodedSizeWithTag(101, c5193020p2.pay_redirect_nav_bar) + C027W.ADAPTER.encodedSizeWithTag(102, c5193020p2.recurring_payment_info) + protoAdapter3.encodedSizeWithTag(103, c5193020p2.is_verified);
            ProtoAdapter<Long> protoAdapter9 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag8 + protoAdapter9.encodedSizeWithTag(104, c5193020p2.verify_date) + protoAdapter3.encodedSizeWithTag(105, c5193020p2.can_appeal) + protoAdapter.encodedSizeWithTag(106, c5193020p2.appeal_status) + protoAdapter.encodedSizeWithTag(107, c5193020p2.payment_price_version_id) + protoAdapter.encodedSizeWithTag(108, c5193020p2.payment_unit_id) + protoAdapter3.encodedSizeWithTag(109, c5193020p2.needs_independent_pricing) + protoAdapter3.encodedSizeWithTag(110, c5193020p2.is_installment) + protoAdapter.encodedSizeWithTag(111, c5193020p2.card_bin) + protoAdapter3.encodedSizeWithTag(112, c5193020p2.disable_braintree_sdk) + protoAdapter3.encodedSizeWithTag(113, c5193020p2.needs_secondary_query_installment) + protoAdapter3.encodedSizeWithTag(114, c5193020p2.is_need_pre_bind_verify) + C650502gJ.ADAPTER.encodedSizeWithTag(115, c5193020p2.tooltip) + protoAdapter.encodedSizeWithTag(116, c5193020p2.last_four) + protoAdapter3.encodedSizeWithTag(117, c5193020p2.support_donation) + protoAdapter3.encodedSizeWithTag(118, c5193020p2.is_client_bind) + protoAdapter3.encodedSizeWithTag(119, c5193020p2.is_expand) + protoAdapter.encodedSizeWithTag(120, c5193020p2.additional_clarification) + C594602To.ADAPTER.encodedSizeWithTag(121, c5193020p2.page_button_info) + protoAdapter.encodedSizeWithTag(122, c5193020p2.balance_str) + protoAdapter8.encodedSizeWithTag(123, c5193020p2.anchored_payment_info) + ProtoAdapter.INT32.encodedSizeWithTag(124, c5193020p2.bnpl_and_hybrid_payment_interaction_style) + protoAdapter5.encodedSizeWithTag(125, c5193020p2.remain_amount_tips) + protoAdapter.encodedSizeWithTag(126, c5193020p2.appeal_id) + C552102Df.ADAPTER.encodedSizeWithTag(127, c5193020p2.popup_info) + protoAdapter.encodedSizeWithTag(128, c5193020p2.da_info) + C02CY.ADAPTER.asRepeated().encodedSizeWithTag(129, c5193020p2.save_security_section) + C1CJI.ADAPTER.encodedSizeWithTag(130, c5193020p2.deferred_apple_pay_params) + protoAdapter5.encodedSizeWithTag(135, c5193020p2.balance_tips) + protoAdapter5.encodedSizeWithTag(136, c5193020p2.card_tips) + C660402hu.ADAPTER.asRepeated().encodedSizeWithTag(137, c5193020p2.sub_asset_info) + protoAdapter3.encodedSizeWithTag(138, c5193020p2.is_expand_sub_payment_method) + C744802vW.ADAPTER.encodedSizeWithTag(139, c5193020p2.pay_availability) + protoAdapter8.encodedSizeWithTag(140, c5193020p2.single_payment_info) + protoAdapter9.encodedSizeWithTag(141, c5193020p2.fund_source) + protoAdapter.encodedSizeWithTag(142, c5193020p2.fund_token) + C693002nA.ADAPTER.asRepeated().encodedSizeWithTag(143, c5193020p2.co_brands) + C614702aX.ADAPTER.encodedSizeWithTag(144, c5193020p2.balance_amount) + protoAdapter5.encodedSizeWithTag(145, c5193020p2.payment_limit_tips) + C551102Cv.ADAPTER.encodedSizeWithTag(146, c5193020p2.recovery_marketing_info) + protoAdapter9.encodedSizeWithTag(147, c5193020p2.card_type) + protoAdapter.encodedSizeWithTag(148, c5193020p2.bank_code) + protoAdapter6.asRepeated().encodedSizeWithTag(150, c5193020p2.not_instant_discount_promotion_info) + protoAdapter.encodedSizeWithTag(151, c5193020p2.pocket_name) + protoAdapter3.encodedSizeWithTag(152, c5193020p2.is_need_refresh) + c5193020p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5193020p c5193020p) {
        }
    };
    public String additional_clarification;
    public List<C02B0> additional_tips;
    public C660102hr anchored_payment_info;
    public String appeal_id;
    public String appeal_status;
    public C554402Ec availability;
    public String balance;
    public C614702aX balance_amount;
    public String balance_str;
    public C02B0 balance_tips;
    public String bank_code;
    public C028B bind_info;
    public List<String> binding_tip;
    public Integer bnpl_and_hybrid_payment_interaction_style;
    public Boolean can_appeal;
    public String card_bin;
    public C02B0 card_tips;
    public Long card_type;
    public List<C02GM> cashier_sheet;
    public String ccdc_card_tip;
    public List<C02HC> ccdc_icon_urls;
    public C02VO ccdc_safe_tip;
    public String checkout_button_icon_color;
    public String checkout_button_icon_url;
    public List<C693002nA> co_brands;
    public String currency;
    public String da_info;
    public String dark_checkout_button_icon_color;
    public String dark_checkout_button_icon_url;
    public Boolean default_save;
    public C1CJI deferred_apple_pay_params;
    public Boolean disable_braintree_sdk;
    public String display_name;
    public List<String> display_name_tags;
    public List<AnonymousClass0230> elements;
    public String events_for_client;
    public C023J exception;
    public String explanation_url;
    public C715402qm extra_fee_statement;
    public String extra_info;
    public Long fund_source;
    public String fund_token;
    public String half_screen_title_key;
    public C660102hr hybrid_payment_info;
    public String icon_url;
    public String icon_url_dark;
    public String installation_tips;
    public C022C installment_info;
    public List<C022C> installment_info_list;
    public Boolean is_choose_recommend;
    public Boolean is_client_bind;
    public Boolean is_deeplink;
    public Boolean is_expand;
    public Boolean is_expand_sub_payment_method;
    public Boolean is_installment;
    public Boolean is_need_install_app;
    public Boolean is_need_pre_bind_verify;
    public Boolean is_need_refresh;
    public Boolean is_primary;
    public Boolean is_verified;
    public String last_four;
    public String masked_identity;
    public String max_limited_amount;
    public String min_limited_amount;
    public List<AnonymousClass0230> missing_elements;
    public List<AnonymousClass0230> needed_elements;
    public Boolean needs_independent_pricing;
    public Boolean needs_secondary_query_installment;
    public Boolean new_bind_card_flow;
    public String new_payment_method_title;
    public List<AnonymousClass0220> not_instant_discount_promotion_info;
    public String order_payment_tips;
    public String package_name;
    public C594602To page_button_info;
    public C744802vW pay_availability;
    public C02HC pay_redirect_nav_bar;
    public C02CR payment_banner;
    public C551702Db payment_label;
    public C02B0 payment_limit_tips;
    public String payment_method_first_type;
    public String payment_method_id;
    public String payment_method_second_type;
    public String payment_method_token;
    public String payment_price_version_id;
    public C548002Bq payment_service_fee_info;
    public String payment_subtitle;
    public C02B0 payment_tips;
    public String payment_unit_id;
    public Boolean pci_sensitive;
    public String pocket_name;
    public List<AnonymousClass0230> pop_up_needed_elements;
    public C552102Df popup_info;
    public List<AnonymousClass0220> promotion_info;
    public String prompt;
    public C551102Cv recovery_marketing_info;
    public C027W recurring_payment_info;
    public C02B0 remain_amount_tips;
    public String save_display_text;
    public String save_notification_url;
    public List<C599102Vh> save_security_info;
    public List<C02CY> save_security_section;
    public String schema;
    public Boolean should_reload_billinfo;
    public C660102hr single_payment_info;
    public String starling_key;
    public List<C660402hu> sub_asset_info;
    public C5431029t sub_display_name;
    public List<C02HC> sub_icon_urls;
    public List<C5193020p> sub_payment_methods;
    public List<String> support_card_list;
    public Boolean support_donation;
    public List<C639302eV> supported_pay_commute_types;
    public C650502gJ tooltip;
    public String unfold_strategy;
    public Long verify_date;

    public C5193020p() {
        super(ADAPTER, ByteString.EMPTY);
        this.elements = C1516540pZE.LJIIIIZZ();
        this.sub_payment_methods = C1516540pZE.LJIIIIZZ();
        this.needed_elements = C1516540pZE.LJIIIIZZ();
        this.supported_pay_commute_types = C1516540pZE.LJIIIIZZ();
        this.display_name_tags = C1516540pZE.LJIIIIZZ();
        this.support_card_list = C1516540pZE.LJIIIIZZ();
        this.promotion_info = C1516540pZE.LJIIIIZZ();
        this.missing_elements = C1516540pZE.LJIIIIZZ();
        this.installment_info_list = C1516540pZE.LJIIIIZZ();
        this.ccdc_icon_urls = C1516540pZE.LJIIIIZZ();
        this.additional_tips = C1516540pZE.LJIIIIZZ();
        this.save_security_info = C1516540pZE.LJIIIIZZ();
        this.cashier_sheet = C1516540pZE.LJIIIIZZ();
        this.pop_up_needed_elements = C1516540pZE.LJIIIIZZ();
        this.binding_tip = C1516540pZE.LJIIIIZZ();
        this.sub_icon_urls = C1516540pZE.LJIIIIZZ();
        this.save_security_section = C1516540pZE.LJIIIIZZ();
        this.sub_asset_info = C1516540pZE.LJIIIIZZ();
        this.co_brands = C1516540pZE.LJIIIIZZ();
        this.not_instant_discount_promotion_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C578802Nm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
