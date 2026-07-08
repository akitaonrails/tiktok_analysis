package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235881CfC extends Message<C2235881CfC, C2235901CfE> {
    public static final ProtoAdapter<C2235881CfC> ADAPTER = new ProtoAdapter<C2235881CfC>() { // from class: X.1CfD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235881CfC decode(ProtoReader protoReader) {
            C2235901CfE c2235901CfE = new C2235901CfE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235901CfE.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2235901CfE.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2235901CfE.LIZLLL = C2235911CfF.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235901CfE.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235881CfC c2235881CfC) {
            C2235881CfC c2235881CfC2 = c2235881CfC;
            return C2235911CfF.ADAPTER.encodedSizeWithTag(1, c2235881CfC2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2235881CfC2.callback) + c2235881CfC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235881CfC redact(C2235881CfC c2235881CfC) {
            C2235901CfE c2235901CfENewBuilder = c2235881CfC.newBuilder();
            c2235901CfENewBuilder.LIZLLL = C2235911CfF.ADAPTER.redact(c2235901CfENewBuilder.LIZLLL);
            c2235901CfENewBuilder.LJ = C1CIG.ADAPTER.redact(c2235901CfENewBuilder.LJ);
            c2235901CfENewBuilder.clearUnknownFields();
            return c2235901CfENewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235881CfC c2235881CfC) {
            C2235881CfC c2235881CfC2 = c2235881CfC;
            C2235911CfF.ADAPTER.encodeWithTag(protoWriter, 1, c2235881CfC2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2235881CfC2.callback);
            protoWriter.writeBytes(c2235881CfC2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicJoinGroupParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2235911CfF param;

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
    public C2235901CfE newBuilder() {
        C2235901CfE c2235901CfE = new C2235901CfE();
        c2235901CfE.LIZLLL = this.param;
        c2235901CfE.LJ = this.callback;
        c2235901CfE.addUnknownFields(unknownFields());
        return c2235901CfE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX75a4d16e5c0f69dd{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235881CfC)) {
            return false;
        }
        C2235881CfC c2235881CfC = (C2235881CfC) obj;
        if (unknownFields().equals(c2235881CfC.unknownFields()) && this.param.equals(c2235881CfC.param) && this.callback.equals(c2235881CfC.callback)) {
            return true;
        }
        return false;
    }

    public C2235881CfC(C2235911CfF c2235911CfF, C1CIG c1cig) {
        this(c2235911CfF, c1cig, ByteString.EMPTY);
    }

    public C2235881CfC(C2235911CfF c2235911CfF, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2235911CfF;
        this.callback = c1cig;
    }
}
