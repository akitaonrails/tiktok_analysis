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

/* JADX INFO: renamed from: X.024z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5307024z extends Message<C5307024z, C586902Qp> {
    public static final ProtoAdapter<C5307024z> ADAPTER = new ProtoAdapter<C5307024z>() { // from class: X.022R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5307024z decode(ProtoReader protoReader) {
            C5307024z c5307024z = new C5307024z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5307024z.min_price_sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5307024z.max_price_sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5307024z.currency_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5307024z.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5307024z.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c5307024z.show_currency_space = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c5307024z.currency_show_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5307024z.range_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5307024z.max_discount_decimal = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5307024z.discount_txt = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5307024z.origin_range_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c5307024z.price_display_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c5307024z.price_hide_info = C686702m9.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5307024z.min_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5307024z.min_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c5307024z.max_price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5307024z.max_price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c5307024z.decimal_point_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5307024z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5307024z c5307024z) {
            C5307024z c5307024z2 = c5307024z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5307024z2.min_price_sku_id) + protoAdapter.encodedSizeWithTag(2, c5307024z2.max_price_sku_id) + protoAdapter.encodedSizeWithTag(3, c5307024z2.currency_name) + protoAdapter.encodedSizeWithTag(4, c5307024z2.currency_symbol);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c5307024z2.symbol_position) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c5307024z2.show_currency_space) + protoAdapter2.encodedSizeWithTag(7, c5307024z2.currency_show_mode) + protoAdapter.encodedSizeWithTag(11, c5307024z2.range_price) + protoAdapter.encodedSizeWithTag(12, c5307024z2.max_discount_decimal) + protoAdapter.encodedSizeWithTag(13, c5307024z2.discount_txt) + protoAdapter.encodedSizeWithTag(14, c5307024z2.origin_range_price) + protoAdapter2.encodedSizeWithTag(15, c5307024z2.price_display_mode) + C686702m9.ADAPTER.encodedSizeWithTag(16, c5307024z2.price_hide_info) + protoAdapter.encodedSizeWithTag(17, c5307024z2.min_price_integer_part_format) + protoAdapter.encodedSizeWithTag(18, c5307024z2.min_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(19, c5307024z2.max_price_integer_part_format) + protoAdapter.encodedSizeWithTag(20, c5307024z2.max_price_decimal_part_format) + protoAdapter.encodedSizeWithTag(21, c5307024z2.decimal_point_symbol) + c5307024z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5307024z c5307024z) {
        }
    };
    public String currency_name;
    public Integer currency_show_mode;
    public String currency_symbol;
    public String decimal_point_symbol;
    public String discount_txt;
    public String max_discount_decimal;
    public String max_price_decimal_part_format;
    public String max_price_integer_part_format;
    public String max_price_sku_id;
    public String min_price_decimal_part_format;
    public String min_price_integer_part_format;
    public String min_price_sku_id;
    public String origin_range_price;
    public Integer price_display_mode;
    public C686702m9 price_hide_info;
    public String range_price;
    public Boolean show_currency_space;
    public Integer symbol_position;

    public C5307024z() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586902Qp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
