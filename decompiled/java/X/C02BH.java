package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BH extends Message<C02BH, C02ME> {
    public static final ProtoAdapter<C02BH> ADAPTER = new ProtoAdapter<C02BH>() { // from class: X.024f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BH decode(ProtoReader protoReader) {
            C02BH c02bh = new C02BH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bh.category_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02bh.category_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bh.brand_id = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02bh.brand_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bh.logo_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02bh.heat = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02bh.rank = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02bh.rank_diff = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bh.tag_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BH c02bh) {
            C02BH c02bh2 = c02bh;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02bh2.category_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02bh2.category_name) + protoAdapter.encodedSizeWithTag(3, c02bh2.brand_id) + protoAdapter2.encodedSizeWithTag(4, c02bh2.brand_name) + C673002jw.ADAPTER.encodedSizeWithTag(5, c02bh2.logo_url) + protoAdapter.encodedSizeWithTag(6, c02bh2.heat) + protoAdapter.encodedSizeWithTag(7, c02bh2.rank) + protoAdapter.encodedSizeWithTag(8, c02bh2.rank_diff) + protoAdapter2.encodedSizeWithTag(9, c02bh2.tag_name) + c02bh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BH c02bh) {
            C02BH c02bh2 = c02bh;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02bh2.category_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02bh2.category_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c02bh2.brand_id);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02bh2.brand_name);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c02bh2.logo_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c02bh2.heat);
            protoAdapter.encodeWithTag(protoWriter, 7, c02bh2.rank);
            protoAdapter.encodeWithTag(protoWriter, 8, c02bh2.rank_diff);
            protoAdapter2.encodeWithTag(protoWriter, 9, c02bh2.tag_name);
            protoWriter.writeBytes(c02bh2.unknownFields());
        }
    };
    public Integer brand_id;
    public String brand_name;
    public Integer category_id;
    public String category_name;
    public Integer heat;
    public C673002jw logo_url;
    public Integer rank;
    public Integer rank_diff;
    public String tag_name;

    public C02BH() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02ME newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
