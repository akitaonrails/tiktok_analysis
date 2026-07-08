package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240871CnF extends Message<C2240871CnF, C2240891CnH> {
    public static final ProtoAdapter<C2240871CnF> ADAPTER = new ProtoAdapter<C2240871CnF>() { // from class: X.1CnG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240871CnF decode(ProtoReader protoReader) {
            C2240891CnH c2240891CnH = new C2240891CnH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 101) {
                            if (iNextTag != 102) {
                                if (iNextTag != 200) {
                                    if (iNextTag != 201) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2240891CnH.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2240891CnH.LJII = C2241571CoN.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2240891CnH.LJI = C1CH0.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2240891CnH.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2240891CnH.LJ = C2242211CpP.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2240891CnH.LIZLLL = C2227651CGt.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240891CnH.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240871CnF c2240871CnF) {
            C2240871CnF c2240871CnF2 = c2240871CnF;
            return C2227651CGt.ADAPTER.encodedSizeWithTag(1, c2240871CnF2.audio_wave) + C2242211CpP.ADAPTER.encodedSizeWithTag(101, c2240871CnF2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(102, c2240871CnF2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2240871CnF2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2240871CnF2.resp_base) + c2240871CnF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240871CnF redact(C2240871CnF c2240871CnF) {
            C2240891CnH c2240891CnHNewBuilder = c2240871CnF.newBuilder();
            C2227651CGt c2227651CGt = c2240891CnHNewBuilder.LIZLLL;
            if (c2227651CGt != null) {
                c2240891CnHNewBuilder.LIZLLL = C2227651CGt.ADAPTER.redact(c2227651CGt);
            }
            C2242211CpP c2242211CpP = c2240891CnHNewBuilder.LJ;
            if (c2242211CpP != null) {
                c2240891CnHNewBuilder.LJ = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2240891CnHNewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2240891CnHNewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2240891CnHNewBuilder.LJI;
            if (c1ch0 != null) {
                c2240891CnHNewBuilder.LJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2240891CnHNewBuilder.LJII;
            if (c2241571CoN != null) {
                c2240891CnHNewBuilder.LJII = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2240891CnHNewBuilder.clearUnknownFields();
            return c2240891CnHNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240871CnF c2240871CnF) {
            C2240871CnF c2240871CnF2 = c2240871CnF;
            C2227651CGt.ADAPTER.encodeWithTag(protoWriter, 1, c2240871CnF2.audio_wave);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 101, c2240871CnF2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 102, c2240871CnF2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2240871CnF2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2240871CnF2.resp_base);
            protoWriter.writeBytes(c2240871CnF2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AudioCardWaveformInfo#ADAPTER", tag = 1)
    public final C2227651CGt audio_wave;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = 101)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 102)
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
        C2227651CGt c2227651CGt = this.audio_wave;
        int iHashCode2 = (iHashCode + (c2227651CGt != null ? c2227651CGt.hashCode() : 0)) * 37;
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
    public C2240891CnH newBuilder() {
        C2240891CnH c2240891CnH = new C2240891CnH();
        c2240891CnH.LIZLLL = this.audio_wave;
        c2240891CnH.LJ = this.fallback_info;
        c2240891CnH.LJFF = this.preview_hint;
        c2240891CnH.LJI = this.req_base;
        c2240891CnH.LJII = this.resp_base;
        c2240891CnH.addUnknownFields(unknownFields());
        return c2240891CnH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.audio_wave != null) {
            sb.append(", audio_wave=");
            sb.append(this.audio_wave);
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
        sb.replace(0, 2, "AudioCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240871CnF)) {
            return false;
        }
        C2240871CnF c2240871CnF = (C2240871CnF) obj;
        if (unknownFields().equals(c2240871CnF.unknownFields()) && C1516540pZE.LJ(this.audio_wave, c2240871CnF.audio_wave) && C1516540pZE.LJ(this.fallback_info, c2240871CnF.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2240871CnF.preview_hint) && C1516540pZE.LJ(this.req_base, c2240871CnF.req_base) && C1516540pZE.LJ(this.resp_base, c2240871CnF.resp_base)) {
            return true;
        }
        return false;
    }

    public C2240871CnF(C2227651CGt c2227651CGt, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2227651CGt, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2240871CnF(C2227651CGt c2227651CGt, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.audio_wave = c2227651CGt;
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
