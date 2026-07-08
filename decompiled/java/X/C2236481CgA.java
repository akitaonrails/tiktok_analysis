package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236481CgA extends Message<C2236481CgA, C2236501CgC> {
    public static final ProtoAdapter<C2236481CgA> ADAPTER = new ProtoAdapter<C2236481CgA>() { // from class: X.1CgB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236481CgA decode(ProtoReader protoReader) {
            C2236501CgC c2236501CgC = new C2236501CgC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2236501CgC.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2236501CgC.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c2236501CgC.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2236501CgC.LIZLLL = C2236511CgD.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236501CgC.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236481CgA c2236481CgA) {
            C2236481CgA c2236481CgA2 = c2236481CgA;
            return C2236511CgD.ADAPTER.encodedSizeWithTag(1, c2236481CgA2.param) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2236481CgA2.rsp_json) + ProtoAdapter.BYTES.encodedSizeWithTag(3, c2236481CgA2.rsp_pb) + c2236481CgA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236481CgA redact(C2236481CgA c2236481CgA) {
            C2236501CgC c2236501CgCNewBuilder = c2236481CgA.newBuilder();
            c2236501CgCNewBuilder.LIZLLL = C2236511CgD.ADAPTER.redact(c2236501CgCNewBuilder.LIZLLL);
            c2236501CgCNewBuilder.clearUnknownFields();
            return c2236501CgCNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236481CgA c2236481CgA) {
            C2236481CgA c2236481CgA2 = c2236481CgA;
            C2236511CgD.ADAPTER.encodeWithTag(protoWriter, 1, c2236481CgA2.param);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2236481CgA2.rsp_json);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, c2236481CgA2.rsp_pb);
            protoWriter.writeBytes(c2236481CgA2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_RSP_PB = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPermitParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2236511CgD param;

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
    public C2236501CgC newBuilder() {
        C2236501CgC c2236501CgC = new C2236501CgC();
        c2236501CgC.LIZLLL = this.param;
        c2236501CgC.LJ = this.rsp_json;
        c2236501CgC.LJFF = this.rsp_pb;
        c2236501CgC.addUnknownFields(unknownFields());
        return c2236501CgC;
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
        sb.replace(0, 2, "FuncParamsX21429df7bc3d2fbe{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236481CgA)) {
            return false;
        }
        C2236481CgA c2236481CgA = (C2236481CgA) obj;
        if (unknownFields().equals(c2236481CgA.unknownFields()) && this.param.equals(c2236481CgA.param) && C1516540pZE.LJ(this.rsp_json, c2236481CgA.rsp_json) && C1516540pZE.LJ(this.rsp_pb, c2236481CgA.rsp_pb)) {
            return true;
        }
        return false;
    }

    public C2236481CgA(C2236511CgD c2236511CgD, String str, ByteString byteString) {
        this(c2236511CgD, str, byteString, ByteString.EMPTY);
    }

    public C2236481CgA(C2236511CgD c2236511CgD, String str, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.param = c2236511CgD;
        this.rsp_json = str;
        this.rsp_pb = byteString;
    }
}
