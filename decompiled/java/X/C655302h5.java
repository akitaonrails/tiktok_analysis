package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02h5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C655302h5 extends Message<C655302h5, C655402h6> {
    public static final ProtoAdapter<C655302h5> ADAPTER = new ProtoAdapter<C655302h5>() { // from class: X.02h4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C655302h5 decode(ProtoReader protoReader) {
            C655302h5 c655302h5 = new C655302h5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c655302h5.raw_data = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c655302h5.schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c655302h5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C655302h5 c655302h5) {
            C655302h5 c655302h52 = c655302h5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c655302h52.schema) + protoAdapter.encodedSizeWithTag(2, c655302h52.raw_data) + c655302h52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C655302h5 c655302h5) {
            C655302h5 c655302h52 = c655302h5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c655302h52.schema);
            protoAdapter.encodeWithTag(protoWriter, 2, c655302h52.raw_data);
            protoWriter.writeBytes(c655302h52.unknownFields());
        }
    };
    public String raw_data;
    public String schema;

    public C655302h5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C655402h6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
