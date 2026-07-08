package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEC extends Message<C1CEC, C1CED> {
    public static final ProtoAdapter<C1CEC> ADAPTER = new ProtoAdapter<C1CEC>() { // from class: X.1CEB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEC decode(ProtoReader protoReader) {
            C1CED c1ced = new C1CED();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ced.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ced.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ced.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CEC c1cec) {
            C1CEC c1cec2 = c1cec;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c1cec2.ret) + c1cec2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEC redact(C1CEC c1cec) {
            C1CED c1cedNewBuilder = c1cec.newBuilder();
            c1cedNewBuilder.clearUnknownFields();
            return c1cedNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CEC c1cec) {
            C1CEC c1cec2 = c1cec;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1cec2.ret);
            protoWriter.writeBytes(c1cec2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_RET = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CED newBuilder() {
        C1CED c1ced = new C1CED();
        c1ced.LIZLLL = this.ret;
        c1ced.addUnknownFields(unknownFields());
        return c1ced;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX3dc8b8542df1cbb1{");
        sb.append('}');
        return sb.toString();
    }

    public C1CEC(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CEC)) {
            return false;
        }
        C1CEC c1cec = (C1CEC) obj;
        if (unknownFields().equals(c1cec.unknownFields()) && this.ret.equals(c1cec.ret)) {
            return true;
        }
        return false;
    }

    public C1CEC(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = bool;
    }
}
