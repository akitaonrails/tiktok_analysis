package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243301CrA extends Message<C2243301CrA, C2243391CrJ> {
    public static final ProtoAdapter<C2243301CrA> ADAPTER = new ProtoAdapter<C2243301CrA>() { // from class: X.1CrC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243301CrA decode(ProtoReader protoReader) {
            C2243391CrJ c2243391CrJ = new C2243391CrJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 6) {
                                        if (iNextTag != 200) {
                                            if (iNextTag != 201) {
                                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                c2243391CrJ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            } else {
                                                c2243391CrJ.LJIIIZ = C2241571CoN.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2243391CrJ.LJIIIIZZ = C1CH0.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2243391CrJ.LJII = C2244321Cso.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2243391CrJ.LJI.add(C2243341CrE.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c2243391CrJ.LJFF = C2244101CsS.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243391CrJ.LJ = C2243331CrD.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243391CrJ.LIZLLL = C2243361CrG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243391CrJ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243301CrA c2243301CrA) {
            C2243301CrA c2243301CrA2 = c2243301CrA;
            return C2243361CrG.ADAPTER.encodedSizeWithTag(1, c2243301CrA2.title) + C2243331CrD.ADAPTER.encodedSizeWithTag(2, c2243301CrA2.content) + C2244101CsS.ADAPTER.encodedSizeWithTag(3, c2243301CrA2.video) + C2243341CrE.ADAPTER.asRepeated().encodedSizeWithTag(4, c2243301CrA2.buttons) + C2244321Cso.ADAPTER.encodedSizeWithTag(6, c2243301CrA2.link_info) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2243301CrA2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2243301CrA2.resp_base) + c2243301CrA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243301CrA redact(C2243301CrA c2243301CrA) {
            C2243391CrJ c2243391CrJNewBuilder = c2243301CrA.newBuilder();
            C2243361CrG c2243361CrG = c2243391CrJNewBuilder.LIZLLL;
            if (c2243361CrG != null) {
                c2243391CrJNewBuilder.LIZLLL = C2243361CrG.ADAPTER.redact(c2243361CrG);
            }
            C2243331CrD c2243331CrD = c2243391CrJNewBuilder.LJ;
            if (c2243331CrD != null) {
                c2243391CrJNewBuilder.LJ = C2243331CrD.ADAPTER.redact(c2243331CrD);
            }
            C2244101CsS c2244101CsS = c2243391CrJNewBuilder.LJFF;
            if (c2244101CsS != null) {
                c2243391CrJNewBuilder.LJFF = C2244101CsS.ADAPTER.redact(c2244101CsS);
            }
            C1516540pZE.LJIIIZ(c2243391CrJNewBuilder.LJI, C2243341CrE.ADAPTER);
            C2244321Cso c2244321Cso = c2243391CrJNewBuilder.LJII;
            if (c2244321Cso != null) {
                c2243391CrJNewBuilder.LJII = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C1CH0 c1ch0 = c2243391CrJNewBuilder.LJIIIIZZ;
            if (c1ch0 != null) {
                c2243391CrJNewBuilder.LJIIIIZZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2243391CrJNewBuilder.LJIIIZ;
            if (c2241571CoN != null) {
                c2243391CrJNewBuilder.LJIIIZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2243391CrJNewBuilder.clearUnknownFields();
            return c2243391CrJNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243301CrA c2243301CrA) {
            C2243301CrA c2243301CrA2 = c2243301CrA;
            C2243361CrG.ADAPTER.encodeWithTag(protoWriter, 1, c2243301CrA2.title);
            C2243331CrD.ADAPTER.encodeWithTag(protoWriter, 2, c2243301CrA2.content);
            C2244101CsS.ADAPTER.encodeWithTag(protoWriter, 3, c2243301CrA2.video);
            C2243341CrE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2243301CrA2.buttons);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 6, c2243301CrA2.link_info);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2243301CrA2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2243301CrA2.resp_base);
            protoWriter.writeBytes(c2243301CrA2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCardButton#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C2243341CrE> buttons;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCardContent#ADAPTER", tag = 2)
    public final C2243331CrD content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 6)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCardTitle#ADAPTER", tag = 1)
    public final C2243361CrG title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", tag = 3)
    public final C2244101CsS video;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243361CrG c2243361CrG = this.title;
        int iHashCode2 = (iHashCode + (c2243361CrG != null ? c2243361CrG.hashCode() : 0)) * 37;
        C2243331CrD c2243331CrD = this.content;
        int iHashCode3 = (iHashCode2 + (c2243331CrD != null ? c2243331CrD.hashCode() : 0)) * 37;
        C2244101CsS c2244101CsS = this.video;
        int iHashCode4 = (((iHashCode3 + (c2244101CsS != null ? c2244101CsS.hashCode() : 0)) * 37) + this.buttons.hashCode()) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode5 = (iHashCode4 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode6 = (iHashCode5 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode7 = iHashCode6 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2243391CrJ newBuilder() {
        C2243391CrJ c2243391CrJ = new C2243391CrJ();
        c2243391CrJ.LIZLLL = this.title;
        c2243391CrJ.LJ = this.content;
        c2243391CrJ.LJFF = this.video;
        c2243391CrJ.LJI = C1516540pZE.LIZJ("buttons", this.buttons);
        c2243391CrJ.LJII = this.link_info;
        c2243391CrJ.LJIIIIZZ = this.req_base;
        c2243391CrJ.LJIIIZ = this.resp_base;
        c2243391CrJ.addUnknownFields(unknownFields());
        return c2243391CrJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (!this.buttons.isEmpty()) {
            sb.append(", buttons=");
            sb.append(this.buttons);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "InfoCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243301CrA)) {
            return false;
        }
        C2243301CrA c2243301CrA = (C2243301CrA) obj;
        if (unknownFields().equals(c2243301CrA.unknownFields()) && C1516540pZE.LJ(this.title, c2243301CrA.title) && C1516540pZE.LJ(this.content, c2243301CrA.content) && C1516540pZE.LJ(this.video, c2243301CrA.video) && this.buttons.equals(c2243301CrA.buttons) && C1516540pZE.LJ(this.link_info, c2243301CrA.link_info) && C1516540pZE.LJ(this.req_base, c2243301CrA.req_base) && C1516540pZE.LJ(this.resp_base, c2243301CrA.resp_base)) {
            return true;
        }
        return false;
    }

    public C2243301CrA(C2243361CrG c2243361CrG, C2243331CrD c2243331CrD, C2244101CsS c2244101CsS, List<C2243341CrE> list, C2244321Cso c2244321Cso, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2243361CrG, c2243331CrD, c2244101CsS, list, c2244321Cso, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2243301CrA(C2243361CrG c2243361CrG, C2243331CrD c2243331CrD, C2244101CsS c2244101CsS, List<C2243341CrE> list, C2244321Cso c2244321Cso, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = c2243361CrG;
        this.content = c2243331CrD;
        this.video = c2244101CsS;
        this.buttons = C1516540pZE.LJFF("buttons", list);
        this.link_info = c2244321Cso;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
