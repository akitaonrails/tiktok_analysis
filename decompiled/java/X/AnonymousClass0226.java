package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0226, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0226 extends Message<AnonymousClass0226, C575302Md> {
    public static final ProtoAdapter<AnonymousClass0226> ADAPTER = new ProtoAdapter<AnonymousClass0226>() { // from class: X.021c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0226 decode(ProtoReader protoReader) {
            AnonymousClass0226 anonymousClass0226 = new AnonymousClass0226();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0226.insurance_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0226.insurance_protection_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0226.insurance_protection_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0226.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0226.introduce_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0226.priority = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0226.insurance_product_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0226.insurance_product_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0226.insurance_selected = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0226.insurance_product_name_locale = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0226.insurance_premium_payment = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0226.insurance_premium = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0226.insurance_premium_before_promotion = C02FG.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0226.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0226.insurance_partner_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            anonymousClass0226.insurance_partner_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            anonymousClass0226.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            anonymousClass0226.insurance_pay_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            anonymousClass0226.protection_priority = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            anonymousClass0226.insurance_product_name_en = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            anonymousClass0226.bill_pre_split_sku_sale_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            anonymousClass0226.insurance_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            anonymousClass0226.insurance_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 100:
                                    anonymousClass0226.abnormal_description = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 101:
                                    anonymousClass0226.toast = C02A8.ADAPTER.decode(protoReader);
                                    break;
                                case 102:
                                    anonymousClass0226.mandatory = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 103:
                                    anonymousClass0226.logistics_valuable_flag = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 104:
                                    anonymousClass0226.total_sum_insured = C02FG.ADAPTER.decode(protoReader);
                                    break;
                                case 105:
                                    anonymousClass0226.insurance_meta_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0226;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0226 anonymousClass0226) {
            AnonymousClass0226 anonymousClass02262 = anonymousClass0226;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02262.insurance_type) + protoAdapter.encodedSizeWithTag(2, anonymousClass02262.insurance_protection_code) + protoAdapter.encodedSizeWithTag(3, anonymousClass02262.insurance_protection_type) + protoAdapter.encodedSizeWithTag(4, anonymousClass02262.description) + protoAdapter.encodedSizeWithTag(5, anonymousClass02262.introduce_url);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, anonymousClass02262.priority) + ProtoAdapter.INT64.encodedSizeWithTag(7, anonymousClass02262.insurance_product_id) + protoAdapter.encodedSizeWithTag(8, anonymousClass02262.insurance_product_name) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02262.insurance_selected) + protoAdapter.encodedSizeWithTag(10, anonymousClass02262.insurance_product_name_locale);
            ProtoAdapter<C02FG> protoAdapter3 = C02FG.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(11, anonymousClass02262.insurance_premium_payment) + protoAdapter3.encodedSizeWithTag(12, anonymousClass02262.insurance_premium) + protoAdapter3.encodedSizeWithTag(13, anonymousClass02262.insurance_premium_before_promotion) + protoAdapter.encodedSizeWithTag(14, anonymousClass02262.currency) + protoAdapter.encodedSizeWithTag(15, anonymousClass02262.insurance_partner_id) + protoAdapter.encodedSizeWithTag(16, anonymousClass02262.insurance_partner_name) + protoAdapter.encodedSizeWithTag(17, anonymousClass02262.promotion_id) + protoAdapter.encodedSizeWithTag(18, anonymousClass02262.insurance_pay_type) + protoAdapter2.encodedSizeWithTag(19, anonymousClass02262.protection_priority) + protoAdapter.encodedSizeWithTag(20, anonymousClass02262.insurance_product_name_en) + protoAdapter.encodedSizeWithTag(21, anonymousClass02262.bill_pre_split_sku_sale_price) + protoAdapter2.encodedSizeWithTag(22, anonymousClass02262.insurance_status) + protoAdapter.encodedSizeWithTag(23, anonymousClass02262.insurance_price) + protoAdapter.encodedSizeWithTag(100, anonymousClass02262.abnormal_description) + C02A8.ADAPTER.encodedSizeWithTag(101, anonymousClass02262.toast) + ProtoAdapter.BOOL.encodedSizeWithTag(102, anonymousClass02262.mandatory) + protoAdapter.encodedSizeWithTag(103, anonymousClass02262.logistics_valuable_flag) + protoAdapter3.encodedSizeWithTag(104, anonymousClass02262.total_sum_insured) + protoAdapter.encodedSizeWithTag(105, anonymousClass02262.insurance_meta_info) + anonymousClass02262.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0226 anonymousClass0226) {
        }
    };
    public String abnormal_description;
    public String bill_pre_split_sku_sale_price;
    public String currency;
    public String description;
    public String insurance_meta_info;
    public String insurance_partner_id;
    public String insurance_partner_name;
    public String insurance_pay_type;
    public C02FG insurance_premium;
    public C02FG insurance_premium_before_promotion;
    public C02FG insurance_premium_payment;
    public String insurance_price;
    public Long insurance_product_id;
    public String insurance_product_name;
    public String insurance_product_name_en;
    public String insurance_product_name_locale;
    public String insurance_protection_code;
    public String insurance_protection_type;
    public Integer insurance_selected;
    public Integer insurance_status;
    public String insurance_type;
    public String introduce_url;
    public String logistics_valuable_flag;
    public Boolean mandatory;
    public Integer priority;
    public String promotion_id;
    public Integer protection_priority;
    public C02A8 toast;
    public C02FG total_sum_insured;

    public AnonymousClass0226() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C575302Md newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
