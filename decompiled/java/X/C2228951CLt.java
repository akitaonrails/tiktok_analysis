package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228951CLt extends Message<C2228951CLt, C2228971CLv> {
    public static final ProtoAdapter<C2228951CLt> ADAPTER = new ProtoAdapter<C2228951CLt>() { // from class: X.1CLu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228951CLt decode(ProtoReader protoReader) {
            C2228971CLv c2228971CLv = new C2228971CLv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228971CLv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228971CLv.LIZLLL = C1CMV.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228971CLv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228951CLt c2228951CLt) {
            C2228951CLt c2228951CLt2 = c2228951CLt;
            return C1CMV.ADAPTER.encodedSizeWithTag(1, c2228951CLt2.error) + c2228951CLt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228951CLt redact(C2228951CLt c2228951CLt) {
            C2228971CLv c2228971CLvNewBuilder = c2228951CLt.newBuilder();
            c2228971CLvNewBuilder.LIZLLL = C1CMV.ADAPTER.redact(c2228971CLvNewBuilder.LIZLLL);
            c2228971CLvNewBuilder.clearUnknownFields();
            return c2228971CLvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228951CLt c2228951CLt) {
            C2228951CLt c2228951CLt2 = c2228951CLt;
            C1CMV.ADAPTER.encodeWithTag(protoWriter, 1, c2228951CLt2.error);
            protoWriter.writeBytes(c2228951CLt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicError#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CMV error;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.error.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228971CLv newBuilder() {
        C2228971CLv c2228971CLv = new C2228971CLv();
        c2228971CLv.LIZLLL = this.error;
        c2228971CLv.addUnknownFields(unknownFields());
        return c2228971CLv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", error=");
        sb.append(this.error);
        sb.replace(0, 2, "FuncParamsXebb1225e236da323{");
        sb.append('}');
        return sb.toString();
    }

    public C2228951CLt(C1CMV c1cmv) {
        this(c1cmv, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228951CLt)) {
            return false;
        }
        C2228951CLt c2228951CLt = (C2228951CLt) obj;
        if (unknownFields().equals(c2228951CLt.unknownFields()) && this.error.equals(c2228951CLt.error)) {
            return true;
        }
        return false;
    }

    public C2228951CLt(C1CMV c1cmv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.error = c1cmv;
    }
}
