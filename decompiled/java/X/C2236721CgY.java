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

/* JADX INFO: renamed from: X.1CgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236721CgY extends Message<C2236721CgY, C2236741Cga> {
    public static final Long DEFAULT_ENTER_ACTION;
    public static final Long DEFAULT_ENTER_ACTION_REASON;
    public static final Boolean DEFAULT_FOLLOW;
    public static final Long DEFAULT_INVITER_ROLE;
    public static final Long DEFAULT_INVITER_USER_ID;
    public static final Long DEFAULT_JOIN_GAME_SESSION_ID;
    public static final Boolean DEFAULT_LINEUP_RESUME_LINK;
    public static final EnumC2232051CXr DEFAULT_SHARE_REVENUE_SETTING;
    public static final EnumC2231931CXf DEFAULT_SHARE_REVENUE_SETTING_RATIO;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long anchor_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final Long enter_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final Long enter_action_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean follow;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_SMS_VOICE)
    public final Long inviter_role;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 14)
    public final Long inviter_user_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 8)
    public final Long join_game_session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final Boolean lineup_resume_link;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long link_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String mg_enter_params_proto_json;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String request_param;

    @WireField(adapter = "link_mic_sdk.proto.LinkmicShareRevenueSetting#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC2232051CXr share_revenue_setting;

    @WireField(adapter = "link_mic_sdk.proto.LinkmicUserSettingMultiGuestShareRevenueRatio#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final EnumC2231931CXf share_revenue_setting_ratio;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAudienceUserReturnType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2231921CXe user_return_type;
    public static final ProtoAdapter<C2236721CgY> ADAPTER = new ProtoAdapter<C2236721CgY>() { // from class: X.1CgZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236721CgY decode(ProtoReader protoReader) {
            C2236741Cga c2236741Cga = new C2236741Cga();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2236741Cga.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2236741Cga.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            try {
                                c2236741Cga.LJFF = EnumC2231921CXe.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236741Cga.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 4:
                            c2236741Cga.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            try {
                                c2236741Cga.LJII = EnumC2232051CXr.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2236741Cga.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            try {
                                c2236741Cga.LJIIIIZZ = EnumC2231931CXf.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2236741Cga.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 7:
                            c2236741Cga.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2236741Cga.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2236741Cga.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2236741Cga.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2236741Cga.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2236741Cga.LJIILJJIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2236741Cga.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c2236741Cga.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236741Cga.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236741Cga.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236721CgY c2236721CgY) {
            C2236721CgY c2236721CgY2 = c2236721CgY;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2236721CgY2.link_type) + protoAdapter.encodedSizeWithTag(2, c2236721CgY2.anchor_id) + EnumC2231921CXe.ADAPTER.encodedSizeWithTag(3, c2236721CgY2.user_return_type);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2236721CgY2.follow) + EnumC2232051CXr.ADAPTER.encodedSizeWithTag(5, c2236721CgY2.share_revenue_setting) + EnumC2231931CXf.ADAPTER.encodedSizeWithTag(6, c2236721CgY2.share_revenue_setting_ratio);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c2236721CgY2.request_param) + protoAdapter.encodedSizeWithTag(8, c2236721CgY2.join_game_session_id) + protoAdapter3.encodedSizeWithTag(9, c2236721CgY2.mg_enter_params_proto_json) + protoAdapter.encodedSizeWithTag(10, c2236721CgY2.enter_action) + protoAdapter.encodedSizeWithTag(11, c2236721CgY2.enter_action_reason) + protoAdapter2.encodedSizeWithTag(12, c2236721CgY2.lineup_resume_link) + protoAdapter.encodedSizeWithTag(13, c2236721CgY2.inviter_role) + protoAdapter.encodedSizeWithTag(14, c2236721CgY2.inviter_user_id) + c2236721CgY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236721CgY redact(C2236721CgY c2236721CgY) {
            C2236741Cga c2236741CgaNewBuilder = c2236721CgY.newBuilder();
            c2236741CgaNewBuilder.clearUnknownFields();
            return c2236741CgaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236721CgY c2236721CgY) {
            C2236721CgY c2236721CgY2 = c2236721CgY;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236721CgY2.link_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c2236721CgY2.anchor_id);
            EnumC2231921CXe.ADAPTER.encodeWithTag(protoWriter, 3, c2236721CgY2.user_return_type);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2236721CgY2.follow);
            EnumC2232051CXr.ADAPTER.encodeWithTag(protoWriter, 5, c2236721CgY2.share_revenue_setting);
            EnumC2231931CXf.ADAPTER.encodeWithTag(protoWriter, 6, c2236721CgY2.share_revenue_setting_ratio);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 7, c2236721CgY2.request_param);
            protoAdapter.encodeWithTag(protoWriter, 8, c2236721CgY2.join_game_session_id);
            protoAdapter3.encodeWithTag(protoWriter, 9, c2236721CgY2.mg_enter_params_proto_json);
            protoAdapter.encodeWithTag(protoWriter, 10, c2236721CgY2.enter_action);
            protoAdapter.encodeWithTag(protoWriter, 11, c2236721CgY2.enter_action_reason);
            protoAdapter2.encodeWithTag(protoWriter, 12, c2236721CgY2.lineup_resume_link);
            protoAdapter.encodeWithTag(protoWriter, 13, c2236721CgY2.inviter_role);
            protoAdapter.encodeWithTag(protoWriter, 14, c2236721CgY2.inviter_user_id);
            protoWriter.writeBytes(c2236721CgY2.unknownFields());
        }
    };
    public static final Long DEFAULT_LINK_TYPE = 0L;
    public static final Long DEFAULT_ANCHOR_ID = 0L;
    public static final EnumC2231921CXe DEFAULT_USER_RETURN_TYPE = EnumC2231921CXe.VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_NONE;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_FOLLOW = bool;
        DEFAULT_SHARE_REVENUE_SETTING = EnumC2232051CXr.VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_NOT_SET;
        DEFAULT_SHARE_REVENUE_SETTING_RATIO = EnumC2231931CXf.VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_NOT_SET;
        DEFAULT_JOIN_GAME_SESSION_ID = 0L;
        DEFAULT_ENTER_ACTION = 0L;
        DEFAULT_ENTER_ACTION_REASON = 0L;
        DEFAULT_LINEUP_RESUME_LINK = bool;
        DEFAULT_INVITER_ROLE = 0L;
        DEFAULT_INVITER_USER_ID = 0L;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.link_type.hashCode()) * 37) + this.anchor_id.hashCode()) * 37) + this.user_return_type.hashCode()) * 37) + this.follow.hashCode()) * 37) + this.share_revenue_setting.hashCode()) * 37) + this.share_revenue_setting_ratio.hashCode()) * 37;
        String str = this.request_param;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.join_game_session_id.hashCode()) * 37;
        String str2 = this.mg_enter_params_proto_json;
        int iHashCode3 = ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.enter_action.hashCode()) * 37) + this.enter_action_reason.hashCode()) * 37) + this.lineup_resume_link.hashCode()) * 37) + this.inviter_role.hashCode()) * 37) + this.inviter_user_id.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2236741Cga newBuilder() {
        C2236741Cga c2236741Cga = new C2236741Cga();
        c2236741Cga.LIZLLL = this.link_type;
        c2236741Cga.LJ = this.anchor_id;
        c2236741Cga.LJFF = this.user_return_type;
        c2236741Cga.LJI = this.follow;
        c2236741Cga.LJII = this.share_revenue_setting;
        c2236741Cga.LJIIIIZZ = this.share_revenue_setting_ratio;
        c2236741Cga.LJIIIZ = this.request_param;
        c2236741Cga.LJIIJ = this.join_game_session_id;
        c2236741Cga.LJIIJJI = this.mg_enter_params_proto_json;
        c2236741Cga.LJIIL = this.enter_action;
        c2236741Cga.LJIILIIL = this.enter_action_reason;
        c2236741Cga.LJIILJJIL = this.lineup_resume_link;
        c2236741Cga.LJIILL = this.inviter_role;
        c2236741Cga.LJIILLIIL = this.inviter_user_id;
        c2236741Cga.addUnknownFields(unknownFields());
        return c2236741Cga;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_type=");
        sb.append(this.link_type);
        sb.append(", anchor_id=");
        sb.append(this.anchor_id);
        sb.append(", user_return_type=");
        sb.append(this.user_return_type);
        sb.append(", follow=");
        sb.append(this.follow);
        sb.append(", share_revenue_setting=");
        sb.append(this.share_revenue_setting);
        sb.append(", share_revenue_setting_ratio=");
        sb.append(this.share_revenue_setting_ratio);
        if (this.request_param != null) {
            sb.append(", request_param=");
            sb.append(this.request_param);
        }
        sb.append(", join_game_session_id=");
        sb.append(this.join_game_session_id);
        if (this.mg_enter_params_proto_json != null) {
            sb.append(", mg_enter_params_proto_json=");
            sb.append(this.mg_enter_params_proto_json);
        }
        sb.append(", enter_action=");
        sb.append(this.enter_action);
        sb.append(", enter_action_reason=");
        sb.append(this.enter_action_reason);
        sb.append(", lineup_resume_link=");
        sb.append(this.lineup_resume_link);
        sb.append(", inviter_role=");
        sb.append(this.inviter_role);
        sb.append(", inviter_user_id=");
        sb.append(this.inviter_user_id);
        sb.replace(0, 2, "LinkMicMultiLiveBizApplyParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236721CgY)) {
            return false;
        }
        C2236721CgY c2236721CgY = (C2236721CgY) obj;
        if (unknownFields().equals(c2236721CgY.unknownFields()) && this.link_type.equals(c2236721CgY.link_type) && this.anchor_id.equals(c2236721CgY.anchor_id) && this.user_return_type.equals(c2236721CgY.user_return_type) && this.follow.equals(c2236721CgY.follow) && this.share_revenue_setting.equals(c2236721CgY.share_revenue_setting) && this.share_revenue_setting_ratio.equals(c2236721CgY.share_revenue_setting_ratio) && C1516540pZE.LJ(this.request_param, c2236721CgY.request_param) && this.join_game_session_id.equals(c2236721CgY.join_game_session_id) && C1516540pZE.LJ(this.mg_enter_params_proto_json, c2236721CgY.mg_enter_params_proto_json) && this.enter_action.equals(c2236721CgY.enter_action) && this.enter_action_reason.equals(c2236721CgY.enter_action_reason) && this.lineup_resume_link.equals(c2236721CgY.lineup_resume_link) && this.inviter_role.equals(c2236721CgY.inviter_role) && this.inviter_user_id.equals(c2236721CgY.inviter_user_id)) {
            return true;
        }
        return false;
    }

    public C2236721CgY(Long l, Long l2, EnumC2231921CXe enumC2231921CXe, Boolean bool, EnumC2232051CXr enumC2232051CXr, EnumC2231931CXf enumC2231931CXf, String str, Long l3, String str2, Long l4, Long l5, Boolean bool2, Long l6, Long l7) {
        this(l, l2, enumC2231921CXe, bool, enumC2232051CXr, enumC2231931CXf, str, l3, str2, l4, l5, bool2, l6, l7, ByteString.EMPTY);
    }

    public C2236721CgY(Long l, Long l2, EnumC2231921CXe enumC2231921CXe, Boolean bool, EnumC2232051CXr enumC2232051CXr, EnumC2231931CXf enumC2231931CXf, String str, Long l3, String str2, Long l4, Long l5, Boolean bool2, Long l6, Long l7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_type = l;
        this.anchor_id = l2;
        this.user_return_type = enumC2231921CXe;
        this.follow = bool;
        this.share_revenue_setting = enumC2232051CXr;
        this.share_revenue_setting_ratio = enumC2231931CXf;
        this.request_param = str;
        this.join_game_session_id = l3;
        this.mg_enter_params_proto_json = str2;
        this.enter_action = l4;
        this.enter_action_reason = l5;
        this.lineup_resume_link = bool2;
        this.inviter_role = l6;
        this.inviter_user_id = l7;
    }
}
