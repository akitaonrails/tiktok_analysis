package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241911Cov extends Message<C2241911Cov, C2241891Cot> {
    public static final ProtoAdapter<C2241911Cov> ADAPTER = new ProtoAdapter<C2241911Cov>() { // from class: X.1Cou
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241911Cov decode(ProtoReader protoReader) {
            C2241891Cot c2241891Cot = new C2241891Cot();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    switch (iNextTag) {
                                        case 200:
                                            c2241891Cot.LJII = ProtoAdapter.BYTES.decode(protoReader);
                                            break;
                                        case 201:
                                            c2241891Cot.LJIIIIZZ = C1CH0.ADAPTER.decode(protoReader);
                                            break;
                                        case 202:
                                            c2241891Cot.LJIIIZ = C2241571CoN.ADAPTER.decode(protoReader);
                                            break;
                                        default:
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2241891Cot.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                                } else {
                                    c2241891Cot.LJI = C2242211CpP.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2241891Cot.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2241891Cot.LJ.add(C2244321Cso.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2241891Cot.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241891Cot.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241911Cov c2241911Cov) {
            C2241911Cov c2241911Cov2 = c2241911Cov;
            return C2243521CrW.ADAPTER.encodedSizeWithTag(1, c2241911Cov2.text) + C2244321Cso.ADAPTER.asRepeated().encodedSizeWithTag(2, c2241911Cov2.link_infos) + C2243941CsC.ADAPTER.encodedSizeWithTag(3, c2241911Cov2.preview_hint) + C2242211CpP.ADAPTER.encodedSizeWithTag(4, c2241911Cov2.fallback_info) + ProtoAdapter.BYTES.encodedSizeWithTag(200, c2241911Cov2.extra_content) + C1CH0.ADAPTER.encodedSizeWithTag(201, c2241911Cov2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(202, c2241911Cov2.resp_base) + c2241911Cov2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241911Cov redact(C2241911Cov c2241911Cov) {
            C2241891Cot c2241891CotNewBuilder = c2241911Cov.newBuilder();
            C2243521CrW c2243521CrW = c2241891CotNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2241891CotNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C1516540pZE.LJIIIZ(c2241891CotNewBuilder.LJ, C2244321Cso.ADAPTER);
            C2243941CsC c2243941CsC = c2241891CotNewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2241891CotNewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C2242211CpP c2242211CpP = c2241891CotNewBuilder.LJI;
            if (c2242211CpP != null) {
                c2241891CotNewBuilder.LJI = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C1CH0 c1ch0 = c2241891CotNewBuilder.LJIIIIZZ;
            if (c1ch0 != null) {
                c2241891CotNewBuilder.LJIIIIZZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241891CotNewBuilder.LJIIIZ;
            if (c2241571CoN != null) {
                c2241891CotNewBuilder.LJIIIZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241891CotNewBuilder.clearUnknownFields();
            return c2241891CotNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241911Cov c2241911Cov) {
            C2241911Cov c2241911Cov2 = c2241911Cov;
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 1, c2241911Cov2.text);
            C2244321Cso.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2241911Cov2.link_infos);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 3, c2241911Cov2.preview_hint);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 4, c2241911Cov2.fallback_info);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 200, c2241911Cov2.extra_content);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 201, c2241911Cov2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 202, c2241911Cov2.resp_base);
            protoWriter.writeBytes(c2241911Cov2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_EXTRA_CONTENT = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 200)
    public final ByteString extra_content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = 4)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2244321Cso> link_infos;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 3)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 201)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 202)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW text;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243521CrW c2243521CrW = this.text;
        int iHashCode2 = (((iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37) + this.link_infos.hashCode()) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode3 = (iHashCode2 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode4 = (iHashCode3 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        ByteString byteString = this.extra_content;
        int iHashCode5 = (iHashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode6 = (iHashCode5 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode7 = iHashCode6 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2241891Cot newBuilder() {
        C2241891Cot c2241891Cot = new C2241891Cot();
        c2241891Cot.LIZLLL = this.text;
        c2241891Cot.LJ = C1516540pZE.LIZJ("link_infos", this.link_infos);
        c2241891Cot.LJFF = this.preview_hint;
        c2241891Cot.LJI = this.fallback_info;
        c2241891Cot.LJII = this.extra_content;
        c2241891Cot.LJIIIIZZ = this.req_base;
        c2241891Cot.LJIIIZ = this.resp_base;
        c2241891Cot.addUnknownFields(unknownFields());
        return c2241891Cot;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        if (!this.link_infos.isEmpty()) {
            sb.append(", link_infos=");
            sb.append(this.link_infos);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
        }
        if (this.extra_content != null) {
            sb.append(", extra_content=");
            sb.append(this.extra_content);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "BubbleCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241911Cov)) {
            return false;
        }
        C2241911Cov c2241911Cov = (C2241911Cov) obj;
        if (unknownFields().equals(c2241911Cov.unknownFields()) && C1516540pZE.LJ(this.text, c2241911Cov.text) && this.link_infos.equals(c2241911Cov.link_infos) && C1516540pZE.LJ(this.preview_hint, c2241911Cov.preview_hint) && C1516540pZE.LJ(this.fallback_info, c2241911Cov.fallback_info) && C1516540pZE.LJ(this.extra_content, c2241911Cov.extra_content) && C1516540pZE.LJ(this.req_base, c2241911Cov.req_base) && C1516540pZE.LJ(this.resp_base, c2241911Cov.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241911Cov(C2243521CrW c2243521CrW, List<C2244321Cso> list, C2243941CsC c2243941CsC, C2242211CpP c2242211CpP, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2243521CrW, list, c2243941CsC, c2242211CpP, byteString, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241911Cov(C2243521CrW c2243521CrW, List<C2244321Cso> list, C2243941CsC c2243941CsC, C2242211CpP c2242211CpP, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.text = c2243521CrW;
        this.link_infos = C1516540pZE.LJFF("link_infos", list);
        this.preview_hint = c2243941CsC;
        this.fallback_info = c2242211CpP;
        this.extra_content = byteString;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
