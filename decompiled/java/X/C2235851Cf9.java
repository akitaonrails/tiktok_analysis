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
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235851Cf9 extends Message<C2235851Cf9, C2235871CfB> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long anchor_invite_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final Map<String, String> extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInviteType#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC2232111CXx invite_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", tag = 3)
    public final C2232021CXo invitee;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInviteeParam#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<C2227361CFq> invitee_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long max_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final Boolean notice_confirmed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final List<Long> out_room_invitee_list;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPositionData#ADAPTER", tag = 2)
    public final C1CEH position_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 8)
    public final Long scene_version;
    public static final ProtoAdapter<C2235851Cf9> ADAPTER = new ProtoAdapter<C2235851Cf9>() { // from class: X.1CfA
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235851Cf9 decode(ProtoReader protoReader) {
            C2235871CfB c2235871CfB = new C2235871CfB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2235871CfB.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2235871CfB.LJ = C1CEH.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2235871CfB.LJFF = C2232021CXo.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2235871CfB.LJI = EnumC2232111CXx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2235871CfB.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c2235871CfB.LJII.add(C2227361CFq.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c2235871CfB.LJIIIIZZ.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 7:
                            c2235871CfB.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2235871CfB.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2235871CfB.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2235871CfB.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2235871CfB.LJIILIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2235871CfB.LJIILJJIL.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2235871CfB.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235871CfB.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235851Cf9 c2235851Cf9) {
            C2235851Cf9 c2235851Cf92 = c2235851Cf9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2235851Cf92.invoke_id) + C1CEH.ADAPTER.encodedSizeWithTag(2, c2235851Cf92.position_data) + C2232021CXo.ADAPTER.encodedSizeWithTag(3, c2235851Cf92.invitee) + EnumC2232111CXx.ADAPTER.encodedSizeWithTag(4, c2235851Cf92.invite_type) + C2227361CFq.ADAPTER.asRepeated().encodedSizeWithTag(5, c2235851Cf92.invitee_list) + this.LIZ.encodedSizeWithTag(6, c2235851Cf92.extra);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c2235851Cf92.max_position) + protoAdapter2.encodedSizeWithTag(8, c2235851Cf92.scene_version) + protoAdapter.encodedSizeWithTag(9, c2235851Cf92.layout_id) + protoAdapter2.encodedSizeWithTag(10, c2235851Cf92.anchor_invite_source) + ProtoAdapter.BOOL.encodedSizeWithTag(11, c2235851Cf92.notice_confirmed) + protoAdapter2.asPacked().encodedSizeWithTag(12, c2235851Cf92.out_room_invitee_list) + c2235851Cf92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235851Cf9 redact(C2235851Cf9 c2235851Cf9) {
            C2235871CfB c2235871CfBNewBuilder = c2235851Cf9.newBuilder();
            C1CEH c1ceh = c2235871CfBNewBuilder.LJ;
            if (c1ceh != null) {
                c2235871CfBNewBuilder.LJ = C1CEH.ADAPTER.redact(c1ceh);
            }
            C2232021CXo c2232021CXo = c2235871CfBNewBuilder.LJFF;
            if (c2232021CXo != null) {
                c2235871CfBNewBuilder.LJFF = C2232021CXo.ADAPTER.redact(c2232021CXo);
            }
            C1516540pZE.LJIIIZ(c2235871CfBNewBuilder.LJII, C2227361CFq.ADAPTER);
            c2235871CfBNewBuilder.clearUnknownFields();
            return c2235871CfBNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235851Cf9 c2235851Cf9) {
            C2235851Cf9 c2235851Cf92 = c2235851Cf9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2235851Cf92.invoke_id);
            C1CEH.ADAPTER.encodeWithTag(protoWriter, 2, c2235851Cf92.position_data);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 3, c2235851Cf92.invitee);
            EnumC2232111CXx.ADAPTER.encodeWithTag(protoWriter, 4, c2235851Cf92.invite_type);
            C2227361CFq.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c2235851Cf92.invitee_list);
            this.LIZ.encodeWithTag(protoWriter, 6, c2235851Cf92.extra);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 7, c2235851Cf92.max_position);
            protoAdapter2.encodeWithTag(protoWriter, 8, c2235851Cf92.scene_version);
            protoAdapter.encodeWithTag(protoWriter, 9, c2235851Cf92.layout_id);
            protoAdapter2.encodeWithTag(protoWriter, 10, c2235851Cf92.anchor_invite_source);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, c2235851Cf92.notice_confirmed);
            protoAdapter2.asPacked().encodeWithTag(protoWriter, 12, c2235851Cf92.out_room_invitee_list);
            protoWriter.writeBytes(c2235851Cf92.unknownFields());
        }
    };
    public static final EnumC2232111CXx DEFAULT_INVITE_TYPE = EnumC2232111CXx.VAR_LINK_MIC_INVITE_TYPE_LEGACY_INVITEE;
    public static final Long DEFAULT_MAX_POSITION = 0L;
    public static final Long DEFAULT_SCENE_VERSION = 0L;
    public static final Long DEFAULT_ANCHOR_INVITE_SOURCE = 0L;
    public static final Boolean DEFAULT_NOTICE_CONFIRMED = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37;
        C1CEH c1ceh = this.position_data;
        int iHashCode2 = (iHashCode + (c1ceh != null ? c1ceh.hashCode() : 0)) * 37;
        C2232021CXo c2232021CXo = this.invitee;
        int iHashCode3 = (((((((((((iHashCode2 + (c2232021CXo != null ? c2232021CXo.hashCode() : 0)) * 37) + this.invite_type.hashCode()) * 37) + this.invitee_list.hashCode()) * 37) + this.extra.hashCode()) * 37) + this.max_position.hashCode()) * 37) + this.scene_version.hashCode()) * 37;
        String str = this.layout_id;
        int iHashCode4 = ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.anchor_invite_source.hashCode()) * 37) + this.notice_confirmed.hashCode()) * 37) + this.out_room_invitee_list.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2235871CfB newBuilder() {
        C2235871CfB c2235871CfB = new C2235871CfB();
        c2235871CfB.LIZLLL = this.invoke_id;
        c2235871CfB.LJ = this.position_data;
        c2235871CfB.LJFF = this.invitee;
        c2235871CfB.LJI = this.invite_type;
        c2235871CfB.LJII = C1516540pZE.LIZJ("invitee_list", this.invitee_list);
        c2235871CfB.LJIIIIZZ = C1516540pZE.LIZLLL("extra", this.extra);
        c2235871CfB.LJIIIZ = this.max_position;
        c2235871CfB.LJIIJ = this.scene_version;
        c2235871CfB.LJIIJJI = this.layout_id;
        c2235871CfB.LJIIL = this.anchor_invite_source;
        c2235871CfB.LJIILIIL = this.notice_confirmed;
        c2235871CfB.LJIILJJIL = C1516540pZE.LIZJ("out_room_invitee_list", this.out_room_invitee_list);
        c2235871CfB.addUnknownFields(unknownFields());
        return c2235871CfB;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        if (this.position_data != null) {
            sb.append(", position_data=");
            sb.append(this.position_data);
        }
        if (this.invitee != null) {
            sb.append(", invitee=");
            sb.append(this.invitee);
        }
        sb.append(", invite_type=");
        sb.append(this.invite_type);
        if (!this.invitee_list.isEmpty()) {
            sb.append(", invitee_list=");
            sb.append(this.invitee_list);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.append(", max_position=");
        sb.append(this.max_position);
        sb.append(", scene_version=");
        sb.append(this.scene_version);
        if (this.layout_id != null) {
            sb.append(", layout_id=");
            sb.append(this.layout_id);
        }
        sb.append(", anchor_invite_source=");
        sb.append(this.anchor_invite_source);
        sb.append(", notice_confirmed=");
        sb.append(this.notice_confirmed);
        if (!this.out_room_invitee_list.isEmpty()) {
            sb.append(", out_room_invitee_list=");
            sb.append(this.out_room_invitee_list);
        }
        sb.replace(0, 2, "LinkMicInviteParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235851Cf9)) {
            return false;
        }
        C2235851Cf9 c2235851Cf9 = (C2235851Cf9) obj;
        if (unknownFields().equals(c2235851Cf9.unknownFields()) && this.invoke_id.equals(c2235851Cf9.invoke_id) && C1516540pZE.LJ(this.position_data, c2235851Cf9.position_data) && C1516540pZE.LJ(this.invitee, c2235851Cf9.invitee) && this.invite_type.equals(c2235851Cf9.invite_type) && this.invitee_list.equals(c2235851Cf9.invitee_list) && this.extra.equals(c2235851Cf9.extra) && this.max_position.equals(c2235851Cf9.max_position) && this.scene_version.equals(c2235851Cf9.scene_version) && C1516540pZE.LJ(this.layout_id, c2235851Cf9.layout_id) && this.anchor_invite_source.equals(c2235851Cf9.anchor_invite_source) && this.notice_confirmed.equals(c2235851Cf9.notice_confirmed) && this.out_room_invitee_list.equals(c2235851Cf9.out_room_invitee_list)) {
            return true;
        }
        return false;
    }

    public C2235851Cf9(String str, C1CEH c1ceh, C2232021CXo c2232021CXo, EnumC2232111CXx enumC2232111CXx, List<C2227361CFq> list, Map<String, String> map, Long l, Long l2, String str2, Long l3, Boolean bool, List<Long> list2) {
        this(str, c1ceh, c2232021CXo, enumC2232111CXx, list, map, l, l2, str2, l3, bool, list2, ByteString.EMPTY);
    }

    public C2235851Cf9(String str, C1CEH c1ceh, C2232021CXo c2232021CXo, EnumC2232111CXx enumC2232111CXx, List<C2227361CFq> list, Map<String, String> map, Long l, Long l2, String str2, Long l3, Boolean bool, List<Long> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.position_data = c1ceh;
        this.invitee = c2232021CXo;
        this.invite_type = enumC2232111CXx;
        this.invitee_list = C1516540pZE.LJFF("invitee_list", list);
        this.extra = C1516540pZE.LJI("extra", map);
        this.max_position = l;
        this.scene_version = l2;
        this.layout_id = str2;
        this.anchor_invite_source = l3;
        this.notice_confirmed = bool;
        this.out_room_invitee_list = C1516540pZE.LJFF("out_room_invitee_list", list2);
    }
}
