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

/* JADX INFO: renamed from: X.1DrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268901DrM extends Message<C2268901DrM, C2268911DrN> {
    public static final ProtoAdapter<C2268901DrM> ADAPTER = new ProtoAdapter<C2268901DrM>() { // from class: X.1DrL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2268901DrM decode(ProtoReader protoReader) {
            C2268901DrM c2268901DrM = new C2268901DrM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2268901DrM.ships_out_days = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c2268901DrM.shipping_subsidy_rate = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2268901DrM.shipping_subsidy_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2268901DrM.shipping_price_val = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2268901DrM.shipping_currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2268901DrM.edt_date = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2268901DrM.edt_business_days = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2268901DrM.ignore_threshold_shipping_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2268901DrM.shipping_price_discounted = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2268901DrM.discount_threshold = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2268901DrM.edt_min_date = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2268901DrM.edt_max_date = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2268901DrM.edt_range_date = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c2268901DrM.edt_range_days = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c2268901DrM.edt_expected_date = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c2268901DrM.shipping_region_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2268901DrM.shipping_from_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2268901DrM.pdp_selling_points_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c2268901DrM.arrival_before_holiday = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2268901DrM;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2268901DrM c2268901DrM) {
            C2268901DrM c2268901DrM2 = c2268901DrM;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c2268901DrM2.ships_out_days);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2268901DrM2.shipping_subsidy_rate) + protoAdapter.encodedSizeWithTag(3, c2268901DrM2.shipping_subsidy_amount) + protoAdapter.encodedSizeWithTag(4, c2268901DrM2.shipping_price_val) + protoAdapter.encodedSizeWithTag(5, c2268901DrM2.shipping_currency) + protoAdapter.encodedSizeWithTag(6, c2268901DrM2.edt_date) + protoAdapter.encodedSizeWithTag(7, c2268901DrM2.edt_business_days) + protoAdapter.encodedSizeWithTag(8, c2268901DrM2.ignore_threshold_shipping_price) + protoAdapter.encodedSizeWithTag(9, c2268901DrM2.shipping_price_discounted) + protoAdapter.encodedSizeWithTag(10, c2268901DrM2.discount_threshold) + protoAdapter.encodedSizeWithTag(11, c2268901DrM2.edt_min_date) + protoAdapter.encodedSizeWithTag(12, c2268901DrM2.edt_max_date) + protoAdapter.encodedSizeWithTag(13, c2268901DrM2.edt_range_date) + protoAdapter.encodedSizeWithTag(14, c2268901DrM2.edt_range_days) + protoAdapter.encodedSizeWithTag(15, c2268901DrM2.edt_expected_date) + protoAdapter.encodedSizeWithTag(16, c2268901DrM2.shipping_region_code) + protoAdapter.encodedSizeWithTag(17, c2268901DrM2.shipping_from_title) + protoAdapter.encodedSizeWithTag(18, c2268901DrM2.pdp_selling_points_title) + protoAdapter.encodedSizeWithTag(19, c2268901DrM2.arrival_before_holiday) + c2268901DrM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2268901DrM c2268901DrM) {
        }
    };
    public String arrival_before_holiday;
    public String discount_threshold;
    public String edt_business_days;
    public String edt_date;
    public String edt_expected_date;
    public String edt_max_date;
    public String edt_min_date;
    public String edt_range_date;
    public String edt_range_days;
    public String ignore_threshold_shipping_price;
    public String pdp_selling_points_title;
    public String shipping_currency;
    public String shipping_from_title;
    public String shipping_price_discounted;
    public String shipping_price_val;
    public String shipping_region_code;
    public String shipping_subsidy_amount;
    public String shipping_subsidy_rate;
    public Integer ships_out_days;

    public C2268901DrM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2268911DrN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
