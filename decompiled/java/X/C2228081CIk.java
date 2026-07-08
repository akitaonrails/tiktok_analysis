package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228081CIk extends Message<C2228081CIk, C2228101CIm> {
    public static final ProtoAdapter<C2228081CIk> ADAPTER = new ProtoAdapter<C2228081CIk>() { // from class: X.1CIl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228081CIk decode(ProtoReader protoReader) {
            C2228101CIm c2228101CIm = new C2228101CIm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2228101CIm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2228101CIm.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c2228101CIm.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2228101CIm.LIZLLL = C2227501CGe.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228101CIm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228081CIk c2228081CIk) {
            C2228081CIk c2228081CIk2 = c2228081CIk;
            return C2227501CGe.ADAPTER.encodedSizeWithTag(1, c2228081CIk2.param) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2228081CIk2.rsp_json) + ProtoAdapter.BYTES.encodedSizeWithTag(3, c2228081CIk2.rsp_pb) + c2228081CIk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228081CIk redact(C2228081CIk c2228081CIk) {
            C2228101CIm c2228101CImNewBuilder = c2228081CIk.newBuilder();
            c2228101CImNewBuilder.LIZLLL = C2227501CGe.ADAPTER.redact(c2228101CImNewBuilder.LIZLLL);
            c2228101CImNewBuilder.clearUnknownFields();
            return c2228101CImNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228081CIk c2228081CIk) {
            C2228081CIk c2228081CIk2 = c2228081CIk;
            C2227501CGe.ADAPTER.encodeWithTag(protoWriter, 1, c2228081CIk2.param);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2228081CIk2.rsp_json);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, c2228081CIk2.rsp_pb);
            protoWriter.writeBytes(c2228081CIk2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_RSP_PB = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCancelApplyParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2227501CGe param;

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
    public C2228101CIm newBuilder() {
        C2228101CIm c2228101CIm = new C2228101CIm();
        c2228101CIm.LIZLLL = this.param;
        c2228101CIm.LJ = this.rsp_json;
        c2228101CIm.LJFF = this.rsp_pb;
        c2228101CIm.addUnknownFields(unknownFields());
        return c2228101CIm;
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
        sb.replace(0, 2, "FuncParamsX323ea56ac6ff4542{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228081CIk)) {
            return false;
        }
        C2228081CIk c2228081CIk = (C2228081CIk) obj;
        if (unknownFields().equals(c2228081CIk.unknownFields()) && this.param.equals(c2228081CIk.param) && C1516540pZE.LJ(this.rsp_json, c2228081CIk.rsp_json) && C1516540pZE.LJ(this.rsp_pb, c2228081CIk.rsp_pb)) {
            return true;
        }
        return false;
    }

    public C2228081CIk(C2227501CGe c2227501CGe, String str, ByteString byteString) {
        this(c2227501CGe, str, byteString, ByteString.EMPTY);
    }

    public C2228081CIk(C2227501CGe c2227501CGe, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.param = c2227501CGe;
        this.rsp_json = str;
        this.rsp_pb = byteString;
    }
}
