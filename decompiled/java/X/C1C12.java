package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C12, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C12 extends Message<C1C12, C1C13> {
    public static final ProtoAdapter<C1C12> ADAPTER = new ProtoAdapter<C1C12>() { // from class: X.1C11
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C12 decode(ProtoReader protoReader) {
            C1C12 c1c12 = new C1C12();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c12.param_value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c12.param_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c12;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C12 c1c12) {
            C1C12 c1c122 = c1c12;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c122.param_key) + protoAdapter.encodedSizeWithTag(2, c1c122.param_value) + c1c122.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C12 c1c12) {
            C1C12 c1c122 = c1c12;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c122.param_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c122.param_value);
            protoWriter.writeBytes(c1c122.unknownFields());
        }
    };
    public String param_key;
    public String param_value;

    public C1C12() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C13 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
