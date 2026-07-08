package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224471C4n extends Message<C2224471C4n, C2224481C4o> {
    public static final ProtoAdapter<C2224471C4n> ADAPTER = new ProtoAdapter<C2224471C4n>() { // from class: X.1C4m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224471C4n decode(ProtoReader protoReader) {
            C2224481C4o c2224481C4o = new C2224481C4o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224481C4o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224481C4o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224471C4n c2224471C4n) {
            return c2224471C4n.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224471C4n c2224471C4n) {
            protoWriter.writeBytes(c2224471C4n.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224471C4n() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224481C4o newBuilder() {
        C2224481C4o c2224481C4o = new C2224481C4o();
        c2224481C4o.addUnknownFields(unknownFields());
        return c2224481C4o;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "DeleteStrangerAllConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224471C4n(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
