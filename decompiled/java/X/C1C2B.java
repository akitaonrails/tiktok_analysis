package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2B extends Message<C1C2B, C1C2C> {
    public static final ProtoAdapter<C1C2B> ADAPTER = new ProtoAdapter<C1C2B>() { // from class: X.1C2A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2B decode(ProtoReader protoReader) {
            C1C2B c1c2b = new C1C2B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c2b.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c2b.lynx_data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2B c1c2b) {
            C1C2B c1c2b2 = c1c2b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c2b2.lynx_data) + protoAdapter.encodedSizeWithTag(2, c1c2b2.schema) + c1c2b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C2B c1c2b) {
        }
    };
    public String lynx_data;
    public String schema;

    public C1C2B() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C2C newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
