package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CO9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CO9 extends Message<C1CO9, C1COA> {
    public static final ProtoAdapter<C1CO9> ADAPTER = new ProtoAdapter<C1CO9>() { // from class: X.1CO8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CO9 decode(ProtoReader protoReader) {
            C1COA c1coa = new C1COA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1coa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1coa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1coa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CO9 c1co9) {
            C1CO9 c1co92 = c1co9;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1co92.content_link_mic_id) + c1co92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CO9 redact(C1CO9 c1co9) {
            C1COA c1coaNewBuilder = c1co9.newBuilder();
            c1coaNewBuilder.clearUnknownFields();
            return c1coaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CO9 c1co9) {
            C1CO9 c1co92 = c1co9;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1co92.content_link_mic_id);
            protoWriter.writeBytes(c1co92.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String content_link_mic_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.content_link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1COA newBuilder() {
        C1COA c1coa = new C1COA();
        c1coa.LIZLLL = this.content_link_mic_id;
        c1coa.addUnknownFields(unknownFields());
        return c1coa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", content_link_mic_id=");
        sb.append(this.content_link_mic_id);
        sb.replace(0, 2, "LinkMicPosIdentityExtra{");
        sb.append('}');
        return sb.toString();
    }

    public C1CO9(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CO9)) {
            return false;
        }
        C1CO9 c1co9 = (C1CO9) obj;
        if (unknownFields().equals(c1co9.unknownFields()) && this.content_link_mic_id.equals(c1co9.content_link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CO9(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.content_link_mic_id = str;
    }
}
