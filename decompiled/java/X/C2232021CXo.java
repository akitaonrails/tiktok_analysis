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
import okio.ByteString;

/* JADX INFO: renamed from: X.1CXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232021CXo extends Message<C2232021CXo, C2232041CXq> {
    public static final Boolean DEFAULT_AUDIO_MUTED_BY_CHANNEL;
    public static final Boolean DEFAULT_AUDIO_OCCUPIED;
    public static final Boolean DEFAULT_AUDIO_SWITCH_ON;
    public static final Long DEFAULT_AVATAR_ID;
    public static final Long DEFAULT_GROUP_CHANNEL_ID;
    public static final C1CWW DEFAULT_ONLINE_USER_STATE;
    public static final Long DEFAULT_OWNER_CHANNEL_ID;
    public static final Long DEFAULT_OWNER_ROOM_ID;
    public static final Long DEFAULT_OWNER_UID;
    public static final C1CWY DEFAULT_RTC_CONNECTION_STATE;
    public static final C1CXN DEFAULT_TX_QUALITY;
    public static final EnumC2232011CXn DEFAULT_USER_TYPE;
    public static final Boolean DEFAULT_VIDEO_SWITCH_ON;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT)
    public final String app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 7)
    public final Boolean audio_muted_by_channel;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Boolean audio_occupied;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 8)
    public final Boolean audio_switch_on;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Long avatar_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 19)
    public final Long group_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public final String group_link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long join_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long linked_time;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicOnlineUserState#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final C1CWW online_user_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 15)
    public final Long owner_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 14)
    public final Long owner_room_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final Long owner_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long room_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final C1CWY rtc_connection_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcNetworkQuality#ADAPTER", label = WireField.Label.REQUIRED, tag = 16)
    public final C1CXN tx_quality;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long uid;

    @WireField(adapter = "link_mic_sdk.proto.LinkerUserType#ADAPTER", label = WireField.Label.REQUIRED, tag = 21)
    public final EnumC2232011CXn user_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Boolean video_switch_on;
    public static final ProtoAdapter<C2232021CXo> ADAPTER = new ProtoAdapter<C2232021CXo>() { // from class: X.1CXp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232021CXo decode(ProtoReader protoReader) {
            C2232041CXq c2232041CXq = new C2232041CXq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2232041CXq.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2232041CXq.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2232041CXq.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2232041CXq.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2232041CXq.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2232041CXq.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2232041CXq.LJIIIZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c2232041CXq.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2232041CXq.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2232041CXq.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            try {
                                c2232041CXq.LJIILIIL = C1CWW.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2232041CXq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2232041CXq.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2232041CXq.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c2232041CXq.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            c2232041CXq.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            try {
                                c2232041CXq.LJIJ = C1CXN.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2232041CXq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            try {
                                c2232041CXq.LJIJI = C1CWY.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2232041CXq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2232041CXq.LJIJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c2232041CXq.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c2232041CXq.LJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            try {
                                c2232041CXq.LJJ = EnumC2232011CXn.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c2232041CXq.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232041CXq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232041CXq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232021CXo c2232021CXo) {
            C2232021CXo c2232021CXo2 = c2232021CXo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2232021CXo2.room_id) + protoAdapter.encodedSizeWithTag(2, c2232021CXo2.channel_id) + protoAdapter.encodedSizeWithTag(3, c2232021CXo2.uid);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2232021CXo2.link_mic_id) + protoAdapter.encodedSizeWithTag(5, c2232021CXo2.join_time) + protoAdapter.encodedSizeWithTag(6, c2232021CXo2.linked_time);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c2232021CXo2.audio_muted_by_channel) + protoAdapter3.encodedSizeWithTag(8, c2232021CXo2.audio_switch_on) + protoAdapter3.encodedSizeWithTag(9, c2232021CXo2.video_switch_on) + protoAdapter3.encodedSizeWithTag(10, c2232021CXo2.audio_occupied) + C1CWW.ADAPTER.encodedSizeWithTag(11, c2232021CXo2.online_user_state) + protoAdapter.encodedSizeWithTag(12, c2232021CXo2.avatar_id) + protoAdapter.encodedSizeWithTag(13, c2232021CXo2.owner_uid) + protoAdapter.encodedSizeWithTag(14, c2232021CXo2.owner_room_id) + protoAdapter.encodedSizeWithTag(15, c2232021CXo2.owner_channel_id) + C1CXN.ADAPTER.encodedSizeWithTag(16, c2232021CXo2.tx_quality) + C1CWY.ADAPTER.encodedSizeWithTag(17, c2232021CXo2.rtc_connection_state) + protoAdapter2.encodedSizeWithTag(18, c2232021CXo2.app_version) + protoAdapter.encodedSizeWithTag(19, c2232021CXo2.group_channel_id) + protoAdapter2.encodedSizeWithTag(20, c2232021CXo2.group_link_mic_id) + EnumC2232011CXn.ADAPTER.encodedSizeWithTag(21, c2232021CXo2.user_type) + c2232021CXo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232021CXo redact(C2232021CXo c2232021CXo) {
            C2232041CXq c2232041CXqNewBuilder = c2232021CXo.newBuilder();
            c2232041CXqNewBuilder.clearUnknownFields();
            return c2232041CXqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232021CXo c2232021CXo) {
            C2232021CXo c2232021CXo2 = c2232021CXo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2232021CXo2.room_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2232021CXo2.channel_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c2232021CXo2.uid);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2232021CXo2.link_mic_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c2232021CXo2.join_time);
            protoAdapter.encodeWithTag(protoWriter, 6, c2232021CXo2.linked_time);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 7, c2232021CXo2.audio_muted_by_channel);
            protoAdapter3.encodeWithTag(protoWriter, 8, c2232021CXo2.audio_switch_on);
            protoAdapter3.encodeWithTag(protoWriter, 9, c2232021CXo2.video_switch_on);
            protoAdapter3.encodeWithTag(protoWriter, 10, c2232021CXo2.audio_occupied);
            C1CWW.ADAPTER.encodeWithTag(protoWriter, 11, c2232021CXo2.online_user_state);
            protoAdapter.encodeWithTag(protoWriter, 12, c2232021CXo2.avatar_id);
            protoAdapter.encodeWithTag(protoWriter, 13, c2232021CXo2.owner_uid);
            protoAdapter.encodeWithTag(protoWriter, 14, c2232021CXo2.owner_room_id);
            protoAdapter.encodeWithTag(protoWriter, 15, c2232021CXo2.owner_channel_id);
            C1CXN.ADAPTER.encodeWithTag(protoWriter, 16, c2232021CXo2.tx_quality);
            C1CWY.ADAPTER.encodeWithTag(protoWriter, 17, c2232021CXo2.rtc_connection_state);
            protoAdapter2.encodeWithTag(protoWriter, 18, c2232021CXo2.app_version);
            protoAdapter.encodeWithTag(protoWriter, 19, c2232021CXo2.group_channel_id);
            protoAdapter2.encodeWithTag(protoWriter, 20, c2232021CXo2.group_link_mic_id);
            EnumC2232011CXn.ADAPTER.encodeWithTag(protoWriter, 21, c2232021CXo2.user_type);
            protoWriter.writeBytes(c2232021CXo2.unknownFields());
        }
    };
    public static final Long DEFAULT_ROOM_ID = 0L;
    public static final Long DEFAULT_CHANNEL_ID = 0L;
    public static final Long DEFAULT_UID = 0L;
    public static final Long DEFAULT_JOIN_TIME = 0L;
    public static final Long DEFAULT_LINKED_TIME = 0L;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_AUDIO_MUTED_BY_CHANNEL = bool;
        DEFAULT_AUDIO_SWITCH_ON = bool;
        DEFAULT_VIDEO_SWITCH_ON = bool;
        DEFAULT_AUDIO_OCCUPIED = bool;
        DEFAULT_ONLINE_USER_STATE = C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;
        DEFAULT_AVATAR_ID = 0L;
        DEFAULT_OWNER_UID = 0L;
        DEFAULT_OWNER_ROOM_ID = 0L;
        DEFAULT_OWNER_CHANNEL_ID = 0L;
        DEFAULT_TX_QUALITY = C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;
        DEFAULT_RTC_CONNECTION_STATE = C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
        DEFAULT_GROUP_CHANNEL_ID = 0L;
        DEFAULT_USER_TYPE = EnumC2232011CXn.VAR_LINKER_USER_TYPE_UNKNOWN;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.room_id.hashCode()) * 37) + this.channel_id.hashCode()) * 37) + this.uid.hashCode()) * 37) + this.link_mic_id.hashCode()) * 37) + this.join_time.hashCode()) * 37) + this.linked_time.hashCode()) * 37) + this.audio_muted_by_channel.hashCode()) * 37) + this.audio_switch_on.hashCode()) * 37) + this.video_switch_on.hashCode()) * 37) + this.audio_occupied.hashCode()) * 37) + this.online_user_state.hashCode()) * 37) + this.avatar_id.hashCode()) * 37) + this.owner_uid.hashCode()) * 37) + this.owner_room_id.hashCode()) * 37) + this.owner_channel_id.hashCode()) * 37) + this.tx_quality.hashCode()) * 37) + this.rtc_connection_state.hashCode()) * 37) + this.app_version.hashCode()) * 37) + this.group_channel_id.hashCode()) * 37;
        String str = this.group_link_mic_id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.user_type.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2232041CXq newBuilder() {
        C2232041CXq c2232041CXq = new C2232041CXq();
        c2232041CXq.LIZLLL = this.room_id;
        c2232041CXq.LJ = this.channel_id;
        c2232041CXq.LJFF = this.uid;
        c2232041CXq.LJI = this.link_mic_id;
        c2232041CXq.LJII = this.join_time;
        c2232041CXq.LJIIIIZZ = this.linked_time;
        c2232041CXq.LJIIIZ = this.audio_muted_by_channel;
        c2232041CXq.LJIIJ = this.audio_switch_on;
        c2232041CXq.LJIIJJI = this.video_switch_on;
        c2232041CXq.LJIIL = this.audio_occupied;
        c2232041CXq.LJIILIIL = this.online_user_state;
        c2232041CXq.LJIILJJIL = this.avatar_id;
        c2232041CXq.LJIILL = this.owner_uid;
        c2232041CXq.LJIILLIIL = this.owner_room_id;
        c2232041CXq.LJIIZILJ = this.owner_channel_id;
        c2232041CXq.LJIJ = this.tx_quality;
        c2232041CXq.LJIJI = this.rtc_connection_state;
        c2232041CXq.LJIJJ = this.app_version;
        c2232041CXq.LJIJJLI = this.group_channel_id;
        c2232041CXq.LJIL = this.group_link_mic_id;
        c2232041CXq.LJJ = this.user_type;
        c2232041CXq.addUnknownFields(unknownFields());
        return c2232041CXq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", room_id=");
        sb.append(this.room_id);
        sb.append(", channel_id=");
        sb.append(this.channel_id);
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", join_time=");
        sb.append(this.join_time);
        sb.append(", linked_time=");
        sb.append(this.linked_time);
        sb.append(", audio_muted_by_channel=");
        sb.append(this.audio_muted_by_channel);
        sb.append(", audio_switch_on=");
        sb.append(this.audio_switch_on);
        sb.append(", video_switch_on=");
        sb.append(this.video_switch_on);
        sb.append(", audio_occupied=");
        sb.append(this.audio_occupied);
        sb.append(", online_user_state=");
        sb.append(this.online_user_state);
        sb.append(", avatar_id=");
        sb.append(this.avatar_id);
        sb.append(", owner_uid=");
        sb.append(this.owner_uid);
        sb.append(", owner_room_id=");
        sb.append(this.owner_room_id);
        sb.append(", owner_channel_id=");
        sb.append(this.owner_channel_id);
        sb.append(", tx_quality=");
        sb.append(this.tx_quality);
        sb.append(", rtc_connection_state=");
        sb.append(this.rtc_connection_state);
        sb.append(", app_version=");
        sb.append(this.app_version);
        sb.append(", group_channel_id=");
        sb.append(this.group_channel_id);
        if (this.group_link_mic_id != null) {
            sb.append(", group_link_mic_id=");
            sb.append(this.group_link_mic_id);
        }
        sb.append(", user_type=");
        sb.append(this.user_type);
        sb.replace(0, 2, "LinkMicLinkUser{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232021CXo)) {
            return false;
        }
        C2232021CXo c2232021CXo = (C2232021CXo) obj;
        if (unknownFields().equals(c2232021CXo.unknownFields()) && this.room_id.equals(c2232021CXo.room_id) && this.channel_id.equals(c2232021CXo.channel_id) && this.uid.equals(c2232021CXo.uid) && this.link_mic_id.equals(c2232021CXo.link_mic_id) && this.join_time.equals(c2232021CXo.join_time) && this.linked_time.equals(c2232021CXo.linked_time) && this.audio_muted_by_channel.equals(c2232021CXo.audio_muted_by_channel) && this.audio_switch_on.equals(c2232021CXo.audio_switch_on) && this.video_switch_on.equals(c2232021CXo.video_switch_on) && this.audio_occupied.equals(c2232021CXo.audio_occupied) && this.online_user_state.equals(c2232021CXo.online_user_state) && this.avatar_id.equals(c2232021CXo.avatar_id) && this.owner_uid.equals(c2232021CXo.owner_uid) && this.owner_room_id.equals(c2232021CXo.owner_room_id) && this.owner_channel_id.equals(c2232021CXo.owner_channel_id) && this.tx_quality.equals(c2232021CXo.tx_quality) && this.rtc_connection_state.equals(c2232021CXo.rtc_connection_state) && this.app_version.equals(c2232021CXo.app_version) && this.group_channel_id.equals(c2232021CXo.group_channel_id) && C1516540pZE.LJ(this.group_link_mic_id, c2232021CXo.group_link_mic_id) && this.user_type.equals(c2232021CXo.user_type)) {
            return true;
        }
        return false;
    }

    public C2232021CXo(Long l, Long l2, Long l3, String str, Long l4, Long l5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C1CWW c1cww, Long l6, Long l7, Long l8, Long l9, C1CXN c1cxn, C1CWY c1cwy, String str2, Long l10, String str3, EnumC2232011CXn enumC2232011CXn) {
        this(l, l2, l3, str, l4, l5, bool, bool2, bool3, bool4, c1cww, l6, l7, l8, l9, c1cxn, c1cwy, str2, l10, str3, enumC2232011CXn, ByteString.EMPTY);
    }

    public C2232021CXo(Long l, Long l2, Long l3, String str, Long l4, Long l5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, C1CWW c1cww, Long l6, Long l7, Long l8, Long l9, C1CXN c1cxn, C1CWY c1cwy, String str2, Long l10, String str3, EnumC2232011CXn enumC2232011CXn, ByteString byteString) {
        super(ADAPTER, byteString);
        this.room_id = l;
        this.channel_id = l2;
        this.uid = l3;
        this.link_mic_id = str;
        this.join_time = l4;
        this.linked_time = l5;
        this.audio_muted_by_channel = bool;
        this.audio_switch_on = bool2;
        this.video_switch_on = bool3;
        this.audio_occupied = bool4;
        this.online_user_state = c1cww;
        this.avatar_id = l6;
        this.owner_uid = l7;
        this.owner_room_id = l8;
        this.owner_channel_id = l9;
        this.tx_quality = c1cxn;
        this.rtc_connection_state = c1cwy;
        this.app_version = str2;
        this.group_channel_id = l10;
        this.group_link_mic_id = str3;
        this.user_type = enumC2232011CXn;
    }
}
