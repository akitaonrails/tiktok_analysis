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

/* JADX INFO: renamed from: X.1CoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241641CoU extends Message<C2241641CoU, C2241631CoT> {
    public static final ProtoAdapter<C2241641CoU> ADAPTER = new ProtoAdapter<C2241641CoU>() { // from class: X.1CoV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241641CoU decode(ProtoReader protoReader) {
            C2241631CoT c2241631CoT = new C2241631CoT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        if (iNextTag != 201) {
                            switch (iNextTag) {
                                case 1:
                                    c2241631CoT.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c2241631CoT.LJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c2241631CoT.LJFF = C2241671CoX.ADAPTER.decode(protoReader);
                                    break;
                                case 4:
                                    c2241631CoT.LJI.add(C1CNI.ADAPTER.decode(protoReader));
                                    break;
                                case 5:
                                    c2241631CoT.LJII = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 6:
                                    try {
                                        c2241631CoT.LJIIIIZZ = EnumC2241711Cob.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2241631CoT.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                    break;
                                case 7:
                                    c2241631CoT.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 8:
                                    c2241631CoT.LJIIJ = C2230151CQj.ADAPTER.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c2241631CoT.LJIIJJI = C2243941CsC.ADAPTER.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c2241631CoT.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c2241631CoT.LJIILIIL = C1CNI.ADAPTER.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c2241631CoT.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2241631CoT.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c2241631CoT.LJIILLIIL = C2241571CoN.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241631CoT.LJIILL = C1CH0.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241631CoT.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241641CoU c2241641CoU) {
            C2241641CoU c2241641CoU2 = c2241641CoU;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2241641CoU2.task_id) + protoAdapter.encodedSizeWithTag(2, c2241641CoU2.creator_uid) + C2241671CoX.ADAPTER.encodedSizeWithTag(3, c2241641CoU2.game_info);
            ProtoAdapter<C1CNI> protoAdapter2 = C1CNI.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(4, c2241641CoU2.scores);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c2241641CoU2.has_more_participants) + EnumC2241711Cob.ADAPTER.encodedSizeWithTag(6, c2241641CoU2.status) + protoAdapter3.encodedSizeWithTag(7, c2241641CoU2.hide_card) + C2230151CQj.ADAPTER.encodedSizeWithTag(8, c2241641CoU2.tip) + C2243941CsC.ADAPTER.encodedSizeWithTag(9, c2241641CoU2.preview_hint) + ProtoAdapter.INT64.encodedSizeWithTag(10, c2241641CoU2.version) + protoAdapter2.encodedSizeWithTag(11, c2241641CoU2.current_user_score) + ProtoAdapter.INT32.encodedSizeWithTag(12, c2241641CoU2.participant_count) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241641CoU2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241641CoU2.resp_base) + c2241641CoU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241641CoU redact(C2241641CoU c2241641CoU) {
            C2241631CoT c2241631CoTNewBuilder = c2241641CoU.newBuilder();
            C2241671CoX c2241671CoX = c2241631CoTNewBuilder.LJFF;
            if (c2241671CoX != null) {
                c2241631CoTNewBuilder.LJFF = C2241671CoX.ADAPTER.redact(c2241671CoX);
            }
            List<C1CNI> list = c2241631CoTNewBuilder.LJI;
            ProtoAdapter<C1CNI> protoAdapter = C1CNI.ADAPTER;
            C1516540pZE.LJIIIZ(list, protoAdapter);
            C2230151CQj c2230151CQj = c2241631CoTNewBuilder.LJIIJ;
            if (c2230151CQj != null) {
                c2241631CoTNewBuilder.LJIIJ = C2230151CQj.ADAPTER.redact(c2230151CQj);
            }
            C2243941CsC c2243941CsC = c2241631CoTNewBuilder.LJIIJJI;
            if (c2243941CsC != null) {
                c2241631CoTNewBuilder.LJIIJJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CNI c1cni = c2241631CoTNewBuilder.LJIILIIL;
            if (c1cni != null) {
                c2241631CoTNewBuilder.LJIILIIL = protoAdapter.redact(c1cni);
            }
            C1CH0 c1ch0 = c2241631CoTNewBuilder.LJIILL;
            if (c1ch0 != null) {
                c2241631CoTNewBuilder.LJIILL = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241631CoTNewBuilder.LJIILLIIL;
            if (c2241571CoN != null) {
                c2241631CoTNewBuilder.LJIILLIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241631CoTNewBuilder.clearUnknownFields();
            return c2241631CoTNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241641CoU c2241641CoU) {
            C2241641CoU c2241641CoU2 = c2241641CoU;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241641CoU2.task_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241641CoU2.creator_uid);
            C2241671CoX.ADAPTER.encodeWithTag(protoWriter, 3, c2241641CoU2.game_info);
            ProtoAdapter<C1CNI> protoAdapter2 = C1CNI.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, c2241641CoU2.scores);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 5, c2241641CoU2.has_more_participants);
            EnumC2241711Cob.ADAPTER.encodeWithTag(protoWriter, 6, c2241641CoU2.status);
            protoAdapter3.encodeWithTag(protoWriter, 7, c2241641CoU2.hide_card);
            C2230151CQj.ADAPTER.encodeWithTag(protoWriter, 8, c2241641CoU2.tip);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 9, c2241641CoU2.preview_hint);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 10, c2241641CoU2.version);
            protoAdapter2.encodeWithTag(protoWriter, 11, c2241641CoU2.current_user_score);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 12, c2241641CoU2.participant_count);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241641CoU2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241641CoU2.resp_base);
            protoWriter.writeBytes(c2241641CoU2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE_PARTICIPANTS;
    public static final Boolean DEFAULT_HIDE_CARD;
    public static final Integer DEFAULT_PARTICIPANT_COUNT;
    public static final EnumC2241711Cob DEFAULT_STATUS;
    public static final Long DEFAULT_VERSION;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String creator_uid;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GameParticipantScore#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C1CNI current_user_score;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GameInfo#ADAPTER", tag = 3)
    public final C2241671CoX game_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean has_more_participants;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean hide_card;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Integer participant_count;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GameParticipantScore#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CNI> scores;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InteractiveTaskStatus#ADAPTER", tag = 6)
    public final EnumC2241711Cob status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String task_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InlineMessageTip#ADAPTER", tag = 8)
    public final C2230151CQj tip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long version;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_HAS_MORE_PARTICIPANTS = bool;
        DEFAULT_STATUS = EnumC2241711Cob.TASK_STATUS_UNKNOWN;
        DEFAULT_HIDE_CARD = bool;
        DEFAULT_VERSION = 0L;
        DEFAULT_PARTICIPANT_COUNT = 0;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.task_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.creator_uid;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2241671CoX c2241671CoX = this.game_info;
        int iHashCode4 = (((iHashCode3 + (c2241671CoX != null ? c2241671CoX.hashCode() : 0)) * 37) + this.scores.hashCode()) * 37;
        Boolean bool = this.has_more_participants;
        int iHashCode5 = (iHashCode4 + (bool != null ? bool.hashCode() : 0)) * 37;
        EnumC2241711Cob enumC2241711Cob = this.status;
        int iHashCode6 = (iHashCode5 + (enumC2241711Cob != null ? enumC2241711Cob.hashCode() : 0)) * 37;
        Boolean bool2 = this.hide_card;
        int iHashCode7 = (iHashCode6 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        C2230151CQj c2230151CQj = this.tip;
        int iHashCode8 = (iHashCode7 + (c2230151CQj != null ? c2230151CQj.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode9 = (iHashCode8 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        Long l = this.version;
        int iHashCode10 = (iHashCode9 + (l != null ? l.hashCode() : 0)) * 37;
        C1CNI c1cni = this.current_user_score;
        int iHashCode11 = (iHashCode10 + (c1cni != null ? c1cni.hashCode() : 0)) * 37;
        Integer num = this.participant_count;
        int iHashCode12 = (iHashCode11 + (num != null ? num.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode13 = (iHashCode12 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode14 = iHashCode13 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode14;
        return iHashCode14;
    }

    @Override // com.squareup.wire.Message
    public C2241631CoT newBuilder() {
        C2241631CoT c2241631CoT = new C2241631CoT();
        c2241631CoT.LIZLLL = this.task_id;
        c2241631CoT.LJ = this.creator_uid;
        c2241631CoT.LJFF = this.game_info;
        c2241631CoT.LJI = C1516540pZE.LIZJ("scores", this.scores);
        c2241631CoT.LJII = this.has_more_participants;
        c2241631CoT.LJIIIIZZ = this.status;
        c2241631CoT.LJIIIZ = this.hide_card;
        c2241631CoT.LJIIJ = this.tip;
        c2241631CoT.LJIIJJI = this.preview_hint;
        c2241631CoT.LJIIL = this.version;
        c2241631CoT.LJIILIIL = this.current_user_score;
        c2241631CoT.LJIILJJIL = this.participant_count;
        c2241631CoT.LJIILL = this.req_base;
        c2241631CoT.LJIILLIIL = this.resp_base;
        c2241631CoT.addUnknownFields(unknownFields());
        return c2241631CoT;
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
        if (this.game_info != null) {
            sb.append(", game_info=");
            sb.append(this.game_info);
        }
        if (!this.scores.isEmpty()) {
            sb.append(", scores=");
            sb.append(this.scores);
        }
        if (this.has_more_participants != null) {
            sb.append(", has_more_participants=");
            sb.append(this.has_more_participants);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.hide_card != null) {
            sb.append(", hide_card=");
            sb.append(this.hide_card);
        }
        if (this.tip != null) {
            sb.append(", tip=");
            sb.append(this.tip);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.current_user_score != null) {
            sb.append(", current_user_score=");
            sb.append(this.current_user_score);
        }
        if (this.participant_count != null) {
            sb.append(", participant_count=");
            sb.append(this.participant_count);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "GameCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241641CoU)) {
            return false;
        }
        C2241641CoU c2241641CoU = (C2241641CoU) obj;
        if (unknownFields().equals(c2241641CoU.unknownFields()) && C1516540pZE.LJ(this.task_id, c2241641CoU.task_id) && C1516540pZE.LJ(this.creator_uid, c2241641CoU.creator_uid) && C1516540pZE.LJ(this.game_info, c2241641CoU.game_info) && this.scores.equals(c2241641CoU.scores) && C1516540pZE.LJ(this.has_more_participants, c2241641CoU.has_more_participants) && C1516540pZE.LJ(this.status, c2241641CoU.status) && C1516540pZE.LJ(this.hide_card, c2241641CoU.hide_card) && C1516540pZE.LJ(this.tip, c2241641CoU.tip) && C1516540pZE.LJ(this.preview_hint, c2241641CoU.preview_hint) && C1516540pZE.LJ(this.version, c2241641CoU.version) && C1516540pZE.LJ(this.current_user_score, c2241641CoU.current_user_score) && C1516540pZE.LJ(this.participant_count, c2241641CoU.participant_count) && C1516540pZE.LJ(this.req_base, c2241641CoU.req_base) && C1516540pZE.LJ(this.resp_base, c2241641CoU.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241641CoU(String str, String str2, C2241671CoX c2241671CoX, List<C1CNI> list, Boolean bool, EnumC2241711Cob enumC2241711Cob, Boolean bool2, C2230151CQj c2230151CQj, C2243941CsC c2243941CsC, Long l, C1CNI c1cni, Integer num, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(str, str2, c2241671CoX, list, bool, enumC2241711Cob, bool2, c2230151CQj, c2243941CsC, l, c1cni, num, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241641CoU(String str, String str2, C2241671CoX c2241671CoX, List<C1CNI> list, Boolean bool, EnumC2241711Cob enumC2241711Cob, Boolean bool2, C2230151CQj c2230151CQj, C2243941CsC c2243941CsC, Long l, C1CNI c1cni, Integer num, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.task_id = str;
        this.creator_uid = str2;
        this.game_info = c2241671CoX;
        this.scores = C1516540pZE.LJFF("scores", list);
        this.has_more_participants = bool;
        this.status = enumC2241711Cob;
        this.hide_card = bool2;
        this.tip = c2230151CQj;
        this.preview_hint = c2243941CsC;
        this.version = l;
        this.current_user_score = c1cni;
        this.participant_count = num;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
