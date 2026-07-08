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
import okio.ByteString;

/* JADX INFO: renamed from: X.022O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022O extends Message<C022O, C587002Qq> {
    public static final ProtoAdapter<C022O> ADAPTER = new ProtoAdapter<C022O>() { // from class: X.021m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022O decode(ProtoReader protoReader) {
            C022O c022o = new C022O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c022o.sku_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c022o.currency_name = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c022o.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c022o.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                c022o.sale_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c022o.origin_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c022o.sale_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c022o.origin_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c022o.discount_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c022o.discount_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c022o.price_prefix = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c022o.reduce_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c022o.single_product_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                c022o.show_currency_space = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 15:
                                c022o.currency_show_mode = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 16:
                                c022o.unit_price_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c022o.single_product_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c022o.post_seller_pre_platform_coupon_price = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                c022o.price_display_mode = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c022o.price_hide_info = C686702m9.ADAPTER.decode(protoReader);
                                break;
                            case 21:
                                c022o.sale_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 22:
                                c022o.sale_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 23:
                                c022o.decimal_point_symbol = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                c022o.deposit_price_amount = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 25:
                                c022o.after_coupon_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 26:
                                c022o.after_coupon_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 27:
                                c022o.after_coupon_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 28:
                                c022o.after_coupon_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c022o.price_serialized_extra = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022O c022o) {
            C022O c022o2 = c022o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022o2.sku_id) + protoAdapter.encodedSizeWithTag(2, c022o2.currency_name) + protoAdapter.encodedSizeWithTag(3, c022o2.currency_symbol);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c022o2.symbol_position) + protoAdapter.encodedSizeWithTag(5, c022o2.sale_price_decimal) + protoAdapter.encodedSizeWithTag(6, c022o2.origin_price_decimal) + protoAdapter.encodedSizeWithTag(7, c022o2.sale_price_format) + protoAdapter.encodedSizeWithTag(8, c022o2.origin_price_format) + protoAdapter.encodedSizeWithTag(9, c022o2.discount_format) + protoAdapter.encodedSizeWithTag(10, c022o2.discount_decimal) + protoAdapter.encodedSizeWithTag(11, c022o2.price_prefix) + protoAdapter.encodedSizeWithTag(12, c022o2.reduce_price_format) + protoAdapter.encodedSizeWithTag(13, c022o2.single_product_price_format) + protoAdapter.encodedSizeWithTag(17, c022o2.single_product_price_decimal) + ProtoAdapter.BOOL.encodedSizeWithTag(14, c022o2.show_currency_space) + protoAdapter2.encodedSizeWithTag(15, c022o2.currency_show_mode) + protoAdapter.encodedSizeWithTag(16, c022o2.unit_price_desc) + protoAdapter.encodedSizeWithTag(18, c022o2.post_seller_pre_platform_coupon_price) + protoAdapter2.encodedSizeWithTag(19, c022o2.price_display_mode) + C686702m9.ADAPTER.encodedSizeWithTag(20, c022o2.price_hide_info) + protoAdapter.encodedSizeWithTag(21, c022o2.sale_price_integer_part_format) + protoAdapter.encodedSizeWithTag(22, c022o2.sale_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(23, c022o2.decimal_point_symbol) + protoAdapter.encodedSizeWithTag(24, c022o2.deposit_price_amount) + protoAdapter.encodedSizeWithTag(25, c022o2.after_coupon_price_format) + protoAdapter.encodedSizeWithTag(26, c022o2.after_coupon_price_decimal) + protoAdapter.encodedSizeWithTag(27, c022o2.after_coupon_price_integer_part_format) + protoAdapter.encodedSizeWithTag(28, c022o2.after_coupon_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(200, c022o2.price_serialized_extra) + c022o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C022O c022o) {
        }
    };
    public String after_coupon_price_decimal;
    public String after_coupon_price_decimal_part_format;
    public String after_coupon_price_format;
    public String after_coupon_price_integer_part_format;
    public String currency_name;
    public Integer currency_show_mode;
    public String currency_symbol;
    public String decimal_point_symbol;
    public String deposit_price_amount;
    public String discount_decimal;
    public String discount_format;
    public String origin_price_decimal;
    public String origin_price_format;
    public String post_seller_pre_platform_coupon_price;
    public Integer price_display_mode;
    public C686702m9 price_hide_info;
    public String price_prefix;
    public String price_serialized_extra;
    public String reduce_price_format;
    public String sale_price_decimal;
    public String sale_price_decimal_part_format;
    public String sale_price_format;
    public String sale_price_integer_part_format;
    public Boolean show_currency_space;
    public String single_product_price_decimal;
    public String single_product_price_format;
    public String sku_id;
    public Integer symbol_position;
    public String unit_price_desc;

    public C022O() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C587002Qq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
