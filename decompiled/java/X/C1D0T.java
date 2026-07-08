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

/* JADX INFO: renamed from: X.1D0T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0T extends Message<C1D0T, C1D0X> {
    public static final Long DEFAULT_BATTLE_ID;
    public static final Double DEFAULT_CANVAS_HEIGHT;
    public static final Double DEFAULT_CANVAS_WIDTH;
    public static final Double DEFAULT_CONTAINER_OFFSET_Y;
    public static final Boolean DEFAULT_IS_FORCE_PUSH_AUDIO_STEAM;
    public static final C1CXG DEFAULT_ROOM_PERMISSION_V2;
    public static final Long DEFAULT_SUB_SCENE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 19)
    public final String background;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 8)
    public final Long battle_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final String business_extra_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 7)
    public final Double canvas_height;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 6)
    public final Double canvas_width;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Double container_offset_y;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcSeiGridInfo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Map<String, C1CSD> content_id_to_grid_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String dsl_layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long dsl_layout_scene_override;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long dsl_layout_scene_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public final Boolean is_force_push_audio_steam;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcSeiGridInfo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_EMAIL)
    public final Map<String, C1CSD> link_mic_id_to_grid_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final List<String> local_change_link_mic_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT)
    public final String mix_background_color;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLiveRoomPermission#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2182911Abx room_permission;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLiveRoomPermissionV2#ADAPTER", label = WireField.Label.REQUIRED, tag = 21)
    public final C1CXG room_permission_v2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final Long sub_scene;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 16)
    public final String sync_layout_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicStreamVendorVersion#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2182371Ab5 vendor_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 14)
    public final String zoomed_linkmic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String zoomed_position;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REPEATED, tag = 22)
    public final List<C1CW4> zoomed_positions;
    public static final ProtoAdapter<C1D0T> ADAPTER = new ProtoAdapter<C1D0T>() { // from class: X.1D0U
        public final ProtoAdapter<Map<String, C1CSD>> LIZ;
        public final ProtoAdapter<Map<String, C1CSD>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            ProtoAdapter<C1CSD> protoAdapter2 = C1CSD.ADAPTER;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0T decode(ProtoReader protoReader) {
            C1D0X c1d0x = new C1D0X();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c1d0x.LIZLLL = EnumC2182911Abx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1d0x.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            try {
                                c1d0x.LJ = EnumC2182371Ab5.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c1d0x.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 3:
                            c1d0x.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1d0x.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1d0x.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1d0x.LJIIIIZZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            c1d0x.LJIIIZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 8:
                            c1d0x.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1d0x.LJIIJJI = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1d0x.LJIIL.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1d0x.LJIILIIL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1d0x.LJIILJJIL.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1d0x.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c1d0x.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c1d0x.LJIIZILJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c1d0x.LJIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1d0x.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1d0x.LJIJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c1d0x.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1d0x.LJIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 21:
                            try {
                                c1d0x.LJJ = C1CXG.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1d0x.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 22:
                            c1d0x.LJJI.add(C1CW4.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1d0x.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d0x.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D0T c1d0t) {
            C1D0T c1d0t2 = c1d0t;
            int iEncodedSizeWithTag = EnumC2182911Abx.ADAPTER.encodedSizeWithTag(1, c1d0t2.room_permission) + EnumC2182371Ab5.ADAPTER.encodedSizeWithTag(2, c1d0t2.vendor_version);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c1d0t2.dsl_layout_scene_override) + protoAdapter.encodedSizeWithTag(4, c1d0t2.dsl_layout_scene_version);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, c1d0t2.dsl_layout_id);
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(6, c1d0t2.canvas_width) + protoAdapter3.encodedSizeWithTag(7, c1d0t2.canvas_height) + protoAdapter.encodedSizeWithTag(8, c1d0t2.battle_id) + protoAdapter3.encodedSizeWithTag(9, c1d0t2.container_offset_y) + protoAdapter2.asRepeated().encodedSizeWithTag(10, c1d0t2.local_change_link_mic_ids) + this.LIZ.encodedSizeWithTag(11, c1d0t2.link_mic_id_to_grid_info) + this.LIZIZ.encodedSizeWithTag(12, c1d0t2.content_id_to_grid_info) + protoAdapter2.encodedSizeWithTag(13, c1d0t2.business_extra_info) + protoAdapter2.encodedSizeWithTag(14, c1d0t2.zoomed_linkmic_id) + protoAdapter2.encodedSizeWithTag(15, c1d0t2.zoomed_position) + protoAdapter2.encodedSizeWithTag(16, c1d0t2.sync_layout_id) + protoAdapter.encodedSizeWithTag(17, c1d0t2.sub_scene) + protoAdapter2.encodedSizeWithTag(18, c1d0t2.mix_background_color) + protoAdapter2.encodedSizeWithTag(19, c1d0t2.background) + ProtoAdapter.BOOL.encodedSizeWithTag(20, c1d0t2.is_force_push_audio_steam) + C1CXG.ADAPTER.encodedSizeWithTag(21, c1d0t2.room_permission_v2) + C1CW4.ADAPTER.asRepeated().encodedSizeWithTag(22, c1d0t2.zoomed_positions) + c1d0t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0T redact(C1D0T c1d0t) {
            C1D0X c1d0xNewBuilder = c1d0t.newBuilder();
            Map<String, C1CSD> map = c1d0xNewBuilder.LJIILIIL;
            ProtoAdapter<C1CSD> protoAdapter = C1CSD.ADAPTER;
            C1516540pZE.LJIIJ(map, protoAdapter);
            C1516540pZE.LJIIJ(c1d0xNewBuilder.LJIILJJIL, protoAdapter);
            C1516540pZE.LJIIIZ(c1d0xNewBuilder.LJJI, C1CW4.ADAPTER);
            c1d0xNewBuilder.clearUnknownFields();
            return c1d0xNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D0T c1d0t) {
            C1D0T c1d0t2 = c1d0t;
            EnumC2182911Abx.ADAPTER.encodeWithTag(protoWriter, 1, c1d0t2.room_permission);
            EnumC2182371Ab5.ADAPTER.encodeWithTag(protoWriter, 2, c1d0t2.vendor_version);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, c1d0t2.dsl_layout_scene_override);
            protoAdapter.encodeWithTag(protoWriter, 4, c1d0t2.dsl_layout_scene_version);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 5, c1d0t2.dsl_layout_id);
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            protoAdapter3.encodeWithTag(protoWriter, 6, c1d0t2.canvas_width);
            protoAdapter3.encodeWithTag(protoWriter, 7, c1d0t2.canvas_height);
            protoAdapter.encodeWithTag(protoWriter, 8, c1d0t2.battle_id);
            protoAdapter3.encodeWithTag(protoWriter, 9, c1d0t2.container_offset_y);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 10, c1d0t2.local_change_link_mic_ids);
            this.LIZ.encodeWithTag(protoWriter, 11, c1d0t2.link_mic_id_to_grid_info);
            this.LIZIZ.encodeWithTag(protoWriter, 12, c1d0t2.content_id_to_grid_info);
            protoAdapter2.encodeWithTag(protoWriter, 13, c1d0t2.business_extra_info);
            protoAdapter2.encodeWithTag(protoWriter, 14, c1d0t2.zoomed_linkmic_id);
            protoAdapter2.encodeWithTag(protoWriter, 15, c1d0t2.zoomed_position);
            protoAdapter2.encodeWithTag(protoWriter, 16, c1d0t2.sync_layout_id);
            protoAdapter.encodeWithTag(protoWriter, 17, c1d0t2.sub_scene);
            protoAdapter2.encodeWithTag(protoWriter, 18, c1d0t2.mix_background_color);
            protoAdapter2.encodeWithTag(protoWriter, 19, c1d0t2.background);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 20, c1d0t2.is_force_push_audio_steam);
            C1CXG.ADAPTER.encodeWithTag(protoWriter, 21, c1d0t2.room_permission_v2);
            C1CW4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, c1d0t2.zoomed_positions);
            protoWriter.writeBytes(c1d0t2.unknownFields());
        }
    };
    public static final EnumC2182911Abx DEFAULT_ROOM_PERMISSION = EnumC2182911Abx.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_ALL_VIEWERS;
    public static final EnumC2182371Ab5 DEFAULT_VENDOR_VERSION = EnumC2182371Ab5.VAR_LINK_MIC_STREAM_VENDOR_VERSION_UNKNOWN;
    public static final Long DEFAULT_DSL_LAYOUT_SCENE_OVERRIDE = 0L;
    public static final Long DEFAULT_DSL_LAYOUT_SCENE_VERSION = 0L;

    static {
        Double dValueOf = Double.valueOf(0.0d);
        DEFAULT_CANVAS_WIDTH = dValueOf;
        DEFAULT_CANVAS_HEIGHT = dValueOf;
        DEFAULT_BATTLE_ID = 0L;
        DEFAULT_CONTAINER_OFFSET_Y = dValueOf;
        DEFAULT_SUB_SCENE = 0L;
        DEFAULT_IS_FORCE_PUSH_AUDIO_STEAM = Boolean.FALSE;
        DEFAULT_ROOM_PERMISSION_V2 = C1CXG.VAR_LINK_MIC_LIVE_ROOM_PERMISSION_V2_FRIENDS_OFF_FOLLOWERS_OFF_OTHERS_OFF;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.room_permission.hashCode()) * 37) + this.vendor_version.hashCode()) * 37) + this.dsl_layout_scene_override.hashCode()) * 37) + this.dsl_layout_scene_version.hashCode()) * 37) + this.dsl_layout_id.hashCode()) * 37) + this.canvas_width.hashCode()) * 37) + this.canvas_height.hashCode()) * 37) + this.battle_id.hashCode()) * 37) + this.container_offset_y.hashCode()) * 37) + this.local_change_link_mic_ids.hashCode()) * 37) + this.link_mic_id_to_grid_info.hashCode()) * 37) + this.content_id_to_grid_info.hashCode()) * 37) + this.business_extra_info.hashCode()) * 37) + this.zoomed_linkmic_id.hashCode()) * 37;
        String str = this.zoomed_position;
        int iHashCode2 = ((((((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.sync_layout_id.hashCode()) * 37) + this.sub_scene.hashCode()) * 37) + this.mix_background_color.hashCode()) * 37) + this.background.hashCode()) * 37) + this.is_force_push_audio_steam.hashCode()) * 37) + this.room_permission_v2.hashCode()) * 37) + this.zoomed_positions.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1D0X newBuilder() {
        C1D0X c1d0x = new C1D0X();
        c1d0x.LIZLLL = this.room_permission;
        c1d0x.LJ = this.vendor_version;
        c1d0x.LJFF = this.dsl_layout_scene_override;
        c1d0x.LJI = this.dsl_layout_scene_version;
        c1d0x.LJII = this.dsl_layout_id;
        c1d0x.LJIIIIZZ = this.canvas_width;
        c1d0x.LJIIIZ = this.canvas_height;
        c1d0x.LJIIJ = this.battle_id;
        c1d0x.LJIIJJI = this.container_offset_y;
        c1d0x.LJIIL = C1516540pZE.LIZJ("local_change_link_mic_ids", this.local_change_link_mic_ids);
        c1d0x.LJIILIIL = C1516540pZE.LIZLLL("link_mic_id_to_grid_info", this.link_mic_id_to_grid_info);
        c1d0x.LJIILJJIL = C1516540pZE.LIZLLL("content_id_to_grid_info", this.content_id_to_grid_info);
        c1d0x.LJIILL = this.business_extra_info;
        c1d0x.LJIILLIIL = this.zoomed_linkmic_id;
        c1d0x.LJIIZILJ = this.zoomed_position;
        c1d0x.LJIJ = this.sync_layout_id;
        c1d0x.LJIJI = this.sub_scene;
        c1d0x.LJIJJ = this.mix_background_color;
        c1d0x.LJIJJLI = this.background;
        c1d0x.LJIL = this.is_force_push_audio_steam;
        c1d0x.LJJ = this.room_permission_v2;
        c1d0x.LJJI = C1516540pZE.LIZJ("zoomed_positions", this.zoomed_positions);
        c1d0x.addUnknownFields(unknownFields());
        return c1d0x;
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
        sb.append(", dsl_layout_scene_version=");
        sb.append(this.dsl_layout_scene_version);
        sb.append(", dsl_layout_id=");
        sb.append(this.dsl_layout_id);
        sb.append(", canvas_width=");
        sb.append(this.canvas_width);
        sb.append(", canvas_height=");
        sb.append(this.canvas_height);
        sb.append(", battle_id=");
        sb.append(this.battle_id);
        sb.append(", container_offset_y=");
        sb.append(this.container_offset_y);
        if (!this.local_change_link_mic_ids.isEmpty()) {
            sb.append(", local_change_link_mic_ids=");
            sb.append(this.local_change_link_mic_ids);
        }
        if (!this.link_mic_id_to_grid_info.isEmpty()) {
            sb.append(", link_mic_id_to_grid_info=");
            sb.append(this.link_mic_id_to_grid_info);
        }
        if (!this.content_id_to_grid_info.isEmpty()) {
            sb.append(", content_id_to_grid_info=");
            sb.append(this.content_id_to_grid_info);
        }
        sb.append(", business_extra_info=");
        sb.append(this.business_extra_info);
        sb.append(", zoomed_linkmic_id=");
        sb.append(this.zoomed_linkmic_id);
        if (this.zoomed_position != null) {
            sb.append(", zoomed_position=");
            sb.append(this.zoomed_position);
        }
        sb.append(", sync_layout_id=");
        sb.append(this.sync_layout_id);
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
        sb.replace(0, 2, "LinkMicBizRtcSeiConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1D0T)) {
            return false;
        }
        C1D0T c1d0t = (C1D0T) obj;
        if (unknownFields().equals(c1d0t.unknownFields()) && this.room_permission.equals(c1d0t.room_permission) && this.vendor_version.equals(c1d0t.vendor_version) && this.dsl_layout_scene_override.equals(c1d0t.dsl_layout_scene_override) && this.dsl_layout_scene_version.equals(c1d0t.dsl_layout_scene_version) && this.dsl_layout_id.equals(c1d0t.dsl_layout_id) && this.canvas_width.equals(c1d0t.canvas_width) && this.canvas_height.equals(c1d0t.canvas_height) && this.battle_id.equals(c1d0t.battle_id) && this.container_offset_y.equals(c1d0t.container_offset_y) && this.local_change_link_mic_ids.equals(c1d0t.local_change_link_mic_ids) && this.link_mic_id_to_grid_info.equals(c1d0t.link_mic_id_to_grid_info) && this.content_id_to_grid_info.equals(c1d0t.content_id_to_grid_info) && this.business_extra_info.equals(c1d0t.business_extra_info) && this.zoomed_linkmic_id.equals(c1d0t.zoomed_linkmic_id) && C1516540pZE.LJ(this.zoomed_position, c1d0t.zoomed_position) && this.sync_layout_id.equals(c1d0t.sync_layout_id) && this.sub_scene.equals(c1d0t.sub_scene) && this.mix_background_color.equals(c1d0t.mix_background_color) && this.background.equals(c1d0t.background) && this.is_force_push_audio_steam.equals(c1d0t.is_force_push_audio_steam) && this.room_permission_v2.equals(c1d0t.room_permission_v2) && this.zoomed_positions.equals(c1d0t.zoomed_positions)) {
            return true;
        }
        return false;
    }

    public C1D0T(EnumC2182911Abx enumC2182911Abx, EnumC2182371Ab5 enumC2182371Ab5, Long l, Long l2, String str, Double d, Double d2, Long l3, Double d3, List<String> list, Map<String, C1CSD> map, Map<String, C1CSD> map2, String str2, String str3, String str4, String str5, Long l4, String str6, String str7, Boolean bool, C1CXG c1cxg, List<C1CW4> list2) {
        this(enumC2182911Abx, enumC2182371Ab5, l, l2, str, d, d2, l3, d3, list, map, map2, str2, str3, str4, str5, l4, str6, str7, bool, c1cxg, list2, ByteString.EMPTY);
    }

    public C1D0T(EnumC2182911Abx enumC2182911Abx, EnumC2182371Ab5 enumC2182371Ab5, Long l, Long l2, String str, Double d, Double d2, Long l3, Double d3, List<String> list, Map<String, C1CSD> map, Map<String, C1CSD> map2, String str2, String str3, String str4, String str5, Long l4, String str6, String str7, Boolean bool, C1CXG c1cxg, List<C1CW4> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_permission = enumC2182911Abx;
        this.vendor_version = enumC2182371Ab5;
        this.dsl_layout_scene_override = l;
        this.dsl_layout_scene_version = l2;
        this.dsl_layout_id = str;
        this.canvas_width = d;
        this.canvas_height = d2;
        this.battle_id = l3;
        this.container_offset_y = d3;
        this.local_change_link_mic_ids = C1516540pZE.LJFF("local_change_link_mic_ids", list);
        this.link_mic_id_to_grid_info = C1516540pZE.LJI("link_mic_id_to_grid_info", map);
        this.content_id_to_grid_info = C1516540pZE.LJI("content_id_to_grid_info", map2);
        this.business_extra_info = str2;
        this.zoomed_linkmic_id = str3;
        this.zoomed_position = str4;
        this.sync_layout_id = str5;
        this.sub_scene = l4;
        this.mix_background_color = str6;
        this.background = str7;
        this.is_force_push_audio_steam = bool;
        this.room_permission_v2 = c1cxg;
        this.zoomed_positions = C1516540pZE.LJFF("zoomed_positions", list2);
    }
}
