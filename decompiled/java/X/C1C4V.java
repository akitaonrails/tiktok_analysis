package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4V extends Message<C1C4V, C1C4W> {
    public static final ProtoAdapter<C1C4V> ADAPTER = new ProtoAdapter<C1C4V>() { // from class: X.1C4U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4V decode(ProtoReader protoReader) {
            C1C4W c1c4w = new C1C4W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1c4w.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4w.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C4V c1c4v) {
            return c1c4v.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C4V c1c4v) {
            protoWriter.writeBytes(c1c4v.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C1C4V() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C4W newBuilder() {
        C1C4W c1c4w = new C1C4W();
        c1c4w.addUnknownFields(unknownFields());
        return c1c4w;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "MarkStrangerAllConversationReadRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public C1C4V(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
