package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Yz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892000Yz0 extends Message<C892000Yz0, C892020Yz2> {
    public static final ProtoAdapter<C892000Yz0> ADAPTER = new ProtoAdapter<C892000Yz0>() { // from class: X.0Yz1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C892000Yz0 decode(ProtoReader protoReader) {
            C892020Yz2 c892020Yz2 = new C892020Yz2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c892020Yz2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c892020Yz2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C892000Yz0 c892000Yz0) {
            return c892000Yz0.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C892000Yz0 redact(C892000Yz0 c892000Yz0) {
            C892020Yz2 c892020Yz2NewBuilder = c892000Yz0.newBuilder();
            c892020Yz2NewBuilder.clearUnknownFields();
            return c892020Yz2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C892000Yz0 c892000Yz0) {
            protoWriter.writeBytes(c892000Yz0.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C892000Yz0() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C892020Yz2 newBuilder() {
        C892020Yz2 c892020Yz2 = new C892020Yz2();
        c892020Yz2.addUnknownFields(unknownFields());
        return c892020Yz2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "CoreTransientExtra{");
        sb.append('}');
        return sb.toString();
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public C892000Yz0(ByteString byteString) {
        super(ADAPTER, byteString);
    }

    public boolean equals(Object obj) {
        return obj instanceof C892000Yz0;
    }
}
