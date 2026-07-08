package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236061CfU extends Message<C2236061CfU, C2236081CfW> {
    public static final ProtoAdapter<C2236061CfU> ADAPTER = new ProtoAdapter<C2236061CfU>() { // from class: X.1CfV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236061CfU decode(ProtoReader protoReader) {
            C2236081CfW c2236081CfW = new C2236081CfW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236081CfW.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236081CfW.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236081CfW.LIZLLL = C2236091CfX.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236081CfW.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236061CfU c2236061CfU) {
            C2236061CfU c2236061CfU2 = c2236061CfU;
            return C2236091CfX.ADAPTER.encodedSizeWithTag(1, c2236061CfU2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236061CfU2.callback) + c2236061CfU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236061CfU redact(C2236061CfU c2236061CfU) {
            C2236081CfW c2236081CfWNewBuilder = c2236061CfU.newBuilder();
            c2236081CfWNewBuilder.LIZLLL = C2236091CfX.ADAPTER.redact(c2236081CfWNewBuilder.LIZLLL);
            c2236081CfWNewBuilder.LJ = C1CIG.ADAPTER.redact(c2236081CfWNewBuilder.LJ);
            c2236081CfWNewBuilder.clearUnknownFields();
            return c2236081CfWNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236061CfU c2236061CfU) {
            C2236061CfU c2236061CfU2 = c2236061CfU;
            C2236091CfX.ADAPTER.encodeWithTag(protoWriter, 1, c2236061CfU2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236061CfU2.callback);
            protoWriter.writeBytes(c2236061CfU2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicChangeLayoutParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236091CfX param;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.param.hashCode()) * 37) + this.callback.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236081CfW newBuilder() {
        C2236081CfW c2236081CfW = new C2236081CfW();
        c2236081CfW.LIZLLL = this.param;
        c2236081CfW.LJ = this.callback;
        c2236081CfW.addUnknownFields(unknownFields());
        return c2236081CfW;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX5b2c75ebb5d8a7e2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236061CfU)) {
            return false;
        }
        C2236061CfU c2236061CfU = (C2236061CfU) obj;
        if (unknownFields().equals(c2236061CfU.unknownFields()) && this.param.equals(c2236061CfU.param) && this.callback.equals(c2236061CfU.callback)) {
            return true;
        }
        return false;
    }

    public C2236061CfU(C2236091CfX c2236091CfX, C1CIG c1cig) {
        this(c2236091CfX, c1cig, ByteString.EMPTY);
    }

    public C2236061CfU(C2236091CfX c2236091CfX, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236091CfX;
        this.callback = c1cig;
    }
}
