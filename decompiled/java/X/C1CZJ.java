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

/* JADX INFO: renamed from: X.1CZJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZJ extends Message<C1CZJ, C1CZM> {
    public static final Boolean DEFAULT_AUDIO_MUTED;
    public static final Boolean DEFAULT_AUDIO_OCCUPIED;
    public static final Boolean DEFAULT_IS_ROOM_OWNER;
    public static final Boolean DEFAULT_IS_SELF;
    public static final C1CXN DEFAULT_NETWORK_STATE;
    public static final C1CWY DEFAULT_RTC_CONNECTION;
    public static final Boolean DEFAULT_VIDEO_MUTED;
    public static final Long DEFAULT_Z_ORDER;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Boolean audio_muted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Boolean audio_occupied;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String content_link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.WindowSpotExtra#ADAPTER", label = WireField.Label.REQUIRED, tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final C2233181Caq extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 16)
    public final Boolean is_room_owner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 15)
    public final Boolean is_self;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcNetworkQuality#ADAPTER", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C1CXN network_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicOnlineUserState#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C1CWW online_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final C1CWY rtc_connection;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutViewInfo#ADAPTER", tag = 5)
    public final C2228421CJs rtc_view_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long spot_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", label = WireField.Label.REQUIRED, tag = 14)
    public final C1CW4 ui_pos;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 8)
    public final Boolean video_muted;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutViewInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2228421CJs view_info;

    @WireField(adapter = "link_mic_sdk.proto.LayoutRenderWindowState#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C1CWO win_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final Long z_order;
    public static final ProtoAdapter<C1CZJ> ADAPTER = new ProtoAdapter<C1CZJ>() { // from class: X.1CZK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZJ decode(ProtoReader protoReader) {
            C1CZM c1czm = new C1CZM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1czm.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1czm.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1czm.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1czm.LJI = C2228421CJs.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1czm.LJII = C2228421CJs.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c1czm.LJIIIIZZ = C1CWO.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1czm.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 7:
                            try {
                                c1czm.LJIIIZ = C1CWW.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c1czm.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 8:
                            c1czm.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1czm.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1czm.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            try {
                                c1czm.LJIILIIL = C1CWY.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1czm.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            try {
                                c1czm.LJIILJJIL = C1CXN.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c1czm.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1czm.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c1czm.LJIILLIIL = C1CW4.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c1czm.LJIIZILJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c1czm.LJIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1czm.LJIJI = C2233181Caq.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1czm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1czm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZJ c1czj) {
            C1CZJ c1czj2 = c1czj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1czj2.id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1czj2.spot_id) + protoAdapter.encodedSizeWithTag(3, c1czj2.content_link_mic_id);
            ProtoAdapter<C2228421CJs> protoAdapter3 = C2228421CJs.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c1czj2.view_info) + protoAdapter3.encodedSizeWithTag(5, c1czj2.rtc_view_info) + C1CWO.ADAPTER.encodedSizeWithTag(6, c1czj2.win_state) + C1CWW.ADAPTER.encodedSizeWithTag(7, c1czj2.online_state);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(8, c1czj2.video_muted) + protoAdapter4.encodedSizeWithTag(9, c1czj2.audio_muted) + protoAdapter4.encodedSizeWithTag(10, c1czj2.audio_occupied) + C1CWY.ADAPTER.encodedSizeWithTag(11, c1czj2.rtc_connection) + C1CXN.ADAPTER.encodedSizeWithTag(12, c1czj2.network_state) + protoAdapter2.encodedSizeWithTag(13, c1czj2.z_order) + C1CW4.ADAPTER.encodedSizeWithTag(14, c1czj2.ui_pos) + protoAdapter4.encodedSizeWithTag(15, c1czj2.is_self) + protoAdapter4.encodedSizeWithTag(16, c1czj2.is_room_owner) + C2233181Caq.ADAPTER.encodedSizeWithTag(17, c1czj2.extra) + c1czj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZJ redact(C1CZJ c1czj) {
            C1CZM c1czmNewBuilder = c1czj.newBuilder();
            ProtoAdapter<C2228421CJs> protoAdapter = C2228421CJs.ADAPTER;
            c1czmNewBuilder.LJI = protoAdapter.redact(c1czmNewBuilder.LJI);
            C2228421CJs c2228421CJs = c1czmNewBuilder.LJII;
            if (c2228421CJs != null) {
                c1czmNewBuilder.LJII = protoAdapter.redact(c2228421CJs);
            }
            c1czmNewBuilder.LJIILLIIL = C1CW4.ADAPTER.redact(c1czmNewBuilder.LJIILLIIL);
            c1czmNewBuilder.LJIJI = C2233181Caq.ADAPTER.redact(c1czmNewBuilder.LJIJI);
            c1czmNewBuilder.clearUnknownFields();
            return c1czmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZJ c1czj) {
            C1CZJ c1czj2 = c1czj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1czj2.id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1czj2.spot_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c1czj2.content_link_mic_id);
            ProtoAdapter<C2228421CJs> protoAdapter3 = C2228421CJs.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 4, c1czj2.view_info);
            protoAdapter3.encodeWithTag(protoWriter, 5, c1czj2.rtc_view_info);
            C1CWO.ADAPTER.encodeWithTag(protoWriter, 6, c1czj2.win_state);
            C1CWW.ADAPTER.encodeWithTag(protoWriter, 7, c1czj2.online_state);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 8, c1czj2.video_muted);
            protoAdapter4.encodeWithTag(protoWriter, 9, c1czj2.audio_muted);
            protoAdapter4.encodeWithTag(protoWriter, 10, c1czj2.audio_occupied);
            C1CWY.ADAPTER.encodeWithTag(protoWriter, 11, c1czj2.rtc_connection);
            C1CXN.ADAPTER.encodeWithTag(protoWriter, 12, c1czj2.network_state);
            protoAdapter2.encodeWithTag(protoWriter, 13, c1czj2.z_order);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 14, c1czj2.ui_pos);
            protoAdapter4.encodeWithTag(protoWriter, 15, c1czj2.is_self);
            protoAdapter4.encodeWithTag(protoWriter, 16, c1czj2.is_room_owner);
            C2233181Caq.ADAPTER.encodeWithTag(protoWriter, 17, c1czj2.extra);
            protoWriter.writeBytes(c1czj2.unknownFields());
        }
    };
    public static final Long DEFAULT_SPOT_ID = 0L;
    public static final C1CWO DEFAULT_WIN_STATE = C1CWO.VAR_LAYOUT_RENDER_WINDOW_STATE_INIT_STATE;
    public static final C1CWW DEFAULT_ONLINE_STATE = C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_VIDEO_MUTED = bool;
        DEFAULT_AUDIO_MUTED = bool;
        DEFAULT_AUDIO_OCCUPIED = bool;
        DEFAULT_RTC_CONNECTION = C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
        DEFAULT_NETWORK_STATE = C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;
        DEFAULT_Z_ORDER = 0L;
        DEFAULT_IS_SELF = bool;
        DEFAULT_IS_ROOM_OWNER = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.spot_id.hashCode()) * 37;
        String str = this.content_link_mic_id;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.view_info.hashCode()) * 37;
        C2228421CJs c2228421CJs = this.rtc_view_info;
        int iHashCode3 = ((((((((((((((((((((((((iHashCode2 + (c2228421CJs != null ? c2228421CJs.hashCode() : 0)) * 37) + this.win_state.hashCode()) * 37) + this.online_state.hashCode()) * 37) + this.video_muted.hashCode()) * 37) + this.audio_muted.hashCode()) * 37) + this.audio_occupied.hashCode()) * 37) + this.rtc_connection.hashCode()) * 37) + this.network_state.hashCode()) * 37) + this.z_order.hashCode()) * 37) + this.ui_pos.hashCode()) * 37) + this.is_self.hashCode()) * 37) + this.is_room_owner.hashCode()) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1CZM newBuilder() {
        C1CZM c1czm = new C1CZM();
        c1czm.LIZLLL = this.id;
        c1czm.LJ = this.spot_id;
        c1czm.LJFF = this.content_link_mic_id;
        c1czm.LJI = this.view_info;
        c1czm.LJII = this.rtc_view_info;
        c1czm.LJIIIIZZ = this.win_state;
        c1czm.LJIIIZ = this.online_state;
        c1czm.LJIIJ = this.video_muted;
        c1czm.LJIIJJI = this.audio_muted;
        c1czm.LJIIL = this.audio_occupied;
        c1czm.LJIILIIL = this.rtc_connection;
        c1czm.LJIILJJIL = this.network_state;
        c1czm.LJIILL = this.z_order;
        c1czm.LJIILLIIL = this.ui_pos;
        c1czm.LJIIZILJ = this.is_self;
        c1czm.LJIJ = this.is_room_owner;
        c1czm.LJIJI = this.extra;
        c1czm.addUnknownFields(unknownFields());
        return c1czm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", spot_id=");
        sb.append(this.spot_id);
        if (this.content_link_mic_id != null) {
            sb.append(", content_link_mic_id=");
            sb.append(this.content_link_mic_id);
        }
        sb.append(", view_info=");
        sb.append(this.view_info);
        if (this.rtc_view_info != null) {
            sb.append(", rtc_view_info=");
            sb.append(this.rtc_view_info);
        }
        sb.append(", win_state=");
        sb.append(this.win_state);
        sb.append(", online_state=");
        sb.append(this.online_state);
        sb.append(", video_muted=");
        sb.append(this.video_muted);
        sb.append(", audio_muted=");
        sb.append(this.audio_muted);
        sb.append(", audio_occupied=");
        sb.append(this.audio_occupied);
        sb.append(", rtc_connection=");
        sb.append(this.rtc_connection);
        sb.append(", network_state=");
        sb.append(this.network_state);
        sb.append(", z_order=");
        sb.append(this.z_order);
        sb.append(", ui_pos=");
        sb.append(this.ui_pos);
        sb.append(", is_self=");
        sb.append(this.is_self);
        sb.append(", is_room_owner=");
        sb.append(this.is_room_owner);
        sb.append(", extra=");
        sb.append(this.extra);
        sb.replace(0, 2, "LinkMicLayoutRenderWindowInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZJ)) {
            return false;
        }
        C1CZJ c1czj = (C1CZJ) obj;
        if (unknownFields().equals(c1czj.unknownFields()) && this.id.equals(c1czj.id) && this.spot_id.equals(c1czj.spot_id) && C1516540pZE.LJ(this.content_link_mic_id, c1czj.content_link_mic_id) && this.view_info.equals(c1czj.view_info) && C1516540pZE.LJ(this.rtc_view_info, c1czj.rtc_view_info) && this.win_state.equals(c1czj.win_state) && this.online_state.equals(c1czj.online_state) && this.video_muted.equals(c1czj.video_muted) && this.audio_muted.equals(c1czj.audio_muted) && this.audio_occupied.equals(c1czj.audio_occupied) && this.rtc_connection.equals(c1czj.rtc_connection) && this.network_state.equals(c1czj.network_state) && this.z_order.equals(c1czj.z_order) && this.ui_pos.equals(c1czj.ui_pos) && this.is_self.equals(c1czj.is_self) && this.is_room_owner.equals(c1czj.is_room_owner) && this.extra.equals(c1czj.extra)) {
            return true;
        }
        return false;
    }

    public C1CZJ(String str, Long l, String str2, C2228421CJs c2228421CJs, C2228421CJs c2228421CJs2, C1CWO c1cwo, C1CWW c1cww, Boolean bool, Boolean bool2, Boolean bool3, C1CWY c1cwy, C1CXN c1cxn, Long l2, C1CW4 c1cw4, Boolean bool4, Boolean bool5, C2233181Caq c2233181Caq) {
        this(str, l, str2, c2228421CJs, c2228421CJs2, c1cwo, c1cww, bool, bool2, bool3, c1cwy, c1cxn, l2, c1cw4, bool4, bool5, c2233181Caq, ByteString.EMPTY);
    }

    public C1CZJ(String str, Long l, String str2, C2228421CJs c2228421CJs, C2228421CJs c2228421CJs2, C1CWO c1cwo, C1CWW c1cww, Boolean bool, Boolean bool2, Boolean bool3, C1CWY c1cwy, C1CXN c1cxn, Long l2, C1CW4 c1cw4, Boolean bool4, Boolean bool5, C2233181Caq c2233181Caq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = str;
        this.spot_id = l;
        this.content_link_mic_id = str2;
        this.view_info = c2228421CJs;
        this.rtc_view_info = c2228421CJs2;
        this.win_state = c1cwo;
        this.online_state = c1cww;
        this.video_muted = bool;
        this.audio_muted = bool2;
        this.audio_occupied = bool3;
        this.rtc_connection = c1cwy;
        this.network_state = c1cxn;
        this.z_order = l2;
        this.ui_pos = c1cw4;
        this.is_self = bool4;
        this.is_room_owner = bool5;
        this.extra = c2233181Caq;
    }
}
