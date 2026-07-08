package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242211CpP extends Message<C2242211CpP, C2242261CpU> {
    public static final ProtoAdapter<C2242211CpP> ADAPTER = new ProtoAdapter<C2242211CpP>() { // from class: X.1CpR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242211CpP decode(ProtoReader protoReader) {
            C2242261CpU c2242261CpU = new C2242261CpU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2242261CpU.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2242261CpU.LJFF = C2244321Cso.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2242261CpU.LJ = C2243521CrW.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242261CpU.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242261CpU.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242211CpP c2242211CpP) {
            C2242211CpP c2242211CpP2 = c2242211CpP;
            return C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2242211CpP2.image) + C2243521CrW.ADAPTER.encodedSizeWithTag(2, c2242211CpP2.text) + C2244321Cso.ADAPTER.encodedSizeWithTag(3, c2242211CpP2.link_info) + c2242211CpP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242211CpP redact(C2242211CpP c2242211CpP) {
            C2242261CpU c2242261CpUNewBuilder = c2242211CpP.newBuilder();
            C2244091CsR c2244091CsR = c2242261CpUNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2242261CpUNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2243521CrW c2243521CrW = c2242261CpUNewBuilder.LJ;
            if (c2243521CrW != null) {
                c2242261CpUNewBuilder.LJ = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2244321Cso c2244321Cso = c2242261CpUNewBuilder.LJFF;
            if (c2244321Cso != null) {
                c2242261CpUNewBuilder.LJFF = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            c2242261CpUNewBuilder.clearUnknownFields();
            return c2242261CpUNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242211CpP c2242211CpP) {
            C2242211CpP c2242211CpP2 = c2242211CpP;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2242211CpP2.image);
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 2, c2242211CpP2.text);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 3, c2242211CpP2.link_info);
            protoWriter.writeBytes(c2242211CpP2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 2)
    public final C2243521CrW text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode3 = (iHashCode2 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode4 = iHashCode3 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2242261CpU newBuilder() {
        C2242261CpU c2242261CpU = new C2242261CpU();
        c2242261CpU.LIZLLL = this.image;
        c2242261CpU.LJ = this.text;
        c2242261CpU.LJFF = this.link_info;
        c2242261CpU.addUnknownFields(unknownFields());
        return c2242261CpU;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        sb.replace(0, 2, "FallbackInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242211CpP)) {
            return false;
        }
        C2242211CpP c2242211CpP = (C2242211CpP) obj;
        if (unknownFields().equals(c2242211CpP.unknownFields()) && C1516540pZE.LJ(this.image, c2242211CpP.image) && C1516540pZE.LJ(this.text, c2242211CpP.text) && C1516540pZE.LJ(this.link_info, c2242211CpP.link_info)) {
            return true;
        }
        return false;
    }

    public C2242211CpP(C2244091CsR c2244091CsR, C2243521CrW c2243521CrW, C2244321Cso c2244321Cso) {
        this(c2244091CsR, c2243521CrW, c2244321Cso, ByteString.EMPTY);
    }

    public C2242211CpP(C2244091CsR c2244091CsR, C2243521CrW c2243521CrW, C2244321Cso c2244321Cso, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2244091CsR;
        this.text = c2243521CrW;
        this.link_info = c2244321Cso;
    }
}
