package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236571CgJ extends Message<C2236571CgJ, C2236591CgL> {
    public static final ProtoAdapter<C2236571CgJ> ADAPTER = new ProtoAdapter<C2236571CgJ>() { // from class: X.1CgK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236571CgJ decode(ProtoReader protoReader) {
            C2236591CgL c2236591CgL = new C2236591CgL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236591CgL.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2236591CgL.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2236591CgL.LIZLLL = C2236631CgP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236591CgL.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236571CgJ c2236571CgJ) {
            C2236571CgJ c2236571CgJ2 = c2236571CgJ;
            return C2236631CgP.ADAPTER.encodedSizeWithTag(1, c2236571CgJ2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2236571CgJ2.callback) + c2236571CgJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236571CgJ redact(C2236571CgJ c2236571CgJ) {
            C2236591CgL c2236591CgLNewBuilder = c2236571CgJ.newBuilder();
            c2236591CgLNewBuilder.LIZLLL = C2236631CgP.ADAPTER.redact(c2236591CgLNewBuilder.LIZLLL);
            c2236591CgLNewBuilder.LJ = C1CIG.ADAPTER.redact(c2236591CgLNewBuilder.LJ);
            c2236591CgLNewBuilder.clearUnknownFields();
            return c2236591CgLNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236571CgJ c2236571CgJ) {
            C2236571CgJ c2236571CgJ2 = c2236571CgJ;
            C2236631CgP.ADAPTER.encodeWithTag(protoWriter, 1, c2236571CgJ2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2236571CgJ2.callback);
            protoWriter.writeBytes(c2236571CgJ2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicApplyParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236631CgP param;

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
    public C2236591CgL newBuilder() {
        C2236591CgL c2236591CgL = new C2236591CgL();
        c2236591CgL.LIZLLL = this.param;
        c2236591CgL.LJ = this.callback;
        c2236591CgL.addUnknownFields(unknownFields());
        return c2236591CgL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsXe4b47ef5b4c8871f{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236571CgJ)) {
            return false;
        }
        C2236571CgJ c2236571CgJ = (C2236571CgJ) obj;
        if (unknownFields().equals(c2236571CgJ.unknownFields()) && this.param.equals(c2236571CgJ.param) && this.callback.equals(c2236571CgJ.callback)) {
            return true;
        }
        return false;
    }

    public C2236571CgJ(C2236631CgP c2236631CgP, C1CIG c1cig) {
        this(c2236631CgP, c1cig, ByteString.EMPTY);
    }

    public C2236571CgJ(C2236631CgP c2236631CgP, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2236631CgP;
        this.callback = c1cig;
    }
}
