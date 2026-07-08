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

/* JADX INFO: renamed from: X.0215, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0215 extends Message<AnonymousClass0215, C581802Oq> {
    public static final ProtoAdapter<AnonymousClass0215> ADAPTER = new ProtoAdapter<AnonymousClass0215>() { // from class: X.020y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0215 decode(ProtoReader protoReader) {
            AnonymousClass0215 anonymousClass0215 = new AnonymousClass0215();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0215.tenure = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0215.total_fee = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0215.monthly_repayment = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0215.plan_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0215.extra_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0215.total_fee_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0215.promo_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0215.installment_plan_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0215.total_repayment = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0215.monthly_fee = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0215.monthly_fee_rate = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0215.ecrich_installment_desc = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0215.total_discount_info = C02G7.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0215.installment_breakdown = C02B2.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0215.marketing_tool = C02BN.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            anonymousClass0215.hybrid_payment_info = C660102hr.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            anonymousClass0215.interest_fee_promotion = C547702Bn.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            anonymousClass0215.promotion_info = AnonymousClass0220.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            anonymousClass0215.display_installment_plan = AnonymousClass0215.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            anonymousClass0215.cci_no_promo_installment_plan = AnonymousClass0215.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            anonymousClass0215.tenure_cycle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            anonymousClass0215.display_statement = C715402qm.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            anonymousClass0215.sign_agreement_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            anonymousClass0215.payment_service_fee_info = C548002Bq.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            anonymousClass0215.payment_price_version_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            anonymousClass0215.payment_unit_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            anonymousClass0215.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 28:
                            anonymousClass0215.payment_service_extra_info = C632102dL.ADAPTER.decode(protoReader);
                            break;
                        case 29:
                            anonymousClass0215.downpayment = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 30:
                            anonymousClass0215.apr_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            anonymousClass0215.installment_option_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 32:
                            anonymousClass0215.availability = C554402Ec.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            anonymousClass0215.tips = C02B0.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            anonymousClass0215.is_default = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 35:
                            anonymousClass0215.is_recommended = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                            anonymousClass0215.payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            break;
                        case 37:
                            anonymousClass0215.remained_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 38:
                            anonymousClass0215.remain_amount_tips = C02B0.ADAPTER.decode(protoReader);
                            break;
                        case 39:
                            anonymousClass0215.no_preselect_tenure = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 40:
                            anonymousClass0215.additional_clarification = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0215;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0215 anonymousClass0215) {
            AnonymousClass0215 anonymousClass02152 = anonymousClass0215;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02152.tenure);
            ProtoAdapter<C614702aX> protoAdapter2 = C614702aX.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, anonymousClass02152.total_fee) + protoAdapter2.encodedSizeWithTag(3, anonymousClass02152.monthly_repayment) + protoAdapter.encodedSizeWithTag(4, anonymousClass02152.plan_description) + protoAdapter.encodedSizeWithTag(5, anonymousClass02152.extra_description) + protoAdapter.encodedSizeWithTag(6, anonymousClass02152.total_fee_text) + protoAdapter.encodedSizeWithTag(7, anonymousClass02152.promo_text) + protoAdapter.encodedSizeWithTag(8, anonymousClass02152.installment_plan_id) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02152.total_repayment) + protoAdapter2.encodedSizeWithTag(10, anonymousClass02152.monthly_fee) + ProtoAdapter.DOUBLE.encodedSizeWithTag(11, anonymousClass02152.monthly_fee_rate) + C5431029t.ADAPTER.encodedSizeWithTag(12, anonymousClass02152.ecrich_installment_desc) + C02G7.ADAPTER.encodedSizeWithTag(13, anonymousClass02152.total_discount_info) + C02B2.ADAPTER.encodedSizeWithTag(14, anonymousClass02152.installment_breakdown) + C02BN.ADAPTER.encodedSizeWithTag(15, anonymousClass02152.marketing_tool) + C660102hr.ADAPTER.encodedSizeWithTag(16, anonymousClass02152.hybrid_payment_info) + C547702Bn.ADAPTER.encodedSizeWithTag(17, anonymousClass02152.interest_fee_promotion) + AnonymousClass0220.ADAPTER.encodedSizeWithTag(18, anonymousClass02152.promotion_info);
            ProtoAdapter<AnonymousClass0215> protoAdapter3 = AnonymousClass0215.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(19, anonymousClass02152.display_installment_plan) + protoAdapter3.encodedSizeWithTag(20, anonymousClass02152.cci_no_promo_installment_plan) + protoAdapter.encodedSizeWithTag(21, anonymousClass02152.tenure_cycle) + C715402qm.ADAPTER.encodedSizeWithTag(22, anonymousClass02152.display_statement) + protoAdapter.encodedSizeWithTag(23, anonymousClass02152.sign_agreement_link) + C548002Bq.ADAPTER.encodedSizeWithTag(24, anonymousClass02152.payment_service_fee_info) + protoAdapter.encodedSizeWithTag(25, anonymousClass02152.payment_price_version_id) + protoAdapter.encodedSizeWithTag(26, anonymousClass02152.payment_unit_id) + protoAdapter.encodedSizeWithTag(27, anonymousClass02152.da_info) + C632102dL.ADAPTER.encodedSizeWithTag(28, anonymousClass02152.payment_service_extra_info) + protoAdapter2.encodedSizeWithTag(29, anonymousClass02152.downpayment) + protoAdapter.encodedSizeWithTag(30, anonymousClass02152.apr_description) + protoAdapter.encodedSizeWithTag(31, anonymousClass02152.installment_option_id) + C554402Ec.ADAPTER.encodedSizeWithTag(32, anonymousClass02152.availability);
            ProtoAdapter<C02B0> protoAdapter4 = C02B0.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(33, anonymousClass02152.tips);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(34, anonymousClass02152.is_default) + protoAdapter5.encodedSizeWithTag(35, anonymousClass02152.is_recommended) + C5193020p.ADAPTER.asRepeated().encodedSizeWithTag(36, anonymousClass02152.payment_methods) + protoAdapter2.encodedSizeWithTag(37, anonymousClass02152.remained_amount) + protoAdapter4.encodedSizeWithTag(38, anonymousClass02152.remain_amount_tips) + protoAdapter5.encodedSizeWithTag(39, anonymousClass02152.no_preselect_tenure) + protoAdapter.encodedSizeWithTag(40, anonymousClass02152.additional_clarification) + anonymousClass02152.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0215 anonymousClass0215) {
        }
    };
    public String additional_clarification;
    public String apr_description;
    public C554402Ec availability;
    public AnonymousClass0215 cci_no_promo_installment_plan;
    public String da_info;
    public AnonymousClass0215 display_installment_plan;
    public C715402qm display_statement;
    public C614702aX downpayment;
    public C5431029t ecrich_installment_desc;
    public String extra_description;
    public C660102hr hybrid_payment_info;
    public C02B2 installment_breakdown;
    public String installment_option_id;
    public String installment_plan_id;
    public C547702Bn interest_fee_promotion;
    public Boolean is_default;
    public Boolean is_recommended;
    public C02BN marketing_tool;
    public C614702aX monthly_fee;
    public Double monthly_fee_rate;
    public C614702aX monthly_repayment;
    public Boolean no_preselect_tenure;
    public List<C5193020p> payment_methods;
    public String payment_price_version_id;
    public C632102dL payment_service_extra_info;
    public C548002Bq payment_service_fee_info;
    public String payment_unit_id;
    public String plan_description;
    public String promo_text;
    public AnonymousClass0220 promotion_info;
    public C02B0 remain_amount_tips;
    public C614702aX remained_amount;
    public String sign_agreement_link;
    public String tenure;
    public String tenure_cycle;
    public C02B0 tips;
    public C02G7 total_discount_info;
    public C614702aX total_fee;
    public String total_fee_text;
    public C614702aX total_repayment;

    public AnonymousClass0215() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_methods = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C581802Oq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
