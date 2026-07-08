package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228051CIh extends Message<C2228051CIh, C2228071CIj> {
    public static final ProtoAdapter<C2228051CIh> ADAPTER = new ProtoAdapter<C2228051CIh>() { // from class: X.1CIi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228051CIh decode(ProtoReader protoReader) {
            C2228071CIj c2228071CIj = new C2228071CIj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228071CIj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228071CIj.LJ = C1CIG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2228071CIj.LIZLLL = C2227501CGe.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228071CIj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228051CIh c2228051CIh) {
            C2228051CIh c2228051CIh2 = c2228051CIh;
            return C2227501CGe.ADAPTER.encodedSizeWithTag(1, c2228051CIh2.param) + C1CIG.ADAPTER.encodedSizeWithTag(2, c2228051CIh2.callback) + c2228051CIh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228051CIh redact(C2228051CIh c2228051CIh) {
            C2228071CIj c2228071CIjNewBuilder = c2228051CIh.newBuilder();
            c2228071CIjNewBuilder.LIZLLL = C2227501CGe.ADAPTER.redact(c2228071CIjNewBuilder.LIZLLL);
            C1CIG c1cig = c2228071CIjNewBuilder.LJ;
            if (c1cig != null) {
                c2228071CIjNewBuilder.LJ = C1CIG.ADAPTER.redact(c1cig);
            }
            c2228071CIjNewBuilder.clearUnknownFields();
            return c2228071CIjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228051CIh c2228051CIh) {
            C2228051CIh c2228051CIh2 = c2228051CIh;
            C2227501CGe.ADAPTER.encodeWithTag(protoWriter, 1, c2228051CIh2.param);
            C1CIG.ADAPTER.encodeWithTag(protoWriter, 2, c2228051CIh2.callback);
            protoWriter.writeBytes(c2228051CIh2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 2)
    public final C1CIG callback;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCancelApplyParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2227501CGe param;

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
    public C2228071CIj newBuilder() {
        C2228071CIj c2228071CIj = new C2228071CIj();
        c2228071CIj.LIZLLL = this.param;
        c2228071CIj.LJ = this.callback;
        c2228071CIj.addUnknownFields(unknownFields());
        return c2228071CIj;
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
        sb.replace(0, 2, "FuncParamsXe016399a208a6dd6{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228051CIh)) {
            return false;
        }
        C2228051CIh c2228051CIh = (C2228051CIh) obj;
        if (unknownFields().equals(c2228051CIh.unknownFields()) && this.param.equals(c2228051CIh.param) && C1516540pZE.LJ(this.callback, c2228051CIh.callback)) {
            return true;
        }
        return false;
    }

    public C2228051CIh(C2227501CGe c2227501CGe, C1CIG c1cig) {
        this(c2227501CGe, c1cig, ByteString.EMPTY);
    }

    public C2228051CIh(C2227501CGe c2227501CGe, C1CIG c1cig, ByteString byteString) {
        super(ADAPTER, byteString);
        this.param = c2227501CGe;
        this.callback = c1cig;
    }
}
