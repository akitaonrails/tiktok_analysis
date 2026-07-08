package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228891CLn extends Message<C2228891CLn, C2228911CLp> {
    public static final ProtoAdapter<C2228891CLn> ADAPTER = new ProtoAdapter<C2228891CLn>() { // from class: X.1CLo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228891CLn decode(ProtoReader protoReader) {
            C2228911CLp c2228911CLp = new C2228911CLp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228911CLp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228911CLp.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228911CLp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228891CLn c2228891CLn) {
            C2228891CLn c2228891CLn2 = c2228891CLn;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228891CLn2.config_id) + c2228891CLn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228891CLn redact(C2228891CLn c2228891CLn) {
            C2228911CLp c2228911CLpNewBuilder = c2228891CLn.newBuilder();
            c2228911CLpNewBuilder.clearUnknownFields();
            return c2228911CLpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228891CLn c2228891CLn) {
            C2228891CLn c2228891CLn2 = c2228891CLn;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228891CLn2.config_id);
            protoWriter.writeBytes(c2228891CLn2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String config_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.config_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228911CLp newBuilder() {
        C2228911CLp c2228911CLp = new C2228911CLp();
        c2228911CLp.LIZLLL = this.config_id;
        c2228911CLp.addUnknownFields(unknownFields());
        return c2228911CLp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", config_id=");
        sb.append(this.config_id);
        sb.replace(0, 2, "LinkMicLayoutInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C2228891CLn(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228891CLn)) {
            return false;
        }
        C2228891CLn c2228891CLn = (C2228891CLn) obj;
        if (unknownFields().equals(c2228891CLn.unknownFields()) && this.config_id.equals(c2228891CLn.config_id)) {
            return true;
        }
        return false;
    }

    public C2228891CLn(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.config_id = str;
    }
}
