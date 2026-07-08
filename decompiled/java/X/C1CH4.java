package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CH4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CH4 extends Message<C1CH4, C1CH6> {
    public static final ProtoAdapter<C1CH4> ADAPTER = new ProtoAdapter<C1CH4>() { // from class: X.1CH5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CH4 decode(ProtoReader protoReader) {
            C1CH6 c1ch6 = new C1CH6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ch6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ch6.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ch6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CH4 c1ch4) {
            C1CH4 c1ch42 = c1ch4;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1ch42.reason) + c1ch42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CH4 redact(C1CH4 c1ch4) {
            C1CH6 c1ch6NewBuilder = c1ch4.newBuilder();
            c1ch6NewBuilder.clearUnknownFields();
            return c1ch6NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CH4 c1ch4) {
            C1CH4 c1ch42 = c1ch4;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1ch42.reason);
            protoWriter.writeBytes(c1ch42.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String reason;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CH6 newBuilder() {
        C1CH6 c1ch6 = new C1CH6();
        c1ch6.LIZLLL = this.reason;
        c1ch6.addUnknownFields(unknownFields());
        return c1ch6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", reason=");
        sb.append(this.reason);
        sb.replace(0, 2, "FuncParamsX230b23e8c8be1b4b{");
        sb.append('}');
        return sb.toString();
    }

    public C1CH4(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CH4)) {
            return false;
        }
        C1CH4 c1ch4 = (C1CH4) obj;
        if (unknownFields().equals(c1ch4.unknownFields()) && this.reason.equals(c1ch4.reason)) {
            return true;
        }
        return false;
    }

    public C1CH4(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reason = str;
    }
}
