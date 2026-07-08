package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228391CJp extends Message<C2228391CJp, C2228411CJr> {
    public static final ProtoAdapter<C2228391CJp> ADAPTER = new ProtoAdapter<C2228391CJp>() { // from class: X.1CJq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228391CJp decode(ProtoReader protoReader) {
            C2228411CJr c2228411CJr = new C2228411CJr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228411CJr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228411CJr.LIZLLL = C2232561CZq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228411CJr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228391CJp c2228391CJp) {
            C2228391CJp c2228391CJp2 = c2228391CJp;
            return C2232561CZq.ADAPTER.encodedSizeWithTag(1, c2228391CJp2.rect) + c2228391CJp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228391CJp redact(C2228391CJp c2228391CJp) {
            C2228411CJr c2228411CJrNewBuilder = c2228391CJp.newBuilder();
            c2228411CJrNewBuilder.LIZLLL = C2232561CZq.ADAPTER.redact(c2228411CJrNewBuilder.LIZLLL);
            c2228411CJrNewBuilder.clearUnknownFields();
            return c2228411CJrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228391CJp c2228391CJp) {
            C2228391CJp c2228391CJp2 = c2228391CJp;
            C2232561CZq.ADAPTER.encodeWithTag(protoWriter, 1, c2228391CJp2.rect);
            protoWriter.writeBytes(c2228391CJp2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232561CZq rect;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.rect.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228411CJr newBuilder() {
        C2228411CJr c2228411CJr = new C2228411CJr();
        c2228411CJr.LIZLLL = this.rect;
        c2228411CJr.addUnknownFields(unknownFields());
        return c2228411CJr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rect=");
        sb.append(this.rect);
        sb.replace(0, 2, "FuncParamsXfee2b1f7c2b1c718{");
        sb.append('}');
        return sb.toString();
    }

    public C2228391CJp(C2232561CZq c2232561CZq) {
        this(c2232561CZq, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228391CJp)) {
            return false;
        }
        C2228391CJp c2228391CJp = (C2228391CJp) obj;
        if (unknownFields().equals(c2228391CJp.unknownFields()) && this.rect.equals(c2228391CJp.rect)) {
            return true;
        }
        return false;
    }

    public C2228391CJp(C2232561CZq c2232561CZq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rect = c2232561CZq;
    }
}
