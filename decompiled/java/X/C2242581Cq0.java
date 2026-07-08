package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cq0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242581Cq0 extends Message<C2242581Cq0, C2242631Cq5> {
    public static final ProtoAdapter<C2242581Cq0> ADAPTER = new ProtoAdapter<C2242581Cq0>() { // from class: X.1Cq1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242581Cq0 decode(ProtoReader protoReader) {
            C2242631Cq5 c2242631Cq5 = new C2242631Cq5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2242631Cq5.LIZLLL = C2244101CsS.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2242631Cq5.LJ = C2243941CsC.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2242631Cq5.LJFF = C2244321Cso.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2242631Cq5.LJI = C2242721CqE.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2242631Cq5.LJII = C2242541Cpw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2242631Cq5.LJIIIIZZ = C2243521CrW.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2242631Cq5.LJIIIZ = C2240071Clx.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 199:
                                    c2242631Cq5.LJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                                    break;
                                case 200:
                                    c2242631Cq5.LJIIJJI = C1CH0.ADAPTER.decode(protoReader);
                                    break;
                                case 201:
                                    c2242631Cq5.LJIIL = C2241571CoN.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2242631Cq5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242631Cq5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242581Cq0 c2242581Cq0) {
            C2242581Cq0 c2242581Cq02 = c2242581Cq0;
            return C2244101CsS.ADAPTER.encodedSizeWithTag(1, c2242581Cq02.video) + C2243941CsC.ADAPTER.encodedSizeWithTag(2, c2242581Cq02.preview_hint) + C2244321Cso.ADAPTER.encodedSizeWithTag(3, c2242581Cq02.link_info) + C2242721CqE.ADAPTER.encodedSizeWithTag(4, c2242581Cq02.fallback) + C2242541Cpw.ADAPTER.encodedSizeWithTag(5, c2242581Cq02.user_info) + C2243521CrW.ADAPTER.encodedSizeWithTag(6, c2242581Cq02.top_inline_text) + C2240071Clx.ADAPTER.encodedSizeWithTag(7, c2242581Cq02.highlight_story_info) + ProtoAdapter.BYTES.encodedSizeWithTag(199, c2242581Cq02.extra_content) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2242581Cq02.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2242581Cq02.resp_base) + c2242581Cq02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242581Cq0 redact(C2242581Cq0 c2242581Cq0) {
            C2242631Cq5 c2242631Cq5NewBuilder = c2242581Cq0.newBuilder();
            C2244101CsS c2244101CsS = c2242631Cq5NewBuilder.LIZLLL;
            if (c2244101CsS != null) {
                c2242631Cq5NewBuilder.LIZLLL = C2244101CsS.ADAPTER.redact(c2244101CsS);
            }
            C2243941CsC c2243941CsC = c2242631Cq5NewBuilder.LJ;
            if (c2243941CsC != null) {
                c2242631Cq5NewBuilder.LJ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C2244321Cso c2244321Cso = c2242631Cq5NewBuilder.LJFF;
            if (c2244321Cso != null) {
                c2242631Cq5NewBuilder.LJFF = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2242721CqE c2242721CqE = c2242631Cq5NewBuilder.LJI;
            if (c2242721CqE != null) {
                c2242631Cq5NewBuilder.LJI = C2242721CqE.ADAPTER.redact(c2242721CqE);
            }
            C2242541Cpw c2242541Cpw = c2242631Cq5NewBuilder.LJII;
            if (c2242541Cpw != null) {
                c2242631Cq5NewBuilder.LJII = C2242541Cpw.ADAPTER.redact(c2242541Cpw);
            }
            C2243521CrW c2243521CrW = c2242631Cq5NewBuilder.LJIIIIZZ;
            if (c2243521CrW != null) {
                c2242631Cq5NewBuilder.LJIIIIZZ = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C2240071Clx c2240071Clx = c2242631Cq5NewBuilder.LJIIIZ;
            if (c2240071Clx != null) {
                c2242631Cq5NewBuilder.LJIIIZ = C2240071Clx.ADAPTER.redact(c2240071Clx);
            }
            C1CH0 c1ch0 = c2242631Cq5NewBuilder.LJIIJJI;
            if (c1ch0 != null) {
                c2242631Cq5NewBuilder.LJIIJJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242631Cq5NewBuilder.LJIIL;
            if (c2241571CoN != null) {
                c2242631Cq5NewBuilder.LJIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242631Cq5NewBuilder.clearUnknownFields();
            return c2242631Cq5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242581Cq0 c2242581Cq0) {
            C2242581Cq0 c2242581Cq02 = c2242581Cq0;
            C2244101CsS.ADAPTER.encodeWithTag(protoWriter, 1, c2242581Cq02.video);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 2, c2242581Cq02.preview_hint);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 3, c2242581Cq02.link_info);
            C2242721CqE.ADAPTER.encodeWithTag(protoWriter, 4, c2242581Cq02.fallback);
            C2242541Cpw.ADAPTER.encodeWithTag(protoWriter, 5, c2242581Cq02.user_info);
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 6, c2242581Cq02.top_inline_text);
            C2240071Clx.ADAPTER.encodeWithTag(protoWriter, 7, c2242581Cq02.highlight_story_info);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 199, c2242581Cq02.extra_content);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2242581Cq02.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2242581Cq02.resp_base);
            protoWriter.writeBytes(c2242581Cq02.unknownFields());
        }
    };
    public static final ByteString DEFAULT_EXTRA_CONTENT = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 199)
    public final ByteString extra_content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VideoCardFallbackInfo#ADAPTER", tag = 4)
    public final C2242721CqE fallback;

    @WireField(adapter = "com.bytedance.im.message.template.proto.HighlightStoryInfo#ADAPTER", tag = 7)
    public final C2240071Clx highlight_story_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 3)
    public final C2244321Cso link_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 2)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 6)
    public final C2243521CrW top_inline_text;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", tag = 5)
    public final C2242541Cpw user_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", tag = 1)
    public final C2244101CsS video;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2244101CsS c2244101CsS = this.video;
        int iHashCode2 = (iHashCode + (c2244101CsS != null ? c2244101CsS.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode3 = (iHashCode2 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.link_info;
        int iHashCode4 = (iHashCode3 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2242721CqE c2242721CqE = this.fallback;
        int iHashCode5 = (iHashCode4 + (c2242721CqE != null ? c2242721CqE.hashCode() : 0)) * 37;
        C2242541Cpw c2242541Cpw = this.user_info;
        int iHashCode6 = (iHashCode5 + (c2242541Cpw != null ? c2242541Cpw.hashCode() : 0)) * 37;
        C2243521CrW c2243521CrW = this.top_inline_text;
        int iHashCode7 = (iHashCode6 + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37;
        C2240071Clx c2240071Clx = this.highlight_story_info;
        int iHashCode8 = (iHashCode7 + (c2240071Clx != null ? c2240071Clx.hashCode() : 0)) * 37;
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
    public C2242631Cq5 newBuilder() {
        C2242631Cq5 c2242631Cq5 = new C2242631Cq5();
        c2242631Cq5.LIZLLL = this.video;
        c2242631Cq5.LJ = this.preview_hint;
        c2242631Cq5.LJFF = this.link_info;
        c2242631Cq5.LJI = this.fallback;
        c2242631Cq5.LJII = this.user_info;
        c2242631Cq5.LJIIIIZZ = this.top_inline_text;
        c2242631Cq5.LJIIIZ = this.highlight_story_info;
        c2242631Cq5.LJIIJ = this.extra_content;
        c2242631Cq5.LJIIJJI = this.req_base;
        c2242631Cq5.LJIIL = this.resp_base;
        c2242631Cq5.addUnknownFields(unknownFields());
        return c2242631Cq5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
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
        if (this.user_info != null) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (this.top_inline_text != null) {
            sb.append(", top_inline_text=");
            sb.append(this.top_inline_text);
        }
        if (this.highlight_story_info != null) {
            sb.append(", highlight_story_info=");
            sb.append(this.highlight_story_info);
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
        sb.replace(0, 2, "VideoCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242581Cq0)) {
            return false;
        }
        C2242581Cq0 c2242581Cq0 = (C2242581Cq0) obj;
        if (unknownFields().equals(c2242581Cq0.unknownFields()) && C1516540pZE.LJ(this.video, c2242581Cq0.video) && C1516540pZE.LJ(this.preview_hint, c2242581Cq0.preview_hint) && C1516540pZE.LJ(this.link_info, c2242581Cq0.link_info) && C1516540pZE.LJ(this.fallback, c2242581Cq0.fallback) && C1516540pZE.LJ(this.user_info, c2242581Cq0.user_info) && C1516540pZE.LJ(this.top_inline_text, c2242581Cq0.top_inline_text) && C1516540pZE.LJ(this.highlight_story_info, c2242581Cq0.highlight_story_info) && C1516540pZE.LJ(this.extra_content, c2242581Cq0.extra_content) && C1516540pZE.LJ(this.req_base, c2242581Cq0.req_base) && C1516540pZE.LJ(this.resp_base, c2242581Cq0.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242581Cq0(C2244101CsS c2244101CsS, C2243941CsC c2243941CsC, C2244321Cso c2244321Cso, C2242721CqE c2242721CqE, C2242541Cpw c2242541Cpw, C2243521CrW c2243521CrW, C2240071Clx c2240071Clx, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2244101CsS, c2243941CsC, c2244321Cso, c2242721CqE, c2242541Cpw, c2243521CrW, c2240071Clx, byteString, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242581Cq0(C2244101CsS c2244101CsS, C2243941CsC c2243941CsC, C2244321Cso c2244321Cso, C2242721CqE c2242721CqE, C2242541Cpw c2242541Cpw, C2243521CrW c2243521CrW, C2240071Clx c2240071Clx, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.video = c2244101CsS;
        this.preview_hint = c2243941CsC;
        this.link_info = c2244321Cso;
        this.fallback = c2242721CqE;
        this.user_info = c2242541Cpw;
        this.top_inline_text = c2243521CrW;
        this.highlight_story_info = c2240071Clx;
        this.extra_content = byteString;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
