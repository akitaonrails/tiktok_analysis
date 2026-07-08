package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cqk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243041Cqk extends Message<C2243041Cqk, C2243101Cqq> {
    public static final ProtoAdapter<C2243041Cqk> ADAPTER = new ProtoAdapter<C2243041Cqk>() { // from class: X.1Cql
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243041Cqk decode(ProtoReader protoReader) {
            C2243101Cqq c2243101Cqq = new C2243101Cqq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 200) {
                                        if (iNextTag != 201) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2243101Cqq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c2243101Cqq.LJIIIIZZ = C2241571CoN.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2243101Cqq.LJII = C1CH0.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2243101Cqq.LJI = C2243941CsC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2243101Cqq.LJFF = C2244321Cso.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2243101Cqq.LJ.add(C2244101CsS.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2243101Cqq.LIZLLL = C2243061Cqm.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243101Cqq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243041Cqk c2243041Cqk) {
            C2243041Cqk c2243041Cqk2 = c2243041Cqk;
            return C2243061Cqm.ADAPTER.encodedSizeWithTag(1, c2243041Cqk2.title) + C2244101CsS.ADAPTER.asRepeated().encodedSizeWithTag(2, c2243041Cqk2.videos) + C2244321Cso.ADAPTER.encodedSizeWithTag(3, c2243041Cqk2.link_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(4, c2243041Cqk2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2243041Cqk2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2243041Cqk2.resp_base) + c2243041Cqk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243041Cqk redact(C2243041Cqk c2243041Cqk) {
            C2243101Cqq c2243101CqqNewBuilder = c2243041Cqk.newBuilder();
            C2243061Cqm c2243061Cqm = c2243101CqqNewBuilder.LIZLLL;
            if (c2243061Cqm != null) {
                c2243101CqqNewBuilder.LIZLLL = C2243061Cqm.ADAPTER.redact(c2243061Cqm);
            }
            C1516540pZE.LJIIIZ(c2243101CqqNewBuilder.LJ, C2244101CsS.ADAPTER);
            C2244321Cso c2244321Cso = c2243101CqqNewBuilder.LJFF;
            if (c2244321Cso != null) {
                c2243101CqqNewBuilder.LJFF = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2243941CsC c2243941CsC = c2243101CqqNewBuilder.LJI;
            if (c2243941CsC != null) {
                c2243101CqqNewBuilder.LJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2243101CqqNewBuilder.LJII;
            if (c1ch0 != null) {
                c2243101CqqNewBuilder.LJII = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2243101CqqNewBuilder.LJIIIIZZ;
            if (c2241571CoN != null) {
                c2243101CqqNewBuilder.LJIIIIZZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2243101CqqNewBuilder.clearUnknownFields();
            return c2243101CqqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243041Cqk c2243041Cqk) {
            C2243041Cqk c2243041Cqk2 = c2243041Cqk;
            C2243061Cqm.ADAPTER.encodeWithTag(protoWriter, 1, c2243041Cqk2.title);
            C2244101CsS.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2243041Cqk2.videos);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 3, c2243041Cqk2.link_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 4, c2243041Cqk2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2243041Cqk2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2243041Cqk2.resp_base);
            protoWriter.writeBytes(c2243041Cqk2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 4)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImageCardTitle#ADAPTER", tag = 1)
    public final C2243061Cqm title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2244101CsS> videos;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243061Cqm c2243061Cqm = this.title;
        int iHashCode2 = (((iHashCode + (c2243061Cqm != null ? c2243061Cqm.hashCode() : 0)) * 37) + this.videos.hashCode()) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode3 = (iHashCode2 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode4 = (iHashCode3 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode5 = (iHashCode4 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode6 = iHashCode5 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2243101Cqq newBuilder() {
        C2243101Cqq c2243101Cqq = new C2243101Cqq();
        c2243101Cqq.LIZLLL = this.title;
        c2243101Cqq.LJ = C1516540pZE.LIZJ("videos", this.videos);
        c2243101Cqq.LJFF = this.link_info;
        c2243101Cqq.LJI = this.preview_hint;
        c2243101Cqq.LJII = this.req_base;
        c2243101Cqq.LJIIIIZZ = this.resp_base;
        c2243101Cqq.addUnknownFields(unknownFields());
        return c2243101Cqq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (!this.videos.isEmpty()) {
            sb.append(", videos=");
            sb.append(this.videos);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "ImageCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243041Cqk)) {
            return false;
        }
        C2243041Cqk c2243041Cqk = (C2243041Cqk) obj;
        if (unknownFields().equals(c2243041Cqk.unknownFields()) && C1516540pZE.LJ(this.title, c2243041Cqk.title) && this.videos.equals(c2243041Cqk.videos) && C1516540pZE.LJ(this.link_info, c2243041Cqk.link_info) && C1516540pZE.LJ(this.preview_hint, c2243041Cqk.preview_hint) && C1516540pZE.LJ(this.req_base, c2243041Cqk.req_base) && C1516540pZE.LJ(this.resp_base, c2243041Cqk.resp_base)) {
            return true;
        }
        return false;
    }

    public C2243041Cqk(C2243061Cqm c2243061Cqm, List<C2244101CsS> list, C2244321Cso c2244321Cso, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2243061Cqm, list, c2244321Cso, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2243041Cqk(C2243061Cqm c2243061Cqm, List<C2244101CsS> list, C2244321Cso c2244321Cso, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = c2243061Cqm;
        this.videos = C1516540pZE.LJFF("videos", list);
        this.link_info = c2244321Cso;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
