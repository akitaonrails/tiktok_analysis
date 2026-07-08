package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235971CfL extends Message<C2235971CfL, C2235991CfN> {
    public static final ProtoAdapter<C2235971CfL> ADAPTER = new ProtoAdapter<C2235971CfL>() { // from class: X.1CfM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235971CfL decode(ProtoReader protoReader) {
            C2235991CfN c2235991CfN = new C2235991CfN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235991CfN.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2235991CfN.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235991CfN.LIZLLL = C2235941CfI.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235991CfN.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235971CfL c2235971CfL) {
            C2235971CfL c2235971CfL2 = c2235971CfL;
            return C2235941CfI.ADAPTER.encodedSizeWithTag(1, c2235971CfL2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2235971CfL2.callback) + c2235971CfL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235971CfL redact(C2235971CfL c2235971CfL) {
            C2235991CfN c2235991CfNNewBuilder = c2235971CfL.newBuilder();
            c2235991CfNNewBuilder.LIZLLL = C2235941CfI.ADAPTER.redact(c2235991CfNNewBuilder.LIZLLL);
            c2235991CfNNewBuilder.LJ = C1CIG.ADAPTER.redact(c2235991CfNNewBuilder.LJ);
            c2235991CfNNewBuilder.clearUnknownFields();
            return c2235991CfNNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235971CfL c2235971CfL) {
            C2235971CfL c2235971CfL2 = c2235971CfL;
            C2235941CfI.ADAPTER.encodeWithTag(protoWriter, 1, c2235971CfL2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2235971CfL2.callback);
            protoWriter.writeBytes(c2235971CfL2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPermitGroupParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235941CfI param;

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
    public C2235991CfN newBuilder() {
        C2235991CfN c2235991CfN = new C2235991CfN();
        c2235991CfN.LIZLLL = this.param;
        c2235991CfN.LJ = this.callback;
        c2235991CfN.addUnknownFields(unknownFields());
        return c2235991CfN;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX9f485fe8bf599575{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235971CfL)) {
            return false;
        }
        C2235971CfL c2235971CfL = (C2235971CfL) obj;
        if (unknownFields().equals(c2235971CfL.unknownFields()) && this.param.equals(c2235971CfL.param) && this.callback.equals(c2235971CfL.callback)) {
            return true;
        }
        return false;
    }

    public C2235971CfL(C2235941CfI c2235941CfI, C1CIG c1cig) {
        this(c2235941CfI, c1cig, ByteString.EMPTY);
    }

    public C2235971CfL(C2235941CfI c2235941CfI, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2235941CfI;
        this.callback = c1cig;
    }
}
