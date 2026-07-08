package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224381C4e extends Message<C2224381C4e, C2224391C4f> {
    public static final ProtoAdapter<C2224381C4e> ADAPTER = new ProtoAdapter<C2224381C4e>() { // from class: X.1C4d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224381C4e decode(ProtoReader protoReader) {
            C2224391C4f c2224391C4f = new C2224391C4f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224391C4f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224391C4f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224381C4e c2224381C4e) {
            return c2224381C4e.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224381C4e c2224381C4e) {
            protoWriter.writeBytes(c2224381C4e.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224381C4e() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224391C4f newBuilder() {
        C2224391C4f c2224391C4f = new C2224391C4f();
        c2224391C4f.addUnknownFields(unknownFields());
        return c2224391C4f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "MarkStrangerConversationReadResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224381C4e(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
