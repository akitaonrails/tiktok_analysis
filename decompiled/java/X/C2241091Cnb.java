package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cnb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241091Cnb extends Message<C2241091Cnb, C2241071CnZ> {
    public static final ProtoAdapter<C2241091Cnb> ADAPTER = new ProtoAdapter<C2241091Cnb>() { // from class: X.1Cna
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241091Cnb decode(ProtoReader protoReader) {
            C2241071CnZ c2241071CnZ = new C2241071CnZ();
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
                                                c2241071CnZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            } else {
                                                c2241071CnZ.LJIIIZ = C2241571CoN.ADAPTER.decode(protoReader);
                                            }
                                        } else {
                                            c2241071CnZ.LJIIIIZZ = C1CH0.ADAPTER.decode(protoReader);
                                        }
                                    } else {
                                        c2241071CnZ.LJII = C2243941CsC.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c2241071CnZ.LJI = EnumC2241111Cnd.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2241071CnZ.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2241071CnZ.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                            }
                        } else {
                            c2241071CnZ.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2241071CnZ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241071CnZ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241091Cnb c2241091Cnb) {
            C2241091Cnb c2241091Cnb2 = c2241091Cnb;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c2241091Cnb2.task_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2241091Cnb2.creator_uid) + protoAdapter.asRepeated().encodedSizeWithTag(3, c2241091Cnb2.participant_uids) + EnumC2241111Cnd.ADAPTER.encodedSizeWithTag(4, c2241091Cnb2.task_status) + C2243941CsC.ADAPTER.encodedSizeWithTag(5, c2241091Cnb2.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241091Cnb2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241091Cnb2.resp_base) + c2241091Cnb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241091Cnb redact(C2241091Cnb c2241091Cnb) {
            C2241071CnZ c2241071CnZNewBuilder = c2241091Cnb.newBuilder();
            C2243941CsC c2243941CsC = c2241071CnZNewBuilder.LJII;
            if (c2243941CsC != null) {
                c2241071CnZNewBuilder.LJII = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2241071CnZNewBuilder.LJIIIIZZ;
            if (c1ch0 != null) {
                c2241071CnZNewBuilder.LJIIIIZZ = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241071CnZNewBuilder.LJIIIZ;
            if (c2241571CoN != null) {
                c2241071CnZNewBuilder.LJIIIZ = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241071CnZNewBuilder.clearUnknownFields();
            return c2241071CnZNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241091Cnb c2241091Cnb) {
            C2241091Cnb c2241091Cnb2 = c2241091Cnb;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2241091Cnb2.task_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c2241091Cnb2.creator_uid);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c2241091Cnb2.participant_uids);
            EnumC2241111Cnd.ADAPTER.encodeWithTag(protoWriter, 4, c2241091Cnb2.task_status);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 5, c2241091Cnb2.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241091Cnb2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241091Cnb2.resp_base);
            protoWriter.writeBytes(c2241091Cnb2.unknownFields());
        }
    };
    public static final Long DEFAULT_CREATOR_UID = 0L;
    public static final EnumC2241111Cnd DEFAULT_TASK_STATUS = EnumC2241111Cnd.AVATAR_DUO_TASK_STATUS_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long creator_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REPEATED, tag = 3)
    public final List<Long> participant_uids;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 5)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String task_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AvatarDuoTaskStatus#ADAPTER", tag = 4)
    public final EnumC2241111Cnd task_status;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.task_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.creator_uid;
        int iHashCode3 = (((iHashCode2 + (l != null ? l.hashCode() : 0)) * 37) + this.participant_uids.hashCode()) * 37;
        EnumC2241111Cnd enumC2241111Cnd = this.task_status;
        int iHashCode4 = (iHashCode3 + (enumC2241111Cnd != null ? enumC2241111Cnd.hashCode() : 0)) * 37;
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
    public C2241071CnZ newBuilder() {
        C2241071CnZ c2241071CnZ = new C2241071CnZ();
        c2241071CnZ.LIZLLL = this.task_id;
        c2241071CnZ.LJ = this.creator_uid;
        c2241071CnZ.LJFF = C1516540pZE.LIZJ("participant_uids", this.participant_uids);
        c2241071CnZ.LJI = this.task_status;
        c2241071CnZ.LJII = this.preview_hint;
        c2241071CnZ.LJIIIIZZ = this.req_base;
        c2241071CnZ.LJIIIZ = this.resp_base;
        c2241071CnZ.addUnknownFields(unknownFields());
        return c2241071CnZ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.creator_uid != null) {
            sb.append(", creator_uid=");
            sb.append(this.creator_uid);
        }
        if (!this.participant_uids.isEmpty()) {
            sb.append(", participant_uids=");
            sb.append(this.participant_uids);
        }
        if (this.task_status != null) {
            sb.append(", task_status=");
            sb.append(this.task_status);
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
        sb.replace(0, 2, "AvatarDuoInvitationCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241091Cnb)) {
            return false;
        }
        C2241091Cnb c2241091Cnb = (C2241091Cnb) obj;
        if (unknownFields().equals(c2241091Cnb.unknownFields()) && C1516540pZE.LJ(this.task_id, c2241091Cnb.task_id) && C1516540pZE.LJ(this.creator_uid, c2241091Cnb.creator_uid) && this.participant_uids.equals(c2241091Cnb.participant_uids) && C1516540pZE.LJ(this.task_status, c2241091Cnb.task_status) && C1516540pZE.LJ(this.preview_hint, c2241091Cnb.preview_hint) && C1516540pZE.LJ(this.req_base, c2241091Cnb.req_base) && C1516540pZE.LJ(this.resp_base, c2241091Cnb.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241091Cnb(String str, Long l, List<Long> list, EnumC2241111Cnd enumC2241111Cnd, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(str, l, list, enumC2241111Cnd, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241091Cnb(String str, Long l, List<Long> list, EnumC2241111Cnd enumC2241111Cnd, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.task_id = str;
        this.creator_uid = l;
        this.participant_uids = C1516540pZE.LJFF("participant_uids", list);
        this.task_status = enumC2241111Cnd;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
