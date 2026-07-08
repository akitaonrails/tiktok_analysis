package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FG extends Message<C02FG, C02OA> {
    public static final ProtoAdapter<C02FG> ADAPTER = new ProtoAdapter<C02FG>() { // from class: X.02FF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FG decode(ProtoReader protoReader) {
            C02FG c02fg = new C02FG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02fg.price_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02fg.price_val = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02fg.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02fg.promotions.add(C604602Xk.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c02fg.price_text_color = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02fg.decimal_places = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02fg.fee_tags.add(C604902Xn.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c02fg.symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02fg.price_str_no_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02fg.payment_methods_promotions.add(C02FE.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02fg.price_text_font = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c02fg.original_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c02fg.price_integer_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c02fg.price_decimal_part_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c02fg.decimal_point_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c02fg.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c02fg.discount_percentage = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c02fg.show_currency_space = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 19:
                            c02fg.real_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FG c02fg) {
            C02FG c02fg2 = c02fg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02fg2.price_str) + protoAdapter.encodedSizeWithTag(2, c02fg2.price_val) + protoAdapter.encodedSizeWithTag(3, c02fg2.currency) + C604602Xk.ADAPTER.asRepeated().encodedSizeWithTag(4, c02fg2.promotions);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c02fg2.price_text_color) + protoAdapter2.encodedSizeWithTag(6, c02fg2.decimal_places) + C604902Xn.ADAPTER.asRepeated().encodedSizeWithTag(7, c02fg2.fee_tags) + protoAdapter.encodedSizeWithTag(8, c02fg2.symbol) + protoAdapter.encodedSizeWithTag(9, c02fg2.price_str_no_symbol) + C02FE.ADAPTER.asRepeated().encodedSizeWithTag(10, c02fg2.payment_methods_promotions) + protoAdapter2.encodedSizeWithTag(11, c02fg2.price_text_font) + protoAdapter.encodedSizeWithTag(12, c02fg2.original_price) + protoAdapter.encodedSizeWithTag(13, c02fg2.price_integer_part_format) + protoAdapter.encodedSizeWithTag(14, c02fg2.price_decimal_part_format) + protoAdapter.encodedSizeWithTag(15, c02fg2.decimal_point_symbol) + protoAdapter2.encodedSizeWithTag(16, c02fg2.symbol_position) + protoAdapter.encodedSizeWithTag(17, c02fg2.discount_percentage) + ProtoAdapter.BOOL.encodedSizeWithTag(18, c02fg2.show_currency_space) + protoAdapter.encodedSizeWithTag(19, c02fg2.real_price_decimal) + c02fg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FG c02fg) {
        }
    };
    public String currency;
    public Integer decimal_places;
    public String decimal_point_symbol;
    public String discount_percentage;
    public List<C604902Xn> fee_tags;
    public String original_price;
    public List<C02FE> payment_methods_promotions;
    public String price_decimal_part_format;
    public String price_integer_part_format;
    public String price_str;
    public String price_str_no_symbol;
    public Integer price_text_color;
    public Integer price_text_font;
    public String price_val;
    public List<C604602Xk> promotions;
    public String real_price_decimal;
    public Boolean show_currency_space;
    public String symbol;
    public Integer symbol_position;

    public C02FG() {
        super(ADAPTER, ByteString.EMPTY);
        this.promotions = C1516540pZE.LJIIIIZZ();
        this.fee_tags = C1516540pZE.LJIIIIZZ();
        this.payment_methods_promotions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02OA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
