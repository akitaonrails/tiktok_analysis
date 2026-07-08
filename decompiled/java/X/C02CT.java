package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CT extends Message<C02CT, C566902Ix> {
    public static final ProtoAdapter<C02CT> ADAPTER = new ProtoAdapter<C02CT>() { // from class: X.026x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CT decode(ProtoReader protoReader) {
            C02CT c02ct = new C02CT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ct.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02ct.image_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02ct.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02ct.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02ct.i18n_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02ct.header = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02ct.footer = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02ct.pattern_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ct;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CT c02ct) {
            C02CT c02ct2 = c02ct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02ct2.title) + protoAdapter.encodedSizeWithTag(2, c02ct2.image_url) + protoAdapter.encodedSizeWithTag(3, c02ct2.schema);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02ct2.type) + protoAdapter.encodedSizeWithTag(5, c02ct2.i18n_title) + protoAdapter.encodedSizeWithTag(6, c02ct2.header) + protoAdapter.encodedSizeWithTag(7, c02ct2.footer) + protoAdapter2.encodedSizeWithTag(8, c02ct2.pattern_type) + c02ct2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CT c02ct) {
            C02CT c02ct2 = c02ct;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ct2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ct2.image_url);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ct2.schema);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02ct2.type);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ct2.i18n_title);
            protoAdapter.encodeWithTag(protoWriter, 6, c02ct2.header);
            protoAdapter.encodeWithTag(protoWriter, 7, c02ct2.footer);
            protoAdapter2.encodeWithTag(protoWriter, 8, c02ct2.pattern_type);
            protoWriter.writeBytes(c02ct2.unknownFields());
        }
    };
    public String footer;
    public String header;
    public String i18n_title;
    public String image_url;
    public Integer pattern_type;
    public String schema;
    public String title;
    public Integer type;

    public C02CT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566902Ix newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
