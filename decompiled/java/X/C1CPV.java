package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPV extends Message<C1CPV, C1CPX> {
    public static final ProtoAdapter<C1CPV> ADAPTER = new ProtoAdapter<C1CPV>() { // from class: X.1CPW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPV decode(ProtoReader protoReader) {
            C1CPX c1cpx = new C1CPX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cpx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cpx.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cpx.LIZLLL = C1CPQ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPV c1cpv) {
            C1CPV c1cpv2 = c1cpv;
            return C1CPQ.ADAPTER.encodedSizeWithTag(1, c1cpv2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c1cpv2.callback) + c1cpv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPV redact(C1CPV c1cpv) {
            C1CPX c1cpxNewBuilder = c1cpv.newBuilder();
            c1cpxNewBuilder.LIZLLL = C1CPQ.ADAPTER.redact(c1cpxNewBuilder.LIZLLL);
            c1cpxNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cpxNewBuilder.LJ);
            c1cpxNewBuilder.clearUnknownFields();
            return c1cpxNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPV c1cpv) {
            C1CPV c1cpv2 = c1cpv;
            C1CPQ.ADAPTER.encodeWithTag(protoWriter, 1, c1cpv2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c1cpv2.callback);
            protoWriter.writeBytes(c1cpv2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicKickoutParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CPQ param;

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
    public C1CPX newBuilder() {
        C1CPX c1cpx = new C1CPX();
        c1cpx.LIZLLL = this.param;
        c1cpx.LJ = this.callback;
        c1cpx.addUnknownFields(unknownFields());
        return c1cpx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.replace(0, 2, "FuncParamsX2cbe481561fe766b{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPV)) {
            return false;
        }
        C1CPV c1cpv = (C1CPV) obj;
        if (unknownFields().equals(c1cpv.unknownFields()) && this.param.equals(c1cpv.param) && this.callback.equals(c1cpv.callback)) {
            return true;
        }
        return false;
    }

    public C1CPV(C1CPQ c1cpq, C1CIG c1cig) {
        this(c1cpq, c1cig, ByteString.EMPTY);
    }

    public C1CPV(C1CPQ c1cpq, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c1cpq;
        this.callback = c1cig;
    }
}
