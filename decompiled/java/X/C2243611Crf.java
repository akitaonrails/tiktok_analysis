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

/* JADX INFO: renamed from: X.1Crf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243611Crf extends Message<C2243611Crf, C2243711Crp> {
    public static final ProtoAdapter<C2243611Crf> ADAPTER = new ProtoAdapter<C2243611Crf>() { // from class: X.1Crg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243611Crf decode(ProtoReader protoReader) {
            C2243711Crp c2243711Crp = new C2243711Crp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        if (iNextTag != 201) {
                            switch (iNextTag) {
                                case 1:
                                    c2243711Crp.LIZLLL = C2243521CrW.ADAPTER.decode(protoReader);
                                    break;
                                case 2:
                                    c2243711Crp.LJ.add(C2244431Csz.ADAPTER.decode(protoReader));
                                    break;
                                case 3:
                                    try {
                                        c2243711Crp.LJFF = EnumC19363210pC.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2243711Crp.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                    break;
                                case 4:
                                    c2243711Crp.LJI = C2243941CsC.ADAPTER.decode(protoReader);
                                    break;
                                case 5:
                                    c2243711Crp.LJII.add(C2242541Cpw.ADAPTER.decode(protoReader));
                                    break;
                                case 6:
                                    c2243711Crp.LJIIIIZZ.add(C2244321Cso.ADAPTER.decode(protoReader));
                                    break;
                                case 7:
                                    c2243711Crp.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 8:
                                    c2243711Crp.LJIIJ.add(ProtoAdapter.INT32.decode(protoReader));
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2243711Crp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c2243711Crp.LJIIL = C2241571CoN.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2243711Crp.LJIIJJI = C1CH0.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243711Crp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243611Crf c2243611Crf) {
            C2243611Crf c2243611Crf2 = c2243611Crf;
            int iEncodedSizeWithTag = C2243521CrW.ADAPTER.encodedSizeWithTag(1, c2243611Crf2.answer) + C2244431Csz.ADAPTER.asRepeated().encodedSizeWithTag(2, c2243611Crf2.recommend_items) + EnumC19363210pC.ADAPTER.encodedSizeWithTag(3, c2243611Crf2.answer_status) + C2243941CsC.ADAPTER.encodedSizeWithTag(4, c2243611Crf2.preview_hint) + C2242541Cpw.ADAPTER.asRepeated().encodedSizeWithTag(5, c2243611Crf2.recommend_users) + C2244321Cso.ADAPTER.asRepeated().encodedSizeWithTag(6, c2243611Crf2.link_infos);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, c2243611Crf2.card_type) + protoAdapter.asRepeated().encodedSizeWithTag(8, c2243611Crf2.content_types) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2243611Crf2.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2243611Crf2.resp_base) + c2243611Crf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243611Crf redact(C2243611Crf c2243611Crf) {
            C2243711Crp c2243711CrpNewBuilder = c2243611Crf.newBuilder();
            C2243521CrW c2243521CrW = c2243711CrpNewBuilder.LIZLLL;
            if (c2243521CrW != null) {
                c2243711CrpNewBuilder.LIZLLL = C2243521CrW.ADAPTER.redact(c2243521CrW);
            }
            C1516540pZE.LJIIIZ(c2243711CrpNewBuilder.LJ, C2244431Csz.ADAPTER);
            C2243941CsC c2243941CsC = c2243711CrpNewBuilder.LJI;
            if (c2243941CsC != null) {
                c2243711CrpNewBuilder.LJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1516540pZE.LJIIIZ(c2243711CrpNewBuilder.LJII, C2242541Cpw.ADAPTER);
            C1516540pZE.LJIIIZ(c2243711CrpNewBuilder.LJIIIIZZ, C2244321Cso.ADAPTER);
            C1CH0 c1ch0 = c2243711CrpNewBuilder.LJIIJJI;
            if (c1ch0 != null) {
                c2243711CrpNewBuilder.LJIIJJI = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2243711CrpNewBuilder.LJIIL;
            if (c2241571CoN != null) {
                c2243711CrpNewBuilder.LJIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2243711CrpNewBuilder.clearUnknownFields();
            return c2243711CrpNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243611Crf c2243611Crf) {
            C2243611Crf c2243611Crf2 = c2243611Crf;
            C2243521CrW.ADAPTER.encodeWithTag(protoWriter, 1, c2243611Crf2.answer);
            C2244431Csz.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c2243611Crf2.recommend_items);
            EnumC19363210pC.ADAPTER.encodeWithTag(protoWriter, 3, c2243611Crf2.answer_status);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 4, c2243611Crf2.preview_hint);
            C2242541Cpw.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c2243611Crf2.recommend_users);
            C2244321Cso.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c2243611Crf2.link_infos);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 7, c2243611Crf2.card_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 8, c2243611Crf2.content_types);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2243611Crf2.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2243611Crf2.resp_base);
            protoWriter.writeBytes(c2243611Crf2.unknownFields());
        }
    };
    public static final EnumC19363210pC DEFAULT_ANSWER_STATUS = EnumC19363210pC.AnswerNormal;
    public static final Integer DEFAULT_CARD_TYPE = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", tag = 1)
    public final C2243521CrW answer;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AnswerStatus#ADAPTER", tag = 3)
    public final EnumC19363210pC answer_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 7)
    public final Integer card_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REPEATED, tag = 8)
    public final List<Integer> content_types;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<C2244321Cso> link_infos;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 4)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Item#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<C2244431Csz> recommend_items;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C2242541Cpw> recommend_users;

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
        C2243521CrW c2243521CrW = this.answer;
        int iHashCode2 = (((iHashCode + (c2243521CrW != null ? c2243521CrW.hashCode() : 0)) * 37) + this.recommend_items.hashCode()) * 37;
        EnumC19363210pC enumC19363210pC = this.answer_status;
        int iHashCode3 = (iHashCode2 + (enumC19363210pC != null ? enumC19363210pC.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode4 = (((((iHashCode3 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37) + this.recommend_users.hashCode()) * 37) + this.link_infos.hashCode()) * 37;
        Integer num = this.card_type;
        int iHashCode5 = (((iHashCode4 + (num != null ? num.hashCode() : 0)) * 37) + this.content_types.hashCode()) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode6 = (iHashCode5 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode7 = iHashCode6 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2243711Crp newBuilder() {
        C2243711Crp c2243711Crp = new C2243711Crp();
        c2243711Crp.LIZLLL = this.answer;
        c2243711Crp.LJ = C1516540pZE.LIZJ("recommend_items", this.recommend_items);
        c2243711Crp.LJFF = this.answer_status;
        c2243711Crp.LJI = this.preview_hint;
        c2243711Crp.LJII = C1516540pZE.LIZJ("recommend_users", this.recommend_users);
        c2243711Crp.LJIIIIZZ = C1516540pZE.LIZJ("link_infos", this.link_infos);
        c2243711Crp.LJIIIZ = this.card_type;
        c2243711Crp.LJIIJ = C1516540pZE.LIZJ("content_types", this.content_types);
        c2243711Crp.LJIIJJI = this.req_base;
        c2243711Crp.LJIIL = this.resp_base;
        c2243711Crp.addUnknownFields(unknownFields());
        return c2243711Crp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.answer != null) {
            sb.append(", answer=");
            sb.append(this.answer);
        }
        if (!this.recommend_items.isEmpty()) {
            sb.append(", recommend_items=");
            sb.append(this.recommend_items);
        }
        if (this.answer_status != null) {
            sb.append(", answer_status=");
            sb.append(this.answer_status);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (!this.recommend_users.isEmpty()) {
            sb.append(", recommend_users=");
            sb.append(this.recommend_users);
        }
        if (!this.link_infos.isEmpty()) {
            sb.append(", link_infos=");
            sb.append(this.link_infos);
        }
        if (this.card_type != null) {
            sb.append(", card_type=");
            sb.append(this.card_type);
        }
        if (!this.content_types.isEmpty()) {
            sb.append(", content_types=");
            sb.append(this.content_types);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "BotAnswerCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243611Crf)) {
            return false;
        }
        C2243611Crf c2243611Crf = (C2243611Crf) obj;
        if (unknownFields().equals(c2243611Crf.unknownFields()) && C1516540pZE.LJ(this.answer, c2243611Crf.answer) && this.recommend_items.equals(c2243611Crf.recommend_items) && C1516540pZE.LJ(this.answer_status, c2243611Crf.answer_status) && C1516540pZE.LJ(this.preview_hint, c2243611Crf.preview_hint) && this.recommend_users.equals(c2243611Crf.recommend_users) && this.link_infos.equals(c2243611Crf.link_infos) && C1516540pZE.LJ(this.card_type, c2243611Crf.card_type) && this.content_types.equals(c2243611Crf.content_types) && C1516540pZE.LJ(this.req_base, c2243611Crf.req_base) && C1516540pZE.LJ(this.resp_base, c2243611Crf.resp_base)) {
            return true;
        }
        return false;
    }

    public C2243611Crf(C2243521CrW c2243521CrW, List<C2244431Csz> list, EnumC19363210pC enumC19363210pC, C2243941CsC c2243941CsC, List<C2242541Cpw> list2, List<C2244321Cso> list3, Integer num, List<Integer> list4, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(c2243521CrW, list, enumC19363210pC, c2243941CsC, list2, list3, num, list4, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2243611Crf(C2243521CrW c2243521CrW, List<C2244431Csz> list, EnumC19363210pC enumC19363210pC, C2243941CsC c2243941CsC, List<C2242541Cpw> list2, List<C2244321Cso> list3, Integer num, List<Integer> list4, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.answer = c2243521CrW;
        this.recommend_items = C1516540pZE.LJFF("recommend_items", list);
        this.answer_status = enumC19363210pC;
        this.preview_hint = c2243941CsC;
        this.recommend_users = C1516540pZE.LJFF("recommend_users", list2);
        this.link_infos = C1516540pZE.LJFF("link_infos", list3);
        this.card_type = num;
        this.content_types = C1516540pZE.LJFF("content_types", list4);
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
