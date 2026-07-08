package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224351C4b extends Message<C2224351C4b, C2224361C4c> {
    public static final ProtoAdapter<C2224351C4b> ADAPTER = new ProtoAdapter<C2224351C4b>() { // from class: X.1C4a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224351C4b decode(ProtoReader protoReader) {
            C2224361C4c c2224361C4c = new C2224361C4c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224361C4c.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224361C4c.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224351C4b c2224351C4b) {
            return c2224351C4b.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224351C4b c2224351C4b) {
            protoWriter.writeBytes(c2224351C4b.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224351C4b() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224361C4c newBuilder() {
        C2224361C4c c2224361C4c = new C2224361C4c();
        c2224361C4c.addUnknownFields(unknownFields());
        return c2224361C4c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "MarkStrangerAllConversationReadResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224351C4b(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
