package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236691CgV extends Message<C2236691CgV, C2236711CgX> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 7)
    public final Long join_direct_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMultiBizJoinDirectLinkType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2232071CXt link_type;

    @WireField(adapter = "link_mic_sdk.proto.MultiGuestOutsideRoomInviteSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final EnumC2231881CXa outside_room_invite_source;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAgreeStatus#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2231981CXk reply_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkmicShareRevenueSetting#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC2232051CXr share_revenue_setting;

    @WireField(adapter = "link_mic_sdk.proto.LinkmicUserSettingMultiGuestShareRevenueRatio#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final EnumC2231931CXf share_revenue_setting_ratio;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAudienceUserReturnType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2231921CXe user_return_type;
    public static final ProtoAdapter<C2236691CgV> ADAPTER = new ProtoAdapter<C2236691CgV>() { // from class: X.1CgW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236691CgV decode(ProtoReader protoReader) {
            C2236711CgX c2236711CgX = new C2236711CgX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2236711CgX.LIZLLL = EnumC2232071CXt.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236711CgX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            try {
                                c2236711CgX.LJ = EnumC2231981CXk.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2236711CgX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 3:
                            try {
                                c2236711CgX.LJFF = EnumC2231921CXe.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2236711CgX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 4:
                            try {
                                c2236711CgX.LJI = EnumC2232051CXr.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c2236711CgX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        case 5:
                            try {
                                c2236711CgX.LJII = EnumC2231931CXf.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                c2236711CgX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            break;
                        case 6:
                            try {
                                c2236711CgX.LJIIIIZZ = EnumC2231881CXa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                TryCatchGuardChecker.doCheck(e6);
                                c2236711CgX.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            break;
                        case 7:
                            c2236711CgX.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2236711CgX.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236711CgX.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236691CgV c2236691CgV) {
            C2236691CgV c2236691CgV2 = c2236691CgV;
            return EnumC2232071CXt.ADAPTER.encodedSizeWithTag(1, c2236691CgV2.link_type) + EnumC2231981CXk.ADAPTER.encodedSizeWithTag(2, c2236691CgV2.reply_type) + EnumC2231921CXe.ADAPTER.encodedSizeWithTag(3, c2236691CgV2.user_return_type) + EnumC2232051CXr.ADAPTER.encodedSizeWithTag(4, c2236691CgV2.share_revenue_setting) + EnumC2231931CXf.ADAPTER.encodedSizeWithTag(5, c2236691CgV2.share_revenue_setting_ratio) + EnumC2231881CXa.ADAPTER.encodedSizeWithTag(6, c2236691CgV2.outside_room_invite_source) + ProtoAdapter.INT64.encodedSizeWithTag(7, c2236691CgV2.join_direct_type) + c2236691CgV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236691CgV redact(C2236691CgV c2236691CgV) {
            C2236711CgX c2236711CgXNewBuilder = c2236691CgV.newBuilder();
            c2236711CgXNewBuilder.clearUnknownFields();
            return c2236711CgXNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236691CgV c2236691CgV) {
            C2236691CgV c2236691CgV2 = c2236691CgV;
            EnumC2232071CXt.ADAPTER.encodeWithTag(protoWriter, 1, c2236691CgV2.link_type);
            EnumC2231981CXk.ADAPTER.encodeWithTag(protoWriter, 2, c2236691CgV2.reply_type);
            EnumC2231921CXe.ADAPTER.encodeWithTag(protoWriter, 3, c2236691CgV2.user_return_type);
            EnumC2232051CXr.ADAPTER.encodeWithTag(protoWriter, 4, c2236691CgV2.share_revenue_setting);
            EnumC2231931CXf.ADAPTER.encodeWithTag(protoWriter, 5, c2236691CgV2.share_revenue_setting_ratio);
            EnumC2231881CXa.ADAPTER.encodeWithTag(protoWriter, 6, c2236691CgV2.outside_room_invite_source);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c2236691CgV2.join_direct_type);
            protoWriter.writeBytes(c2236691CgV2.unknownFields());
        }
    };
    public static final EnumC2232071CXt DEFAULT_LINK_TYPE = EnumC2232071CXt.VAR_LINK_MIC_MULTI_BIZ_JOIN_DIRECT_LINK_TYPE_VIDEO;
    public static final EnumC2231981CXk DEFAULT_REPLY_TYPE = EnumC2231981CXk.VAR_LINK_MIC_AGREE_STATUS_UNKNOWN;
    public static final EnumC2231921CXe DEFAULT_USER_RETURN_TYPE = EnumC2231921CXe.VAR_LINK_MIC_AUDIENCE_USER_RETURN_TYPE_NONE;
    public static final EnumC2232051CXr DEFAULT_SHARE_REVENUE_SETTING = EnumC2232051CXr.VAR_LINKMIC_SHARE_REVENUE_SETTING_LINKMIC_SHARE_REVENUE_NOT_SET;
    public static final EnumC2231931CXf DEFAULT_SHARE_REVENUE_SETTING_RATIO = EnumC2231931CXf.VAR_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_LINKMIC_USER_SETTING_MULTI_GUEST_SHARE_REVENUE_RATIO_NOT_SET;
    public static final EnumC2231881CXa DEFAULT_OUTSIDE_ROOM_INVITE_SOURCE = EnumC2231881CXa.VAR_MULTI_GUEST_OUTSIDE_ROOM_INVITE_SOURCE_OUTSIDE_ROOM_INVITE_SOURCE_UNKNOWN;
    public static final Long DEFAULT_JOIN_DIRECT_TYPE = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.link_type.hashCode()) * 37) + this.reply_type.hashCode()) * 37) + this.user_return_type.hashCode()) * 37) + this.share_revenue_setting.hashCode()) * 37) + this.share_revenue_setting_ratio.hashCode()) * 37) + this.outside_room_invite_source.hashCode()) * 37) + this.join_direct_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236711CgX newBuilder() {
        C2236711CgX c2236711CgX = new C2236711CgX();
        c2236711CgX.LIZLLL = this.link_type;
        c2236711CgX.LJ = this.reply_type;
        c2236711CgX.LJFF = this.user_return_type;
        c2236711CgX.LJI = this.share_revenue_setting;
        c2236711CgX.LJII = this.share_revenue_setting_ratio;
        c2236711CgX.LJIIIIZZ = this.outside_room_invite_source;
        c2236711CgX.LJIIIZ = this.join_direct_type;
        c2236711CgX.addUnknownFields(unknownFields());
        return c2236711CgX;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_type=");
        sb.append(this.link_type);
        sb.append(", reply_type=");
        sb.append(this.reply_type);
        sb.append(", user_return_type=");
        sb.append(this.user_return_type);
        sb.append(", share_revenue_setting=");
        sb.append(this.share_revenue_setting);
        sb.append(", share_revenue_setting_ratio=");
        sb.append(this.share_revenue_setting_ratio);
        sb.append(", outside_room_invite_source=");
        sb.append(this.outside_room_invite_source);
        sb.append(", join_direct_type=");
        sb.append(this.join_direct_type);
        sb.replace(0, 2, "LinkMicMultiLiveBizJoinDirectParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236691CgV)) {
            return false;
        }
        C2236691CgV c2236691CgV = (C2236691CgV) obj;
        if (unknownFields().equals(c2236691CgV.unknownFields()) && this.link_type.equals(c2236691CgV.link_type) && this.reply_type.equals(c2236691CgV.reply_type) && this.user_return_type.equals(c2236691CgV.user_return_type) && this.share_revenue_setting.equals(c2236691CgV.share_revenue_setting) && this.share_revenue_setting_ratio.equals(c2236691CgV.share_revenue_setting_ratio) && this.outside_room_invite_source.equals(c2236691CgV.outside_room_invite_source) && this.join_direct_type.equals(c2236691CgV.join_direct_type)) {
            return true;
        }
        return false;
    }

    public C2236691CgV(EnumC2232071CXt enumC2232071CXt, EnumC2231981CXk enumC2231981CXk, EnumC2231921CXe enumC2231921CXe, EnumC2232051CXr enumC2232051CXr, EnumC2231931CXf enumC2231931CXf, EnumC2231881CXa enumC2231881CXa, Long l) {
        this(enumC2232071CXt, enumC2231981CXk, enumC2231921CXe, enumC2232051CXr, enumC2231931CXf, enumC2231881CXa, l, ByteString.EMPTY);
    }

    public C2236691CgV(EnumC2232071CXt enumC2232071CXt, EnumC2231981CXk enumC2231981CXk, EnumC2231921CXe enumC2231921CXe, EnumC2232051CXr enumC2232051CXr, EnumC2231931CXf enumC2231931CXf, EnumC2231881CXa enumC2231881CXa, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_type = enumC2232071CXt;
        this.reply_type = enumC2231981CXk;
        this.user_return_type = enumC2231921CXe;
        this.share_revenue_setting = enumC2232051CXr;
        this.share_revenue_setting_ratio = enumC2231931CXf;
        this.outside_room_invite_source = enumC2231881CXa;
        this.join_direct_type = l;
    }
}
