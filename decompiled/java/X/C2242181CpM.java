package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242181CpM extends Message<C2242181CpM, C2242241CpS> {
    public static final ProtoAdapter<C2242181CpM> ADAPTER = new ProtoAdapter<C2242181CpM>() { // from class: X.1CpN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242181CpM decode(ProtoReader protoReader) {
            C2242241CpS c2242241CpS = new C2242241CpS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2242241CpS.LIZLLL = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2242241CpS.LJ = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2242241CpS.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2242241CpS.LJI = C2244321Cso.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2242241CpS.LJII = C2242201CpO.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2242241CpS.LJIIIIZZ = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2242241CpS.LJIIIZ = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 199:
                                    c2242241CpS.LJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                                    break;
                                case 200:
                                    c2242241CpS.LJIIJJI = C1CH0.ADAPTER.decode(protoReader);
                                    break;
                                case 201:
                                    c2242241CpS.LJIIL = C2241571CoN.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2242241CpS.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242241CpS.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242181CpM c2242181CpM) {
            C2242181CpM c2242181CpM2 = c2242181CpM;
            ProtoAdapter<C2244091CsR> protoAdapter = C2244091CsR.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2242181CpM2.image) + protoAdapter.encodedSizeWithTag(2, c2242181CpM2.thumbnail) + C2243941CsC.ADAPTER.encodedSizeWithTag(3, c2242181CpM2.preview_hint) + C2244321Cso.ADAPTER.encodedSizeWithTag(4, c2242181CpM2.link_info) + C2242201CpO.ADAPTER.encodedSizeWithTag(5, c2242181CpM2.fallback) + protoAdapter.encodedSizeWithTag(6, c2242181CpM2.image_mint) + protoAdapter.encodedSizeWithTag(7, c2242181CpM2.thumbnail_mint) + ProtoAdapter.BYTES.encodedSizeWithTag(199, c2242181CpM2.extra_content) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2242181CpM2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2242181CpM2.resp_base) + c2242181CpM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242181CpM redact(C2242181CpM c2242181CpM) {
            C2242241CpS c2242241CpSNewBuilder = c2242181CpM.newBuilder();
            C2244091CsR c2244091CsR = c2242241CpSNewBuilder.LIZLLL;
            if (c2244091CsR != null) {
                c2242241CpSNewBuilder.LIZLLL = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2244091CsR c2244091CsR2 = c2242241CpSNewBuilder.LJ;
            if (c2244091CsR2 != null) {
                c2242241CpSNewBuilder.LJ = C2244091CsR.ADAPTER.redact(c2244091CsR2);
            }
            C2243941CsC c2243941CsC = c2242241CpSNewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2242241CpSNewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C2244321Cso c2244321Cso = c2242241CpSNewBuilder.LJI;
            if (c2244321Cso != null) {
                c2242241CpSNewBuilder.LJI = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2242201CpO c2242201CpO = c2242241CpSNewBuilder.LJII;
            if (c2242201CpO != null) {
                c2242241CpSNewBuilder.LJII = C2242201CpO.ADAPTER.redact(c2242201CpO);
            }
            C2244091CsR c2244091CsR3 = c2242241CpSNewBuilder.LJIIIIZZ;
            if (c2244091CsR3 != null) {
                c2242241CpSNewBuilder.LJIIIIZZ = C2244091CsR.ADAPTER.redact(c2244091CsR3);
            }
            C2244091CsR c2244091CsR4 = c2242241CpSNewBuilder.LJIIIZ;
            if (c2244091CsR4 != null) {
                c2242241CpSNewBuilder.LJIIIZ = C2244091CsR.ADAPTER.redact(c2244091CsR4);
            }
            C1CH0 c1ch0 = c2242241CpSNewBuilder.LJIIJJI;
            if (c1ch0 != null) {
                c2242241CpSNewBuilder.LJIIJJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242241CpSNewBuilder.LJIIL;
            if (c2241571CoN != null) {
                c2242241CpSNewBuilder.LJIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242241CpSNewBuilder.clearUnknownFields();
            return c2242241CpSNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242181CpM c2242181CpM) {
            C2242181CpM c2242181CpM2 = c2242181CpM;
            ProtoAdapter<C2244091CsR> protoAdapter = C2244091CsR.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2242181CpM2.image);
            protoAdapter.encodeWithTag(protoWriter, 2, c2242181CpM2.thumbnail);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 3, c2242181CpM2.preview_hint);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 4, c2242181CpM2.link_info);
            C2242201CpO.ADAPTER.encodeWithTag(protoWriter, 5, c2242181CpM2.fallback);
            protoAdapter.encodeWithTag(protoWriter, 6, c2242181CpM2.image_mint);
            protoAdapter.encodeWithTag(protoWriter, 7, c2242181CpM2.thumbnail_mint);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 199, c2242181CpM2.extra_content);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2242181CpM2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2242181CpM2.resp_base);
            protoWriter.writeBytes(c2242181CpM2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_EXTRA_CONTENT = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 199)
    public final ByteString extra_content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PictureCardFallbackInfo#ADAPTER", tag = 5)
    public final C2242201CpO fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 1)
    public final C2244091CsR image;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 6)
    public final C2244091CsR image_mint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 4)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 3)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 2)
    public final C2244091CsR thumbnail;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 7)
    public final C2244091CsR thumbnail_mint;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244091CsR c2244091CsR = this.image;
        int iHashCode2 = (iHashCode + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR2 = this.thumbnail;
        int iHashCode3 = (iHashCode2 + (c2244091CsR2 != null ? c2244091CsR2.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode4 = (iHashCode3 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode5 = (iHashCode4 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2242201CpO c2242201CpO = this.fallback;
        int iHashCode6 = (iHashCode5 + (c2242201CpO != null ? c2242201CpO.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR3 = this.image_mint;
        int iHashCode7 = (iHashCode6 + (c2244091CsR3 != null ? c2244091CsR3.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR4 = this.thumbnail_mint;
        int iHashCode8 = (iHashCode7 + (c2244091CsR4 != null ? c2244091CsR4.hashCode() : 0)) * 37;
        ByteString byteString = this.extra_content;
        int iHashCode9 = (iHashCode8 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode10 = (iHashCode9 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode11 = iHashCode10 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.squareup.wire.Message
    public C2242241CpS newBuilder() {
        C2242241CpS c2242241CpS = new C2242241CpS();
        c2242241CpS.LIZLLL = this.image;
        c2242241CpS.LJ = this.thumbnail;
        c2242241CpS.LJFF = this.preview_hint;
        c2242241CpS.LJI = this.link_info;
        c2242241CpS.LJII = this.fallback;
        c2242241CpS.LJIIIIZZ = this.image_mint;
        c2242241CpS.LJIIIZ = this.thumbnail_mint;
        c2242241CpS.LJIIJ = this.extra_content;
        c2242241CpS.LJIIJJI = this.req_base;
        c2242241CpS.LJIIL = this.resp_base;
        c2242241CpS.addUnknownFields(unknownFields());
        return c2242241CpS;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.thumbnail != null) {
            sb.append(", thumbnail=");
            sb.append(this.thumbnail);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.link_info != null) {
            sb.append(", link_info=");
            sb.append(this.link_info);
        }
        if (this.fallback != null) {
            sb.append(", fallback=");
            sb.append(this.fallback);
        }
        if (this.image_mint != null) {
            sb.append(", image_mint=");
            sb.append(this.image_mint);
        }
        if (this.thumbnail_mint != null) {
            sb.append(", thumbnail_mint=");
            sb.append(this.thumbnail_mint);
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
        sb.replace(0, 2, "PictureCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242181CpM)) {
            return false;
        }
        C2242181CpM c2242181CpM = (C2242181CpM) obj;
        if (unknownFields().equals(c2242181CpM.unknownFields()) && C1516540pZE.LJ(this.image, c2242181CpM.image) && C1516540pZE.LJ(this.thumbnail, c2242181CpM.thumbnail) && C1516540pZE.LJ(this.preview_hint, c2242181CpM.preview_hint) && C1516540pZE.LJ(this.link_info, c2242181CpM.link_info) && C1516540pZE.LJ(this.fallback, c2242181CpM.fallback) && C1516540pZE.LJ(this.image_mint, c2242181CpM.image_mint) && C1516540pZE.LJ(this.thumbnail_mint, c2242181CpM.thumbnail_mint) && C1516540pZE.LJ(this.extra_content, c2242181CpM.extra_content) && C1516540pZE.LJ(this.req_base, c2242181CpM.req_base) && C1516540pZE.LJ(this.resp_base, c2242181CpM.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242181CpM(C2244091CsR c2244091CsR, C2244091CsR c2244091CsR2, C2243941CsC c2243941CsC, C2244321Cso c2244321Cso, C2242201CpO c2242201CpO, C2244091CsR c2244091CsR3, C2244091CsR c2244091CsR4, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2244091CsR, c2244091CsR2, c2243941CsC, c2244321Cso, c2242201CpO, c2244091CsR3, c2244091CsR4, byteString, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242181CpM(C2244091CsR c2244091CsR, C2244091CsR c2244091CsR2, C2243941CsC c2243941CsC, C2244321Cso c2244321Cso, C2242201CpO c2242201CpO, C2244091CsR c2244091CsR3, C2244091CsR c2244091CsR4, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.image = c2244091CsR;
        this.thumbnail = c2244091CsR2;
        this.preview_hint = c2243941CsC;
        this.link_info = c2244321Cso;
        this.fallback = c2242201CpO;
        this.image_mint = c2244091CsR3;
        this.thumbnail_mint = c2244091CsR4;
        this.extra_content = byteString;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
