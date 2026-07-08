package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242471Cpp extends Message<C2242471Cpp, C2242501Cps> {
    public static final ProtoAdapter<C2242471Cpp> ADAPTER = new ProtoAdapter<C2242471Cpp>() { // from class: X.1Cpq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242471Cpp decode(ProtoReader protoReader) {
            C2242501Cps c2242501Cps = new C2242501Cps();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 10) {
                            if (iNextTag != 11) {
                                if (iNextTag != 200) {
                                    if (iNextTag != 201) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2242501Cps.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2242501Cps.LJII = C2241571CoN.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2242501Cps.LJI = C1CH0.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2242501Cps.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2242501Cps.LJ = C2242211CpP.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242501Cps.LIZLLL = C2242451Cpn.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242501Cps.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242471Cpp c2242471Cpp) {
            C2242471Cpp c2242471Cpp2 = c2242471Cpp;
            return C2242451Cpn.ADAPTER.encodedSizeWithTag(1, c2242471Cpp2.repost) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2242471Cpp2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2242471Cpp2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2242471Cpp2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2242471Cpp2.resp_base) + c2242471Cpp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242471Cpp redact(C2242471Cpp c2242471Cpp) {
            C2242501Cps c2242501CpsNewBuilder = c2242471Cpp.newBuilder();
            C2242451Cpn c2242451Cpn = c2242501CpsNewBuilder.LIZLLL;
            if (c2242451Cpn != null) {
                c2242501CpsNewBuilder.LIZLLL = C2242451Cpn.ADAPTER.redact(c2242451Cpn);
            }
            C2242211CpP c2242211CpP = c2242501CpsNewBuilder.LJ;
            if (c2242211CpP != null) {
                c2242501CpsNewBuilder.LJ = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2242501CpsNewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2242501CpsNewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2242501CpsNewBuilder.LJI;
            if (c1ch0 != null) {
                c2242501CpsNewBuilder.LJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242501CpsNewBuilder.LJII;
            if (c2241571CoN != null) {
                c2242501CpsNewBuilder.LJII = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242501CpsNewBuilder.clearUnknownFields();
            return c2242501CpsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242471Cpp c2242471Cpp) {
            C2242471Cpp c2242471Cpp2 = c2242471Cpp;
            C2242451Cpn.ADAPTER.encodeWithTag(protoWriter, 1, c2242471Cpp2.repost);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2242471Cpp2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2242471Cpp2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2242471Cpp2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2242471Cpp2.resp_base);
            protoWriter.writeBytes(c2242471Cpp2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ShareRepost#ADAPTER", tag = 1)
    public final C2242451Cpn repost;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2242451Cpn c2242451Cpn = this.repost;
        int iHashCode2 = (iHashCode + (c2242451Cpn != null ? c2242451Cpn.hashCode() : 0)) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode3 = (iHashCode2 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
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
    public C2242501Cps newBuilder() {
        C2242501Cps c2242501Cps = new C2242501Cps();
        c2242501Cps.LIZLLL = this.repost;
        c2242501Cps.LJ = this.fallback_info;
        c2242501Cps.LJFF = this.preview_hint;
        c2242501Cps.LJI = this.req_base;
        c2242501Cps.LJII = this.resp_base;
        c2242501Cps.addUnknownFields(unknownFields());
        return c2242501Cps;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.repost != null) {
            sb.append(", repost=");
            sb.append(this.repost);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
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
        sb.replace(0, 2, "ShareRepostCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242471Cpp)) {
            return false;
        }
        C2242471Cpp c2242471Cpp = (C2242471Cpp) obj;
        if (unknownFields().equals(c2242471Cpp.unknownFields()) && C1516540pZE.LJ(this.repost, c2242471Cpp.repost) && C1516540pZE.LJ(this.fallback_info, c2242471Cpp.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2242471Cpp.preview_hint) && C1516540pZE.LJ(this.req_base, c2242471Cpp.req_base) && C1516540pZE.LJ(this.resp_base, c2242471Cpp.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242471Cpp(C2242451Cpn c2242451Cpn, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2242451Cpn, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242471Cpp(C2242451Cpn c2242451Cpn, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.repost = c2242451Cpn;
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
