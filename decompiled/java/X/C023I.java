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

/* JADX INFO: renamed from: X.023I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023I extends Message<C023I, C581502On> {
    public static final ProtoAdapter<C023I> ADAPTER = new ProtoAdapter<C023I>() { // from class: X.021z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023I decode(ProtoReader protoReader) {
            C023I c023i = new C023I();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c023i.min_price_sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c023i.max_price_sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c023i.currency_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c023i.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c023i.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c023i.show_currency_space = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c023i.currency_show_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c023i.range_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c023i.max_discount_decimal = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c023i.discount_txt = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c023i.origin_range_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c023i.price_display_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c023i.price_hide_info = C685502lx.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c023i.min_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c023i.min_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c023i.max_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c023i.max_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c023i.decimal_point_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c023i.need_icon = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            c023i.min_price_full = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c023i.origin_price_full = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 25:
                            c023i.discount_full = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c023i.min_price_prefix = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c023i;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023I c023i) {
            C023I c023i2 = c023i;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c023i2.min_price_sku_id) + protoAdapter.encodedSizeWithTag(2, c023i2.max_price_sku_id) + protoAdapter.encodedSizeWithTag(3, c023i2.currency_name) + protoAdapter.encodedSizeWithTag(4, c023i2.currency_symbol);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c023i2.symbol_position);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c023i2.show_currency_space) + protoAdapter2.encodedSizeWithTag(7, c023i2.currency_show_mode) + protoAdapter.encodedSizeWithTag(11, c023i2.range_price) + protoAdapter.encodedSizeWithTag(12, c023i2.max_discount_decimal) + protoAdapter.encodedSizeWithTag(13, c023i2.discount_txt) + protoAdapter.encodedSizeWithTag(14, c023i2.origin_range_price) + protoAdapter2.encodedSizeWithTag(15, c023i2.price_display_mode) + C685502lx.ADAPTER.encodedSizeWithTag(16, c023i2.price_hide_info) + protoAdapter.encodedSizeWithTag(17, c023i2.min_price_integer_part_format) + protoAdapter.encodedSizeWithTag(18, c023i2.min_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(19, c023i2.max_price_integer_part_format) + protoAdapter.encodedSizeWithTag(20, c023i2.max_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(21, c023i2.decimal_point_symbol) + protoAdapter3.encodedSizeWithTag(22, c023i2.need_icon) + protoAdapter.encodedSizeWithTag(23, c023i2.min_price_full) + protoAdapter.encodedSizeWithTag(24, c023i2.origin_price_full) + protoAdapter.encodedSizeWithTag(25, c023i2.discount_full) + protoAdapter.encodedSizeWithTag(26, c023i2.min_price_prefix) + c023i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023I c023i) {
        }
    };
    public String currency_name;
    public Integer currency_show_mode;
    public String currency_symbol;
    public String decimal_point_symbol;
    public String discount_full;
    public String discount_txt;
    public String max_discount_decimal;
    public String max_price_decimal_part_format;
    public String max_price_integer_part_format;
    public String max_price_sku_id;
    public String min_price_decimal_part_format;
    public String min_price_full;
    public String min_price_integer_part_format;
    public String min_price_prefix;
    public String min_price_sku_id;
    public Boolean need_icon;
    public String origin_price_full;
    public String origin_range_price;
    public Integer price_display_mode;
    public C685502lx price_hide_info;
    public String range_price;
    public Boolean show_currency_space;
    public Integer symbol_position;

    public C023I() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C581502On newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
