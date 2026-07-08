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

/* JADX INFO: renamed from: X.02yE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C761602yE extends Message<C761602yE, C723702s7> {
    public static final ProtoAdapter<C761602yE> ADAPTER = new ProtoAdapter<C761602yE>() { // from class: X.02yD
        public final ProtoAdapter<Map<Integer, C608402Yw>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, C608402Yw.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C761602yE decode(ProtoReader protoReader) {
            C761602yE c761602yE = new C761602yE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c761602yE.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c761602yE.voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c761602yE.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c761602yE.cost_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c761602yE.cost_role = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c761602yE.reduction_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c761602yE.claim_user_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c761602yE.use_limit_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c761602yE.discount_level = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c761602yE.claim_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c761602yE.usable_start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c761602yE.usable_end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c761602yE.main_order_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c761602yE.face_value = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c761602yE.voucher_business_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c761602yE.cost_role_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c761602yE.vap_schema_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c761602yE.background = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c761602yE.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c761602yE.voucher_restriction = C2223841C2c.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c761602yE.label_text_list.add(C762102yJ.ADAPTER.decode(protoReader));
                            break;
                        case 22:
                            c761602yE.labels.add(C608102Yt.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            c761602yE.vibe_area = C608102Yt.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c761602yE.claimable_start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 25:
                            c761602yE.claimable_end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            c761602yE.unusable_reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 27:
                            c761602yE.threshold_info = C1CGY.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c761602yE.is_strategy = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 29:
                            c761602yE.strategy_info = C1C28.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            c761602yE.selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 31:
                            c761602yE.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 32:
                            c761602yE.is_best = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c761602yE.selectable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c761602yE.has_multi_count = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 35:
                            c761602yE.tag_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            c761602yE.interactive_user_task = C2251551DAr.ADAPTER.decode(protoReader);
                            break;
                        case 37:
                            c761602yE.voucher_label_map.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 38:
                            c761602yE.voucher_membership_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 39:
                            c761602yE.instance_info_list.add(C2224291C3v.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (iNextTag) {
                                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                                    c761602yE.status_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 51:
                                    c761602yE.cost_role_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 52:
                                    c761602yE.discount_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 53:
                                    c761602yE.threshold_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 54:
                                    c761602yE.use_limit_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 55:
                                    c761602yE.orientation_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 56:
                                    c761602yE.odp_schema = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 57:
                                    c761602yE.scope_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 58:
                                    c761602yE.exclusions_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 59:
                                    c761602yE.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 60:
                                    c761602yE.button_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 61:
                                    c761602yE.valid_time_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BaseNotice.CREATOR /* 62 */:
                                    c761602yE.vap_schema = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 63:
                                    c761602yE.valid_time_text_style = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 64:
                                    c761602yE.claim_limit_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 65:
                                    c761602yE.shop_name_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 66:
                                    c761602yE.exists_count = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 67:
                                    c761602yE.discount_view.add(C659502hl.ADAPTER.decode(protoReader));
                                    break;
                                case 68:
                                    c761602yE.residual_quantity_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 69:
                                    c761602yE.used_count = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 70:
                                    c761602yE.total_count = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 71:
                                    c761602yE.claimed_count = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                                    c761602yE.residual_quantity_text_style = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 73:
                                    c761602yE.full_vap_schema = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 74:
                                    c761602yE.unusable_reason_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 75:
                                    c761602yE.button_state = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 76:
                                    c761602yE.shop_schema = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 77:
                                    c761602yE.discount_limit = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 78:
                                    c761602yE.discount_limit_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 79:
                                    c761602yE.ladder_info.add(C762702yP.ADAPTER.decode(protoReader));
                                    break;
                                case 80:
                                    c761602yE.applicable_shipping_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 81:
                                    c761602yE.usable_reminder_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 82:
                                    c761602yE.face_value_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 83:
                                    c761602yE.countdown = C699502oD.ADAPTER.decode(protoReader);
                                    break;
                                case 84:
                                    c761602yE.live_pill_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 85:
                                    c761602yE.live_pill_icon = C029C.ADAPTER.decode(protoReader);
                                    break;
                                case 86:
                                    c761602yE.face_value_format_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 87:
                                    c761602yE.threshold_value_format_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 88:
                                    c761602yE.discount_value_format_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 89:
                                    c761602yE.shipping_discount_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 90:
                                    c761602yE.shop_photo = C02U1.ADAPTER.decode(protoReader);
                                    break;
                                case 91:
                                    c761602yE.voucher_display_type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 92:
                                    c761602yE.interactive_info = C764302yf.ADAPTER.decode(protoReader);
                                    break;
                                case 93:
                                    c761602yE.code = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    switch (iNextTag) {
                                        case 100:
                                            c761602yE.tc_lines.add(C2263531Dih.ADAPTER.decode(protoReader));
                                            break;
                                        case 101:
                                            c761602yE.terms_apply = C1CGI.ADAPTER.decode(protoReader);
                                            break;
                                        case 102:
                                            c761602yE.highlight_discount_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 103:
                                            c761602yE.user_group_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 104:
                                            c761602yE.product_id_list.add(ProtoAdapter.STRING.decode(protoReader));
                                            break;
                                        case 105:
                                            c761602yE.bottom_bar_image = C02U1.ADAPTER.decode(protoReader);
                                            break;
                                        case 106:
                                            c761602yE.bottom_bar_dark_image = C02U1.ADAPTER.decode(protoReader);
                                            break;
                                        case 107:
                                            c761602yE.bottom_bar_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 108:
                                            c761602yE.corner_label.add(C763402yW.ADAPTER.decode(protoReader));
                                            break;
                                        case 109:
                                            c761602yE.description_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 110:
                                            c761602yE.cost_type_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 111:
                                            c761602yE.cost_type_raw_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 112:
                                            c761602yE.benefit_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        case 113:
                                            c761602yE.discount_limit_rich_text = ProtoAdapter.STRING.decode(protoReader);
                                            break;
                                        default:
                                            switch (iNextTag) {
                                                case 200:
                                                    c761602yE.da_info = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 201:
                                                    c761602yE.explore_eligible_products = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 202:
                                                    c761602yE.template_key = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 203:
                                                    c761602yE.voucher_count = ProtoAdapter.INT32.decode(protoReader);
                                                    break;
                                                case 204:
                                                    c761602yE.bcm_standard_track = C02RJ.ADAPTER.decode(protoReader);
                                                    break;
                                                case 205:
                                                    c761602yE.benefit_keys.add(ProtoAdapter.STRING.decode(protoReader));
                                                    break;
                                                case 206:
                                                    c761602yE.benefit_ctx = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 207:
                                                    c761602yE.business_tags.add(C762402yM.ADAPTER.decode(protoReader));
                                                    break;
                                                case 208:
                                                    c761602yE.promotion_tags.add(C761802yG.ADAPTER.decode(protoReader));
                                                    break;
                                                case 209:
                                                    c761602yE.bonus_desc = ProtoAdapter.STRING.decode(protoReader);
                                                    break;
                                                case 210:
                                                    c761602yE.disable_live_landing_jump = ProtoAdapter.BOOL.decode(protoReader);
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
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c761602yE;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C761602yE c761602yE) {
            C761602yE c761602yE2 = c761602yE;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c761602yE2.voucher_id) + protoAdapter.encodedSizeWithTag(2, c761602yE2.voucher_type_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c761602yE2.status) + protoAdapter2.encodedSizeWithTag(4, c761602yE2.cost_type) + protoAdapter2.encodedSizeWithTag(5, c761602yE2.cost_role) + protoAdapter2.encodedSizeWithTag(6, c761602yE2.reduction_type) + protoAdapter2.encodedSizeWithTag(7, c761602yE2.claim_user_type) + protoAdapter2.encodedSizeWithTag(8, c761602yE2.use_limit_type) + protoAdapter2.encodedSizeWithTag(9, c761602yE2.discount_level);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(10, c761602yE2.claim_time) + protoAdapter3.encodedSizeWithTag(11, c761602yE2.usable_start_time) + protoAdapter3.encodedSizeWithTag(12, c761602yE2.usable_end_time) + protoAdapter.encodedSizeWithTag(13, c761602yE2.main_order_id) + protoAdapter.encodedSizeWithTag(14, c761602yE2.face_value) + protoAdapter.encodedSizeWithTag(15, c761602yE2.voucher_business_type) + protoAdapter.encodedSizeWithTag(16, c761602yE2.cost_role_id) + protoAdapter2.encodedSizeWithTag(17, c761602yE2.vap_schema_type);
            ProtoAdapter<C02U1> protoAdapter4 = C02U1.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(18, c761602yE2.background) + protoAdapter.encodedSizeWithTag(19, c761602yE2.title) + C2223841C2c.ADAPTER.encodedSizeWithTag(20, c761602yE2.voucher_restriction) + C762102yJ.ADAPTER.asRepeated().encodedSizeWithTag(21, c761602yE2.label_text_list);
            ProtoAdapter<C608102Yt> protoAdapter5 = C608102Yt.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.asRepeated().encodedSizeWithTag(22, c761602yE2.labels) + protoAdapter5.encodedSizeWithTag(23, c761602yE2.vibe_area) + protoAdapter3.encodedSizeWithTag(24, c761602yE2.claimable_start_time) + protoAdapter3.encodedSizeWithTag(25, c761602yE2.claimable_end_time) + protoAdapter2.encodedSizeWithTag(26, c761602yE2.unusable_reason) + C1CGY.ADAPTER.encodedSizeWithTag(27, c761602yE2.threshold_info);
            ProtoAdapter<Boolean> protoAdapter6 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(28, c761602yE2.is_strategy) + C1C28.ADAPTER.encodedSizeWithTag(29, c761602yE2.strategy_info) + protoAdapter6.encodedSizeWithTag(30, c761602yE2.selected) + protoAdapter.encodedSizeWithTag(31, c761602yE2.promotion_id) + protoAdapter6.encodedSizeWithTag(32, c761602yE2.is_best) + protoAdapter6.encodedSizeWithTag(33, c761602yE2.selectable) + protoAdapter6.encodedSizeWithTag(34, c761602yE2.has_multi_count) + protoAdapter2.asRepeated().encodedSizeWithTag(35, c761602yE2.tag_list) + C2251551DAr.ADAPTER.encodedSizeWithTag(36, c761602yE2.interactive_user_task) + this.LIZ.encodedSizeWithTag(37, c761602yE2.voucher_label_map) + protoAdapter2.encodedSizeWithTag(38, c761602yE2.voucher_membership_type) + C2224291C3v.ADAPTER.asRepeated().encodedSizeWithTag(39, c761602yE2.instance_info_list) + protoAdapter.encodedSizeWithTag(50, c761602yE2.status_text) + protoAdapter.encodedSizeWithTag(51, c761602yE2.cost_role_text) + protoAdapter.encodedSizeWithTag(52, c761602yE2.discount_text) + protoAdapter.encodedSizeWithTag(53, c761602yE2.threshold_text) + protoAdapter.encodedSizeWithTag(54, c761602yE2.use_limit_text) + protoAdapter.encodedSizeWithTag(55, c761602yE2.orientation_text) + protoAdapter.encodedSizeWithTag(56, c761602yE2.odp_schema) + protoAdapter.encodedSizeWithTag(57, c761602yE2.scope_text) + protoAdapter.encodedSizeWithTag(58, c761602yE2.exclusions_text) + protoAdapter.encodedSizeWithTag(59, c761602yE2.currency_symbol) + protoAdapter.encodedSizeWithTag(60, c761602yE2.button_text) + protoAdapter.encodedSizeWithTag(61, c761602yE2.valid_time_text) + protoAdapter.encodedSizeWithTag(62, c761602yE2.vap_schema) + protoAdapter2.encodedSizeWithTag(63, c761602yE2.valid_time_text_style) + protoAdapter.encodedSizeWithTag(64, c761602yE2.claim_limit_text) + protoAdapter.encodedSizeWithTag(65, c761602yE2.shop_name_text) + protoAdapter2.encodedSizeWithTag(66, c761602yE2.exists_count) + C659502hl.ADAPTER.asRepeated().encodedSizeWithTag(67, c761602yE2.discount_view) + protoAdapter.encodedSizeWithTag(68, c761602yE2.residual_quantity_text) + protoAdapter2.encodedSizeWithTag(69, c761602yE2.used_count) + protoAdapter2.encodedSizeWithTag(70, c761602yE2.total_count) + protoAdapter2.encodedSizeWithTag(71, c761602yE2.claimed_count) + protoAdapter2.encodedSizeWithTag(72, c761602yE2.residual_quantity_text_style) + protoAdapter.encodedSizeWithTag(73, c761602yE2.full_vap_schema) + protoAdapter.encodedSizeWithTag(74, c761602yE2.unusable_reason_text) + protoAdapter2.encodedSizeWithTag(75, c761602yE2.button_state) + protoAdapter.encodedSizeWithTag(76, c761602yE2.shop_schema) + protoAdapter.encodedSizeWithTag(77, c761602yE2.discount_limit) + protoAdapter.encodedSizeWithTag(78, c761602yE2.discount_limit_text) + C762702yP.ADAPTER.asRepeated().encodedSizeWithTag(79, c761602yE2.ladder_info) + protoAdapter.encodedSizeWithTag(80, c761602yE2.applicable_shipping_text) + protoAdapter.encodedSizeWithTag(81, c761602yE2.usable_reminder_text) + protoAdapter.encodedSizeWithTag(82, c761602yE2.face_value_text) + C699502oD.ADAPTER.encodedSizeWithTag(83, c761602yE2.countdown) + protoAdapter.encodedSizeWithTag(84, c761602yE2.live_pill_text) + C029C.ADAPTER.encodedSizeWithTag(85, c761602yE2.live_pill_icon) + protoAdapter.encodedSizeWithTag(86, c761602yE2.face_value_format_text) + protoAdapter.encodedSizeWithTag(87, c761602yE2.threshold_value_format_text) + protoAdapter.encodedSizeWithTag(88, c761602yE2.discount_value_format_text) + protoAdapter.encodedSizeWithTag(89, c761602yE2.shipping_discount_text) + protoAdapter4.encodedSizeWithTag(90, c761602yE2.shop_photo) + protoAdapter2.encodedSizeWithTag(91, c761602yE2.voucher_display_type) + C764302yf.ADAPTER.encodedSizeWithTag(92, c761602yE2.interactive_info) + protoAdapter.encodedSizeWithTag(93, c761602yE2.code) + C2263531Dih.ADAPTER.asRepeated().encodedSizeWithTag(100, c761602yE2.tc_lines) + C1CGI.ADAPTER.encodedSizeWithTag(101, c761602yE2.terms_apply) + protoAdapter.encodedSizeWithTag(102, c761602yE2.highlight_discount_text) + protoAdapter.encodedSizeWithTag(103, c761602yE2.user_group_text) + protoAdapter.asRepeated().encodedSizeWithTag(104, c761602yE2.product_id_list) + protoAdapter4.encodedSizeWithTag(105, c761602yE2.bottom_bar_image) + protoAdapter4.encodedSizeWithTag(106, c761602yE2.bottom_bar_dark_image) + protoAdapter.encodedSizeWithTag(107, c761602yE2.bottom_bar_text) + C763402yW.ADAPTER.asRepeated().encodedSizeWithTag(108, c761602yE2.corner_label) + protoAdapter.encodedSizeWithTag(109, c761602yE2.description_text) + protoAdapter.encodedSizeWithTag(110, c761602yE2.cost_type_text) + protoAdapter.encodedSizeWithTag(111, c761602yE2.cost_type_raw_text) + protoAdapter.encodedSizeWithTag(112, c761602yE2.benefit_text) + protoAdapter.encodedSizeWithTag(113, c761602yE2.discount_limit_rich_text) + protoAdapter.encodedSizeWithTag(200, c761602yE2.da_info) + protoAdapter.encodedSizeWithTag(201, c761602yE2.explore_eligible_products) + protoAdapter.encodedSizeWithTag(202, c761602yE2.template_key) + protoAdapter2.encodedSizeWithTag(203, c761602yE2.voucher_count) + C02RJ.ADAPTER.encodedSizeWithTag(204, c761602yE2.bcm_standard_track) + protoAdapter.asRepeated().encodedSizeWithTag(205, c761602yE2.benefit_keys) + protoAdapter.encodedSizeWithTag(206, c761602yE2.benefit_ctx) + C762402yM.ADAPTER.asRepeated().encodedSizeWithTag(207, c761602yE2.business_tags) + C761802yG.ADAPTER.asRepeated().encodedSizeWithTag(208, c761602yE2.promotion_tags) + protoAdapter.encodedSizeWithTag(209, c761602yE2.bonus_desc) + protoAdapter6.encodedSizeWithTag(210, c761602yE2.disable_live_landing_jump) + c761602yE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C761602yE c761602yE) {
        }
    };
    public String applicable_shipping_text;
    public C02U1 background;
    public C02RJ bcm_standard_track;
    public String benefit_ctx;
    public List<String> benefit_keys;
    public String benefit_text;
    public String bonus_desc;
    public C02U1 bottom_bar_dark_image;
    public C02U1 bottom_bar_image;
    public String bottom_bar_text;
    public List<C762402yM> business_tags;
    public Integer button_state;
    public String button_text;
    public String claim_limit_text;
    public Long claim_time;
    public Integer claim_user_type;
    public Long claimable_end_time;
    public Long claimable_start_time;
    public Integer claimed_count;
    public String code;
    public List<C763402yW> corner_label;
    public Integer cost_role;
    public String cost_role_id;
    public String cost_role_text;
    public Integer cost_type;
    public String cost_type_raw_text;
    public String cost_type_text;
    public C699502oD countdown;
    public String currency_symbol;
    public String da_info;
    public String description_text;
    public Boolean disable_live_landing_jump;
    public Integer discount_level;
    public String discount_limit;
    public String discount_limit_rich_text;
    public String discount_limit_text;
    public String discount_text;
    public String discount_value_format_text;
    public List<C659502hl> discount_view;
    public String exclusions_text;
    public Integer exists_count;
    public String explore_eligible_products;
    public String face_value;
    public String face_value_format_text;
    public String face_value_text;
    public String full_vap_schema;
    public Boolean has_multi_count;
    public String highlight_discount_text;
    public List<C2224291C3v> instance_info_list;
    public C764302yf interactive_info;
    public C2251551DAr interactive_user_task;
    public Boolean is_best;
    public Boolean is_strategy;
    public List<C762102yJ> label_text_list;
    public List<C608102Yt> labels;
    public List<C762702yP> ladder_info;
    public C029C live_pill_icon;
    public String live_pill_text;
    public String main_order_id;
    public String odp_schema;
    public String orientation_text;
    public List<String> product_id_list;
    public String promotion_id;
    public List<C761802yG> promotion_tags;
    public Integer reduction_type;
    public String residual_quantity_text;
    public Integer residual_quantity_text_style;
    public String scope_text;
    public Boolean selectable;
    public Boolean selected;
    public String shipping_discount_text;
    public String shop_name_text;
    public C02U1 shop_photo;
    public String shop_schema;
    public Integer status;
    public String status_text;
    public C1C28 strategy_info;
    public List<Integer> tag_list;
    public List<C2263531Dih> tc_lines;
    public String template_key;
    public C1CGI terms_apply;
    public C1CGY threshold_info;
    public String threshold_text;
    public String threshold_value_format_text;
    public String title;
    public Integer total_count;
    public Integer unusable_reason;
    public String unusable_reason_text;
    public Long usable_end_time;
    public String usable_reminder_text;
    public Long usable_start_time;
    public String use_limit_text;
    public Integer use_limit_type;
    public Integer used_count;
    public String user_group_text;
    public String valid_time_text;
    public Integer valid_time_text_style;
    public String vap_schema;
    public Integer vap_schema_type;
    public C608102Yt vibe_area;
    public String voucher_business_type;
    public Integer voucher_count;
    public Integer voucher_display_type;
    public String voucher_id;
    public Map<Integer, C608402Yw> voucher_label_map;
    public Integer voucher_membership_type;
    public C2223841C2c voucher_restriction;
    public String voucher_type_id;

    @Override // com.squareup.wire.Message
    public C723702s7 newBuilder() {
        return null;
    }

    public C761602yE() {
        super(ADAPTER, ByteString.EMPTY);
        this.label_text_list = C1516540pZE.LJIIIIZZ();
        this.labels = C1516540pZE.LJIIIIZZ();
        this.tag_list = C1516540pZE.LJIIIIZZ();
        this.voucher_label_map = new LinkedHashMap();
        this.instance_info_list = C1516540pZE.LJIIIIZZ();
        this.discount_view = C1516540pZE.LJIIIIZZ();
        this.ladder_info = C1516540pZE.LJIIIIZZ();
        this.tc_lines = C1516540pZE.LJIIIIZZ();
        this.product_id_list = C1516540pZE.LJIIIIZZ();
        this.corner_label = C1516540pZE.LJIIIIZZ();
        this.benefit_keys = C1516540pZE.LJIIIIZZ();
        this.business_tags = C1516540pZE.LJIIIIZZ();
        this.promotion_tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
