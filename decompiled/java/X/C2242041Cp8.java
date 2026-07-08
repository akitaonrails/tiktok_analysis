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

/* JADX INFO: renamed from: X.1Cp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242041Cp8 extends Message<C2242041Cp8, C2242061CpA> {
    public static final ProtoAdapter<C2242041Cp8> ADAPTER = new ProtoAdapter<C2242041Cp8>() { // from class: X.1Cp9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242041Cp8 decode(ProtoReader protoReader) {
            C2242061CpA c2242061CpA = new C2242061CpA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 10) {
                            if (iNextTag != 11) {
                                if (iNextTag != 201) {
                                    if (iNextTag != 202) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2242061CpA.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2242061CpA.LJII = C2241571CoN.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2242061CpA.LJI = C1CH0.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2242061CpA.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2242061CpA.LJ = C2242211CpP.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2242061CpA.LIZLLL = C2242071CpB.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242061CpA.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242041Cp8 c2242041Cp8) {
            C2242041Cp8 c2242041Cp82 = c2242041Cp8;
            return C2242071CpB.ADAPTER.encodedSizeWithTag(1, c2242041Cp82.dynamic_info) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2242041Cp82.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2242041Cp82.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(201, c2242041Cp82.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(202, c2242041Cp82.resp_base) + c2242041Cp82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242041Cp8 redact(C2242041Cp8 c2242041Cp8) {
            C2242061CpA c2242061CpANewBuilder = c2242041Cp8.newBuilder();
            C2242071CpB c2242071CpB = c2242061CpANewBuilder.LIZLLL;
            if (c2242071CpB != null) {
                c2242061CpANewBuilder.LIZLLL = C2242071CpB.ADAPTER.redact(c2242071CpB);
            }
            C2242211CpP c2242211CpP = c2242061CpANewBuilder.LJ;
            if (c2242211CpP != null) {
                c2242061CpANewBuilder.LJ = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2242061CpANewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2242061CpANewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2242061CpANewBuilder.LJI;
            if (c1ch0 != null) {
                c2242061CpANewBuilder.LJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2242061CpANewBuilder.LJII;
            if (c2241571CoN != null) {
                c2242061CpANewBuilder.LJII = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2242061CpANewBuilder.clearUnknownFields();
            return c2242061CpANewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242041Cp8 c2242041Cp8) {
            C2242041Cp8 c2242041Cp82 = c2242041Cp8;
            C2242071CpB.ADAPTER.encodeWithTag(protoWriter, 1, c2242041Cp82.dynamic_info);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2242041Cp82.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2242041Cp82.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 201, c2242041Cp82.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 202, c2242041Cp82.resp_base);
            protoWriter.writeBytes(c2242041Cp82.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.DynamicInfo#ADAPTER", tag = 1)
    public final C2242071CpB dynamic_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 201)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 202)
    public final C2241571CoN resp_base;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2242071CpB c2242071CpB = this.dynamic_info;
        int iHashCode2 = (iHashCode + (c2242071CpB != null ? c2242071CpB.hashCode() : 0)) * 37;
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
    public C2242061CpA newBuilder() {
        C2242061CpA c2242061CpA = new C2242061CpA();
        c2242061CpA.LIZLLL = this.dynamic_info;
        c2242061CpA.LJ = this.fallback_info;
        c2242061CpA.LJFF = this.preview_hint;
        c2242061CpA.LJI = this.req_base;
        c2242061CpA.LJII = this.resp_base;
        c2242061CpA.addUnknownFields(unknownFields());
        return c2242061CpA;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.dynamic_info != null) {
            sb.append(", dynamic_info=");
            sb.append(this.dynamic_info);
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
        sb.replace(0, 2, "DynamicCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242041Cp8)) {
            return false;
        }
        C2242041Cp8 c2242041Cp8 = (C2242041Cp8) obj;
        if (unknownFields().equals(c2242041Cp8.unknownFields()) && C1516540pZE.LJ(this.dynamic_info, c2242041Cp8.dynamic_info) && C1516540pZE.LJ(this.fallback_info, c2242041Cp8.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2242041Cp8.preview_hint) && C1516540pZE.LJ(this.req_base, c2242041Cp8.req_base) && C1516540pZE.LJ(this.resp_base, c2242041Cp8.resp_base)) {
            return true;
        }
        return false;
    }

    public C2242041Cp8(C2242071CpB c2242071CpB, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2242071CpB, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2242041Cp8(C2242071CpB c2242071CpB, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.dynamic_info = c2242071CpB;
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
