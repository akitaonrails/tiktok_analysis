package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cpi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242401Cpi extends Message<C2242401Cpi, C2242391Cph> {
    public static final ProtoAdapter<C2242401Cpi> ADAPTER = new ProtoAdapter<C2242401Cpi>() { // from class: X.1Cpj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242401Cpi decode(ProtoReader protoReader) {
            C2242391Cph c2242391Cph = new C2242391Cph();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        if (iNextTag != 201) {
                            switch (iNextTag) {
                                case 1:
                                    c2242391Cph.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                                    break;
                                case 2:
                                    c2242391Cph.LJ = C2242541Cpw.ADAPTER.decode(protoReader);
                                    break;
                                case 3:
                                    c2242391Cph.LJFF = C2243521CrW.ADAPTER.decode(protoReader);
                                    break;
                                case 4:
                                    c2242391Cph.LJI = C2243521CrW.ADAPTER.decode(protoReader);
                                    break;
                                case 5:
                                    c2242391Cph.LJII = C2243521CrW.ADAPTER.decode(protoReader);
                                    break;
                                case 6:
                                    c2242391Cph.LJIIIIZZ = C2244321Cso.ADAPTER.decode(protoReader);
                                    break;
                                case 7:
                                    c2242391Cph.LJIIIZ = C2243941CsC.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2242391Cph.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c2242391Cph.LJIIJJI = C2241571CoN.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242391Cph.LJIIJ = C1CH0.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242391Cph.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242401Cpi c2242401Cpi) {
            C2242401Cpi c2242401Cpi2 = c2242401Cpi;
            int iEncodedSizeWithTag = C2244091CsR.ADAPTER.encodedSizeWithTag(1, c2242401Cpi2.image) + C2242541Cpw.ADAPTER.encodedSizeWithTag(2, c2242401Cpi2.user_info);
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2242401Cpi2.title) + protoAdapter.encodedSizeWithTag(4, c2242401Cpi2.sub_title) + protoAdapter.encodedSizeWithTag(5, c2242401Cpi2.hint_title) + C2244321Cso.ADAPTER.encodedSizeWithTag(6, c2242401Cpi2.link_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(7, c2242401Cpi2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2242401Cpi2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2242401Cpi2.resp_base) + c2242401Cpi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242401Cpi redact(C2242401Cpi c2242401Cpi) {
            C2242391Cph c2242391CphNewBuilder = c2242401Cpi.newBuilder();
            C2244091CsR c2244091CsR = c2242391CphNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2242391CphNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2242541Cpw c2242541Cpw = c2242391CphNewBuilder.LJ;
            if (c2242541Cpw != null) {
                c2242391CphNewBuilder.LJ = C2242541Cpw.ADAPTER.redact(c2242541Cpw);
            }
            C2243521CrW c2243521CrW = c2242391CphNewBuilder.LJFF;
            if (c2243521CrW != null) {
                c2242391CphNewBuilder.LJFF = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2243521CrW c2243521CrW2 = c2242391CphNewBuilder.LJI;
            if (c2243521CrW2 != null) {
                c2242391CphNewBuilder.LJI = C2243521CrW.ADAPTER.redact(c2243521CrW2);
            }
            C2243521CrW c2243521CrW3 = c2242391CphNewBuilder.LJII;
            if (c2243521CrW3 != null) {
                c2242391CphNewBuilder.LJII = C2243521CrW.ADAPTER.redact(c2243521CrW3);
            }
            C2244321Cso c2244321Cso = c2242391CphNewBuilder.LJIIIIZZ;
            if (c2244321Cso != null) {
                c2242391CphNewBuilder.LJIIIIZZ = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2243941CsC c2243941CsC = c2242391CphNewBuilder.LJIIIZ;
            if (c2243941CsC != null) {
                c2242391CphNewBuilder.LJIIIZ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2242391CphNewBuilder.LJIIJ;
            if (c1ch0 != null) {
                c2242391CphNewBuilder.LJIIJ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242391CphNewBuilder.LJIIJJI;
            if (c2241571CoN != null) {
                c2242391CphNewBuilder.LJIIJJI = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242391CphNewBuilder.clearUnknownFields();
            return c2242391CphNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242401Cpi c2242401Cpi) {
            C2242401Cpi c2242401Cpi2 = c2242401Cpi;
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 1, c2242401Cpi2.image);
            C2242541Cpw.ADAPTER.encodeWithTag(protoWriter, 2, c2242401Cpi2.user_info);
            ProtoAdapter<C2243521CrW> protoAdapter = C2243521CrW.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 3, c2242401Cpi2.title);
            protoAdapter.encodeWithTag(protoWriter, 4, c2242401Cpi2.sub_title);
            protoAdapter.encodeWithTag(protoWriter, 5, c2242401Cpi2.hint_title);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 6, c2242401Cpi2.link_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 7, c2242401Cpi2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2242401Cpi2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2242401Cpi2.resp_base);
            protoWriter.writeBytes(c2242401Cpi2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 5)
    public final C2243521CrW hint_title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 6)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 7)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 4)
    public final C2243521CrW sub_title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 3)
    public final C2243521CrW title;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 2)
    public final C2242541Cpw user_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2242541Cpw c2242541Cpw = this.user_info;
        int iHashCode3 = (iHashCode2 + (c2242541Cpw != null ? c2242541Cpw.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.title;
        int iHashCode4 = (iHashCode3 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW2 = this.sub_title;
        int iHashCode5 = (iHashCode4 + (c2243521CrW2 != null ? c2243521CrW2.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW3 = this.hint_title;
        int iHashCode6 = (iHashCode5 + (c2243521CrW3 != null ? c2243521CrW3.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode7 = (iHashCode6 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode8 = (iHashCode7 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode9 = (iHashCode8 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode10 = iHashCode9 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public C2242391Cph newBuilder() {
        C2242391Cph c2242391Cph = new C2242391Cph();
        c2242391Cph.LIZLLL = this.image;
        c2242391Cph.LJ = this.user_info;
        c2242391Cph.LJFF = this.title;
        c2242391Cph.LJI = this.sub_title;
        c2242391Cph.LJII = this.hint_title;
        c2242391Cph.LJIIIIZZ = this.link_info;
        c2242391Cph.LJIIIZ = this.preview_hint;
        c2242391Cph.LJIIJ = this.req_base;
        c2242391Cph.LJIIJJI = this.resp_base;
        c2242391Cph.addUnknownFields(unknownFields());
        return c2242391Cph;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.sub_title != null) {
            sb.append(", sub_title=");
            sb.append(this.sub_title);
        }
        if (this.hint_title != null) {
            sb.append(", hint_title=");
            sb.append(this.hint_title);
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
        sb.replace(0, 2, "PortraitCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242401Cpi)) {
            return false;
        }
        C2242401Cpi c2242401Cpi = (C2242401Cpi) obj;
        if (unknownFields().equals(c2242401Cpi.unknownFields()) && C1516540pZE.LJ(this.image, c2242401Cpi.image) && C1516540pZE.LJ(this.user_info, c2242401Cpi.user_info) && C1516540pZE.LJ(this.title, c2242401Cpi.title) && C1516540pZE.LJ(this.sub_title, c2242401Cpi.sub_title) && C1516540pZE.LJ(this.hint_title, c2242401Cpi.hint_title) && C1516540pZE.LJ(this.link_info, c2242401Cpi.link_info) && C1516540pZE.LJ(this.preview_hint, c2242401Cpi.preview_hint) && C1516540pZE.LJ(this.req_base, c2242401Cpi.req_base) && C1516540pZE.LJ(this.resp_base, c2242401Cpi.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242401Cpi(C2244091CsR c2244091CsR, C2242541Cpw c2242541Cpw, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2243521CrW c2243521CrW3, C2244321Cso c2244321Cso, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2244091CsR, c2242541Cpw, c2243521CrW, c2243521CrW2, c2243521CrW3, c2244321Cso, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242401Cpi(C2244091CsR c2244091CsR, C2242541Cpw c2242541Cpw, C2243521CrW c2243521CrW, C2243521CrW c2243521CrW2, C2243521CrW c2243521CrW3, C2244321Cso c2244321Cso, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image = c2244091CsR;
        this.user_info = c2242541Cpw;
        this.title = c2243521CrW;
        this.sub_title = c2243521CrW2;
        this.hint_title = c2243521CrW3;
        this.link_info = c2244321Cso;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
