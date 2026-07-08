package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241001CnS extends Message<C2241001CnS, C2240991CnR> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long call_duration_ms;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = 5)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 4)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.RoomMemberStatus#ADAPTER", tag = 2)
    public final EnumC901220ZXc room_member_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long room_member_uid;
    public static final ProtoAdapter<C2241001CnS> ADAPTER = new ProtoAdapter<C2241001CnS>() { // from class: X.1CnT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241001CnS decode(ProtoReader protoReader) {
            C2240991CnR c2240991CnR = new C2240991CnR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 200) {
                                            if (iNextTag != 201) {
                                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                c2240991CnR.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            } else {
                                                c2240991CnR.LJIIIZ = C2241571CoN.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2240991CnR.LJIIIIZZ = C1CH0.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2240991CnR.LJII = C2242211CpP.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2240991CnR.LJI = C2243941CsC.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2240991CnR.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            try {
                                c2240991CnR.LJ = EnumC901220ZXc.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2240991CnR.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2240991CnR.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2240991CnR.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241001CnS c2241001CnS) {
            C2241001CnS c2241001CnS2 = c2241001CnS;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2241001CnS2.room_member_uid) + EnumC901220ZXc.ADAPTER.encodedSizeWithTag(2, c2241001CnS2.room_member_status) + protoAdapter.encodedSizeWithTag(3, c2241001CnS2.call_duration_ms) + C2243941CsC.ADAPTER.encodedSizeWithTag(4, c2241001CnS2.preview_hint) + C2242211CpP.ADAPTER.encodedSizeWithTag(5, c2241001CnS2.fallback_info) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241001CnS2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241001CnS2.resp_base) + c2241001CnS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241001CnS redact(C2241001CnS c2241001CnS) {
            C2240991CnR c2240991CnRNewBuilder = c2241001CnS.newBuilder();
            C2243941CsC c2243941CsC = c2240991CnRNewBuilder.LJI;
            if (c2243941CsC != null) {
                c2240991CnRNewBuilder.LJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C2242211CpP c2242211CpP = c2240991CnRNewBuilder.LJII;
            if (c2242211CpP != null) {
                c2240991CnRNewBuilder.LJII = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C1CH0 c1ch0 = c2240991CnRNewBuilder.LJIIIIZZ;
            if (c1ch0 != null) {
                c2240991CnRNewBuilder.LJIIIIZZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2240991CnRNewBuilder.LJIIIZ;
            if (c2241571CoN != null) {
                c2240991CnRNewBuilder.LJIIIZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2240991CnRNewBuilder.clearUnknownFields();
            return c2240991CnRNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241001CnS c2241001CnS) {
            C2241001CnS c2241001CnS2 = c2241001CnS;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241001CnS2.room_member_uid);
            EnumC901220ZXc.ADAPTER.encodeWithTag(protoWriter, 2, c2241001CnS2.room_member_status);
            protoAdapter.encodeWithTag(protoWriter, 3, c2241001CnS2.call_duration_ms);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 4, c2241001CnS2.preview_hint);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 5, c2241001CnS2.fallback_info);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241001CnS2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241001CnS2.resp_base);
            protoWriter.writeBytes(c2241001CnS2.unknownFields());
        }
    };
    public static final Long DEFAULT_ROOM_MEMBER_UID = 0L;
    public static final EnumC901220ZXc DEFAULT_ROOM_MEMBER_STATUS = EnumC901220ZXc.MemberStatusUnknown;
    public static final Long DEFAULT_CALL_DURATION_MS = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.room_member_uid;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        EnumC901220ZXc enumC901220ZXc = this.room_member_status;
        int iHashCode3 = (iHashCode2 + (enumC901220ZXc != null ? enumC901220ZXc.hashCode() : 0)) * 37;
        Long l2 = this.call_duration_ms;
        int iHashCode4 = (iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode5 = (iHashCode4 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode6 = (iHashCode5 + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode7 = (iHashCode6 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode8 = iHashCode7 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2240991CnR newBuilder() {
        C2240991CnR c2240991CnR = new C2240991CnR();
        c2240991CnR.LIZLLL = this.room_member_uid;
        c2240991CnR.LJ = this.room_member_status;
        c2240991CnR.LJFF = this.call_duration_ms;
        c2240991CnR.LJI = this.preview_hint;
        c2240991CnR.LJII = this.fallback_info;
        c2240991CnR.LJIIIIZZ = this.req_base;
        c2240991CnR.LJIIIZ = this.resp_base;
        c2240991CnR.addUnknownFields(unknownFields());
        return c2240991CnR;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.room_member_uid != null) {
            sb.append(", room_member_uid=");
            sb.append(this.room_member_uid);
        }
        if (this.room_member_status != null) {
            sb.append(", room_member_status=");
            sb.append(this.room_member_status);
        }
        if (this.call_duration_ms != null) {
            sb.append(", call_duration_ms=");
            sb.append(this.call_duration_ms);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "CallLogCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241001CnS)) {
            return false;
        }
        C2241001CnS c2241001CnS = (C2241001CnS) obj;
        if (unknownFields().equals(c2241001CnS.unknownFields()) && C1516540pZE.LJ(this.room_member_uid, c2241001CnS.room_member_uid) && C1516540pZE.LJ(this.room_member_status, c2241001CnS.room_member_status) && C1516540pZE.LJ(this.call_duration_ms, c2241001CnS.call_duration_ms) && C1516540pZE.LJ(this.preview_hint, c2241001CnS.preview_hint) && C1516540pZE.LJ(this.fallback_info, c2241001CnS.fallback_info) && C1516540pZE.LJ(this.req_base, c2241001CnS.req_base) && C1516540pZE.LJ(this.resp_base, c2241001CnS.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241001CnS(Long l, EnumC901220ZXc enumC901220ZXc, Long l2, C2243941CsC c2243941CsC, C2242211CpP c2242211CpP, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(l, enumC901220ZXc, l2, c2243941CsC, c2242211CpP, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241001CnS(Long l, EnumC901220ZXc enumC901220ZXc, Long l2, C2243941CsC c2243941CsC, C2242211CpP c2242211CpP, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_member_uid = l;
        this.room_member_status = enumC901220ZXc;
        this.call_duration_ms = l2;
        this.preview_hint = c2243941CsC;
        this.fallback_info = c2242211CpP;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
