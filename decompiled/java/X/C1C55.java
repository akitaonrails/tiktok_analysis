package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C55, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C55 extends Message<C1C55, C1C56> {
    public static final ProtoAdapter<C1C55> ADAPTER = new ProtoAdapter<C1C55>() { // from class: X.1C54
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C55 decode(ProtoReader protoReader) {
            C1C56 c1c56 = new C1C56();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1c56.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c56.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C55 c1c55) {
            return c1c55.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C55 c1c55) {
            protoWriter.writeBytes(c1c55.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C1C55() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C56 newBuilder() {
        C1C56 c1c56 = new C1C56();
        c1c56.addUnknownFields(unknownFields());
        return c1c56;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "ReportClientMetricsResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public C1C55(ByteString byteString) {
        super(ADAPTER, byteString);
    }
}
