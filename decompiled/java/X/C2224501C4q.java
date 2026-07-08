package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224501C4q extends Message<C2224501C4q, C2224511C4r> {
    public static final ProtoAdapter<C2224501C4q> ADAPTER = new ProtoAdapter<C2224501C4q>() { // from class: X.1C4p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224501C4q decode(ProtoReader protoReader) {
            C2224511C4r c2224511C4r = new C2224511C4r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224511C4r.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224511C4r.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224501C4q c2224501C4q) {
            return c2224501C4q.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224501C4q c2224501C4q) {
            protoWriter.writeBytes(c2224501C4q.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224501C4q() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224511C4r newBuilder() {
        C2224511C4r c2224511C4r = new C2224511C4r();
        c2224511C4r.addUnknownFields(unknownFields());
        return c2224511C4r;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "DeleteStrangerConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224501C4q(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
