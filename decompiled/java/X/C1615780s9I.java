package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0s9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615780s9I extends Message<C1615780s9I, C1615790s9J> {
    public static final ProtoAdapter<C1615780s9I> ADAPTER = new ProtoAdapter<C1615780s9I>() { // from class: X.0s9H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1615780s9I decode(ProtoReader protoReader) {
            C1615780s9I c1615780s9I = new C1615780s9I();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1615780s9I.price_in_usd = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1615780s9I.android_iap_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1615780s9I.ios_iap_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1615780s9I.iap_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1615780s9I.diamond_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1615780s9I.local_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1615780s9I.local_price_currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1615780s9I.local_price_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1615780s9I.local_currency_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1615780s9I;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1615780s9I c1615780s9I) {
            C1615780s9I c1615780s9I2 = c1615780s9I;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1615780s9I2.price_in_usd) + protoAdapter.encodedSizeWithTag(2, c1615780s9I2.android_iap_id) + protoAdapter.encodedSizeWithTag(3, c1615780s9I2.ios_iap_id) + protoAdapter.encodedSizeWithTag(4, c1615780s9I2.iap_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, c1615780s9I2.diamond_id) + protoAdapter.encodedSizeWithTag(6, c1615780s9I2.local_price) + protoAdapter.encodedSizeWithTag(7, c1615780s9I2.local_price_currency) + protoAdapter.encodedSizeWithTag(8, c1615780s9I2.local_price_amount) + protoAdapter.encodedSizeWithTag(9, c1615780s9I2.local_currency_code) + c1615780s9I2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1615780s9I c1615780s9I) {
            C1615780s9I c1615780s9I2 = c1615780s9I;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1615780s9I2.price_in_usd);
            protoAdapter.encodeWithTag(protoWriter, 2, c1615780s9I2.android_iap_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c1615780s9I2.ios_iap_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c1615780s9I2.iap_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c1615780s9I2.diamond_id);
            protoAdapter.encodeWithTag(protoWriter, 6, c1615780s9I2.local_price);
            protoAdapter.encodeWithTag(protoWriter, 7, c1615780s9I2.local_price_currency);
            protoAdapter.encodeWithTag(protoWriter, 8, c1615780s9I2.local_price_amount);
            protoAdapter.encodeWithTag(protoWriter, 9, c1615780s9I2.local_currency_code);
            protoWriter.writeBytes(c1615780s9I2.unknownFields());
        }
    };
    public String android_iap_id;
    public Long diamond_id;
    public String iap_id;
    public String ios_iap_id;
    public String local_currency_code;
    public String local_price;
    public String local_price_amount;
    public String local_price_currency;
    public String price_in_usd;

    public C1615780s9I() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1615790s9J newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
