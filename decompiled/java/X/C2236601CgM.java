package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236601CgM extends Message<C2236601CgM, C2236621CgO> {
    public static final ProtoAdapter<C2236601CgM> ADAPTER = new ProtoAdapter<C2236601CgM>() { // from class: X.1CgN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236601CgM decode(ProtoReader protoReader) {
            C2236621CgO c2236621CgO = new C2236621CgO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2236621CgO.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2236621CgO.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c2236621CgO.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2236621CgO.LIZLLL = C2236631CgP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236621CgO.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236601CgM c2236601CgM) {
            C2236601CgM c2236601CgM2 = c2236601CgM;
            return C2236631CgP.ADAPTER.encodedSizeWithTag(1, c2236601CgM2.param) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2236601CgM2.rsp_json) + ProtoAdapter.BYTES.encodedSizeWithTag(3, c2236601CgM2.rsp_pb) + c2236601CgM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236601CgM redact(C2236601CgM c2236601CgM) {
            C2236621CgO c2236621CgONewBuilder = c2236601CgM.newBuilder();
            c2236621CgONewBuilder.LIZLLL = C2236631CgP.ADAPTER.redact(c2236621CgONewBuilder.LIZLLL);
            c2236621CgONewBuilder.clearUnknownFields();
            return c2236621CgONewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236601CgM c2236601CgM) {
            C2236601CgM c2236601CgM2 = c2236601CgM;
            C2236631CgP.ADAPTER.encodeWithTag(protoWriter, 1, c2236601CgM2.param);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2236601CgM2.rsp_json);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, c2236601CgM2.rsp_pb);
            protoWriter.writeBytes(c2236601CgM2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_RSP_PB = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicApplyParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236631CgP param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String rsp_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 3)
    public final ByteString rsp_pb;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.param.hashCode()) * 37;
        String str = this.rsp_json;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.rsp_pb;
        int iHashCode3 = iHashCode2 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2236621CgO newBuilder() {
        C2236621CgO c2236621CgO = new C2236621CgO();
        c2236621CgO.LIZLLL = this.param;
        c2236621CgO.LJ = this.rsp_json;
        c2236621CgO.LJFF = this.rsp_pb;
        c2236621CgO.addUnknownFields(unknownFields());
        return c2236621CgO;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", param=");
        sb.append(this.param);
        if (this.rsp_json != null) {
            sb.append(", rsp_json=");
            sb.append(this.rsp_json);
        }
        if (this.rsp_pb != null) {
            sb.append(", rsp_pb=");
            sb.append(this.rsp_pb);
        }
        sb.replace(0, 2, "FuncParamsX9679c44fd4788951{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236601CgM)) {
            return false;
        }
        C2236601CgM c2236601CgM = (C2236601CgM) obj;
        if (unknownFields().equals(c2236601CgM.unknownFields()) && this.param.equals(c2236601CgM.param) && C1516540pZE.LJ(this.rsp_json, c2236601CgM.rsp_json) && C1516540pZE.LJ(this.rsp_pb, c2236601CgM.rsp_pb)) {
            return true;
        }
        return false;
    }

    public C2236601CgM(C2236631CgP c2236631CgP, String str, ByteString byteString) {
        this(c2236631CgP, str, byteString, ByteString.EMPTY);
    }

    public C2236601CgM(C2236631CgP c2236631CgP, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.param = c2236631CgP;
        this.rsp_json = str;
        this.rsp_pb = byteString;
    }
}
