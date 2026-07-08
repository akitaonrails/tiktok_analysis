package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
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

/* JADX INFO: renamed from: X.1D0V, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0V extends Message<C1D0V, C1D0Y> {
    public static final Boolean DEFAULT_IS_FORCE_PUSH_AUDIO_STEAM;
    public static final Boolean DEFAULT_NEED_OLD_CORNER_RADIUS;
    public static final C1CXG DEFAULT_ROOM_PERMISSION_V2;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final String background;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long battle_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 7)
    public final String business_extra_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long dsl_layout_scene_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final Map<String, String> grid_business_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final Boolean is_force_push_audio_steam;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 5)
    public final List<String> local_change_link_mic_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final String mix_background_color;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final Boolean need_old_corner_radius;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLiveRoomPermission#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2182911Abx room_permission;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLiveRoomPermissionV2#ADAPTER", label = WireField.Label.REQUIRED, tag = 14)
    public final C1CXG room_permission_v2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long sub_scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 16)
    public final List<String> talk_link_mic_ids;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicStreamVendorVersion#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2182371Ab5 vendor_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 8)
    public final String zoomed_linkmic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String zoomed_position;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REPEATED, tag = 15)
    public final List<C1CW4> zoomed_positions;
    public static final ProtoAdapter<C1D0V> ADAPTER = new ProtoAdapter<C1D0V>() { // from class: X.1D0W
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0V decode(ProtoReader protoReader) {
            C1D0Y c1d0y = new C1D0Y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c1d0y.LIZLLL = EnumC2182911Abx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1d0y.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            try {
                                c1d0y.LJ = EnumC2182371Ab5.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c1d0y.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 3:
                            c1d0y.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1d0y.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1d0y.LJII.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c1d0y.LJIIIIZZ.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 7:
                            c1d0y.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1d0y.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1d0y.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1d0y.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1d0y.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1d0y.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1d0y.LJIILL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            try {
                                c1d0y.LJIILLIIL = C1CXG.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1d0y.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 15:
                            c1d0y.LJIIZILJ.add(C1CW4.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            c1d0y.LJIJ.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1d0y.LJIJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1d0y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d0y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D0V c1d0v) {
            C1D0V c1d0v2 = c1d0v;
            int iEncodedSizeWithTag = EnumC2182911Abx.ADAPTER.encodedSizeWithTag(1, c1d0v2.room_permission) + EnumC2182371Ab5.ADAPTER.encodedSizeWithTag(2, c1d0v2.vendor_version);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1d0v2.dsl_layout_scene_override) + protoAdapter.encodedSizeWithTag(4, c1d0v2.battle_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.asRepeated().encodedSizeWithTag(5, c1d0v2.local_change_link_mic_ids) + this.LIZ.encodedSizeWithTag(6, c1d0v2.grid_business_extra) + protoAdapter2.encodedSizeWithTag(7, c1d0v2.business_extra_info) + protoAdapter2.encodedSizeWithTag(8, c1d0v2.zoomed_linkmic_id) + protoAdapter2.encodedSizeWithTag(9, c1d0v2.zoomed_position) + protoAdapter.encodedSizeWithTag(10, c1d0v2.sub_scene) + protoAdapter2.encodedSizeWithTag(11, c1d0v2.mix_background_color) + protoAdapter2.encodedSizeWithTag(12, c1d0v2.background);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(13, c1d0v2.is_force_push_audio_steam) + C1CXG.ADAPTER.encodedSizeWithTag(14, c1d0v2.room_permission_v2) + C1CW4.ADAPTER.asRepeated().encodedSizeWithTag(15, c1d0v2.zoomed_positions) + protoAdapter2.asRepeated().encodedSizeWithTag(16, c1d0v2.talk_link_mic_ids) + protoAdapter3.encodedSizeWithTag(17, c1d0v2.need_old_corner_radius) + c1d0v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0V redact(C1D0V c1d0v) {
            C1D0Y c1d0yNewBuilder = c1d0v.newBuilder();
            C1516540pZE.LJIIIZ(c1d0yNewBuilder.LJIIZILJ, C1CW4.ADAPTER);
            c1d0yNewBuilder.clearUnknownFields();
            return c1d0yNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D0V c1d0v) {
            C1D0V c1d0v2 = c1d0v;
            EnumC2182911Abx.ADAPTER.encodeWithTag(protoWriter, 1, c1d0v2.room_permission);
            EnumC2182371Ab5.ADAPTER.encodeWithTag(protoWriter, 2, c1d0v2.vendor_version);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c1d0v2.dsl_layout_scene_override);
            protoAdapter.encodeWithTag(protoWriter, 4, c1d0v2.battle_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c1d0v2.local_change_link_mic_ids);
            this.LIZ.encodeWithTag(protoWriter, 6, c1d0v2.grid_business_extra);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1d0v2.business_extra_info);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1d0v2.zoomed_linkmic_id);
            protoAdapter2.encodeWithTag(protoWriter, 9, c1d0v2.zoomed_position);
            protoAdapter.encodeWithTag(protoWriter, 10, c1d0v2.sub_scene);
            protoAdapter2.encodeWithTag(protoWriter, 11, c1d0v2.mix_background_color);
            protoAdapter2.encodeWithTag(protoWriter, 12, c1d0v2.background);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 13, c1d0v2.is_force_push_audio_steam);
            C1CXG.ADAPTER.encodeWithTag(protoWriter, 14, c1d0v2.room_permission_v2);
            C1CW4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, c1d0v2.zoomed_positions);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 16, c1d0v2.talk_link_mic_ids);
            protoAdapter3.encodeWithTag(protoWriter, 17, c1d0v2.need_old_corner_radius);
            protoWriter.writeBytes(c1d0v2.unknownFields());
        }
    };
    public static final EnumC2182911Abx DEFAULT_ROOM_PERMISSION = EnumC2182911Abx.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ALL_VIEWERS;
    public static final EnumC2182371Ab5 DEFAULT_VENDOR_VERSION = EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_UNKNOWN;
    public static final Long DEFAULT_DSL_LAYOUT_SCENE_OVERRIDE = 0L;
    public static final Long DEFAULT_BATTLE_ID = 0L;
    public static final Long DEFAULT_SUB_SCENE = 0L;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_FORCE_PUSH_AUDIO_STEAM = bool;
        DEFAULT_ROOM_PERMISSION_V2 = C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_OFF;
        DEFAULT_NEED_OLD_CORNER_RADIUS = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((unknownFields().hashCode() * 37) + this.room_permission.hashCode()) * 37) + this.vendor_version.hashCode()) * 37) + this.dsl_layout_scene_override.hashCode()) * 37) + this.battle_id.hashCode()) * 37) + this.local_change_link_mic_ids.hashCode()) * 37) + this.grid_business_extra.hashCode()) * 37) + this.business_extra_info.hashCode()) * 37) + this.zoomed_linkmic_id.hashCode()) * 37;
        String str = this.zoomed_position;
        int iHashCode2 = ((((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.sub_scene.hashCode()) * 37) + this.mix_background_color.hashCode()) * 37) + this.background.hashCode()) * 37) + this.is_force_push_audio_steam.hashCode()) * 37) + this.room_permission_v2.hashCode()) * 37) + this.zoomed_positions.hashCode()) * 37) + this.talk_link_mic_ids.hashCode()) * 37) + this.need_old_corner_radius.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1D0Y newBuilder() {
        C1D0Y c1d0y = new C1D0Y();
        c1d0y.LIZLLL = this.room_permission;
        c1d0y.LJ = this.vendor_version;
        c1d0y.LJFF = this.dsl_layout_scene_override;
        c1d0y.LJI = this.battle_id;
        c1d0y.LJII = C1516540pZE.LIZJ("local_change_link_mic_ids", this.local_change_link_mic_ids);
        c1d0y.LJIIIIZZ = C1516540pZE.LIZLLL("grid_business_extra", this.grid_business_extra);
        c1d0y.LJIIIZ = this.business_extra_info;
        c1d0y.LJIIJ = this.zoomed_linkmic_id;
        c1d0y.LJIIJJI = this.zoomed_position;
        c1d0y.LJIIL = this.sub_scene;
        c1d0y.LJIILIIL = this.mix_background_color;
        c1d0y.LJIILJJIL = this.background;
        c1d0y.LJIILL = this.is_force_push_audio_steam;
        c1d0y.LJIILLIIL = this.room_permission_v2;
        c1d0y.LJIIZILJ = C1516540pZE.LIZJ("zoomed_positions", this.zoomed_positions);
        c1d0y.LJIJ = C1516540pZE.LIZJ("talk_link_mic_ids", this.talk_link_mic_ids);
        c1d0y.LJIJI = this.need_old_corner_radius;
        c1d0y.addUnknownFields(unknownFields());
        return c1d0y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", room_permission=");
        sb.append(this.room_permission);
        sb.append(", vendor_version=");
        sb.append(this.vendor_version);
        sb.append(", dsl_layout_scene_override=");
        sb.append(this.dsl_layout_scene_override);
        sb.append(", battle_id=");
        sb.append(this.battle_id);
        if (!this.local_change_link_mic_ids.isEmpty()) {
            sb.append(", local_change_link_mic_ids=");
            sb.append(this.local_change_link_mic_ids);
        }
        if (!this.grid_business_extra.isEmpty()) {
            sb.append(", grid_business_extra=");
            sb.append(this.grid_business_extra);
        }
        sb.append(", business_extra_info=");
        sb.append(this.business_extra_info);
        sb.append(", zoomed_linkmic_id=");
        sb.append(this.zoomed_linkmic_id);
        if (this.zoomed_position != null) {
            sb.append(", zoomed_position=");
            sb.append(this.zoomed_position);
        }
        sb.append(", sub_scene=");
        sb.append(this.sub_scene);
        sb.append(", mix_background_color=");
        sb.append(this.mix_background_color);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", is_force_push_audio_steam=");
        sb.append(this.is_force_push_audio_steam);
        sb.append(", room_permission_v2=");
        sb.append(this.room_permission_v2);
        if (!this.zoomed_positions.isEmpty()) {
            sb.append(", zoomed_positions=");
            sb.append(this.zoomed_positions);
        }
        if (!this.talk_link_mic_ids.isEmpty()) {
            sb.append(", talk_link_mic_ids=");
            sb.append(this.talk_link_mic_ids);
        }
        sb.append(", need_old_corner_radius=");
        sb.append(this.need_old_corner_radius);
        sb.replace(0, 2, "LinkMicRustLayoutBizSeiConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1D0V)) {
            return false;
        }
        C1D0V c1d0v = (C1D0V) obj;
        if (unknownFields().equals(c1d0v.unknownFields()) && this.room_permission.equals(c1d0v.room_permission) && this.vendor_version.equals(c1d0v.vendor_version) && this.dsl_layout_scene_override.equals(c1d0v.dsl_layout_scene_override) && this.battle_id.equals(c1d0v.battle_id) && this.local_change_link_mic_ids.equals(c1d0v.local_change_link_mic_ids) && this.grid_business_extra.equals(c1d0v.grid_business_extra) && this.business_extra_info.equals(c1d0v.business_extra_info) && this.zoomed_linkmic_id.equals(c1d0v.zoomed_linkmic_id) && C1516540pZE.LJ(this.zoomed_position, c1d0v.zoomed_position) && this.sub_scene.equals(c1d0v.sub_scene) && this.mix_background_color.equals(c1d0v.mix_background_color) && this.background.equals(c1d0v.background) && this.is_force_push_audio_steam.equals(c1d0v.is_force_push_audio_steam) && this.room_permission_v2.equals(c1d0v.room_permission_v2) && this.zoomed_positions.equals(c1d0v.zoomed_positions) && this.talk_link_mic_ids.equals(c1d0v.talk_link_mic_ids) && this.need_old_corner_radius.equals(c1d0v.need_old_corner_radius)) {
            return true;
        }
        return false;
    }

    public C1D0V(EnumC2182911Abx enumC2182911Abx, EnumC2182371Ab5 enumC2182371Ab5, Long l, Long l2, List<String> list, Map<String, String> map, String str, String str2, String str3, Long l3, String str4, String str5, Boolean bool, C1CXG c1cxg, List<C1CW4> list2, List<String> list3, Boolean bool2) {
        this(enumC2182911Abx, enumC2182371Ab5, l, l2, list, map, str, str2, str3, l3, str4, str5, bool, c1cxg, list2, list3, bool2, ByteString.EMPTY);
    }

    public C1D0V(EnumC2182911Abx enumC2182911Abx, EnumC2182371Ab5 enumC2182371Ab5, Long l, Long l2, List<String> list, Map<String, String> map, String str, String str2, String str3, Long l3, String str4, String str5, Boolean bool, C1CXG c1cxg, List<C1CW4> list2, List<String> list3, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_permission = enumC2182911Abx;
        this.vendor_version = enumC2182371Ab5;
        this.dsl_layout_scene_override = l;
        this.battle_id = l2;
        this.local_change_link_mic_ids = C1516540pZE.LJFF("local_change_link_mic_ids", list);
        this.grid_business_extra = C1516540pZE.LJI("grid_business_extra", map);
        this.business_extra_info = str;
        this.zoomed_linkmic_id = str2;
        this.zoomed_position = str3;
        this.sub_scene = l3;
        this.mix_background_color = str4;
        this.background = str5;
        this.is_force_push_audio_steam = bool;
        this.room_permission_v2 = c1cxg;
        this.zoomed_positions = C1516540pZE.LJFF("zoomed_positions", list2);
        this.talk_link_mic_ids = C1516540pZE.LJFF("talk_link_mic_ids", list3);
        this.need_old_corner_radius = bool2;
    }
}
