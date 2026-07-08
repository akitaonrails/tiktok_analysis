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
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0220, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0220 extends Message<AnonymousClass0220, C581302Ol> {
    public static final ProtoAdapter<AnonymousClass0220> ADAPTER = new ProtoAdapter<AnonymousClass0220>() { // from class: X.021h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0220 decode(ProtoReader protoReader) {
            AnonymousClass0220 anonymousClass0220 = new AnonymousClass0220();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0220.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0220.promotion_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0220.edit_card_prom_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0220.card_bin_promotion_info = C02FC.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0220.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0220.promotion_amount_val = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0220.promotion_currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0220.promotion_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0220.is_custom_copywriting = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0220.promotion_desc_header = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0220.is_not_meet_promotion_threshold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0220.promotion_batch_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0220.is_dynamic_tips = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0220.not_deductable_on_marketing_bind_payment_method = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0220.hide_marketing_amount = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            anonymousClass0220.desc_selected = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            anonymousClass0220.coupon_dimensions.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            anonymousClass0220.is_card_bind_promotion = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            anonymousClass0220.card_bind_promotion_popup_info = C02GP.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            anonymousClass0220.cashier_bind_pi_promo_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            anonymousClass0220.cashier_bind_pi_promo_desc_selected = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            anonymousClass0220.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            anonymousClass0220.promotion_format = C02GD.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            anonymousClass0220.is_bonus_type_promotion = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 25:
                            anonymousClass0220.marketing_rights_consultation_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0220;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0220 anonymousClass0220) {
            AnonymousClass0220 anonymousClass02202 = anonymousClass0220;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02202.desc) + protoAdapter.encodedSizeWithTag(2, anonymousClass02202.promotion_amount) + protoAdapter.encodedSizeWithTag(3, anonymousClass02202.edit_card_prom_desc) + C02FC.ADAPTER.encodedSizeWithTag(4, anonymousClass02202.card_bin_promotion_info) + protoAdapter.encodedSizeWithTag(5, anonymousClass02202.promotion_id) + protoAdapter.encodedSizeWithTag(6, anonymousClass02202.promotion_amount_val) + protoAdapter.encodedSizeWithTag(7, anonymousClass02202.promotion_currency) + protoAdapter.encodedSizeWithTag(8, anonymousClass02202.promotion_link);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(9, anonymousClass02202.is_custom_copywriting) + protoAdapter.encodedSizeWithTag(10, anonymousClass02202.promotion_desc_header) + protoAdapter2.encodedSizeWithTag(11, anonymousClass02202.is_not_meet_promotion_threshold) + protoAdapter.encodedSizeWithTag(12, anonymousClass02202.promotion_batch_id) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02202.is_dynamic_tips) + protoAdapter2.encodedSizeWithTag(14, anonymousClass02202.not_deductable_on_marketing_bind_payment_method) + protoAdapter2.encodedSizeWithTag(15, anonymousClass02202.hide_marketing_amount) + protoAdapter.encodedSizeWithTag(16, anonymousClass02202.desc_selected);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(17, anonymousClass02202.coupon_dimensions) + protoAdapter2.encodedSizeWithTag(18, anonymousClass02202.is_card_bind_promotion) + C02GP.ADAPTER.encodedSizeWithTag(19, anonymousClass02202.card_bind_promotion_popup_info) + protoAdapter.encodedSizeWithTag(20, anonymousClass02202.cashier_bind_pi_promo_desc) + protoAdapter.encodedSizeWithTag(21, anonymousClass02202.cashier_bind_pi_promo_desc_selected) + protoAdapter.encodedSizeWithTag(22, anonymousClass02202.da_info) + C02GD.ADAPTER.encodedSizeWithTag(23, anonymousClass02202.promotion_format) + protoAdapter2.encodedSizeWithTag(24, anonymousClass02202.is_bonus_type_promotion) + protoAdapter3.encodedSizeWithTag(25, anonymousClass02202.marketing_rights_consultation_type) + anonymousClass02202.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0220 anonymousClass0220) {
        }
    };
    public C02FC card_bin_promotion_info;
    public C02GP card_bind_promotion_popup_info;
    public String cashier_bind_pi_promo_desc;
    public String cashier_bind_pi_promo_desc_selected;
    public List<Integer> coupon_dimensions;
    public String da_info;
    public String desc;
    public String desc_selected;
    public String edit_card_prom_desc;
    public Boolean hide_marketing_amount;
    public Boolean is_bonus_type_promotion;
    public Boolean is_card_bind_promotion;
    public Boolean is_custom_copywriting;
    public Boolean is_dynamic_tips;
    public Boolean is_not_meet_promotion_threshold;
    public Integer marketing_rights_consultation_type;
    public Boolean not_deductable_on_marketing_bind_payment_method;
    public String promotion_amount;
    public String promotion_amount_val;
    public String promotion_batch_id;
    public String promotion_currency;
    public String promotion_desc_header;
    public C02GD promotion_format;
    public String promotion_id;
    public String promotion_link;

    public AnonymousClass0220() {
        super(ADAPTER, ByteString.EMPTY);
        this.coupon_dimensions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C581302Ol newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
