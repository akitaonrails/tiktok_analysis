package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4Y extends Message<C1C4Y, C1C4Z> {
    public static final ProtoAdapter<C1C4Y> ADAPTER = new ProtoAdapter<C1C4Y>() { // from class: X.1C4X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4Y decode(ProtoReader protoReader) {
            C1C4Z c1c4z = new C1C4Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1c4z.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4z.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C4Y c1c4y) {
            return c1c4y.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C4Y c1c4y) {
            protoWriter.writeBytes(c1c4y.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C1C4Y() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C4Z newBuilder() {
        C1C4Z c1c4z = new C1C4Z();
        c1c4z.addUnknownFields(unknownFields());
        return c1c4z;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "BlockConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C1C4Y(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
