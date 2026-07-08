package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224441C4k extends Message<C2224441C4k, C2224451C4l> {
    public static final ProtoAdapter<C2224441C4k> ADAPTER = new ProtoAdapter<C2224441C4k>() { // from class: X.1C4j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224441C4k decode(ProtoReader protoReader) {
            C2224451C4l c2224451C4l = new C2224451C4l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224451C4l.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224451C4l.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224441C4k c2224441C4k) {
            return c2224441C4k.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224441C4k c2224441C4k) {
            protoWriter.writeBytes(c2224441C4k.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224441C4k() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224451C4l newBuilder() {
        C2224451C4l c2224451C4l = new C2224451C4l();
        c2224451C4l.addUnknownFields(unknownFields());
        return c2224451C4l;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "DeleteStrangerAllConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224441C4k(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
