package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Coh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241771Coh extends Message<C2241771Coh, C2241741Coe> {
    public static final ProtoAdapter<C2241771Coh> ADAPTER = new ProtoAdapter<C2241771Coh>() { // from class: X.1Coj
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241771Coh decode(ProtoReader protoReader) {
            C2241741Coe c2241741Coe = new C2241741Coe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 10) {
                                            if (iNextTag != 11) {
                                                if (iNextTag != 200) {
                                                    if (iNextTag != 201) {
                                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                        c2241741Coe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                    } else {
                                                        c2241741Coe.LJIIJJI = C2241571CoN.ADAPTER.decode(protoReader);
                                                    }
                                                } else {
                                                    c2241741Coe.LJIIJ = C1CH0.ADAPTER.decode(protoReader);
                                                }
                                            } else {
                                                c2241741Coe.LJIIIZ = C2243941CsC.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2241741Coe.LJIIIIZZ = C2242211CpP.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2241741Coe.LJII.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c2241741Coe.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2241741Coe.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c2241741Coe.LJ = C2241761Cog.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241741Coe.LIZLLL = C2241801Cok.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241741Coe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241771Coh c2241771Coh) {
            C2241771Coh c2241771Coh2 = c2241771Coh;
            int iEncodedSizeWithTag = C2241801Cok.ADAPTER.encodedSizeWithTag(1, c2241771Coh2.user_content) + C2241761Cog.ADAPTER.encodedSizeWithTag(2, c2241771Coh2.system_content);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2241771Coh2.user_invisible) + protoAdapter.encodedSizeWithTag(4, c2241771Coh2.system_invisible) + this.LIZ.encodedSizeWithTag(5, c2241771Coh2.extra) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2241771Coh2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2241771Coh2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241771Coh2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241771Coh2.resp_base) + c2241771Coh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241771Coh redact(C2241771Coh c2241771Coh) {
            C2241741Coe c2241741CoeNewBuilder = c2241771Coh.newBuilder();
            C2241801Cok c2241801Cok = c2241741CoeNewBuilder.LIZLLL;
            if (c2241801Cok != null) {
                c2241741CoeNewBuilder.LIZLLL = C2241801Cok.ADAPTER.redact(c2241801Cok);
            }
            C2241761Cog c2241761Cog = c2241741CoeNewBuilder.LJ;
            if (c2241761Cog != null) {
                c2241741CoeNewBuilder.LJ = C2241761Cog.ADAPTER.redact(c2241761Cog);
            }
            C2242211CpP c2242211CpP = c2241741CoeNewBuilder.LJIIIIZZ;
            if (c2242211CpP != null) {
                c2241741CoeNewBuilder.LJIIIIZZ = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2241741CoeNewBuilder.LJIIIZ;
            if (c2243941CsC != null) {
                c2241741CoeNewBuilder.LJIIIZ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2241741CoeNewBuilder.LJIIJ;
            if (c1ch0 != null) {
                c2241741CoeNewBuilder.LJIIJ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241741CoeNewBuilder.LJIIJJI;
            if (c2241571CoN != null) {
                c2241741CoeNewBuilder.LJIIJJI = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241741CoeNewBuilder.clearUnknownFields();
            return c2241741CoeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241771Coh c2241771Coh) {
            C2241771Coh c2241771Coh2 = c2241771Coh;
            C2241801Cok.ADAPTER.encodeWithTag(protoWriter, 1, c2241771Coh2.user_content);
            C2241761Cog.ADAPTER.encodeWithTag(protoWriter, 2, c2241771Coh2.system_content);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 3, c2241771Coh2.user_invisible);
            protoAdapter.encodeWithTag(protoWriter, 4, c2241771Coh2.system_invisible);
            this.LIZ.encodeWithTag(protoWriter, 5, c2241771Coh2.extra);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2241771Coh2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2241771Coh2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241771Coh2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241771Coh2.resp_base);
            protoWriter.writeBytes(c2241771Coh2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_SYSTEM_INVISIBLE;
    public static final Boolean DEFAULT_USER_INVISIBLE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final Map<String, String> extra;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetSystem#ADAPTER", tag = 2)
    public final C2241761Cog system_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean system_invisible;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetUser#ADAPTER", tag = 1)
    public final C2241801Cok user_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean user_invisible;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_USER_INVISIBLE = bool;
        DEFAULT_SYSTEM_INVISIBLE = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2241801Cok c2241801Cok = this.user_content;
        int iHashCode2 = (iHashCode + (c2241801Cok != null ? c2241801Cok.hashCode() : 0)) * 37;
        C2241761Cog c2241761Cog = this.system_content;
        int iHashCode3 = (iHashCode2 + (c2241761Cog != null ? c2241761Cog.hashCode() : 0)) * 37;
        Boolean bool = this.user_invisible;
        int iHashCode4 = (iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.system_invisible;
        int iHashCode5 = (((iHashCode4 + (bool2 != null ? bool2.hashCode() : 0)) * 37) + this.extra.hashCode()) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode6 = (iHashCode5 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode7 = (iHashCode6 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode8 = (iHashCode7 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode9 = iHashCode8 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public C2241741Coe newBuilder() {
        C2241741Coe c2241741Coe = new C2241741Coe();
        c2241741Coe.LIZLLL = this.user_content;
        c2241741Coe.LJ = this.system_content;
        c2241741Coe.LJFF = this.user_invisible;
        c2241741Coe.LJI = this.system_invisible;
        c2241741Coe.LJII = C1516540pZE.LIZLLL("extra", this.extra);
        c2241741Coe.LJIIIIZZ = this.fallback_info;
        c2241741Coe.LJIIIZ = this.preview_hint;
        c2241741Coe.LJIIJ = this.req_base;
        c2241741Coe.LJIIJJI = this.resp_base;
        c2241741Coe.addUnknownFields(unknownFields());
        return c2241741Coe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_content != null) {
            sb.append(", user_content=");
            sb.append(this.user_content);
        }
        if (this.system_content != null) {
            sb.append(", system_content=");
            sb.append(this.system_content);
        }
        if (this.user_invisible != null) {
            sb.append(", user_invisible=");
            sb.append(this.user_invisible);
        }
        if (this.system_invisible != null) {
            sb.append(", system_invisible=");
            sb.append(this.system_invisible);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
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
        sb.replace(0, 2, "VisualPoetUserCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241771Coh)) {
            return false;
        }
        C2241771Coh c2241771Coh = (C2241771Coh) obj;
        if (unknownFields().equals(c2241771Coh.unknownFields()) && C1516540pZE.LJ(this.user_content, c2241771Coh.user_content) && C1516540pZE.LJ(this.system_content, c2241771Coh.system_content) && C1516540pZE.LJ(this.user_invisible, c2241771Coh.user_invisible) && C1516540pZE.LJ(this.system_invisible, c2241771Coh.system_invisible) && this.extra.equals(c2241771Coh.extra) && C1516540pZE.LJ(this.fallback_info, c2241771Coh.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2241771Coh.preview_hint) && C1516540pZE.LJ(this.req_base, c2241771Coh.req_base) && C1516540pZE.LJ(this.resp_base, c2241771Coh.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241771Coh(C2241801Cok c2241801Cok, C2241761Cog c2241761Cog, Boolean bool, Boolean bool2, Map<String, String> map, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2241801Cok, c2241761Cog, bool, bool2, map, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241771Coh(C2241801Cok c2241801Cok, C2241761Cog c2241761Cog, Boolean bool, Boolean bool2, Map<String, String> map, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_content = c2241801Cok;
        this.system_content = c2241761Cog;
        this.user_invisible = bool;
        this.system_invisible = bool2;
        this.extra = C1516540pZE.LJI("extra", map);
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
