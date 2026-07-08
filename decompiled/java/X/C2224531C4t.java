package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224531C4t extends Message<C2224531C4t, C2224541C4u> {
    public static final ProtoAdapter<C2224531C4t> ADAPTER = new ProtoAdapter<C2224531C4t>() { // from class: X.1C4s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224531C4t decode(ProtoReader protoReader) {
            C2224541C4u c2224541C4u = new C2224541C4u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224541C4u.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224541C4u.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224531C4t c2224531C4t) {
            return c2224531C4t.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224531C4t c2224531C4t) {
            protoWriter.writeBytes(c2224531C4t.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224531C4t() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224541C4u newBuilder() {
        C2224541C4u c2224541C4u = new C2224541C4u();
        c2224541C4u.addUnknownFields(unknownFields());
        return c2224541C4u;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "DeleteStrangerMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224531C4t(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
