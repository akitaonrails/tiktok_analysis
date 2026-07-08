package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550902Ct extends Message<C550902Ct, C02MG> {
    public static final ProtoAdapter<C550902Ct> ADAPTER = new ProtoAdapter<C550902Ct>() { // from class: X.025W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550902Ct decode(ProtoReader protoReader) {
            C550902Ct c550902Ct = new C550902Ct();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550902Ct.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c550902Ct.start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c550902Ct.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c550902Ct.resource_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c550902Ct.author_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c550902Ct.effect_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550902Ct;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550902Ct c550902Ct) {
            C550902Ct c550902Ct2 = c550902Ct;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c550902Ct2.type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c550902Ct2.start_time) + protoAdapter.encodedSizeWithTag(3, c550902Ct2.end_time);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c550902Ct2.resource_id) + protoAdapter2.encodedSizeWithTag(5, c550902Ct2.author_name) + protoAdapter2.encodedSizeWithTag(6, c550902Ct2.effect_id) + c550902Ct2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550902Ct c550902Ct) {
            C550902Ct c550902Ct2 = c550902Ct;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c550902Ct2.type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c550902Ct2.start_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c550902Ct2.end_time);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c550902Ct2.resource_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, c550902Ct2.author_name);
            protoAdapter2.encodeWithTag(protoWriter, 6, c550902Ct2.effect_id);
            protoWriter.writeBytes(c550902Ct2.unknownFields());
        }
    };
    public String author_name;
    public String effect_id;
    public Long end_time;
    public String resource_id;
    public Long start_time;
    public Integer type;

    public C550902Ct() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
