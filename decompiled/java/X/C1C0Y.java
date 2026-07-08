package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0Y extends Message<C1C0Y, C1C0Z> {
    public static final ProtoAdapter<C1C0Y> ADAPTER = new ProtoAdapter<C1C0Y>() { // from class: X.1C0X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0Y decode(ProtoReader protoReader) {
            C1C0Y c1c0y = new C1C0Y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c0y.schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c0y.raw_data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0y;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0Y c1c0y) {
            C1C0Y c1c0y2 = c1c0y;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c0y2.raw_data) + protoAdapter.encodedSizeWithTag(2, c1c0y2.schema) + c1c0y2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C0Y c1c0y) {
            C1C0Y c1c0y2 = c1c0y;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c0y2.raw_data);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c0y2.schema);
            protoWriter.writeBytes(c1c0y2.unknownFields());
        }
    };
    public String raw_data;
    public String schema;

    public C1C0Y() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C0Z newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
