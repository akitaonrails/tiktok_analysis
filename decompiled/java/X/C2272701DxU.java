package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.im.common.model.BulletinInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DxU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272701DxU extends Message<C2272701DxU, C2272711DxV> {
    public static final ProtoAdapter<C2272701DxU> ADAPTER = new ProtoAdapter<C2272701DxU>() { // from class: X.1DxT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272701DxU decode(ProtoReader protoReader) {
            C2272711DxV c2272711DxV = new C2272711DxV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2272711DxV.LIZLLL = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c2272711DxV.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2272711DxV.LJFF = BulletinInfo.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2272711DxV.LJI = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 5:
                            try {
                                c2272711DxV.LJII = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 6:
                            try {
                                c2272711DxV.LJIIIIZZ = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        case 7:
                            try {
                                c2272711DxV.LJIIIZ = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            break;
                        case 8:
                            try {
                                c2272711DxV.LJIIJ = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                TryCatchGuardChecker.doCheck(e6);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                            }
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2272711DxV.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            try {
                                c2272711DxV.LJIIL = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                TryCatchGuardChecker.doCheck(e7);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            try {
                                c2272711DxV.LJIILIIL = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                TryCatchGuardChecker.doCheck(e8);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            try {
                                c2272711DxV.LJIILJJIL = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                TryCatchGuardChecker.doCheck(e9);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            try {
                                c2272711DxV.LJIILL = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                                TryCatchGuardChecker.doCheck(e10);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e10.value));
                            }
                            break;
                        case 14:
                            c2272711DxV.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            try {
                                c2272711DxV.LJIIZILJ = C0IBF.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                                TryCatchGuardChecker.doCheck(e11);
                                c2272711DxV.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e11.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2272711DxV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2272711DxV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2272701DxU c2272701DxU) {
            C2272701DxU c2272701DxU2 = c2272701DxU;
            ProtoAdapter<C0IBF> protoAdapter = C0IBF.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2272701DxU2.camera_status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2272701DxU2.camera_disabled_tips) + BulletinInfo.ADAPTER.encodedSizeWithTag(3, c2272701DxU2.bulletin_info) + protoAdapter.encodedSizeWithTag(4, c2272701DxU2.photoswap_status) + protoAdapter.encodedSizeWithTag(5, c2272701DxU2.camera_message_display_status) + protoAdapter.encodedSizeWithTag(6, c2272701DxU2.ai_groupshot_status) + protoAdapter.encodedSizeWithTag(7, c2272701DxU2.voice_message_entrance_status) + protoAdapter.encodedSizeWithTag(8, c2272701DxU2.voice_message_display_status) + protoAdapter2.encodedSizeWithTag(9, c2272701DxU2.voice_disabled_tips) + protoAdapter.encodedSizeWithTag(10, c2272701DxU2.avatar_duo_entrance_status) + protoAdapter.encodedSizeWithTag(11, c2272701DxU2.group_streak_pet_status) + protoAdapter.encodedSizeWithTag(12, c2272701DxU2.group_streak_egg_entrance_status) + protoAdapter.encodedSizeWithTag(13, c2272701DxU2.voice_call_entrance_status) + protoAdapter2.encodedSizeWithTag(14, c2272701DxU2.voice_call_disabled_tips) + protoAdapter.encodedSizeWithTag(15, c2272701DxU2.single_streak_egg_entrance_status) + c2272701DxU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2272701DxU redact(C2272701DxU c2272701DxU) {
            C2272711DxV c2272711DxVNewBuilder = c2272701DxU.newBuilder();
            BulletinInfo bulletinInfo = c2272711DxVNewBuilder.LJFF;
            if (bulletinInfo != null) {
                c2272711DxVNewBuilder.LJFF = BulletinInfo.ADAPTER.redact(bulletinInfo);
            }
            c2272711DxVNewBuilder.clearUnknownFields();
            return c2272711DxVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2272701DxU c2272701DxU) {
            C2272701DxU c2272701DxU2 = c2272701DxU;
            ProtoAdapter<C0IBF> protoAdapter = C0IBF.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2272701DxU2.camera_status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2272701DxU2.camera_disabled_tips);
            BulletinInfo.ADAPTER.encodeWithTag(protoWriter, 3, c2272701DxU2.bulletin_info);
            protoAdapter.encodeWithTag(protoWriter, 4, c2272701DxU2.photoswap_status);
            protoAdapter.encodeWithTag(protoWriter, 5, c2272701DxU2.camera_message_display_status);
            protoAdapter.encodeWithTag(protoWriter, 6, c2272701DxU2.ai_groupshot_status);
            protoAdapter.encodeWithTag(protoWriter, 7, c2272701DxU2.voice_message_entrance_status);
            protoAdapter.encodeWithTag(protoWriter, 8, c2272701DxU2.voice_message_display_status);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2272701DxU2.voice_disabled_tips);
            protoAdapter.encodeWithTag(protoWriter, 10, c2272701DxU2.avatar_duo_entrance_status);
            protoAdapter.encodeWithTag(protoWriter, 11, c2272701DxU2.group_streak_pet_status);
            protoAdapter.encodeWithTag(protoWriter, 12, c2272701DxU2.group_streak_egg_entrance_status);
            protoAdapter.encodeWithTag(protoWriter, 13, c2272701DxU2.voice_call_entrance_status);
            protoAdapter2.encodeWithTag(protoWriter, 14, c2272701DxU2.voice_call_disabled_tips);
            protoAdapter.encodeWithTag(protoWriter, 15, c2272701DxU2.single_streak_egg_entrance_status);
            protoWriter.writeBytes(c2272701DxU2.unknownFields());
        }
    };
    public static final C0IBF DEFAULT_AI_GROUPSHOT_STATUS;
    public static final C0IBF DEFAULT_AVATAR_DUO_ENTRANCE_STATUS;
    public static final C0IBF DEFAULT_CAMERA_MESSAGE_DISPLAY_STATUS;
    public static final C0IBF DEFAULT_CAMERA_STATUS;
    public static final C0IBF DEFAULT_GROUP_STREAK_EGG_ENTRANCE_STATUS;
    public static final C0IBF DEFAULT_GROUP_STREAK_PET_STATUS;
    public static final C0IBF DEFAULT_PHOTOSWAP_STATUS;
    public static final C0IBF DEFAULT_SINGLE_STREAK_EGG_ENTRANCE_STATUS;
    public static final C0IBF DEFAULT_VOICE_CALL_ENTRANCE_STATUS;
    public static final C0IBF DEFAULT_VOICE_MESSAGE_DISPLAY_STATUS;
    public static final C0IBF DEFAULT_VOICE_MESSAGE_ENTRANCE_STATUS;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 6)
    public final C0IBF ai_groupshot_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C0IBF avatar_duo_entrance_status;

    @WireField(adapter = "im_conversation_info_proto.BulletinInfo#ADAPTER", tag = 3)
    public final BulletinInfo bulletin_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String camera_disabled_tips;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 5)
    public final C0IBF camera_message_display_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 1)
    public final C0IBF camera_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C0IBF group_streak_egg_entrance_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C0IBF group_streak_pet_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 4)
    public final C0IBF photoswap_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 15)
    public final C0IBF single_streak_egg_entrance_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String voice_call_disabled_tips;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    public final C0IBF voice_call_entrance_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = BdTuring.TYPE_ECAF)
    public final String voice_disabled_tips;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 8)
    public final C0IBF voice_message_display_status;

    @WireField(adapter = "im_conversation_info_proto.FeatureStatus#ADAPTER", tag = 7)
    public final C0IBF voice_message_entrance_status;

    static {
        C0IBF c0ibf = C0IBF.FEATURE_STATUS_UNKNOWN;
        DEFAULT_CAMERA_STATUS = c0ibf;
        DEFAULT_PHOTOSWAP_STATUS = c0ibf;
        DEFAULT_CAMERA_MESSAGE_DISPLAY_STATUS = c0ibf;
        DEFAULT_AI_GROUPSHOT_STATUS = c0ibf;
        DEFAULT_VOICE_MESSAGE_ENTRANCE_STATUS = c0ibf;
        DEFAULT_VOICE_MESSAGE_DISPLAY_STATUS = c0ibf;
        DEFAULT_AVATAR_DUO_ENTRANCE_STATUS = c0ibf;
        DEFAULT_GROUP_STREAK_PET_STATUS = c0ibf;
        DEFAULT_GROUP_STREAK_EGG_ENTRANCE_STATUS = c0ibf;
        DEFAULT_VOICE_CALL_ENTRANCE_STATUS = c0ibf;
        DEFAULT_SINGLE_STREAK_EGG_ENTRANCE_STATUS = c0ibf;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C0IBF c0ibf = this.camera_status;
        int iHashCode2 = (iHashCode + (c0ibf != null ? c0ibf.hashCode() : 0)) * 37;
        String str = this.camera_disabled_tips;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        BulletinInfo bulletinInfo = this.bulletin_info;
        int iHashCode4 = (iHashCode3 + (bulletinInfo != null ? bulletinInfo.hashCode() : 0)) * 37;
        C0IBF c0ibf2 = this.photoswap_status;
        int iHashCode5 = (iHashCode4 + (c0ibf2 != null ? c0ibf2.hashCode() : 0)) * 37;
        C0IBF c0ibf3 = this.camera_message_display_status;
        int iHashCode6 = (iHashCode5 + (c0ibf3 != null ? c0ibf3.hashCode() : 0)) * 37;
        C0IBF c0ibf4 = this.ai_groupshot_status;
        int iHashCode7 = (iHashCode6 + (c0ibf4 != null ? c0ibf4.hashCode() : 0)) * 37;
        C0IBF c0ibf5 = this.voice_message_entrance_status;
        int iHashCode8 = (iHashCode7 + (c0ibf5 != null ? c0ibf5.hashCode() : 0)) * 37;
        C0IBF c0ibf6 = this.voice_message_display_status;
        int iHashCode9 = (iHashCode8 + (c0ibf6 != null ? c0ibf6.hashCode() : 0)) * 37;
        String str2 = this.voice_disabled_tips;
        int iHashCode10 = (iHashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C0IBF c0ibf7 = this.avatar_duo_entrance_status;
        int iHashCode11 = (iHashCode10 + (c0ibf7 != null ? c0ibf7.hashCode() : 0)) * 37;
        C0IBF c0ibf8 = this.group_streak_pet_status;
        int iHashCode12 = (iHashCode11 + (c0ibf8 != null ? c0ibf8.hashCode() : 0)) * 37;
        C0IBF c0ibf9 = this.group_streak_egg_entrance_status;
        int iHashCode13 = (iHashCode12 + (c0ibf9 != null ? c0ibf9.hashCode() : 0)) * 37;
        C0IBF c0ibf10 = this.voice_call_entrance_status;
        int iHashCode14 = (iHashCode13 + (c0ibf10 != null ? c0ibf10.hashCode() : 0)) * 37;
        String str3 = this.voice_call_disabled_tips;
        int iHashCode15 = (iHashCode14 + (str3 != null ? str3.hashCode() : 0)) * 37;
        C0IBF c0ibf11 = this.single_streak_egg_entrance_status;
        int iHashCode16 = iHashCode15 + (c0ibf11 != null ? c0ibf11.hashCode() : 0);
        this.hashCode = iHashCode16;
        return iHashCode16;
    }

    @Override // com.squareup.wire.Message
    public C2272711DxV newBuilder() {
        C2272711DxV c2272711DxV = new C2272711DxV();
        c2272711DxV.LIZLLL = this.camera_status;
        c2272711DxV.LJ = this.camera_disabled_tips;
        c2272711DxV.LJFF = this.bulletin_info;
        c2272711DxV.LJI = this.photoswap_status;
        c2272711DxV.LJII = this.camera_message_display_status;
        c2272711DxV.LJIIIIZZ = this.ai_groupshot_status;
        c2272711DxV.LJIIIZ = this.voice_message_entrance_status;
        c2272711DxV.LJIIJ = this.voice_message_display_status;
        c2272711DxV.LJIIJJI = this.voice_disabled_tips;
        c2272711DxV.LJIIL = this.avatar_duo_entrance_status;
        c2272711DxV.LJIILIIL = this.group_streak_pet_status;
        c2272711DxV.LJIILJJIL = this.group_streak_egg_entrance_status;
        c2272711DxV.LJIILL = this.voice_call_entrance_status;
        c2272711DxV.LJIILLIIL = this.voice_call_disabled_tips;
        c2272711DxV.LJIIZILJ = this.single_streak_egg_entrance_status;
        c2272711DxV.addUnknownFields(unknownFields());
        return c2272711DxV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.camera_status != null) {
            sb.append(", camera_status=");
            sb.append(this.camera_status);
        }
        if (this.camera_disabled_tips != null) {
            sb.append(", camera_disabled_tips=");
            sb.append(this.camera_disabled_tips);
        }
        if (this.bulletin_info != null) {
            sb.append(", bulletin_info=");
            sb.append(this.bulletin_info);
        }
        if (this.photoswap_status != null) {
            sb.append(", photoswap_status=");
            sb.append(this.photoswap_status);
        }
        if (this.camera_message_display_status != null) {
            sb.append(", camera_message_display_status=");
            sb.append(this.camera_message_display_status);
        }
        if (this.ai_groupshot_status != null) {
            sb.append(", ai_groupshot_status=");
            sb.append(this.ai_groupshot_status);
        }
        if (this.voice_message_entrance_status != null) {
            sb.append(", voice_message_entrance_status=");
            sb.append(this.voice_message_entrance_status);
        }
        if (this.voice_message_display_status != null) {
            sb.append(", voice_message_display_status=");
            sb.append(this.voice_message_display_status);
        }
        if (this.voice_disabled_tips != null) {
            sb.append(", voice_disabled_tips=");
            sb.append(this.voice_disabled_tips);
        }
        if (this.avatar_duo_entrance_status != null) {
            sb.append(", avatar_duo_entrance_status=");
            sb.append(this.avatar_duo_entrance_status);
        }
        if (this.group_streak_pet_status != null) {
            sb.append(", group_streak_pet_status=");
            sb.append(this.group_streak_pet_status);
        }
        if (this.group_streak_egg_entrance_status != null) {
            sb.append(", group_streak_egg_entrance_status=");
            sb.append(this.group_streak_egg_entrance_status);
        }
        if (this.voice_call_entrance_status != null) {
            sb.append(", voice_call_entrance_status=");
            sb.append(this.voice_call_entrance_status);
        }
        if (this.voice_call_disabled_tips != null) {
            sb.append(", voice_call_disabled_tips=");
            sb.append(this.voice_call_disabled_tips);
        }
        if (this.single_streak_egg_entrance_status != null) {
            sb.append(", single_streak_egg_entrance_status=");
            sb.append(this.single_streak_egg_entrance_status);
        }
        sb.replace(0, 2, "BusinessExtension{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2272701DxU)) {
            return false;
        }
        C2272701DxU c2272701DxU = (C2272701DxU) obj;
        if (unknownFields().equals(c2272701DxU.unknownFields()) && C1516540pZE.LJ(this.camera_status, c2272701DxU.camera_status) && C1516540pZE.LJ(this.camera_disabled_tips, c2272701DxU.camera_disabled_tips) && C1516540pZE.LJ(this.bulletin_info, c2272701DxU.bulletin_info) && C1516540pZE.LJ(this.photoswap_status, c2272701DxU.photoswap_status) && C1516540pZE.LJ(this.camera_message_display_status, c2272701DxU.camera_message_display_status) && C1516540pZE.LJ(this.ai_groupshot_status, c2272701DxU.ai_groupshot_status) && C1516540pZE.LJ(this.voice_message_entrance_status, c2272701DxU.voice_message_entrance_status) && C1516540pZE.LJ(this.voice_message_display_status, c2272701DxU.voice_message_display_status) && C1516540pZE.LJ(this.voice_disabled_tips, c2272701DxU.voice_disabled_tips) && C1516540pZE.LJ(this.avatar_duo_entrance_status, c2272701DxU.avatar_duo_entrance_status) && C1516540pZE.LJ(this.group_streak_pet_status, c2272701DxU.group_streak_pet_status) && C1516540pZE.LJ(this.group_streak_egg_entrance_status, c2272701DxU.group_streak_egg_entrance_status) && C1516540pZE.LJ(this.voice_call_entrance_status, c2272701DxU.voice_call_entrance_status) && C1516540pZE.LJ(this.voice_call_disabled_tips, c2272701DxU.voice_call_disabled_tips) && C1516540pZE.LJ(this.single_streak_egg_entrance_status, c2272701DxU.single_streak_egg_entrance_status)) {
            return true;
        }
        return false;
    }

    public C2272701DxU(C0IBF c0ibf, String str, BulletinInfo bulletinInfo, C0IBF c0ibf2, C0IBF c0ibf3, C0IBF c0ibf4, C0IBF c0ibf5, C0IBF c0ibf6, String str2, C0IBF c0ibf7, C0IBF c0ibf8, C0IBF c0ibf9, C0IBF c0ibf10, String str3, C0IBF c0ibf11) {
        this(c0ibf, str, bulletinInfo, c0ibf2, c0ibf3, c0ibf4, c0ibf5, c0ibf6, str2, c0ibf7, c0ibf8, c0ibf9, c0ibf10, str3, c0ibf11, ByteString.EMPTY);
    }

    public C2272701DxU(C0IBF c0ibf, String str, BulletinInfo bulletinInfo, C0IBF c0ibf2, C0IBF c0ibf3, C0IBF c0ibf4, C0IBF c0ibf5, C0IBF c0ibf6, String str2, C0IBF c0ibf7, C0IBF c0ibf8, C0IBF c0ibf9, C0IBF c0ibf10, String str3, C0IBF c0ibf11, ByteString byteString) {
        super(ADAPTER, byteString);
        this.camera_status = c0ibf;
        this.camera_disabled_tips = str;
        this.bulletin_info = bulletinInfo;
        this.photoswap_status = c0ibf2;
        this.camera_message_display_status = c0ibf3;
        this.ai_groupshot_status = c0ibf4;
        this.voice_message_entrance_status = c0ibf5;
        this.voice_message_display_status = c0ibf6;
        this.voice_disabled_tips = str2;
        this.avatar_duo_entrance_status = c0ibf7;
        this.group_streak_pet_status = c0ibf8;
        this.group_streak_egg_entrance_status = c0ibf9;
        this.voice_call_entrance_status = c0ibf10;
        this.voice_call_disabled_tips = str3;
        this.single_streak_egg_entrance_status = c0ibf11;
    }
}
