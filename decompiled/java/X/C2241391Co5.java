package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Co5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241391Co5 extends Message<C2241391Co5, C2241381Co4> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String creator_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 7)
    public final Boolean hide_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 200)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 201)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotResult#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C2241451CoB> results;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotStatus#ADAPTER", tag = 6)
    public final EnumC2241491CoF status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String task_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotTemplateInfo#ADAPTER", tag = 3)
    public final C2241421Co8 template_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InlineMessageTip#ADAPTER", tag = 8)
    public final C2230151CQj tip;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotUserInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public final List<C1CNE> user_info;
    public static final ProtoAdapter<C2241391Co5> ADAPTER = new ProtoAdapter<C2241391Co5>() { // from class: X.1Co7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241391Co5 decode(ProtoReader protoReader) {
            C2241381Co4 c2241381Co4 = new C2241381Co4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        if (iNextTag != 201) {
                            switch (iNextTag) {
                                case 1:
                                    c2241381Co4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    c2241381Co4.LJ = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c2241381Co4.LJFF = C2241421Co8.ADAPTER.decode(protoReader);
                                    break;
                                case 4:
                                    c2241381Co4.LJI.add(C1CNE.ADAPTER.decode(protoReader));
                                    break;
                                case 5:
                                    c2241381Co4.LJII.add(C2241451CoB.ADAPTER.decode(protoReader));
                                    break;
                                case 6:
                                    try {
                                        c2241381Co4.LJIIIIZZ = EnumC2241491CoF.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2241381Co4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                    break;
                                case 7:
                                    c2241381Co4.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 8:
                                    c2241381Co4.LJIIJ = C2230151CQj.ADAPTER.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c2241381Co4.LJIIJJI = C2243941CsC.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2241381Co4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    break;
                            }
                        } else {
                            c2241381Co4.LJIILIIL = C2241571CoN.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2241381Co4.LJIIL = C1CH0.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241381Co4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241391Co5 c2241391Co5) {
            C2241391Co5 c2241391Co52 = c2241391Co5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2241391Co52.task_id) + protoAdapter.encodedSizeWithTag(2, c2241391Co52.creator_id) + C2241421Co8.ADAPTER.encodedSizeWithTag(3, c2241391Co52.template_info) + C1CNE.ADAPTER.asRepeated().encodedSizeWithTag(4, c2241391Co52.user_info) + C2241451CoB.ADAPTER.asRepeated().encodedSizeWithTag(5, c2241391Co52.results) + EnumC2241491CoF.ADAPTER.encodedSizeWithTag(6, c2241391Co52.status) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c2241391Co52.hide_card) + C2230151CQj.ADAPTER.encodedSizeWithTag(8, c2241391Co52.tip) + C2243941CsC.ADAPTER.encodedSizeWithTag(9, c2241391Co52.preview_hint) + C1CH0.ADAPTER.encodedSizeWithTag(200, c2241391Co52.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(201, c2241391Co52.resp_base) + c2241391Co52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241391Co5 redact(C2241391Co5 c2241391Co5) {
            C2241381Co4 c2241381Co4NewBuilder = c2241391Co5.newBuilder();
            C2241421Co8 c2241421Co8 = c2241381Co4NewBuilder.LJFF;
            if (c2241421Co8 != null) {
                c2241381Co4NewBuilder.LJFF = C2241421Co8.ADAPTER.redact(c2241421Co8);
            }
            C1516540pZE.LJIIIZ(c2241381Co4NewBuilder.LJI, C1CNE.ADAPTER);
            C1516540pZE.LJIIIZ(c2241381Co4NewBuilder.LJII, C2241451CoB.ADAPTER);
            C2230151CQj c2230151CQj = c2241381Co4NewBuilder.LJIIJ;
            if (c2230151CQj != null) {
                c2241381Co4NewBuilder.LJIIJ = C2230151CQj.ADAPTER.redact(c2230151CQj);
            }
            C2243941CsC c2243941CsC = c2241381Co4NewBuilder.LJIIJJI;
            if (c2243941CsC != null) {
                c2241381Co4NewBuilder.LJIIJJI = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1CH0 c1ch0 = c2241381Co4NewBuilder.LJIIL;
            if (c1ch0 != null) {
                c2241381Co4NewBuilder.LJIIL = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2241381Co4NewBuilder.LJIILIIL;
            if (c2241571CoN != null) {
                c2241381Co4NewBuilder.LJIILIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2241381Co4NewBuilder.clearUnknownFields();
            return c2241381Co4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241391Co5 c2241391Co5) {
            C2241391Co5 c2241391Co52 = c2241391Co5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241391Co52.task_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241391Co52.creator_id);
            C2241421Co8.ADAPTER.encodeWithTag(protoWriter, 3, c2241391Co52.template_info);
            C1CNE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2241391Co52.user_info);
            C2241451CoB.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c2241391Co52.results);
            EnumC2241491CoF.ADAPTER.encodeWithTag(protoWriter, 6, c2241391Co52.status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, c2241391Co52.hide_card);
            C2230151CQj.ADAPTER.encodeWithTag(protoWriter, 8, c2241391Co52.tip);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 9, c2241391Co52.preview_hint);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 200, c2241391Co52.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 201, c2241391Co52.resp_base);
            protoWriter.writeBytes(c2241391Co52.unknownFields());
        }
    };
    public static final EnumC2241491CoF DEFAULT_STATUS = EnumC2241491CoF.InProgress;
    public static final Boolean DEFAULT_HIDE_CARD = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.task_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.creator_id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2241421Co8 c2241421Co8 = this.template_info;
        int iHashCode4 = (((((iHashCode3 + (c2241421Co8 != null ? c2241421Co8.hashCode() : 0)) * 37) + this.user_info.hashCode()) * 37) + this.results.hashCode()) * 37;
        EnumC2241491CoF enumC2241491CoF = this.status;
        int iHashCode5 = (iHashCode4 + (enumC2241491CoF != null ? enumC2241491CoF.hashCode() : 0)) * 37;
        Boolean bool = this.hide_card;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        C2230151CQj c2230151CQj = this.tip;
        int iHashCode7 = (iHashCode6 + (c2230151CQj != null ? c2230151CQj.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode8 = (iHashCode7 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode9 = (iHashCode8 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode10 = iHashCode9 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.squareup.wire.Message
    public C2241381Co4 newBuilder() {
        C2241381Co4 c2241381Co4 = new C2241381Co4();
        c2241381Co4.LIZLLL = this.task_id;
        c2241381Co4.LJ = this.creator_id;
        c2241381Co4.LJFF = this.template_info;
        c2241381Co4.LJI = C1516540pZE.LIZJ("user_info", this.user_info);
        c2241381Co4.LJII = C1516540pZE.LIZJ("results", this.results);
        c2241381Co4.LJIIIIZZ = this.status;
        c2241381Co4.LJIIIZ = this.hide_card;
        c2241381Co4.LJIIJ = this.tip;
        c2241381Co4.LJIIJJI = this.preview_hint;
        c2241381Co4.LJIIL = this.req_base;
        c2241381Co4.LJIILIIL = this.resp_base;
        c2241381Co4.addUnknownFields(unknownFields());
        return c2241381Co4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.creator_id != null) {
            sb.append(", creator_id=");
            sb.append(this.creator_id);
        }
        if (this.template_info != null) {
            sb.append(", template_info=");
            sb.append(this.template_info);
        }
        if (!this.user_info.isEmpty()) {
            sb.append(", user_info=");
            sb.append(this.user_info);
        }
        if (!this.results.isEmpty()) {
            sb.append(", results=");
            sb.append(this.results);
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
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "AIGroupShotCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241391Co5)) {
            return false;
        }
        C2241391Co5 c2241391Co5 = (C2241391Co5) obj;
        if (unknownFields().equals(c2241391Co5.unknownFields()) && C1516540pZE.LJ(this.task_id, c2241391Co5.task_id) && C1516540pZE.LJ(this.creator_id, c2241391Co5.creator_id) && C1516540pZE.LJ(this.template_info, c2241391Co5.template_info) && this.user_info.equals(c2241391Co5.user_info) && this.results.equals(c2241391Co5.results) && C1516540pZE.LJ(this.status, c2241391Co5.status) && C1516540pZE.LJ(this.hide_card, c2241391Co5.hide_card) && C1516540pZE.LJ(this.tip, c2241391Co5.tip) && C1516540pZE.LJ(this.preview_hint, c2241391Co5.preview_hint) && C1516540pZE.LJ(this.req_base, c2241391Co5.req_base) && C1516540pZE.LJ(this.resp_base, c2241391Co5.resp_base)) {
            return true;
        }
        return false;
    }

    public C2241391Co5(String str, String str2, C2241421Co8 c2241421Co8, List<C1CNE> list, List<C2241451CoB> list2, EnumC2241491CoF enumC2241491CoF, Boolean bool, C2230151CQj c2230151CQj, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(str, str2, c2241421Co8, list, list2, enumC2241491CoF, bool, c2230151CQj, c2243941CsC, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2241391Co5(String str, String str2, C2241421Co8 c2241421Co8, List<C1CNE> list, List<C2241451CoB> list2, EnumC2241491CoF enumC2241491CoF, Boolean bool, C2230151CQj c2230151CQj, C2243941CsC c2243941CsC, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.task_id = str;
        this.creator_id = str2;
        this.template_info = c2241421Co8;
        this.user_info = C1516540pZE.LJFF("user_info", list);
        this.results = C1516540pZE.LJFF("results", list2);
        this.status = enumC2241491CoF;
        this.hide_card = bool;
        this.tip = c2230151CQj;
        this.preview_hint = c2243941CsC;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
