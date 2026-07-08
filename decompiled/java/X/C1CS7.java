package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CS7, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CS7 extends Message<C1CS7, C1CS9> {
    public static final ProtoAdapter<C1CS7> ADAPTER = new ProtoAdapter<C1CS7>() { // from class: X.1CS8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CS7 decode(ProtoReader protoReader) {
            C1CS9 c1cs9 = new C1CS9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cs9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cs9.LIZLLL = C2232721Ca6.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cs9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CS7 c1cs7) {
            C1CS7 c1cs72 = c1cs7;
            return C2232721Ca6.ADAPTER.encodedSizeWithTag(1, c1cs72.ret) + c1cs72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CS7 redact(C1CS7 c1cs7) {
            C1CS9 c1cs9NewBuilder = c1cs7.newBuilder();
            c1cs9NewBuilder.LIZLLL = C2232721Ca6.ADAPTER.redact(c1cs9NewBuilder.LIZLLL);
            c1cs9NewBuilder.clearUnknownFields();
            return c1cs9NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CS7 c1cs7) {
            C1CS7 c1cs72 = c1cs7;
            C2232721Ca6.ADAPTER.encodeWithTag(protoWriter, 1, c1cs72.ret);
            protoWriter.writeBytes(c1cs72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LayoutModel#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232721Ca6 ret;

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
    public C1CS9 newBuilder() {
        C1CS9 c1cs9 = new C1CS9();
        c1cs9.LIZLLL = this.ret;
        c1cs9.addUnknownFields(unknownFields());
        return c1cs9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX0db5ba5f4da9ec35{");
        sb.append('}');
        return sb.toString();
    }

    public C1CS7(C2232721Ca6 c2232721Ca6) {
        this(c2232721Ca6, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CS7)) {
            return false;
        }
        C1CS7 c1cs7 = (C1CS7) obj;
        if (unknownFields().equals(c1cs7.unknownFields()) && this.ret.equals(c1cs7.ret)) {
            return true;
        }
        return false;
    }

    public C1CS7(C2232721Ca6 c2232721Ca6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c2232721Ca6;
    }
}
