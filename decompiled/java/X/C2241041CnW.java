package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CnW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241041CnW extends Message<C2241041CnW, C2241031CnV> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 3)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.OnboardingCardStatus#ADAPTER", tag = 2)
    public final C0NZT status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long target_uid;
    public static final ProtoAdapter<C2241041CnW> ADAPTER = new ProtoAdapter<C2241041CnW>() { // from class: X.1CnX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241041CnW decode(ProtoReader protoReader) {
            C2241031CnV c2241031CnV = new C2241031CnV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 200) {
                                    if (iNextTag != 201) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2241031CnV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2241031CnV.LJII = C2241571CoN.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2241031CnV.LJI = C1CH0.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2241031CnV.LJFF = C2243941CsC.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c2241031CnV.LJ = C0NZT.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2241031CnV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2241031CnV.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241031CnV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241041CnW c2241041CnW) {
            C2241041CnW c2241041CnW2 = c2241041CnW;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2241041CnW2.target_uid) + C0NZT.ADAPTER.encodedSizeWithTag(2, c2241041CnW2.status) + C2243941CsC.ADAPTER.encodedSizeWithTag(3, c2241041CnW2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241041CnW2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241041CnW2.resp_base) + c2241041CnW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241041CnW redact(C2241041CnW c2241041CnW) {
            C2241031CnV c2241031CnVNewBuilder = c2241041CnW.newBuilder();
            C2243941CsC c2243941CsC = c2241031CnVNewBuilder.LJFF;
            if (c2243941CsC != null) {
                c2241031CnVNewBuilder.LJFF = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2241031CnVNewBuilder.LJI;
            if (c1ch0 != null) {
                c2241031CnVNewBuilder.LJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241031CnVNewBuilder.LJII;
            if (c2241571CoN != null) {
                c2241031CnVNewBuilder.LJII = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241031CnVNewBuilder.clearUnknownFields();
            return c2241031CnVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241041CnW c2241041CnW) {
            C2241041CnW c2241041CnW2 = c2241041CnW;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2241041CnW2.target_uid);
            C0NZT.ADAPTER.encodeWithTag(protoWriter, 2, c2241041CnW2.status);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 3, c2241041CnW2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241041CnW2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241041CnW2.resp_base);
            protoWriter.writeBytes(c2241041CnW2.unknownFields());
        }
    };
    public static final Long DEFAULT_TARGET_UID = 0L;
    public static final C0NZT DEFAULT_STATUS = C0NZT.ONBOARDING_CARD_STATUS_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.target_uid;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        C0NZT c0nzt = this.status;
        int iHashCode3 = (iHashCode2 + (c0nzt != null ? c0nzt.hashCode() : 0)) * 37;
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
    public C2241031CnV newBuilder() {
        C2241031CnV c2241031CnV = new C2241031CnV();
        c2241031CnV.LIZLLL = this.target_uid;
        c2241031CnV.LJ = this.status;
        c2241031CnV.LJFF = this.preview_hint;
        c2241031CnV.LJI = this.req_base;
        c2241031CnV.LJII = this.resp_base;
        c2241031CnV.addUnknownFields(unknownFields());
        return c2241031CnV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.target_uid != null) {
            sb.append(", target_uid=");
            sb.append(this.target_uid);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
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
        sb.replace(0, 2, "PublicGroupOnboardingCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241041CnW)) {
            return false;
        }
        C2241041CnW c2241041CnW = (C2241041CnW) obj;
        if (unknownFields().equals(c2241041CnW.unknownFields()) && C1516540pZE.LJ(this.target_uid, c2241041CnW.target_uid) && C1516540pZE.LJ(this.status, c2241041CnW.status) && C1516540pZE.LJ(this.preview_hint, c2241041CnW.preview_hint) && C1516540pZE.LJ(this.req_base, c2241041CnW.req_base) && C1516540pZE.LJ(this.resp_base, c2241041CnW.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241041CnW(Long l, C0NZT c0nzt, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(l, c0nzt, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241041CnW(Long l, C0NZT c0nzt, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.target_uid = l;
        this.status = c0nzt;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
