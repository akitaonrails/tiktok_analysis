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
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CZI extends Message<C1CZI, C1CZN> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Long audio_muted;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAvatarState#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    public final C1CJR avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long linked_time_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String linkmic_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcNetworkQuality#ADAPTER", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C1CXN network_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicOnlineUserState#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final C1CWW online_user_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 6)
    public final Long position_link_opt;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long position_link_position;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long position_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final C1CWY rtc_connection;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long user_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long user_room_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long video_muted;
    public static final ProtoAdapter<C1CZI> ADAPTER = new ProtoAdapter<C1CZI>() { // from class: X.1CZL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZI decode(ProtoReader protoReader) {
            C1CZN c1czn = new C1CZN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1czn.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1czn.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1czn.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1czn.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1czn.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1czn.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1czn.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            try {
                                c1czn.LJIIJ = C1CWW.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1czn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1czn.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1czn.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            try {
                                c1czn.LJIILIIL = C1CWY.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c1czn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            try {
                                c1czn.LJIILJJIL = C1CXN.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c1czn.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1czn.LJIILL = C1CJR.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1czn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1czn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CZI c1czi) {
            C1CZI c1czi2 = c1czi;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1czi2.user_room_id) + protoAdapter.encodedSizeWithTag(2, c1czi2.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, c1czi2.linkmic_id) + protoAdapter.encodedSizeWithTag(4, c1czi2.position_type) + protoAdapter.encodedSizeWithTag(5, c1czi2.position_link_position) + protoAdapter.encodedSizeWithTag(6, c1czi2.position_link_opt) + protoAdapter.encodedSizeWithTag(7, c1czi2.linked_time_nano) + C1CWW.ADAPTER.encodedSizeWithTag(8, c1czi2.online_user_state) + protoAdapter.encodedSizeWithTag(9, c1czi2.audio_muted) + protoAdapter.encodedSizeWithTag(10, c1czi2.video_muted) + C1CWY.ADAPTER.encodedSizeWithTag(11, c1czi2.rtc_connection) + C1CXN.ADAPTER.encodedSizeWithTag(12, c1czi2.network_state) + C1CJR.ADAPTER.encodedSizeWithTag(13, c1czi2.avatar) + c1czi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CZI redact(C1CZI c1czi) {
            C1CZN c1cznNewBuilder = c1czi.newBuilder();
            C1CJR c1cjr = c1cznNewBuilder.LJIILL;
            if (c1cjr != null) {
                c1cznNewBuilder.LJIILL = C1CJR.ADAPTER.redact(c1cjr);
            }
            c1cznNewBuilder.clearUnknownFields();
            return c1cznNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CZI c1czi) {
            C1CZI c1czi2 = c1czi;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1czi2.user_room_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1czi2.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c1czi2.linkmic_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c1czi2.position_type);
            protoAdapter.encodeWithTag(protoWriter, 5, c1czi2.position_link_position);
            protoAdapter.encodeWithTag(protoWriter, 6, c1czi2.position_link_opt);
            protoAdapter.encodeWithTag(protoWriter, 7, c1czi2.linked_time_nano);
            C1CWW.ADAPTER.encodeWithTag(protoWriter, 8, c1czi2.online_user_state);
            protoAdapter.encodeWithTag(protoWriter, 9, c1czi2.audio_muted);
            protoAdapter.encodeWithTag(protoWriter, 10, c1czi2.video_muted);
            C1CWY.ADAPTER.encodeWithTag(protoWriter, 11, c1czi2.rtc_connection);
            C1CXN.ADAPTER.encodeWithTag(protoWriter, 12, c1czi2.network_state);
            C1CJR.ADAPTER.encodeWithTag(protoWriter, 13, c1czi2.avatar);
            protoWriter.writeBytes(c1czi2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_ROOM_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_POSITION_TYPE = 0L;
    public static final Long DEFAULT_POSITION_LINK_POSITION = 0L;
    public static final Long DEFAULT_POSITION_LINK_OPT = 0L;
    public static final Long DEFAULT_LINKED_TIME_NANO = 0L;
    public static final C1CWW DEFAULT_ONLINE_USER_STATE = C1CWW.VAR_LINK_MIC_ONLINE_USER_STATE_UNDEFINED;
    public static final Long DEFAULT_AUDIO_MUTED = 0L;
    public static final Long DEFAULT_VIDEO_MUTED = 0L;
    public static final C1CWY DEFAULT_RTC_CONNECTION = C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
    public static final C1CXN DEFAULT_NETWORK_STATE = C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.user_room_id.hashCode()) * 37) + this.user_id.hashCode()) * 37) + this.linkmic_id.hashCode()) * 37) + this.position_type.hashCode()) * 37) + this.position_link_position.hashCode()) * 37) + this.position_link_opt.hashCode()) * 37) + this.linked_time_nano.hashCode()) * 37) + this.online_user_state.hashCode()) * 37) + this.audio_muted.hashCode()) * 37) + this.video_muted.hashCode()) * 37) + this.rtc_connection.hashCode()) * 37) + this.network_state.hashCode()) * 37;
        C1CJR c1cjr = this.avatar;
        int iHashCode2 = iHashCode + (c1cjr != null ? c1cjr.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CZN newBuilder() {
        C1CZN c1czn = new C1CZN();
        c1czn.LIZLLL = this.user_room_id;
        c1czn.LJ = this.user_id;
        c1czn.LJFF = this.linkmic_id;
        c1czn.LJI = this.position_type;
        c1czn.LJII = this.position_link_position;
        c1czn.LJIIIIZZ = this.position_link_opt;
        c1czn.LJIIIZ = this.linked_time_nano;
        c1czn.LJIIJ = this.online_user_state;
        c1czn.LJIIJJI = this.audio_muted;
        c1czn.LJIIL = this.video_muted;
        c1czn.LJIILIIL = this.rtc_connection;
        c1czn.LJIILJJIL = this.network_state;
        c1czn.LJIILL = this.avatar;
        c1czn.addUnknownFields(unknownFields());
        return c1czn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_room_id=");
        sb.append(this.user_room_id);
        sb.append(", user_id=");
        sb.append(this.user_id);
        sb.append(", linkmic_id=");
        sb.append(this.linkmic_id);
        sb.append(", position_type=");
        sb.append(this.position_type);
        sb.append(", position_link_position=");
        sb.append(this.position_link_position);
        sb.append(", position_link_opt=");
        sb.append(this.position_link_opt);
        sb.append(", linked_time_nano=");
        sb.append(this.linked_time_nano);
        sb.append(", online_user_state=");
        sb.append(this.online_user_state);
        sb.append(", audio_muted=");
        sb.append(this.audio_muted);
        sb.append(", video_muted=");
        sb.append(this.video_muted);
        sb.append(", rtc_connection=");
        sb.append(this.rtc_connection);
        sb.append(", network_state=");
        sb.append(this.network_state);
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        sb.replace(0, 2, "LinkMicUserState{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CZI)) {
            return false;
        }
        C1CZI c1czi = (C1CZI) obj;
        if (unknownFields().equals(c1czi.unknownFields()) && this.user_room_id.equals(c1czi.user_room_id) && this.user_id.equals(c1czi.user_id) && this.linkmic_id.equals(c1czi.linkmic_id) && this.position_type.equals(c1czi.position_type) && this.position_link_position.equals(c1czi.position_link_position) && this.position_link_opt.equals(c1czi.position_link_opt) && this.linked_time_nano.equals(c1czi.linked_time_nano) && this.online_user_state.equals(c1czi.online_user_state) && this.audio_muted.equals(c1czi.audio_muted) && this.video_muted.equals(c1czi.video_muted) && this.rtc_connection.equals(c1czi.rtc_connection) && this.network_state.equals(c1czi.network_state) && C1516540pZE.LJ(this.avatar, c1czi.avatar)) {
            return true;
        }
        return false;
    }

    public C1CZI(Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, C1CWW c1cww, Long l7, Long l8, C1CWY c1cwy, C1CXN c1cxn, C1CJR c1cjr) {
        this(l, l2, str, l3, l4, l5, l6, c1cww, l7, l8, c1cwy, c1cxn, c1cjr, ByteString.EMPTY);
    }

    public C1CZI(Long l, Long l2, String str, Long l3, Long l4, Long l5, Long l6, C1CWW c1cww, Long l7, Long l8, C1CWY c1cwy, C1CXN c1cxn, C1CJR c1cjr, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_room_id = l;
        this.user_id = l2;
        this.linkmic_id = str;
        this.position_type = l3;
        this.position_link_position = l4;
        this.position_link_opt = l5;
        this.linked_time_nano = l6;
        this.online_user_state = c1cww;
        this.audio_muted = l7;
        this.video_muted = l8;
        this.rtc_connection = c1cwy;
        this.network_state = c1cxn;
        this.avatar = c1cjr;
    }
}
