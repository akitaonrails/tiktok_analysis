package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228001CIc extends Message<C2228001CIc, C2228011CId> {
    public static final ProtoAdapter<C2228001CIc> ADAPTER = new ProtoAdapter<C2228001CIc>() { // from class: X.1CIb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228001CIc decode(ProtoReader protoReader) {
            C2228011CId c2228011CId = new C2228011CId();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228011CId.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228011CId.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2228011CId.LIZLLL = C2227561CGk.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228011CId.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228001CIc c2228001CIc) {
            C2228001CIc c2228001CIc2 = c2228001CIc;
            return C2227561CGk.ADAPTER.encodedSizeWithTag(1, c2228001CIc2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2228001CIc2.callback) + c2228001CIc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228001CIc redact(C2228001CIc c2228001CIc) {
            C2228011CId c2228011CIdNewBuilder = c2228001CIc.newBuilder();
            c2228011CIdNewBuilder.LIZLLL = C2227561CGk.ADAPTER.redact(c2228011CIdNewBuilder.LIZLLL);
            C1CIG c1cig = c2228011CIdNewBuilder.LJ;
            if (c1cig != null) {
                c2228011CIdNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c2228011CIdNewBuilder.clearUnknownFields();
            return c2228011CIdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228001CIc c2228001CIc) {
            C2228001CIc c2228001CIc2 = c2228001CIc;
            C2227561CGk.ADAPTER.encodeWithTag(protoWriter, 1, c2228001CIc2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2228001CIc2.callback);
            protoWriter.writeBytes(c2228001CIc2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCancelInviteParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2227561CGk param;

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
    public C2228011CId newBuilder() {
        C2228011CId c2228011CId = new C2228011CId();
        c2228011CId.LIZLLL = this.param;
        c2228011CId.LJ = this.callback;
        c2228011CId.addUnknownFields(unknownFields());
        return c2228011CId;
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
        sb.replace(0, 2, "FuncParamsX53e0c552585641d7{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228001CIc)) {
            return false;
        }
        C2228001CIc c2228001CIc = (C2228001CIc) obj;
        if (unknownFields().equals(c2228001CIc.unknownFields()) && this.param.equals(c2228001CIc.param) && C1516540pZE.LJ(this.callback, c2228001CIc.callback)) {
            return true;
        }
        return false;
    }

    public C2228001CIc(C2227561CGk c2227561CGk, C1CIG c1cig) {
        this(c2227561CGk, c1cig, ByteString.EMPTY);
    }

    public C2228001CIc(C2227561CGk c2227561CGk, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2227561CGk;
        this.callback = c1cig;
    }
}
