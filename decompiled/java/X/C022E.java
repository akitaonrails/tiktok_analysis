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

/* JADX INFO: renamed from: X.022E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022E extends Message<C022E, C578202Ng> {
    public static final ProtoAdapter<C022E> ADAPTER = new ProtoAdapter<C022E>() { // from class: X.021i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022E decode(ProtoReader protoReader) {
            C022E c022e = new C022E();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c022e.sku_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c022e.currency_name = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c022e.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c022e.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                c022e.sale_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c022e.origin_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c022e.sale_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c022e.origin_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c022e.discount_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c022e.discount_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c022e.price_prefix = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c022e.reduce_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c022e.single_product_price_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                c022e.show_currency_space = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 15:
                                c022e.currency_show_mode = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 16:
                                c022e.unit_price_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c022e.single_product_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c022e.post_seller_pre_platform_coupon_price = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 19:
                                c022e.price_display_mode = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c022e.price_hide_info = C685502lx.ADAPTER.decode(protoReader);
                                break;
                            case 21:
                                c022e.sale_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 22:
                                c022e.sale_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 23:
                                c022e.decimal_point_symbol = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                c022e.pfand_price_desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 25:
                                c022e.need_icon = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 26:
                                c022e.sale_price_full = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 27:
                                c022e.origin_price_full = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 28:
                                c022e.discount_full = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c022e.price_serialized_extra = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022E c022e) {
            C022E c022e2 = c022e;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022e2.sku_id) + protoAdapter.encodedSizeWithTag(2, c022e2.currency_name) + protoAdapter.encodedSizeWithTag(3, c022e2.currency_symbol);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c022e2.symbol_position) + protoAdapter.encodedSizeWithTag(5, c022e2.sale_price_decimal) + protoAdapter.encodedSizeWithTag(6, c022e2.origin_price_decimal) + protoAdapter.encodedSizeWithTag(7, c022e2.sale_price_format) + protoAdapter.encodedSizeWithTag(8, c022e2.origin_price_format) + protoAdapter.encodedSizeWithTag(9, c022e2.discount_format) + protoAdapter.encodedSizeWithTag(10, c022e2.discount_decimal) + protoAdapter.encodedSizeWithTag(11, c022e2.price_prefix) + protoAdapter.encodedSizeWithTag(12, c022e2.reduce_price_format) + protoAdapter.encodedSizeWithTag(13, c022e2.single_product_price_format) + protoAdapter.encodedSizeWithTag(17, c022e2.single_product_price_decimal);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(14, c022e2.show_currency_space) + protoAdapter2.encodedSizeWithTag(15, c022e2.currency_show_mode) + protoAdapter.encodedSizeWithTag(16, c022e2.unit_price_desc) + protoAdapter.encodedSizeWithTag(18, c022e2.post_seller_pre_platform_coupon_price) + protoAdapter2.encodedSizeWithTag(19, c022e2.price_display_mode) + C685502lx.ADAPTER.encodedSizeWithTag(20, c022e2.price_hide_info) + protoAdapter.encodedSizeWithTag(21, c022e2.sale_price_integer_part_format) + protoAdapter.encodedSizeWithTag(22, c022e2.sale_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(23, c022e2.decimal_point_symbol) + protoAdapter.encodedSizeWithTag(24, c022e2.pfand_price_desc) + protoAdapter3.encodedSizeWithTag(25, c022e2.need_icon) + protoAdapter.encodedSizeWithTag(26, c022e2.sale_price_full) + protoAdapter.encodedSizeWithTag(27, c022e2.origin_price_full) + protoAdapter.encodedSizeWithTag(28, c022e2.discount_full) + protoAdapter.encodedSizeWithTag(200, c022e2.price_serialized_extra) + c022e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C022E c022e) {
        }
    };
    public String currency_name;
    public Integer currency_show_mode;
    public String currency_symbol;
    public String decimal_point_symbol;
    public String discount_decimal;
    public String discount_format;
    public String discount_full;
    public Boolean need_icon;
    public String origin_price_decimal;
    public String origin_price_format;
    public String origin_price_full;
    public String pfand_price_desc;
    public String post_seller_pre_platform_coupon_price;
    public Integer price_display_mode;
    public C685502lx price_hide_info;
    public String price_prefix;
    public String price_serialized_extra;
    public String reduce_price_format;
    public String sale_price_decimal;
    public String sale_price_decimal_part_format;
    public String sale_price_format;
    public String sale_price_full;
    public String sale_price_integer_part_format;
    public Boolean show_currency_space;
    public String single_product_price_decimal;
    public String single_product_price_format;
    public String sku_id;
    public Integer symbol_position;
    public String unit_price_desc;

    public C022E() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C578202Ng newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
