package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
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

/* JADX INFO: renamed from: X.1CWe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231661CWe extends Message<C2231661CWe, C2231681CWg> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImApplyGroupModel#ADAPTER", tag = 22)
    public final C2227291CFj apply_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImApplyModel#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C1CFY apply_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 5)
    public final ByteString business_content;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImCancelApplyGroupModel#ADAPTER", tag = 23)
    public final C1CHN cancel_apply_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImCancelApplyModel#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C2227201CFa cancel_apply_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImCancelInviteGroupModel#ADAPTER", tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public final C1CHQ cancel_invite_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImCancelInviteModel#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public final C2233041Cac cancel_invite_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImFinishChannelModel#ADAPTER", tag = 7)
    public final C2228211CIx finish_channel_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImGroupListChangeModel#ADAPTER", tag = 26)
    public final C1CNW group_list_change_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2231801CWs im_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImInviteGroupModel#ADAPTER", tag = 19)
    public final C2227321CFm invite_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImInviteModel#ADAPTER", tag = 8)
    public final C2233011CaZ invite_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImJoinDirectModel#ADAPTER", tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final C2227241CFe join_direct_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImJoinGroupDirectModel#ADAPTER", tag = 28)
    public final C1CFU join_group_direct_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImJoinRoomDirectModel#ADAPTER", tag = LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT)
    public final C2227261CFg join_room_direct_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImKickoutModel#ADAPTER", tag = 15)
    public final C1CPN kickout_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImLeaveModel#ADAPTER", tag = 14)
    public final C1CKY leave_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImListChangeModel#ADAPTER", tag = 16)
    public final C1CJO list_change_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImMode#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC2231901CXc mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long msg_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImp2pGroupListChangeModel#ADAPTER", tag = 27)
    public final C1CNT p2p_group_list_change_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImPermitGroupModel#ADAPTER", tag = LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT)
    public final C2232931CaR permit_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImPermitModel#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    public final C2232981CaW permit_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 6)
    public final Double receive_timestamp;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImReplyGroupModel#ADAPTER", tag = 21)
    public final C2232921CaQ reply_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImReplyModel#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2232891CaN reply_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImSelfShouldLeaveGroupModel#ADAPTER", tag = 25)
    public final C2229461CNs self_should_leave_group_model;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicImSubType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CXR sub_type;
    public static final ProtoAdapter<C2231661CWe> ADAPTER = new ProtoAdapter<C2231661CWe>() { // from class: X.1CWf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231661CWe decode(ProtoReader protoReader) {
            C2231681CWg c2231681CWg = new C2231681CWg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2231681CWg.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c2231681CWg.LJ = EnumC2231801CWs.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2231681CWg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            try {
                                c2231681CWg.LJFF = C1CXR.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2231681CWg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 4:
                            try {
                                c2231681CWg.LJI = EnumC2231901CXc.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2231681CWg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case 5:
                            c2231681CWg.LJII = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 6:
                            c2231681CWg.LJIIIIZZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            c2231681CWg.LJIIIZ = C2228211CIx.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2231681CWg.LJIIJ = C2233011CaZ.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2231681CWg.LJIIJJI = C2233041Cac.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2231681CWg.LJIIL = C2232891CaN.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2231681CWg.LJIILIIL = C1CFY.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2231681CWg.LJIILJJIL = C2227201CFa.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2231681CWg.LJIILL = C2232981CaW.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c2231681CWg.LJIILLIIL = C1CKY.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c2231681CWg.LJIIZILJ = C1CPN.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c2231681CWg.LJIJ = C1CJO.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2231681CWg.LJIJI = C2227241CFe.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2231681CWg.LJIJJ = C2227261CFg.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c2231681CWg.LJIJJLI = C2227321CFm.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c2231681CWg.LJIL = C1CHQ.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c2231681CWg.LJJ = C2232921CaQ.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c2231681CWg.LJJI = C2227291CFj.ADAPTER.decode(protoReader);
                            break;
                        case 23:
                            c2231681CWg.LJJIFFI = C1CHN.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c2231681CWg.LJJII = C2232931CaR.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c2231681CWg.LJJIII = C2229461CNs.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c2231681CWg.LJJIIJ = C1CNW.ADAPTER.decode(protoReader);
                            break;
                        case 27:
                            c2231681CWg.LJJIIJZLJL = C1CNT.ADAPTER.decode(protoReader);
                            break;
                        case 28:
                            c2231681CWg.LJJIIZ = C1CFU.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2231681CWg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231681CWg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231661CWe c2231661CWe) {
            C2231661CWe c2231661CWe2 = c2231661CWe;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2231661CWe2.msg_id) + EnumC2231801CWs.ADAPTER.encodedSizeWithTag(2, c2231661CWe2.im_type) + C1CXR.ADAPTER.encodedSizeWithTag(3, c2231661CWe2.sub_type) + EnumC2231901CXc.ADAPTER.encodedSizeWithTag(4, c2231661CWe2.mode) + ProtoAdapter.BYTES.encodedSizeWithTag(5, c2231661CWe2.business_content) + ProtoAdapter.DOUBLE.encodedSizeWithTag(6, c2231661CWe2.receive_timestamp) + C2228211CIx.ADAPTER.encodedSizeWithTag(7, c2231661CWe2.finish_channel_model) + C2233011CaZ.ADAPTER.encodedSizeWithTag(8, c2231661CWe2.invite_model) + C2233041Cac.ADAPTER.encodedSizeWithTag(9, c2231661CWe2.cancel_invite_model) + C2232891CaN.ADAPTER.encodedSizeWithTag(10, c2231661CWe2.reply_model) + C1CFY.ADAPTER.encodedSizeWithTag(11, c2231661CWe2.apply_model) + C2227201CFa.ADAPTER.encodedSizeWithTag(12, c2231661CWe2.cancel_apply_model) + C2232981CaW.ADAPTER.encodedSizeWithTag(13, c2231661CWe2.permit_model) + C1CKY.ADAPTER.encodedSizeWithTag(14, c2231661CWe2.leave_model) + C1CPN.ADAPTER.encodedSizeWithTag(15, c2231661CWe2.kickout_model) + C1CJO.ADAPTER.encodedSizeWithTag(16, c2231661CWe2.list_change_model) + C2227241CFe.ADAPTER.encodedSizeWithTag(17, c2231661CWe2.join_direct_model) + C2227261CFg.ADAPTER.encodedSizeWithTag(18, c2231661CWe2.join_room_direct_model) + C2227321CFm.ADAPTER.encodedSizeWithTag(19, c2231661CWe2.invite_group_model) + C1CHQ.ADAPTER.encodedSizeWithTag(20, c2231661CWe2.cancel_invite_group_model) + C2232921CaQ.ADAPTER.encodedSizeWithTag(21, c2231661CWe2.reply_group_model) + C2227291CFj.ADAPTER.encodedSizeWithTag(22, c2231661CWe2.apply_group_model) + C1CHN.ADAPTER.encodedSizeWithTag(23, c2231661CWe2.cancel_apply_group_model) + C2232931CaR.ADAPTER.encodedSizeWithTag(24, c2231661CWe2.permit_group_model) + C2229461CNs.ADAPTER.encodedSizeWithTag(25, c2231661CWe2.self_should_leave_group_model) + C1CNW.ADAPTER.encodedSizeWithTag(26, c2231661CWe2.group_list_change_model) + C1CNT.ADAPTER.encodedSizeWithTag(27, c2231661CWe2.p2p_group_list_change_model) + C1CFU.ADAPTER.encodedSizeWithTag(28, c2231661CWe2.join_group_direct_model) + c2231661CWe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231661CWe redact(C2231661CWe c2231661CWe) {
            C2231681CWg c2231681CWgNewBuilder = c2231661CWe.newBuilder();
            C2228211CIx c2228211CIx = c2231681CWgNewBuilder.LJIIIZ;
            if (c2228211CIx != null) {
                c2231681CWgNewBuilder.LJIIIZ = C2228211CIx.ADAPTER.redact(c2228211CIx);
            }
            C2233011CaZ c2233011CaZ = c2231681CWgNewBuilder.LJIIJ;
            if (c2233011CaZ != null) {
                c2231681CWgNewBuilder.LJIIJ = C2233011CaZ.ADAPTER.redact(c2233011CaZ);
            }
            C2233041Cac c2233041Cac = c2231681CWgNewBuilder.LJIIJJI;
            if (c2233041Cac != null) {
                c2231681CWgNewBuilder.LJIIJJI = C2233041Cac.ADAPTER.redact(c2233041Cac);
            }
            C2232891CaN c2232891CaN = c2231681CWgNewBuilder.LJIIL;
            if (c2232891CaN != null) {
                c2231681CWgNewBuilder.LJIIL = C2232891CaN.ADAPTER.redact(c2232891CaN);
            }
            C1CFY c1cfy = c2231681CWgNewBuilder.LJIILIIL;
            if (c1cfy != null) {
                c2231681CWgNewBuilder.LJIILIIL = C1CFY.ADAPTER.redact(c1cfy);
            }
            C2227201CFa c2227201CFa = c2231681CWgNewBuilder.LJIILJJIL;
            if (c2227201CFa != null) {
                c2231681CWgNewBuilder.LJIILJJIL = C2227201CFa.ADAPTER.redact(c2227201CFa);
            }
            C2232981CaW c2232981CaW = c2231681CWgNewBuilder.LJIILL;
            if (c2232981CaW != null) {
                c2231681CWgNewBuilder.LJIILL = C2232981CaW.ADAPTER.redact(c2232981CaW);
            }
            C1CKY c1cky = c2231681CWgNewBuilder.LJIILLIIL;
            if (c1cky != null) {
                c2231681CWgNewBuilder.LJIILLIIL = C1CKY.ADAPTER.redact(c1cky);
            }
            C1CPN c1cpn = c2231681CWgNewBuilder.LJIIZILJ;
            if (c1cpn != null) {
                c2231681CWgNewBuilder.LJIIZILJ = C1CPN.ADAPTER.redact(c1cpn);
            }
            C1CJO c1cjo = c2231681CWgNewBuilder.LJIJ;
            if (c1cjo != null) {
                c2231681CWgNewBuilder.LJIJ = C1CJO.ADAPTER.redact(c1cjo);
            }
            C2227241CFe c2227241CFe = c2231681CWgNewBuilder.LJIJI;
            if (c2227241CFe != null) {
                c2231681CWgNewBuilder.LJIJI = C2227241CFe.ADAPTER.redact(c2227241CFe);
            }
            C2227261CFg c2227261CFg = c2231681CWgNewBuilder.LJIJJ;
            if (c2227261CFg != null) {
                c2231681CWgNewBuilder.LJIJJ = C2227261CFg.ADAPTER.redact(c2227261CFg);
            }
            C2227321CFm c2227321CFm = c2231681CWgNewBuilder.LJIJJLI;
            if (c2227321CFm != null) {
                c2231681CWgNewBuilder.LJIJJLI = C2227321CFm.ADAPTER.redact(c2227321CFm);
            }
            C1CHQ c1chq = c2231681CWgNewBuilder.LJIL;
            if (c1chq != null) {
                c2231681CWgNewBuilder.LJIL = C1CHQ.ADAPTER.redact(c1chq);
            }
            C2232921CaQ c2232921CaQ = c2231681CWgNewBuilder.LJJ;
            if (c2232921CaQ != null) {
                c2231681CWgNewBuilder.LJJ = C2232921CaQ.ADAPTER.redact(c2232921CaQ);
            }
            C2227291CFj c2227291CFj = c2231681CWgNewBuilder.LJJI;
            if (c2227291CFj != null) {
                c2231681CWgNewBuilder.LJJI = C2227291CFj.ADAPTER.redact(c2227291CFj);
            }
            C1CHN c1chn = c2231681CWgNewBuilder.LJJIFFI;
            if (c1chn != null) {
                c2231681CWgNewBuilder.LJJIFFI = C1CHN.ADAPTER.redact(c1chn);
            }
            C2232931CaR c2232931CaR = c2231681CWgNewBuilder.LJJII;
            if (c2232931CaR != null) {
                c2231681CWgNewBuilder.LJJII = C2232931CaR.ADAPTER.redact(c2232931CaR);
            }
            C2229461CNs c2229461CNs = c2231681CWgNewBuilder.LJJIII;
            if (c2229461CNs != null) {
                c2231681CWgNewBuilder.LJJIII = C2229461CNs.ADAPTER.redact(c2229461CNs);
            }
            C1CNW c1cnw = c2231681CWgNewBuilder.LJJIIJ;
            if (c1cnw != null) {
                c2231681CWgNewBuilder.LJJIIJ = C1CNW.ADAPTER.redact(c1cnw);
            }
            C1CNT c1cnt = c2231681CWgNewBuilder.LJJIIJZLJL;
            if (c1cnt != null) {
                c2231681CWgNewBuilder.LJJIIJZLJL = C1CNT.ADAPTER.redact(c1cnt);
            }
            C1CFU c1cfu = c2231681CWgNewBuilder.LJJIIZ;
            if (c1cfu != null) {
                c2231681CWgNewBuilder.LJJIIZ = C1CFU.ADAPTER.redact(c1cfu);
            }
            c2231681CWgNewBuilder.clearUnknownFields();
            return c2231681CWgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231661CWe c2231661CWe) {
            C2231661CWe c2231661CWe2 = c2231661CWe;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2231661CWe2.msg_id);
            EnumC2231801CWs.ADAPTER.encodeWithTag(protoWriter, 2, c2231661CWe2.im_type);
            C1CXR.ADAPTER.encodeWithTag(protoWriter, 3, c2231661CWe2.sub_type);
            EnumC2231901CXc.ADAPTER.encodeWithTag(protoWriter, 4, c2231661CWe2.mode);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, c2231661CWe2.business_content);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 6, c2231661CWe2.receive_timestamp);
            C2228211CIx.ADAPTER.encodeWithTag(protoWriter, 7, c2231661CWe2.finish_channel_model);
            C2233011CaZ.ADAPTER.encodeWithTag(protoWriter, 8, c2231661CWe2.invite_model);
            C2233041Cac.ADAPTER.encodeWithTag(protoWriter, 9, c2231661CWe2.cancel_invite_model);
            C2232891CaN.ADAPTER.encodeWithTag(protoWriter, 10, c2231661CWe2.reply_model);
            C1CFY.ADAPTER.encodeWithTag(protoWriter, 11, c2231661CWe2.apply_model);
            C2227201CFa.ADAPTER.encodeWithTag(protoWriter, 12, c2231661CWe2.cancel_apply_model);
            C2232981CaW.ADAPTER.encodeWithTag(protoWriter, 13, c2231661CWe2.permit_model);
            C1CKY.ADAPTER.encodeWithTag(protoWriter, 14, c2231661CWe2.leave_model);
            C1CPN.ADAPTER.encodeWithTag(protoWriter, 15, c2231661CWe2.kickout_model);
            C1CJO.ADAPTER.encodeWithTag(protoWriter, 16, c2231661CWe2.list_change_model);
            C2227241CFe.ADAPTER.encodeWithTag(protoWriter, 17, c2231661CWe2.join_direct_model);
            C2227261CFg.ADAPTER.encodeWithTag(protoWriter, 18, c2231661CWe2.join_room_direct_model);
            C2227321CFm.ADAPTER.encodeWithTag(protoWriter, 19, c2231661CWe2.invite_group_model);
            C1CHQ.ADAPTER.encodeWithTag(protoWriter, 20, c2231661CWe2.cancel_invite_group_model);
            C2232921CaQ.ADAPTER.encodeWithTag(protoWriter, 21, c2231661CWe2.reply_group_model);
            C2227291CFj.ADAPTER.encodeWithTag(protoWriter, 22, c2231661CWe2.apply_group_model);
            C1CHN.ADAPTER.encodeWithTag(protoWriter, 23, c2231661CWe2.cancel_apply_group_model);
            C2232931CaR.ADAPTER.encodeWithTag(protoWriter, 24, c2231661CWe2.permit_group_model);
            C2229461CNs.ADAPTER.encodeWithTag(protoWriter, 25, c2231661CWe2.self_should_leave_group_model);
            C1CNW.ADAPTER.encodeWithTag(protoWriter, 26, c2231661CWe2.group_list_change_model);
            C1CNT.ADAPTER.encodeWithTag(protoWriter, 27, c2231661CWe2.p2p_group_list_change_model);
            C1CFU.ADAPTER.encodeWithTag(protoWriter, 28, c2231661CWe2.join_group_direct_model);
            protoWriter.writeBytes(c2231661CWe2.unknownFields());
        }
    };
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final EnumC2231801CWs DEFAULT_IM_TYPE = EnumC2231801CWs.VAR_LINK_MIC_IM_TYPE_UNKNOWN;
    public static final C1CXR DEFAULT_SUB_TYPE = C1CXR.VAR_LINK_MIC_IM_SUB_TYPE_NONE;
    public static final EnumC2231901CXc DEFAULT_MODE = EnumC2231901CXc.VAR_LINK_MIC_IM_MODE_IM;
    public static final ByteString DEFAULT_BUSINESS_CONTENT = ByteString.EMPTY;
    public static final Double DEFAULT_RECEIVE_TIMESTAMP = Double.valueOf(0.0d);

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.msg_id.hashCode()) * 37) + this.im_type.hashCode()) * 37) + this.sub_type.hashCode()) * 37) + this.mode.hashCode()) * 37;
        ByteString byteString = this.business_content;
        int iHashCode2 = (((iHashCode + (byteString != null ? byteString.hashCode() : 0)) * 37) + this.receive_timestamp.hashCode()) * 37;
        C2228211CIx c2228211CIx = this.finish_channel_model;
        int iHashCode3 = (iHashCode2 + (c2228211CIx != null ? c2228211CIx.hashCode() : 0)) * 37;
        C2233011CaZ c2233011CaZ = this.invite_model;
        int iHashCode4 = (iHashCode3 + (c2233011CaZ != null ? c2233011CaZ.hashCode() : 0)) * 37;
        C2233041Cac c2233041Cac = this.cancel_invite_model;
        int iHashCode5 = (iHashCode4 + (c2233041Cac != null ? c2233041Cac.hashCode() : 0)) * 37;
        C2232891CaN c2232891CaN = this.reply_model;
        int iHashCode6 = (iHashCode5 + (c2232891CaN != null ? c2232891CaN.hashCode() : 0)) * 37;
        C1CFY c1cfy = this.apply_model;
        int iHashCode7 = (iHashCode6 + (c1cfy != null ? c1cfy.hashCode() : 0)) * 37;
        C2227201CFa c2227201CFa = this.cancel_apply_model;
        int iHashCode8 = (iHashCode7 + (c2227201CFa != null ? c2227201CFa.hashCode() : 0)) * 37;
        C2232981CaW c2232981CaW = this.permit_model;
        int iHashCode9 = (iHashCode8 + (c2232981CaW != null ? c2232981CaW.hashCode() : 0)) * 37;
        C1CKY c1cky = this.leave_model;
        int iHashCode10 = (iHashCode9 + (c1cky != null ? c1cky.hashCode() : 0)) * 37;
        C1CPN c1cpn = this.kickout_model;
        int iHashCode11 = (iHashCode10 + (c1cpn != null ? c1cpn.hashCode() : 0)) * 37;
        C1CJO c1cjo = this.list_change_model;
        int iHashCode12 = (iHashCode11 + (c1cjo != null ? c1cjo.hashCode() : 0)) * 37;
        C2227241CFe c2227241CFe = this.join_direct_model;
        int iHashCode13 = (iHashCode12 + (c2227241CFe != null ? c2227241CFe.hashCode() : 0)) * 37;
        C2227261CFg c2227261CFg = this.join_room_direct_model;
        int iHashCode14 = (iHashCode13 + (c2227261CFg != null ? c2227261CFg.hashCode() : 0)) * 37;
        C2227321CFm c2227321CFm = this.invite_group_model;
        int iHashCode15 = (iHashCode14 + (c2227321CFm != null ? c2227321CFm.hashCode() : 0)) * 37;
        C1CHQ c1chq = this.cancel_invite_group_model;
        int iHashCode16 = (iHashCode15 + (c1chq != null ? c1chq.hashCode() : 0)) * 37;
        C2232921CaQ c2232921CaQ = this.reply_group_model;
        int iHashCode17 = (iHashCode16 + (c2232921CaQ != null ? c2232921CaQ.hashCode() : 0)) * 37;
        C2227291CFj c2227291CFj = this.apply_group_model;
        int iHashCode18 = (iHashCode17 + (c2227291CFj != null ? c2227291CFj.hashCode() : 0)) * 37;
        C1CHN c1chn = this.cancel_apply_group_model;
        int iHashCode19 = (iHashCode18 + (c1chn != null ? c1chn.hashCode() : 0)) * 37;
        C2232931CaR c2232931CaR = this.permit_group_model;
        int iHashCode20 = (iHashCode19 + (c2232931CaR != null ? c2232931CaR.hashCode() : 0)) * 37;
        C2229461CNs c2229461CNs = this.self_should_leave_group_model;
        int iHashCode21 = (iHashCode20 + (c2229461CNs != null ? c2229461CNs.hashCode() : 0)) * 37;
        C1CNW c1cnw = this.group_list_change_model;
        int iHashCode22 = (iHashCode21 + (c1cnw != null ? c1cnw.hashCode() : 0)) * 37;
        C1CNT c1cnt = this.p2p_group_list_change_model;
        int iHashCode23 = (iHashCode22 + (c1cnt != null ? c1cnt.hashCode() : 0)) * 37;
        C1CFU c1cfu = this.join_group_direct_model;
        int iHashCode24 = iHashCode23 + (c1cfu != null ? c1cfu.hashCode() : 0);
        this.hashCode = iHashCode24;
        return iHashCode24;
    }

    @Override // com.squareup.wire.Message
    public C2231681CWg newBuilder() {
        C2231681CWg c2231681CWg = new C2231681CWg();
        c2231681CWg.LIZLLL = this.msg_id;
        c2231681CWg.LJ = this.im_type;
        c2231681CWg.LJFF = this.sub_type;
        c2231681CWg.LJI = this.mode;
        c2231681CWg.LJII = this.business_content;
        c2231681CWg.LJIIIIZZ = this.receive_timestamp;
        c2231681CWg.LJIIIZ = this.finish_channel_model;
        c2231681CWg.LJIIJ = this.invite_model;
        c2231681CWg.LJIIJJI = this.cancel_invite_model;
        c2231681CWg.LJIIL = this.reply_model;
        c2231681CWg.LJIILIIL = this.apply_model;
        c2231681CWg.LJIILJJIL = this.cancel_apply_model;
        c2231681CWg.LJIILL = this.permit_model;
        c2231681CWg.LJIILLIIL = this.leave_model;
        c2231681CWg.LJIIZILJ = this.kickout_model;
        c2231681CWg.LJIJ = this.list_change_model;
        c2231681CWg.LJIJI = this.join_direct_model;
        c2231681CWg.LJIJJ = this.join_room_direct_model;
        c2231681CWg.LJIJJLI = this.invite_group_model;
        c2231681CWg.LJIL = this.cancel_invite_group_model;
        c2231681CWg.LJJ = this.reply_group_model;
        c2231681CWg.LJJI = this.apply_group_model;
        c2231681CWg.LJJIFFI = this.cancel_apply_group_model;
        c2231681CWg.LJJII = this.permit_group_model;
        c2231681CWg.LJJIII = this.self_should_leave_group_model;
        c2231681CWg.LJJIIJ = this.group_list_change_model;
        c2231681CWg.LJJIIJZLJL = this.p2p_group_list_change_model;
        c2231681CWg.LJJIIZ = this.join_group_direct_model;
        c2231681CWg.addUnknownFields(unknownFields());
        return c2231681CWg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", msg_id=");
        sb.append(this.msg_id);
        sb.append(", im_type=");
        sb.append(this.im_type);
        sb.append(", sub_type=");
        sb.append(this.sub_type);
        sb.append(", mode=");
        sb.append(this.mode);
        if (this.business_content != null) {
            sb.append(", business_content=");
            sb.append(this.business_content);
        }
        sb.append(", receive_timestamp=");
        sb.append(this.receive_timestamp);
        if (this.finish_channel_model != null) {
            sb.append(", finish_channel_model=");
            sb.append(this.finish_channel_model);
        }
        if (this.invite_model != null) {
            sb.append(", invite_model=");
            sb.append(this.invite_model);
        }
        if (this.cancel_invite_model != null) {
            sb.append(", cancel_invite_model=");
            sb.append(this.cancel_invite_model);
        }
        if (this.reply_model != null) {
            sb.append(", reply_model=");
            sb.append(this.reply_model);
        }
        if (this.apply_model != null) {
            sb.append(", apply_model=");
            sb.append(this.apply_model);
        }
        if (this.cancel_apply_model != null) {
            sb.append(", cancel_apply_model=");
            sb.append(this.cancel_apply_model);
        }
        if (this.permit_model != null) {
            sb.append(", permit_model=");
            sb.append(this.permit_model);
        }
        if (this.leave_model != null) {
            sb.append(", leave_model=");
            sb.append(this.leave_model);
        }
        if (this.kickout_model != null) {
            sb.append(", kickout_model=");
            sb.append(this.kickout_model);
        }
        if (this.list_change_model != null) {
            sb.append(", list_change_model=");
            sb.append(this.list_change_model);
        }
        if (this.join_direct_model != null) {
            sb.append(", join_direct_model=");
            sb.append(this.join_direct_model);
        }
        if (this.join_room_direct_model != null) {
            sb.append(", join_room_direct_model=");
            sb.append(this.join_room_direct_model);
        }
        if (this.invite_group_model != null) {
            sb.append(", invite_group_model=");
            sb.append(this.invite_group_model);
        }
        if (this.cancel_invite_group_model != null) {
            sb.append(", cancel_invite_group_model=");
            sb.append(this.cancel_invite_group_model);
        }
        if (this.reply_group_model != null) {
            sb.append(", reply_group_model=");
            sb.append(this.reply_group_model);
        }
        if (this.apply_group_model != null) {
            sb.append(", apply_group_model=");
            sb.append(this.apply_group_model);
        }
        if (this.cancel_apply_group_model != null) {
            sb.append(", cancel_apply_group_model=");
            sb.append(this.cancel_apply_group_model);
        }
        if (this.permit_group_model != null) {
            sb.append(", permit_group_model=");
            sb.append(this.permit_group_model);
        }
        if (this.self_should_leave_group_model != null) {
            sb.append(", self_should_leave_group_model=");
            sb.append(this.self_should_leave_group_model);
        }
        if (this.group_list_change_model != null) {
            sb.append(", group_list_change_model=");
            sb.append(this.group_list_change_model);
        }
        if (this.p2p_group_list_change_model != null) {
            sb.append(", p2p_group_list_change_model=");
            sb.append(this.p2p_group_list_change_model);
        }
        if (this.join_group_direct_model != null) {
            sb.append(", join_group_direct_model=");
            sb.append(this.join_group_direct_model);
        }
        sb.replace(0, 2, "LinkMicImModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231661CWe)) {
            return false;
        }
        C2231661CWe c2231661CWe = (C2231661CWe) obj;
        if (unknownFields().equals(c2231661CWe.unknownFields()) && this.msg_id.equals(c2231661CWe.msg_id) && this.im_type.equals(c2231661CWe.im_type) && this.sub_type.equals(c2231661CWe.sub_type) && this.mode.equals(c2231661CWe.mode) && C1516540pZE.LJ(this.business_content, c2231661CWe.business_content) && this.receive_timestamp.equals(c2231661CWe.receive_timestamp) && C1516540pZE.LJ(this.finish_channel_model, c2231661CWe.finish_channel_model) && C1516540pZE.LJ(this.invite_model, c2231661CWe.invite_model) && C1516540pZE.LJ(this.cancel_invite_model, c2231661CWe.cancel_invite_model) && C1516540pZE.LJ(this.reply_model, c2231661CWe.reply_model) && C1516540pZE.LJ(this.apply_model, c2231661CWe.apply_model) && C1516540pZE.LJ(this.cancel_apply_model, c2231661CWe.cancel_apply_model) && C1516540pZE.LJ(this.permit_model, c2231661CWe.permit_model) && C1516540pZE.LJ(this.leave_model, c2231661CWe.leave_model) && C1516540pZE.LJ(this.kickout_model, c2231661CWe.kickout_model) && C1516540pZE.LJ(this.list_change_model, c2231661CWe.list_change_model) && C1516540pZE.LJ(this.join_direct_model, c2231661CWe.join_direct_model) && C1516540pZE.LJ(this.join_room_direct_model, c2231661CWe.join_room_direct_model) && C1516540pZE.LJ(this.invite_group_model, c2231661CWe.invite_group_model) && C1516540pZE.LJ(this.cancel_invite_group_model, c2231661CWe.cancel_invite_group_model) && C1516540pZE.LJ(this.reply_group_model, c2231661CWe.reply_group_model) && C1516540pZE.LJ(this.apply_group_model, c2231661CWe.apply_group_model) && C1516540pZE.LJ(this.cancel_apply_group_model, c2231661CWe.cancel_apply_group_model) && C1516540pZE.LJ(this.permit_group_model, c2231661CWe.permit_group_model) && C1516540pZE.LJ(this.self_should_leave_group_model, c2231661CWe.self_should_leave_group_model) && C1516540pZE.LJ(this.group_list_change_model, c2231661CWe.group_list_change_model) && C1516540pZE.LJ(this.p2p_group_list_change_model, c2231661CWe.p2p_group_list_change_model) && C1516540pZE.LJ(this.join_group_direct_model, c2231661CWe.join_group_direct_model)) {
            return true;
        }
        return false;
    }

    public C2231661CWe(Long l, EnumC2231801CWs enumC2231801CWs, C1CXR c1cxr, EnumC2231901CXc enumC2231901CXc, ByteString byteString, Double d, C2228211CIx c2228211CIx, C2233011CaZ c2233011CaZ, C2233041Cac c2233041Cac, C2232891CaN c2232891CaN, C1CFY c1cfy, C2227201CFa c2227201CFa, C2232981CaW c2232981CaW, C1CKY c1cky, C1CPN c1cpn, C1CJO c1cjo, C2227241CFe c2227241CFe, C2227261CFg c2227261CFg, C2227321CFm c2227321CFm, C1CHQ c1chq, C2232921CaQ c2232921CaQ, C2227291CFj c2227291CFj, C1CHN c1chn, C2232931CaR c2232931CaR, C2229461CNs c2229461CNs, C1CNW c1cnw, C1CNT c1cnt, C1CFU c1cfu) {
        this(l, enumC2231801CWs, c1cxr, enumC2231901CXc, byteString, d, c2228211CIx, c2233011CaZ, c2233041Cac, c2232891CaN, c1cfy, c2227201CFa, c2232981CaW, c1cky, c1cpn, c1cjo, c2227241CFe, c2227261CFg, c2227321CFm, c1chq, c2232921CaQ, c2227291CFj, c1chn, c2232931CaR, c2229461CNs, c1cnw, c1cnt, c1cfu, ByteString.EMPTY);
    }

    public C2231661CWe(Long l, EnumC2231801CWs enumC2231801CWs, C1CXR c1cxr, EnumC2231901CXc enumC2231901CXc, ByteString byteString, Double d, C2228211CIx c2228211CIx, C2233011CaZ c2233011CaZ, C2233041Cac c2233041Cac, C2232891CaN c2232891CaN, C1CFY c1cfy, C2227201CFa c2227201CFa, C2232981CaW c2232981CaW, C1CKY c1cky, C1CPN c1cpn, C1CJO c1cjo, C2227241CFe c2227241CFe, C2227261CFg c2227261CFg, C2227321CFm c2227321CFm, C1CHQ c1chq, C2232921CaQ c2232921CaQ, C2227291CFj c2227291CFj, C1CHN c1chn, C2232931CaR c2232931CaR, C2229461CNs c2229461CNs, C1CNW c1cnw, C1CNT c1cnt, C1CFU c1cfu, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.msg_id = l;
        this.im_type = enumC2231801CWs;
        this.sub_type = c1cxr;
        this.mode = enumC2231901CXc;
        this.business_content = byteString;
        this.receive_timestamp = d;
        this.finish_channel_model = c2228211CIx;
        this.invite_model = c2233011CaZ;
        this.cancel_invite_model = c2233041Cac;
        this.reply_model = c2232891CaN;
        this.apply_model = c1cfy;
        this.cancel_apply_model = c2227201CFa;
        this.permit_model = c2232981CaW;
        this.leave_model = c1cky;
        this.kickout_model = c1cpn;
        this.list_change_model = c1cjo;
        this.join_direct_model = c2227241CFe;
        this.join_room_direct_model = c2227261CFg;
        this.invite_group_model = c2227321CFm;
        this.cancel_invite_group_model = c1chq;
        this.reply_group_model = c2232921CaQ;
        this.apply_group_model = c2227291CFj;
        this.cancel_apply_group_model = c1chn;
        this.permit_group_model = c2232931CaR;
        this.self_should_leave_group_model = c2229461CNs;
        this.group_list_change_model = c1cnw;
        this.p2p_group_list_change_model = c1cnt;
        this.join_group_direct_model = c1cfu;
    }
}
