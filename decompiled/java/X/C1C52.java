package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C52, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C52 extends Message<C1C52, C1C53> {
    public static final ProtoAdapter<C1C52> ADAPTER = new ProtoAdapter<C1C52>() { // from class: X.1C51
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C52 decode(ProtoReader protoReader) {
            C1C53 c1c53 = new C1C53();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1c53.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c53.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C52 c1c52) {
            return c1c52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C52 c1c52) {
            protoWriter.writeBytes(c1c52.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C1C52() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C53 newBuilder() {
        C1C53 c1c53 = new C1C53();
        c1c53.addUnknownFields(unknownFields());
        return c1c53;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "RecallMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C1C52(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
