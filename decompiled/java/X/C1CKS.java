package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CKS extends Message<C1CKS, C1CKU> {
    public static final ProtoAdapter<C1CKS> ADAPTER = new ProtoAdapter<C1CKS>() { // from class: X.1CKT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKS decode(ProtoReader protoReader) {
            C1CKU c1cku = new C1CKU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cku.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cku.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cku.LIZLLL = C1CKP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cku.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CKS c1cks) {
            C1CKS c1cks2 = c1cks;
            return C1CKP.ADAPTER.encodedSizeWithTag(1, c1cks2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c1cks2.callback) + c1cks2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CKS redact(C1CKS c1cks) {
            C1CKU c1ckuNewBuilder = c1cks.newBuilder();
            c1ckuNewBuilder.LIZLLL = C1CKP.ADAPTER.redact(c1ckuNewBuilder.LIZLLL);
            C1CIG c1cig = c1ckuNewBuilder.LJ;
            if (c1cig != null) {
                c1ckuNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c1ckuNewBuilder.clearUnknownFields();
            return c1ckuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CKS c1cks) {
            C1CKS c1cks2 = c1cks;
            C1CKP.ADAPTER.encodeWithTag(protoWriter, 1, c1cks2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c1cks2.callback);
            protoWriter.writeBytes(c1cks2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLeaveParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CKP param;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.param.hashCode()) * 37;
        C1CIG c1cig = this.callback;
        int iHashCode2 = iHashCode + (c1cig != null ? c1cig.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CKU newBuilder() {
        C1CKU c1cku = new C1CKU();
        c1cku.LIZLLL = this.param;
        c1cku.LJ = this.callback;
        c1cku.addUnknownFields(unknownFields());
        return c1cku;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        if (this.callback != null) {
            sb.append(", callback=");
            sb.append(this.callback);
        }
        sb.replace(0, 2, "FuncParamsX272cb6b017e828f8{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CKS)) {
            return false;
        }
        C1CKS c1cks = (C1CKS) obj;
        if (unknownFields().equals(c1cks.unknownFields()) && this.param.equals(c1cks.param) && C1516540pZE.LJ(this.callback, c1cks.callback)) {
            return true;
        }
        return false;
    }

    public C1CKS(C1CKP c1ckp, C1CIG c1cig) {
        this(c1ckp, c1cig, ByteString.EMPTY);
    }

    public C1CKS(C1CKP c1ckp, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c1ckp;
        this.callback = c1cig;
    }
}
