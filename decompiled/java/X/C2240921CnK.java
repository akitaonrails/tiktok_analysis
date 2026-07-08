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

/* JADX INFO: renamed from: X.1CnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240921CnK extends Message<C2240921CnK, C2240911CnJ> {
    public static final ProtoAdapter<C2240921CnK> ADAPTER = new ProtoAdapter<C2240921CnK>() { // from class: X.1CnL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240921CnK decode(ProtoReader protoReader) {
            C2240911CnJ c2240911CnJ = new C2240911CnJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 10) {
                                if (iNextTag != 11) {
                                    if (iNextTag != 200) {
                                        if (iNextTag != 201) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2240911CnJ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c2240911CnJ.LJIIIIZZ = C2241571CoN.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2240911CnJ.LJII = C1CH0.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2240911CnJ.LJI = C2243941CsC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2240911CnJ.LJFF = C2242211CpP.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2240911CnJ.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2240911CnJ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240911CnJ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240921CnK c2240921CnK) {
            C2240921CnK c2240921CnK2 = c2240921CnK;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2240921CnK2.business_native_info) + protoAdapter.encodedSizeWithTag(2, c2240921CnK2.business_id) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2240921CnK2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2240921CnK2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2240921CnK2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2240921CnK2.resp_base) + c2240921CnK2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240921CnK redact(C2240921CnK c2240921CnK) {
            C2240911CnJ c2240911CnJNewBuilder = c2240921CnK.newBuilder();
            C2242211CpP c2242211CpP = c2240911CnJNewBuilder.LJFF;
            if (c2242211CpP != null) {
                c2240911CnJNewBuilder.LJFF = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2240911CnJNewBuilder.LJI;
            if (c2243941CsC != null) {
                c2240911CnJNewBuilder.LJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2240911CnJNewBuilder.LJII;
            if (c1ch0 != null) {
                c2240911CnJNewBuilder.LJII = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2240911CnJNewBuilder.LJIIIIZZ;
            if (c2241571CoN != null) {
                c2240911CnJNewBuilder.LJIIIIZZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2240911CnJNewBuilder.clearUnknownFields();
            return c2240911CnJNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240921CnK c2240921CnK) {
            C2240921CnK c2240921CnK2 = c2240921CnK;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2240921CnK2.business_native_info);
            protoAdapter.encodeWithTag(protoWriter, 2, c2240921CnK2.business_id);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2240921CnK2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2240921CnK2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2240921CnK2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2240921CnK2.resp_base);
            protoWriter.writeBytes(c2240921CnK2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String business_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String business_native_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

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
        String str = this.business_native_info;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.business_id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode4 = (iHashCode3 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode5 = (iHashCode4 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode6 = (iHashCode5 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode7 = iHashCode6 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2240911CnJ newBuilder() {
        C2240911CnJ c2240911CnJ = new C2240911CnJ();
        c2240911CnJ.LIZLLL = this.business_native_info;
        c2240911CnJ.LJ = this.business_id;
        c2240911CnJ.LJFF = this.fallback_info;
        c2240911CnJ.LJI = this.preview_hint;
        c2240911CnJ.LJII = this.req_base;
        c2240911CnJ.LJIIIIZZ = this.resp_base;
        c2240911CnJ.addUnknownFields(unknownFields());
        return c2240911CnJ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.business_native_info != null) {
            sb.append(", business_native_info=");
            sb.append(this.business_native_info);
        }
        if (this.business_id != null) {
            sb.append(", business_id=");
            sb.append(this.business_id);
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
        sb.replace(0, 2, "BusinessNativeCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240921CnK)) {
            return false;
        }
        C2240921CnK c2240921CnK = (C2240921CnK) obj;
        if (unknownFields().equals(c2240921CnK.unknownFields()) && C1516540pZE.LJ(this.business_native_info, c2240921CnK.business_native_info) && C1516540pZE.LJ(this.business_id, c2240921CnK.business_id) && C1516540pZE.LJ(this.fallback_info, c2240921CnK.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2240921CnK.preview_hint) && C1516540pZE.LJ(this.req_base, c2240921CnK.req_base) && C1516540pZE.LJ(this.resp_base, c2240921CnK.resp_base)) {
            return true;
        }
        return false;
    }

    public C2240921CnK(String str, String str2, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(str, str2, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2240921CnK(String str, String str2, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.business_native_info = str;
        this.business_id = str2;
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
