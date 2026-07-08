package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEH extends Message<C1CEH, C1CEJ> {
    public static final ProtoAdapter<C1CEH> ADAPTER = new ProtoAdapter<C1CEH>() { // from class: X.1CEI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEH decode(ProtoReader protoReader) {
            C1CEJ c1cej = new C1CEJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cej.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cej.LIZLLL = C1CEF.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cej.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CEH c1ceh) {
            C1CEH c1ceh2 = c1ceh;
            return C1CEF.ADAPTER.encodedSizeWithTag(1, c1ceh2.link) + c1ceh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEH redact(C1CEH c1ceh) {
            C1CEJ c1cejNewBuilder = c1ceh.newBuilder();
            c1cejNewBuilder.LIZLLL = C1CEF.ADAPTER.redact(c1cejNewBuilder.LIZLLL);
            c1cejNewBuilder.clearUnknownFields();
            return c1cejNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CEH c1ceh) {
            C1CEH c1ceh2 = c1ceh;
            C1CEF.ADAPTER.encodeWithTag(protoWriter, 1, c1ceh2.link);
            protoWriter.writeBytes(c1ceh2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkPosData#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CEF link;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.link.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CEJ newBuilder() {
        C1CEJ c1cej = new C1CEJ();
        c1cej.LIZLLL = this.link;
        c1cej.addUnknownFields(unknownFields());
        return c1cej;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link=");
        sb.append(this.link);
        sb.replace(0, 2, "LinkMicPositionData{");
        sb.append('}');
        return sb.toString();
    }

    public C1CEH(C1CEF c1cef) {
        this(c1cef, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CEH)) {
            return false;
        }
        C1CEH c1ceh = (C1CEH) obj;
        if (unknownFields().equals(c1ceh.unknownFields()) && this.link.equals(c1ceh.link)) {
            return true;
        }
        return false;
    }

    public C1CEH(C1CEF c1cef, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link = c1cef;
    }
}
