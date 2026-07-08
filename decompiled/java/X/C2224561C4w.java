package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224561C4w extends Message<C2224561C4w, C2224571C4x> {
    public static final ProtoAdapter<C2224561C4w> ADAPTER = new ProtoAdapter<C2224561C4w>() { // from class: X.1C4v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224561C4w decode(ProtoReader protoReader) {
            C2224571C4x c2224571C4x = new C2224571C4x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224571C4x.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224571C4x.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224561C4w c2224561C4w) {
            return c2224561C4w.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224561C4w c2224561C4w) {
            protoWriter.writeBytes(c2224561C4w.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224561C4w() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224571C4x newBuilder() {
        C2224571C4x c2224571C4x = new C2224571C4x();
        c2224571C4x.addUnknownFields(unknownFields());
        return c2224571C4x;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "GetConfigsRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224561C4w(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
