package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C58, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C58 extends Message<C1C58, C1C59> {
    public static final ProtoAdapter<C1C58> ADAPTER = new ProtoAdapter<C1C58>() { // from class: X.1C57
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C58 decode(ProtoReader protoReader) {
            C1C59 c1c59 = new C1C59();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1c59.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c59.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C58 c1c58) {
            return c1c58.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C58 c1c58) {
            protoWriter.writeBytes(c1c58.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C1C58() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C59 newBuilder() {
        C1C59 c1c59 = new C1C59();
        c1c59.addUnknownFields(unknownFields());
        return c1c59;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "SendUserActionResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C1C58(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
