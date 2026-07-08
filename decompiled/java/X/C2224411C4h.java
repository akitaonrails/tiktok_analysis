package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224411C4h extends Message<C2224411C4h, C2224421C4i> {
    public static final ProtoAdapter<C2224411C4h> ADAPTER = new ProtoAdapter<C2224411C4h>() { // from class: X.1C4g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224411C4h decode(ProtoReader protoReader) {
            C2224421C4i c2224421C4i = new C2224421C4i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c2224421C4i.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224421C4i.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224411C4h c2224411C4h) {
            return c2224411C4h.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2224411C4h c2224411C4h) {
            protoWriter.writeBytes(c2224411C4h.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C2224411C4h() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224421C4i newBuilder() {
        C2224421C4i c2224421C4i = new C2224421C4i();
        c2224421C4i.addUnknownFields(unknownFields());
        return c2224421C4i;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "ClientBatchACKResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C2224411C4h(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
