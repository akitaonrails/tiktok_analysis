package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224591C4z extends Message<C2224591C4z, C1C50> {
    public static final ProtoAdapter<C2224591C4z> ADAPTER = new ProtoAdapter<C2224591C4z>() { // from class: X.1C4y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224591C4z decode(ProtoReader protoReader) {
            C1C50 c1c50 = new C1C50();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1c50.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c50.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224591C4z c2224591C4z) {
            return c2224591C4z.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224591C4z c2224591C4z) {
            protoWriter.writeBytes(c2224591C4z.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224591C4z() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C50 newBuilder() {
        C1C50 c1c50 = new C1C50();
        c1c50.addUnknownFields(unknownFields());
        return c1c50;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "GetConversationsCheckInfoRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224591C4z(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
