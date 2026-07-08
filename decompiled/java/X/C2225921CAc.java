package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225921CAc extends Message<C2225921CAc, C2225941CAe> {
    public static final ProtoAdapter<C2225921CAc> ADAPTER = new ProtoAdapter<C2225921CAc>() { // from class: X.1CAd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225921CAc decode(ProtoReader protoReader) {
            C2225941CAe c2225941CAe = new C2225941CAe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2225941CAe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2225941CAe.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225941CAe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225921CAc c2225921CAc) {
            C2225921CAc c2225921CAc2 = c2225921CAc;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2225921CAc2.message) + c2225921CAc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225921CAc redact(C2225921CAc c2225921CAc) {
            C2225941CAe c2225941CAeNewBuilder = c2225921CAc.newBuilder();
            c2225941CAeNewBuilder.clearUnknownFields();
            return c2225941CAeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2225921CAc c2225921CAc) {
            C2225921CAc c2225921CAc2 = c2225921CAc;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2225921CAc2.message);
            protoWriter.writeBytes(c2225921CAc2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.message;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2225941CAe newBuilder() {
        C2225941CAe c2225941CAe = new C2225941CAe();
        c2225941CAe.LIZLLL = this.message;
        c2225941CAe.addUnknownFields(unknownFields());
        return c2225941CAe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        sb.replace(0, 2, "FuncParamsXa74f247004c12edc{");
        sb.append('}');
        return sb.toString();
    }

    public C2225921CAc(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2225921CAc)) {
            return false;
        }
        C2225921CAc c2225921CAc = (C2225921CAc) obj;
        if (unknownFields().equals(c2225921CAc.unknownFields()) && C1516540pZE.LJ(this.message, c2225921CAc.message)) {
            return true;
        }
        return false;
    }

    public C2225921CAc(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = str;
    }
}
