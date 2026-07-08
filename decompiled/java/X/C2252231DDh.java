package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252231DDh extends Message<C2252231DDh, C2252241DDi> {
    public static final ProtoAdapter<C2252231DDh> ADAPTER = new ProtoAdapter<C2252231DDh>() { // from class: X.1DDg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2252231DDh decode(ProtoReader protoReader) {
            C2252231DDh c2252231DDh = new C2252231DDh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2252231DDh.sku_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2252231DDh.currency_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2252231DDh.currency_symbol = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2252231DDh.symbol_position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c2252231DDh.sale_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2252231DDh.origin_price_decimal = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2252231DDh.sale_price_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2252231DDh.origin_price_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2252231DDh.discount_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2252231DDh.discount_decimal = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2252231DDh.price_prefix = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2252231DDh.reduce_price_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2252231DDh.single_product_price_format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c2252231DDh.show_currency_space = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            c2252231DDh.currency_show_mode = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2252231DDh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2252231DDh c2252231DDh) {
            C2252231DDh c2252231DDh2 = c2252231DDh;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2252231DDh2.sku_id) + protoAdapter.encodedSizeWithTag(2, c2252231DDh2.currency_name) + protoAdapter.encodedSizeWithTag(3, c2252231DDh2.currency_symbol);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2252231DDh2.symbol_position) + protoAdapter.encodedSizeWithTag(5, c2252231DDh2.sale_price_decimal) + protoAdapter.encodedSizeWithTag(6, c2252231DDh2.origin_price_decimal) + protoAdapter.encodedSizeWithTag(7, c2252231DDh2.sale_price_format) + protoAdapter.encodedSizeWithTag(8, c2252231DDh2.origin_price_format) + protoAdapter.encodedSizeWithTag(9, c2252231DDh2.discount_format) + protoAdapter.encodedSizeWithTag(10, c2252231DDh2.discount_decimal) + protoAdapter.encodedSizeWithTag(11, c2252231DDh2.price_prefix) + protoAdapter.encodedSizeWithTag(12, c2252231DDh2.reduce_price_format) + protoAdapter.encodedSizeWithTag(13, c2252231DDh2.single_product_price_format) + ProtoAdapter.BOOL.encodedSizeWithTag(14, c2252231DDh2.show_currency_space) + protoAdapter2.encodedSizeWithTag(15, c2252231DDh2.currency_show_mode) + c2252231DDh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2252231DDh c2252231DDh) {
        }
    };
    public String currency_name;
    public Integer currency_show_mode;
    public String currency_symbol;
    public String discount_decimal;
    public String discount_format;
    public String origin_price_decimal;
    public String origin_price_format;
    public String price_prefix;
    public String reduce_price_format;
    public String sale_price_decimal;
    public String sale_price_format;
    public Boolean show_currency_space;
    public String single_product_price_format;
    public String sku_id;
    public Integer symbol_position;

    public C2252231DDh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2252241DDi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
