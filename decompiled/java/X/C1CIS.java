package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIS extends Message<C1CIS, C1CIU> {
    public static final ProtoAdapter<C1CIS> ADAPTER = new ProtoAdapter<C1CIS>() { // from class: X.1CIT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIS decode(ProtoReader protoReader) {
            C1CIU c1ciu = new C1CIU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ciu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ciu.LIZLLL = C1CIG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ciu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIS c1cis) {
            C1CIS c1cis2 = c1cis;
            return C1CIG.ADAPTER.encodedSizeWithTag(1, c1cis2.provider) + c1cis2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIS redact(C1CIS c1cis) {
            C1CIU c1ciuNewBuilder = c1cis.newBuilder();
            c1ciuNewBuilder.LIZLLL = C1CIG.ADAPTER.redact(c1ciuNewBuilder.LIZLLL);
            c1ciuNewBuilder.clearUnknownFields();
            return c1ciuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIS c1cis) {
            C1CIS c1cis2 = c1cis;
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 1, c1cis2.provider);
            protoWriter.writeBytes(c1cis2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CIG provider;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.provider.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CIU newBuilder() {
        C1CIU c1ciu = new C1CIU();
        c1ciu.LIZLLL = this.provider;
        c1ciu.addUnknownFields(unknownFields());
        return c1ciu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", provider=");
        sb.append(this.provider);
        sb.replace(0, 2, "FuncParamsXe3bb576f62184337{");
        sb.append('}');
        return sb.toString();
    }

    public C1CIS(C1CIG c1cig) {
        this(c1cig, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIS)) {
            return false;
        }
        C1CIS c1cis = (C1CIS) obj;
        if (unknownFields().equals(c1cis.unknownFields()) && this.provider.equals(c1cis.provider)) {
            return true;
        }
        return false;
    }

    public C1CIS(C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.provider = c1cig;
    }
}
