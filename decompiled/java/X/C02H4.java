package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02H4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02H4 extends Message<C02H4, C02QW> {
    public static final ProtoAdapter<C02H4> ADAPTER = new ProtoAdapter<C02H4>() { // from class: X.02BW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02H4 decode(ProtoReader protoReader) {
            C02H4 c02h4 = new C02H4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02h4.collection_point = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02h4.collection_flow = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02h4.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02h4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02H4 c02h4) {
            C02H4 c02h42 = c02h4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02h42.key) + protoAdapter.encodedSizeWithTag(2, c02h42.collection_flow) + protoAdapter.encodedSizeWithTag(3, c02h42.collection_point) + c02h42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02H4 c02h4) {
        }
    };
    public String collection_flow;
    public String collection_point;
    public String key;

    public C02H4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
