package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2240841CnC extends Message<C2240841CnC, C2240851CnD> {
    public static final ProtoAdapter<C2240841CnC> ADAPTER = new ProtoAdapter<C2240841CnC>() { // from class: X.1CnB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240841CnC decode(ProtoReader protoReader) {
            C2240851CnD c2240851CnD = new C2240851CnD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 10) {
                                    if (iNextTag != 11) {
                                        if (iNextTag != 200) {
                                            if (iNextTag != 201) {
                                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                c2240851CnD.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            } else {
                                                c2240851CnD.LJIIIZ = C2241571CoN.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2240851CnD.LJIIIIZZ = C1CH0.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2240851CnD.LJII = C2243941CsC.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2240851CnD.LJI = C2242211CpP.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2240851CnD.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2240851CnD.LJ = EnumC2240801Cn8.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2240851CnD.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2240851CnD.LIZLLL.add(C2240741Cn2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240851CnD.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2240841CnC c2240841CnC) {
            C2240841CnC c2240841CnC2 = c2240841CnC;
            return C2240741Cn2.ADAPTER.asRepeated().encodedSizeWithTag(1, c2240841CnC2.blocks) + EnumC2240801Cn8.ADAPTER.encodedSizeWithTag(2, c2240841CnC2.stream_status) + ProtoAdapter.STRING.encodedSizeWithTag(3, c2240841CnC2.send_server_message_id) + C2242211CpP.ADAPTER.encodedSizeWithTag(10, c2240841CnC2.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(11, c2240841CnC2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2240841CnC2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2240841CnC2.resp_base) + c2240841CnC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2240841CnC redact(C2240841CnC c2240841CnC) {
            C2240851CnD c2240851CnDNewBuilder = c2240841CnC.newBuilder();
            C1516540pZE.LJIIIZ(c2240851CnDNewBuilder.LIZLLL, C2240741Cn2.ADAPTER);
            C2242211CpP c2242211CpP = c2240851CnDNewBuilder.LJI;
            if (c2242211CpP != null) {
                c2240851CnDNewBuilder.LJI = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2240851CnDNewBuilder.LJII;
            if (c2243941CsC != null) {
                c2240851CnDNewBuilder.LJII = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2240851CnDNewBuilder.LJIIIIZZ;
            if (c1ch0 != null) {
                c2240851CnDNewBuilder.LJIIIIZZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2240851CnDNewBuilder.LJIIIZ;
            if (c2241571CoN != null) {
                c2240851CnDNewBuilder.LJIIIZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2240851CnDNewBuilder.clearUnknownFields();
            return c2240851CnDNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2240841CnC c2240841CnC) {
            C2240841CnC c2240841CnC2 = c2240841CnC;
            C2240741Cn2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2240841CnC2.blocks);
            EnumC2240801Cn8.ADAPTER.encodeWithTag(protoWriter, 2, c2240841CnC2.stream_status);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c2240841CnC2.send_server_message_id);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 10, c2240841CnC2.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 11, c2240841CnC2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2240841CnC2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2240841CnC2.resp_base);
            protoWriter.writeBytes(c2240841CnC2.unknownFields());
        }
    };
    public static final EnumC2240801Cn8 DEFAULT_STREAM_STATUS = EnumC2240801Cn8.STREAM_STATUS_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamBlock#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2240741Cn2> blocks;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String send_server_message_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamStatus#ADAPTER", tag = 2)
    public final EnumC2240801Cn8 stream_status;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.blocks.hashCode()) * 37;
        EnumC2240801Cn8 enumC2240801Cn8 = this.stream_status;
        int iHashCode2 = (iHashCode + (enumC2240801Cn8 != null ? enumC2240801Cn8.hashCode() : 0)) * 37;
        String str = this.send_server_message_id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
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
    public C2240851CnD newBuilder() {
        C2240851CnD c2240851CnD = new C2240851CnD();
        c2240851CnD.LIZLLL = C1516540pZE.LIZJ("blocks", this.blocks);
        c2240851CnD.LJ = this.stream_status;
        c2240851CnD.LJFF = this.send_server_message_id;
        c2240851CnD.LJI = this.fallback_info;
        c2240851CnD.LJII = this.preview_hint;
        c2240851CnD.LJIIIIZZ = this.req_base;
        c2240851CnD.LJIIIZ = this.resp_base;
        c2240851CnD.addUnknownFields(unknownFields());
        return c2240851CnD;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.blocks.isEmpty()) {
            sb.append(", blocks=");
            sb.append(this.blocks);
        }
        if (this.stream_status != null) {
            sb.append(", stream_status=");
            sb.append(this.stream_status);
        }
        if (this.send_server_message_id != null) {
            sb.append(", send_server_message_id=");
            sb.append(this.send_server_message_id);
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
        sb.replace(0, 2, "StreamingCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2240841CnC)) {
            return false;
        }
        C2240841CnC c2240841CnC = (C2240841CnC) obj;
        if (unknownFields().equals(c2240841CnC.unknownFields()) && this.blocks.equals(c2240841CnC.blocks) && C1516540pZE.LJ(this.stream_status, c2240841CnC.stream_status) && C1516540pZE.LJ(this.send_server_message_id, c2240841CnC.send_server_message_id) && C1516540pZE.LJ(this.fallback_info, c2240841CnC.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2240841CnC.preview_hint) && C1516540pZE.LJ(this.req_base, c2240841CnC.req_base) && C1516540pZE.LJ(this.resp_base, c2240841CnC.resp_base)) {
            return true;
        }
        return false;
    }

    public C2240841CnC(List<C2240741Cn2> list, EnumC2240801Cn8 enumC2240801Cn8, String str, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(list, enumC2240801Cn8, str, c2242211CpP, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2240841CnC(List<C2240741Cn2> list, EnumC2240801Cn8 enumC2240801Cn8, String str, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.blocks = C1516540pZE.LJFF("blocks", list);
        this.stream_status = enumC2240801Cn8;
        this.send_server_message_id = str;
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
