package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Coy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241941Coy extends Message<C2241941Coy, C2241961Cp0> {
    public static final ProtoAdapter<C2241941Coy> ADAPTER = new ProtoAdapter<C2241941Coy>() { // from class: X.1Coz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241941Coy decode(ProtoReader protoReader) {
            C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        switch (iNextTag) {
                            case 4:
                                c2241961Cp0.LJ = C2242181CpM.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c2241961Cp0.LJFF = C2242581Cq0.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c2241961Cp0.LJI = C2243301CrA.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c2241961Cp0.LJII = C2243581Crc.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c2241961Cp0.LJIIIIZZ = C2242401Cpi.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c2241961Cp0.LJIIIZ = C2243611Crf.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c2241961Cp0.LJIIJ = C2242001Cp4.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c2241961Cp0.LJIIJJI = C2241911Cov.ADAPTER.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c2241961Cp0.LJIIL = C2242861CqS.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c2241961Cp0.LJIILIIL = C2241391Co5.ADAPTER.decode(protoReader);
                                break;
                            case 14:
                                c2241961Cp0.LJIILJJIL = C2240871CnF.ADAPTER.decode(protoReader);
                                break;
                            case 15:
                                c2241961Cp0.LJIILL = C2243171Cqx.ADAPTER.decode(protoReader);
                                break;
                            case 16:
                                c2241961Cp0.LJIILLIIL = C2241091Cnb.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c2241961Cp0.LJIIZILJ = C2241641CoU.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c2241961Cp0.LJIJ = C2242471Cpp.ADAPTER.decode(protoReader);
                                break;
                            case 19:
                                c2241961Cp0.LJIJI = C2241771Coh.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c2241961Cp0.LJIJJ = C2241271Cnt.ADAPTER.decode(protoReader);
                                break;
                            case 21:
                                c2241961Cp0.LJIJJLI = C2241171Cnj.ADAPTER.decode(protoReader);
                                break;
                            case 22:
                                c2241961Cp0.LJIL = C2240961CnO.ADAPTER.decode(protoReader);
                                break;
                            case 23:
                                c2241961Cp0.LJJ = C2241001CnS.ADAPTER.decode(protoReader);
                                break;
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                c2241961Cp0.LJJI = C2241041CnW.ADAPTER.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case 100:
                                        c2241961Cp0.LJJIFFI = C2243261Cr6.ADAPTER.decode(protoReader);
                                        break;
                                    case 101:
                                        c2241961Cp0.LJJII = C2242041Cp8.ADAPTER.decode(protoReader);
                                        break;
                                    case 102:
                                        c2241961Cp0.LJJIII = C2240921CnK.ADAPTER.decode(protoReader);
                                        break;
                                    case 103:
                                        c2241961Cp0.LJJIIJ = C2240841CnC.ADAPTER.decode(protoReader);
                                        break;
                                    default:
                                        switch (iNextTag) {
                                            case 200:
                                                c2241961Cp0.LJJIIJZLJL = C2244541CtA.ADAPTER.decode(protoReader);
                                                break;
                                            case 201:
                                                c2241961Cp0.LJJIIZ = C1CA6.ADAPTER.decode(protoReader);
                                                break;
                                            case 202:
                                                c2241961Cp0.LJJIIZI = C1CHU.ADAPTER.decode(protoReader);
                                                break;
                                            default:
                                                switch (iNextTag) {
                                                    case DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL /* 300 */:
                                                        c2241961Cp0.LJJIJ = C2242321Cpa.ADAPTER.decode(protoReader);
                                                        break;
                                                    case 301:
                                                        c2241961Cp0.LJJIJIIJI = C2242801CqM.ADAPTER.decode(protoReader);
                                                        break;
                                                    case 302:
                                                        c2241961Cp0.LJJIJIIJIL = C2242771CqJ.ADAPTER.decode(protoReader);
                                                        break;
                                                    default:
                                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                                        c2241961Cp0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        c2241961Cp0.LIZLLL = C2243041Cqk.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241961Cp0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241941Coy c2241941Coy) {
            C2241941Coy c2241941Coy2 = c2241941Coy;
            return C2243041Cqk.ADAPTER.encodedSizeWithTag(2, c2241941Coy2.image_card) + C2242181CpM.ADAPTER.encodedSizeWithTag(4, c2241941Coy2.picture_card) + C2242581Cq0.ADAPTER.encodedSizeWithTag(5, c2241941Coy2.video_card) + C2243301CrA.ADAPTER.encodedSizeWithTag(6, c2241941Coy2.info_card) + C2243581Crc.ADAPTER.encodedSizeWithTag(7, c2241941Coy2.sticker_card) + C2242401Cpi.ADAPTER.encodedSizeWithTag(8, c2241941Coy2.portrait_card) + C2243611Crf.ADAPTER.encodedSizeWithTag(9, c2241941Coy2.bot_answer_card) + C2242001Cp4.ADAPTER.encodedSizeWithTag(10, c2241941Coy2.interactive_notice_card) + C2241911Cov.ADAPTER.encodedSizeWithTag(11, c2241941Coy2.bubble_card) + C2242861CqS.ADAPTER.encodedSizeWithTag(12, c2241941Coy2.share_comment_card) + C2241391Co5.ADAPTER.encodedSizeWithTag(13, c2241941Coy2.ai_group_shot_card) + C2240871CnF.ADAPTER.encodedSizeWithTag(14, c2241941Coy2.audio_card) + C2243171Cqx.ADAPTER.encodedSizeWithTag(15, c2241941Coy2.interaction_card) + C2241091Cnb.ADAPTER.encodedSizeWithTag(16, c2241941Coy2.avatar_duo_card) + C2241641CoU.ADAPTER.encodedSizeWithTag(17, c2241941Coy2.game_card) + C2242471Cpp.ADAPTER.encodedSizeWithTag(18, c2241941Coy2.share_repost_card) + C2241771Coh.ADAPTER.encodedSizeWithTag(19, c2241941Coy2.visual_poet_user_card) + C2241271Cnt.ADAPTER.encodedSizeWithTag(20, c2241941Coy2.visual_poet_bot_card) + C2241171Cnj.ADAPTER.encodedSizeWithTag(21, c2241941Coy2.visual_poet_error_card) + C2240961CnO.ADAPTER.encodedSizeWithTag(22, c2241941Coy2.markdown_card) + C2241001CnS.ADAPTER.encodedSizeWithTag(23, c2241941Coy2.call_log_card) + C2241041CnW.ADAPTER.encodedSizeWithTag(24, c2241941Coy2.public_group_onboarding_card) + C2243261Cr6.ADAPTER.encodedSizeWithTag(100, c2241941Coy2.common_msg_card) + C2242041Cp8.ADAPTER.encodedSizeWithTag(101, c2241941Coy2.dynamic_card) + C2240921CnK.ADAPTER.encodedSizeWithTag(102, c2241941Coy2.business_native_card) + C2240841CnC.ADAPTER.encodedSizeWithTag(103, c2241941Coy2.streaming_card) + C2244541CtA.ADAPTER.encodedSizeWithTag(200, c2241941Coy2.streak_cmd) + C1CA6.ADAPTER.encodedSizeWithTag(201, c2241941Coy2.streak_pet_cmd) + C1CHU.ADAPTER.encodedSizeWithTag(202, c2241941Coy2.tns_data) + C2242321Cpa.ADAPTER.encodedSizeWithTag(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c2241941Coy2.header) + C2242801CqM.ADAPTER.encodedSizeWithTag(301, c2241941Coy2.footer) + C2242771CqJ.ADAPTER.encodedSizeWithTag(302, c2241941Coy2.attachment) + c2241941Coy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241941Coy redact(C2241941Coy c2241941Coy) {
            C2241961Cp0 c2241961Cp0NewBuilder = c2241941Coy.newBuilder();
            C2243041Cqk c2243041Cqk = c2241961Cp0NewBuilder.LIZLLL;
            if (c2243041Cqk != null) {
                c2241961Cp0NewBuilder.LIZLLL = C2243041Cqk.ADAPTER.redact(c2243041Cqk);
            }
            C2242181CpM c2242181CpM = c2241961Cp0NewBuilder.LJ;
            if (c2242181CpM != null) {
                c2241961Cp0NewBuilder.LJ = C2242181CpM.ADAPTER.redact(c2242181CpM);
            }
            C2242581Cq0 c2242581Cq0 = c2241961Cp0NewBuilder.LJFF;
            if (c2242581Cq0 != null) {
                c2241961Cp0NewBuilder.LJFF = C2242581Cq0.ADAPTER.redact(c2242581Cq0);
            }
            C2243301CrA c2243301CrA = c2241961Cp0NewBuilder.LJI;
            if (c2243301CrA != null) {
                c2241961Cp0NewBuilder.LJI = C2243301CrA.ADAPTER.redact(c2243301CrA);
            }
            C2243581Crc c2243581Crc = c2241961Cp0NewBuilder.LJII;
            if (c2243581Crc != null) {
                c2241961Cp0NewBuilder.LJII = C2243581Crc.ADAPTER.redact(c2243581Crc);
            }
            C2242401Cpi c2242401Cpi = c2241961Cp0NewBuilder.LJIIIIZZ;
            if (c2242401Cpi != null) {
                c2241961Cp0NewBuilder.LJIIIIZZ = C2242401Cpi.ADAPTER.redact(c2242401Cpi);
            }
            C2243611Crf c2243611Crf = c2241961Cp0NewBuilder.LJIIIZ;
            if (c2243611Crf != null) {
                c2241961Cp0NewBuilder.LJIIIZ = C2243611Crf.ADAPTER.redact(c2243611Crf);
            }
            C2242001Cp4 c2242001Cp4 = c2241961Cp0NewBuilder.LJIIJ;
            if (c2242001Cp4 != null) {
                c2241961Cp0NewBuilder.LJIIJ = C2242001Cp4.ADAPTER.redact(c2242001Cp4);
            }
            C2241911Cov c2241911Cov = c2241961Cp0NewBuilder.LJIIJJI;
            if (c2241911Cov != null) {
                c2241961Cp0NewBuilder.LJIIJJI = C2241911Cov.ADAPTER.redact(c2241911Cov);
            }
            C2242861CqS c2242861CqS = c2241961Cp0NewBuilder.LJIIL;
            if (c2242861CqS != null) {
                c2241961Cp0NewBuilder.LJIIL = C2242861CqS.ADAPTER.redact(c2242861CqS);
            }
            C2241391Co5 c2241391Co5 = c2241961Cp0NewBuilder.LJIILIIL;
            if (c2241391Co5 != null) {
                c2241961Cp0NewBuilder.LJIILIIL = C2241391Co5.ADAPTER.redact(c2241391Co5);
            }
            C2240871CnF c2240871CnF = c2241961Cp0NewBuilder.LJIILJJIL;
            if (c2240871CnF != null) {
                c2241961Cp0NewBuilder.LJIILJJIL = C2240871CnF.ADAPTER.redact(c2240871CnF);
            }
            C2243171Cqx c2243171Cqx = c2241961Cp0NewBuilder.LJIILL;
            if (c2243171Cqx != null) {
                c2241961Cp0NewBuilder.LJIILL = C2243171Cqx.ADAPTER.redact(c2243171Cqx);
            }
            C2241091Cnb c2241091Cnb = c2241961Cp0NewBuilder.LJIILLIIL;
            if (c2241091Cnb != null) {
                c2241961Cp0NewBuilder.LJIILLIIL = C2241091Cnb.ADAPTER.redact(c2241091Cnb);
            }
            C2241641CoU c2241641CoU = c2241961Cp0NewBuilder.LJIIZILJ;
            if (c2241641CoU != null) {
                c2241961Cp0NewBuilder.LJIIZILJ = C2241641CoU.ADAPTER.redact(c2241641CoU);
            }
            C2242471Cpp c2242471Cpp = c2241961Cp0NewBuilder.LJIJ;
            if (c2242471Cpp != null) {
                c2241961Cp0NewBuilder.LJIJ = C2242471Cpp.ADAPTER.redact(c2242471Cpp);
            }
            C2241771Coh c2241771Coh = c2241961Cp0NewBuilder.LJIJI;
            if (c2241771Coh != null) {
                c2241961Cp0NewBuilder.LJIJI = C2241771Coh.ADAPTER.redact(c2241771Coh);
            }
            C2241271Cnt c2241271Cnt = c2241961Cp0NewBuilder.LJIJJ;
            if (c2241271Cnt != null) {
                c2241961Cp0NewBuilder.LJIJJ = C2241271Cnt.ADAPTER.redact(c2241271Cnt);
            }
            C2241171Cnj c2241171Cnj = c2241961Cp0NewBuilder.LJIJJLI;
            if (c2241171Cnj != null) {
                c2241961Cp0NewBuilder.LJIJJLI = C2241171Cnj.ADAPTER.redact(c2241171Cnj);
            }
            C2240961CnO c2240961CnO = c2241961Cp0NewBuilder.LJIL;
            if (c2240961CnO != null) {
                c2241961Cp0NewBuilder.LJIL = C2240961CnO.ADAPTER.redact(c2240961CnO);
            }
            C2241001CnS c2241001CnS = c2241961Cp0NewBuilder.LJJ;
            if (c2241001CnS != null) {
                c2241961Cp0NewBuilder.LJJ = C2241001CnS.ADAPTER.redact(c2241001CnS);
            }
            C2241041CnW c2241041CnW = c2241961Cp0NewBuilder.LJJI;
            if (c2241041CnW != null) {
                c2241961Cp0NewBuilder.LJJI = C2241041CnW.ADAPTER.redact(c2241041CnW);
            }
            C2243261Cr6 c2243261Cr6 = c2241961Cp0NewBuilder.LJJIFFI;
            if (c2243261Cr6 != null) {
                c2241961Cp0NewBuilder.LJJIFFI = C2243261Cr6.ADAPTER.redact(c2243261Cr6);
            }
            C2242041Cp8 c2242041Cp8 = c2241961Cp0NewBuilder.LJJII;
            if (c2242041Cp8 != null) {
                c2241961Cp0NewBuilder.LJJII = C2242041Cp8.ADAPTER.redact(c2242041Cp8);
            }
            C2240921CnK c2240921CnK = c2241961Cp0NewBuilder.LJJIII;
            if (c2240921CnK != null) {
                c2241961Cp0NewBuilder.LJJIII = C2240921CnK.ADAPTER.redact(c2240921CnK);
            }
            C2240841CnC c2240841CnC = c2241961Cp0NewBuilder.LJJIIJ;
            if (c2240841CnC != null) {
                c2241961Cp0NewBuilder.LJJIIJ = C2240841CnC.ADAPTER.redact(c2240841CnC);
            }
            C2244541CtA c2244541CtA = c2241961Cp0NewBuilder.LJJIIJZLJL;
            if (c2244541CtA != null) {
                c2241961Cp0NewBuilder.LJJIIJZLJL = C2244541CtA.ADAPTER.redact(c2244541CtA);
            }
            C1CA6 c1ca6 = c2241961Cp0NewBuilder.LJJIIZ;
            if (c1ca6 != null) {
                c2241961Cp0NewBuilder.LJJIIZ = C1CA6.ADAPTER.redact(c1ca6);
            }
            C1CHU c1chu = c2241961Cp0NewBuilder.LJJIIZI;
            if (c1chu != null) {
                c2241961Cp0NewBuilder.LJJIIZI = C1CHU.ADAPTER.redact(c1chu);
            }
            C2242321Cpa c2242321Cpa = c2241961Cp0NewBuilder.LJJIJ;
            if (c2242321Cpa != null) {
                c2241961Cp0NewBuilder.LJJIJ = C2242321Cpa.ADAPTER.redact(c2242321Cpa);
            }
            C2242801CqM c2242801CqM = c2241961Cp0NewBuilder.LJJIJIIJI;
            if (c2242801CqM != null) {
                c2241961Cp0NewBuilder.LJJIJIIJI = C2242801CqM.ADAPTER.redact(c2242801CqM);
            }
            C2242771CqJ c2242771CqJ = c2241961Cp0NewBuilder.LJJIJIIJIL;
            if (c2242771CqJ != null) {
                c2241961Cp0NewBuilder.LJJIJIIJIL = C2242771CqJ.ADAPTER.redact(c2242771CqJ);
            }
            c2241961Cp0NewBuilder.clearUnknownFields();
            return c2241961Cp0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241941Coy c2241941Coy) {
            C2241941Coy c2241941Coy2 = c2241941Coy;
            C2243041Cqk.ADAPTER.encodeWithTag(protoWriter, 2, c2241941Coy2.image_card);
            C2242181CpM.ADAPTER.encodeWithTag(protoWriter, 4, c2241941Coy2.picture_card);
            C2242581Cq0.ADAPTER.encodeWithTag(protoWriter, 5, c2241941Coy2.video_card);
            C2243301CrA.ADAPTER.encodeWithTag(protoWriter, 6, c2241941Coy2.info_card);
            C2243581Crc.ADAPTER.encodeWithTag(protoWriter, 7, c2241941Coy2.sticker_card);
            C2242401Cpi.ADAPTER.encodeWithTag(protoWriter, 8, c2241941Coy2.portrait_card);
            C2243611Crf.ADAPTER.encodeWithTag(protoWriter, 9, c2241941Coy2.bot_answer_card);
            C2242001Cp4.ADAPTER.encodeWithTag(protoWriter, 10, c2241941Coy2.interactive_notice_card);
            C2241911Cov.ADAPTER.encodeWithTag(protoWriter, 11, c2241941Coy2.bubble_card);
            C2242861CqS.ADAPTER.encodeWithTag(protoWriter, 12, c2241941Coy2.share_comment_card);
            C2241391Co5.ADAPTER.encodeWithTag(protoWriter, 13, c2241941Coy2.ai_group_shot_card);
            C2240871CnF.ADAPTER.encodeWithTag(protoWriter, 14, c2241941Coy2.audio_card);
            C2243171Cqx.ADAPTER.encodeWithTag(protoWriter, 15, c2241941Coy2.interaction_card);
            C2241091Cnb.ADAPTER.encodeWithTag(protoWriter, 16, c2241941Coy2.avatar_duo_card);
            C2241641CoU.ADAPTER.encodeWithTag(protoWriter, 17, c2241941Coy2.game_card);
            C2242471Cpp.ADAPTER.encodeWithTag(protoWriter, 18, c2241941Coy2.share_repost_card);
            C2241771Coh.ADAPTER.encodeWithTag(protoWriter, 19, c2241941Coy2.visual_poet_user_card);
            C2241271Cnt.ADAPTER.encodeWithTag(protoWriter, 20, c2241941Coy2.visual_poet_bot_card);
            C2241171Cnj.ADAPTER.encodeWithTag(protoWriter, 21, c2241941Coy2.visual_poet_error_card);
            C2240961CnO.ADAPTER.encodeWithTag(protoWriter, 22, c2241941Coy2.markdown_card);
            C2241001CnS.ADAPTER.encodeWithTag(protoWriter, 23, c2241941Coy2.call_log_card);
            C2241041CnW.ADAPTER.encodeWithTag(protoWriter, 24, c2241941Coy2.public_group_onboarding_card);
            C2243261Cr6.ADAPTER.encodeWithTag(protoWriter, 100, c2241941Coy2.common_msg_card);
            C2242041Cp8.ADAPTER.encodeWithTag(protoWriter, 101, c2241941Coy2.dynamic_card);
            C2240921CnK.ADAPTER.encodeWithTag(protoWriter, 102, c2241941Coy2.business_native_card);
            C2240841CnC.ADAPTER.encodeWithTag(protoWriter, 103, c2241941Coy2.streaming_card);
            C2244541CtA.ADAPTER.encodeWithTag(protoWriter, 200, c2241941Coy2.streak_cmd);
            C1CA6.ADAPTER.encodeWithTag(protoWriter, 201, c2241941Coy2.streak_pet_cmd);
            C1CHU.ADAPTER.encodeWithTag(protoWriter, 202, c2241941Coy2.tns_data);
            C2242321Cpa.ADAPTER.encodeWithTag(protoWriter, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, c2241941Coy2.header);
            C2242801CqM.ADAPTER.encodeWithTag(protoWriter, 301, c2241941Coy2.footer);
            C2242771CqJ.ADAPTER.encodeWithTag(protoWriter, 302, c2241941Coy2.attachment);
            protoWriter.writeBytes(c2241941Coy2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AIGroupShotCard#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    public final C2241391Co5 ai_group_shot_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Attachment#ADAPTER", tag = 302)
    public final C2242771CqJ attachment;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AudioCard#ADAPTER", tag = 14)
    public final C2240871CnF audio_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AvatarDuoInvitationCard#ADAPTER", tag = 16)
    public final C2241091Cnb avatar_duo_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BotAnswerCard#ADAPTER", tag = BdTuring.TYPE_ECAF)
    public final C2243611Crf bot_answer_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BubbleCard#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final C2241911Cov bubble_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BusinessNativeCard#ADAPTER", tag = 102)
    public final C2240921CnK business_native_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.CallLogCard#ADAPTER", tag = 23)
    public final C2241001CnS call_log_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.CommonMsgCard#ADAPTER", tag = 100)
    public final C2243261Cr6 common_msg_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.DynamicCard#ADAPTER", tag = 101)
    public final C2242041Cp8 dynamic_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseFooter#ADAPTER", tag = 301)
    public final C2242801CqM footer;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GameCard#ADAPTER", tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final C2241641CoU game_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseHeader#ADAPTER", tag = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL)
    public final C2242321Cpa header;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ImageCard#ADAPTER", tag = 2)
    public final C2243041Cqk image_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InfoCard#ADAPTER", tag = 6)
    public final C2243301CrA info_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InteractionCard#ADAPTER", tag = 15)
    public final C2243171Cqx interaction_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.InteractiveNoticeCard#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C2242001Cp4 interactive_notice_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.MarkdownCard#ADAPTER", tag = 22)
    public final C2240961CnO markdown_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PictureCard#ADAPTER", tag = 4)
    public final C2242181CpM picture_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PortraitCard#ADAPTER", tag = 8)
    public final C2242401Cpi portrait_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PublicGroupOnboardingCard#ADAPTER", tag = LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT)
    public final C2241041CnW public_group_onboarding_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ShareCommentCard#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C2242861CqS share_comment_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.ShareRepostCard#ADAPTER", tag = LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT)
    public final C2242471Cpp share_repost_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StickerCard#ADAPTER", tag = 7)
    public final C2243581Crc sticker_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakCommandMessage#ADAPTER", tag = 200)
    public final C2244541CtA streak_cmd;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreakPetCommandMessage#ADAPTER", tag = 201)
    public final C1CA6 streak_pet_cmd;

    @WireField(adapter = "com.bytedance.im.message.template.proto.StreamingCard#ADAPTER", tag = 103)
    public final C2240841CnC streaming_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TnSData#ADAPTER", tag = 202)
    public final C1CHU tns_data;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VideoCard#ADAPTER", tag = 5)
    public final C2242581Cq0 video_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetBotCard#ADAPTER", tag = LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT)
    public final C2241271Cnt visual_poet_bot_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetErrorCard#ADAPTER", tag = 21)
    public final C2241171Cnj visual_poet_error_card;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VisualPoetUserCard#ADAPTER", tag = 19)
    public final C2241771Coh visual_poet_user_card;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2243041Cqk c2243041Cqk = this.image_card;
        int iHashCode2 = (iHashCode + (c2243041Cqk != null ? c2243041Cqk.hashCode() : 0)) * 37;
        C2242181CpM c2242181CpM = this.picture_card;
        int iHashCode3 = (iHashCode2 + (c2242181CpM != null ? c2242181CpM.hashCode() : 0)) * 37;
        C2242581Cq0 c2242581Cq0 = this.video_card;
        int iHashCode4 = (iHashCode3 + (c2242581Cq0 != null ? c2242581Cq0.hashCode() : 0)) * 37;
        C2243301CrA c2243301CrA = this.info_card;
        int iHashCode5 = (iHashCode4 + (c2243301CrA != null ? c2243301CrA.hashCode() : 0)) * 37;
        C2243581Crc c2243581Crc = this.sticker_card;
        int iHashCode6 = (iHashCode5 + (c2243581Crc != null ? c2243581Crc.hashCode() : 0)) * 37;
        C2242401Cpi c2242401Cpi = this.portrait_card;
        int iHashCode7 = (iHashCode6 + (c2242401Cpi != null ? c2242401Cpi.hashCode() : 0)) * 37;
        C2243611Crf c2243611Crf = this.bot_answer_card;
        int iHashCode8 = (iHashCode7 + (c2243611Crf != null ? c2243611Crf.hashCode() : 0)) * 37;
        C2242001Cp4 c2242001Cp4 = this.interactive_notice_card;
        int iHashCode9 = (iHashCode8 + (c2242001Cp4 != null ? c2242001Cp4.hashCode() : 0)) * 37;
        C2241911Cov c2241911Cov = this.bubble_card;
        int iHashCode10 = (iHashCode9 + (c2241911Cov != null ? c2241911Cov.hashCode() : 0)) * 37;
        C2242861CqS c2242861CqS = this.share_comment_card;
        int iHashCode11 = (iHashCode10 + (c2242861CqS != null ? c2242861CqS.hashCode() : 0)) * 37;
        C2241391Co5 c2241391Co5 = this.ai_group_shot_card;
        int iHashCode12 = (iHashCode11 + (c2241391Co5 != null ? c2241391Co5.hashCode() : 0)) * 37;
        C2240871CnF c2240871CnF = this.audio_card;
        int iHashCode13 = (iHashCode12 + (c2240871CnF != null ? c2240871CnF.hashCode() : 0)) * 37;
        C2243171Cqx c2243171Cqx = this.interaction_card;
        int iHashCode14 = (iHashCode13 + (c2243171Cqx != null ? c2243171Cqx.hashCode() : 0)) * 37;
        C2241091Cnb c2241091Cnb = this.avatar_duo_card;
        int iHashCode15 = (iHashCode14 + (c2241091Cnb != null ? c2241091Cnb.hashCode() : 0)) * 37;
        C2241641CoU c2241641CoU = this.game_card;
        int iHashCode16 = (iHashCode15 + (c2241641CoU != null ? c2241641CoU.hashCode() : 0)) * 37;
        C2242471Cpp c2242471Cpp = this.share_repost_card;
        int iHashCode17 = (iHashCode16 + (c2242471Cpp != null ? c2242471Cpp.hashCode() : 0)) * 37;
        C2241771Coh c2241771Coh = this.visual_poet_user_card;
        int iHashCode18 = (iHashCode17 + (c2241771Coh != null ? c2241771Coh.hashCode() : 0)) * 37;
        C2241271Cnt c2241271Cnt = this.visual_poet_bot_card;
        int iHashCode19 = (iHashCode18 + (c2241271Cnt != null ? c2241271Cnt.hashCode() : 0)) * 37;
        C2241171Cnj c2241171Cnj = this.visual_poet_error_card;
        int iHashCode20 = (iHashCode19 + (c2241171Cnj != null ? c2241171Cnj.hashCode() : 0)) * 37;
        C2240961CnO c2240961CnO = this.markdown_card;
        int iHashCode21 = (iHashCode20 + (c2240961CnO != null ? c2240961CnO.hashCode() : 0)) * 37;
        C2241001CnS c2241001CnS = this.call_log_card;
        int iHashCode22 = (iHashCode21 + (c2241001CnS != null ? c2241001CnS.hashCode() : 0)) * 37;
        C2241041CnW c2241041CnW = this.public_group_onboarding_card;
        int iHashCode23 = (iHashCode22 + (c2241041CnW != null ? c2241041CnW.hashCode() : 0)) * 37;
        C2243261Cr6 c2243261Cr6 = this.common_msg_card;
        int iHashCode24 = (iHashCode23 + (c2243261Cr6 != null ? c2243261Cr6.hashCode() : 0)) * 37;
        C2242041Cp8 c2242041Cp8 = this.dynamic_card;
        int iHashCode25 = (iHashCode24 + (c2242041Cp8 != null ? c2242041Cp8.hashCode() : 0)) * 37;
        C2240921CnK c2240921CnK = this.business_native_card;
        int iHashCode26 = (iHashCode25 + (c2240921CnK != null ? c2240921CnK.hashCode() : 0)) * 37;
        C2240841CnC c2240841CnC = this.streaming_card;
        int iHashCode27 = (iHashCode26 + (c2240841CnC != null ? c2240841CnC.hashCode() : 0)) * 37;
        C2244541CtA c2244541CtA = this.streak_cmd;
        int iHashCode28 = (iHashCode27 + (c2244541CtA != null ? c2244541CtA.hashCode() : 0)) * 37;
        C1CA6 c1ca6 = this.streak_pet_cmd;
        int iHashCode29 = (iHashCode28 + (c1ca6 != null ? c1ca6.hashCode() : 0)) * 37;
        C1CHU c1chu = this.tns_data;
        int iHashCode30 = (iHashCode29 + (c1chu != null ? c1chu.hashCode() : 0)) * 37;
        C2242321Cpa c2242321Cpa = this.header;
        int iHashCode31 = (iHashCode30 + (c2242321Cpa != null ? c2242321Cpa.hashCode() : 0)) * 37;
        C2242801CqM c2242801CqM = this.footer;
        int iHashCode32 = (iHashCode31 + (c2242801CqM != null ? c2242801CqM.hashCode() : 0)) * 37;
        C2242771CqJ c2242771CqJ = this.attachment;
        int iHashCode33 = iHashCode32 + (c2242771CqJ != null ? c2242771CqJ.hashCode() : 0);
        this.hashCode = iHashCode33;
        return iHashCode33;
    }

    @Override // com.squareup.wire.Message
    public C2241961Cp0 newBuilder() {
        C2241961Cp0 c2241961Cp0 = new C2241961Cp0();
        c2241961Cp0.LIZLLL = this.image_card;
        c2241961Cp0.LJ = this.picture_card;
        c2241961Cp0.LJFF = this.video_card;
        c2241961Cp0.LJI = this.info_card;
        c2241961Cp0.LJII = this.sticker_card;
        c2241961Cp0.LJIIIIZZ = this.portrait_card;
        c2241961Cp0.LJIIIZ = this.bot_answer_card;
        c2241961Cp0.LJIIJ = this.interactive_notice_card;
        c2241961Cp0.LJIIJJI = this.bubble_card;
        c2241961Cp0.LJIIL = this.share_comment_card;
        c2241961Cp0.LJIILIIL = this.ai_group_shot_card;
        c2241961Cp0.LJIILJJIL = this.audio_card;
        c2241961Cp0.LJIILL = this.interaction_card;
        c2241961Cp0.LJIILLIIL = this.avatar_duo_card;
        c2241961Cp0.LJIIZILJ = this.game_card;
        c2241961Cp0.LJIJ = this.share_repost_card;
        c2241961Cp0.LJIJI = this.visual_poet_user_card;
        c2241961Cp0.LJIJJ = this.visual_poet_bot_card;
        c2241961Cp0.LJIJJLI = this.visual_poet_error_card;
        c2241961Cp0.LJIL = this.markdown_card;
        c2241961Cp0.LJJ = this.call_log_card;
        c2241961Cp0.LJJI = this.public_group_onboarding_card;
        c2241961Cp0.LJJIFFI = this.common_msg_card;
        c2241961Cp0.LJJII = this.dynamic_card;
        c2241961Cp0.LJJIII = this.business_native_card;
        c2241961Cp0.LJJIIJ = this.streaming_card;
        c2241961Cp0.LJJIIJZLJL = this.streak_cmd;
        c2241961Cp0.LJJIIZ = this.streak_pet_cmd;
        c2241961Cp0.LJJIIZI = this.tns_data;
        c2241961Cp0.LJJIJ = this.header;
        c2241961Cp0.LJJIJIIJI = this.footer;
        c2241961Cp0.LJJIJIIJIL = this.attachment;
        c2241961Cp0.addUnknownFields(unknownFields());
        return c2241961Cp0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image_card != null) {
            sb.append(", image_card=");
            sb.append(this.image_card);
        }
        if (this.picture_card != null) {
            sb.append(", picture_card=");
            sb.append(this.picture_card);
        }
        if (this.video_card != null) {
            sb.append(", video_card=");
            sb.append(this.video_card);
        }
        if (this.info_card != null) {
            sb.append(", info_card=");
            sb.append(this.info_card);
        }
        if (this.sticker_card != null) {
            sb.append(", sticker_card=");
            sb.append(this.sticker_card);
        }
        if (this.portrait_card != null) {
            sb.append(", portrait_card=");
            sb.append(this.portrait_card);
        }
        if (this.bot_answer_card != null) {
            sb.append(", bot_answer_card=");
            sb.append(this.bot_answer_card);
        }
        if (this.interactive_notice_card != null) {
            sb.append(", interactive_notice_card=");
            sb.append(this.interactive_notice_card);
        }
        if (this.bubble_card != null) {
            sb.append(", bubble_card=");
            sb.append(this.bubble_card);
        }
        if (this.share_comment_card != null) {
            sb.append(", share_comment_card=");
            sb.append(this.share_comment_card);
        }
        if (this.ai_group_shot_card != null) {
            sb.append(", ai_group_shot_card=");
            sb.append(this.ai_group_shot_card);
        }
        if (this.audio_card != null) {
            sb.append(", audio_card=");
            sb.append(this.audio_card);
        }
        if (this.interaction_card != null) {
            sb.append(", interaction_card=");
            sb.append(this.interaction_card);
        }
        if (this.avatar_duo_card != null) {
            sb.append(", avatar_duo_card=");
            sb.append(this.avatar_duo_card);
        }
        if (this.game_card != null) {
            sb.append(", game_card=");
            sb.append(this.game_card);
        }
        if (this.share_repost_card != null) {
            sb.append(", share_repost_card=");
            sb.append(this.share_repost_card);
        }
        if (this.visual_poet_user_card != null) {
            sb.append(", visual_poet_user_card=");
            sb.append(this.visual_poet_user_card);
        }
        if (this.visual_poet_bot_card != null) {
            sb.append(", visual_poet_bot_card=");
            sb.append(this.visual_poet_bot_card);
        }
        if (this.visual_poet_error_card != null) {
            sb.append(", visual_poet_error_card=");
            sb.append(this.visual_poet_error_card);
        }
        if (this.markdown_card != null) {
            sb.append(", markdown_card=");
            sb.append(this.markdown_card);
        }
        if (this.call_log_card != null) {
            sb.append(", call_log_card=");
            sb.append(this.call_log_card);
        }
        if (this.public_group_onboarding_card != null) {
            sb.append(", public_group_onboarding_card=");
            sb.append(this.public_group_onboarding_card);
        }
        if (this.common_msg_card != null) {
            sb.append(", common_msg_card=");
            sb.append(this.common_msg_card);
        }
        if (this.dynamic_card != null) {
            sb.append(", dynamic_card=");
            sb.append(this.dynamic_card);
        }
        if (this.business_native_card != null) {
            sb.append(", business_native_card=");
            sb.append(this.business_native_card);
        }
        if (this.streaming_card != null) {
            sb.append(", streaming_card=");
            sb.append(this.streaming_card);
        }
        if (this.streak_cmd != null) {
            sb.append(", streak_cmd=");
            sb.append(this.streak_cmd);
        }
        if (this.streak_pet_cmd != null) {
            sb.append(", streak_pet_cmd=");
            sb.append(this.streak_pet_cmd);
        }
        if (this.tns_data != null) {
            sb.append(", tns_data=");
            sb.append(this.tns_data);
        }
        if (this.header != null) {
            sb.append(", header=");
            sb.append(this.header);
        }
        if (this.footer != null) {
            sb.append(", footer=");
            sb.append(this.footer);
        }
        if (this.attachment != null) {
            sb.append(", attachment=");
            sb.append(this.attachment);
        }
        sb.replace(0, 2, "MessageContent{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241941Coy)) {
            return false;
        }
        C2241941Coy c2241941Coy = (C2241941Coy) obj;
        if (unknownFields().equals(c2241941Coy.unknownFields()) && C1516540pZE.LJ(this.image_card, c2241941Coy.image_card) && C1516540pZE.LJ(this.picture_card, c2241941Coy.picture_card) && C1516540pZE.LJ(this.video_card, c2241941Coy.video_card) && C1516540pZE.LJ(this.info_card, c2241941Coy.info_card) && C1516540pZE.LJ(this.sticker_card, c2241941Coy.sticker_card) && C1516540pZE.LJ(this.portrait_card, c2241941Coy.portrait_card) && C1516540pZE.LJ(this.bot_answer_card, c2241941Coy.bot_answer_card) && C1516540pZE.LJ(this.interactive_notice_card, c2241941Coy.interactive_notice_card) && C1516540pZE.LJ(this.bubble_card, c2241941Coy.bubble_card) && C1516540pZE.LJ(this.share_comment_card, c2241941Coy.share_comment_card) && C1516540pZE.LJ(this.ai_group_shot_card, c2241941Coy.ai_group_shot_card) && C1516540pZE.LJ(this.audio_card, c2241941Coy.audio_card) && C1516540pZE.LJ(this.interaction_card, c2241941Coy.interaction_card) && C1516540pZE.LJ(this.avatar_duo_card, c2241941Coy.avatar_duo_card) && C1516540pZE.LJ(this.game_card, c2241941Coy.game_card) && C1516540pZE.LJ(this.share_repost_card, c2241941Coy.share_repost_card) && C1516540pZE.LJ(this.visual_poet_user_card, c2241941Coy.visual_poet_user_card) && C1516540pZE.LJ(this.visual_poet_bot_card, c2241941Coy.visual_poet_bot_card) && C1516540pZE.LJ(this.visual_poet_error_card, c2241941Coy.visual_poet_error_card) && C1516540pZE.LJ(this.markdown_card, c2241941Coy.markdown_card) && C1516540pZE.LJ(this.call_log_card, c2241941Coy.call_log_card) && C1516540pZE.LJ(this.public_group_onboarding_card, c2241941Coy.public_group_onboarding_card) && C1516540pZE.LJ(this.common_msg_card, c2241941Coy.common_msg_card) && C1516540pZE.LJ(this.dynamic_card, c2241941Coy.dynamic_card) && C1516540pZE.LJ(this.business_native_card, c2241941Coy.business_native_card) && C1516540pZE.LJ(this.streaming_card, c2241941Coy.streaming_card) && C1516540pZE.LJ(this.streak_cmd, c2241941Coy.streak_cmd) && C1516540pZE.LJ(this.streak_pet_cmd, c2241941Coy.streak_pet_cmd) && C1516540pZE.LJ(this.tns_data, c2241941Coy.tns_data) && C1516540pZE.LJ(this.header, c2241941Coy.header) && C1516540pZE.LJ(this.footer, c2241941Coy.footer) && C1516540pZE.LJ(this.attachment, c2241941Coy.attachment)) {
            return true;
        }
        return false;
    }

    public C2241941Coy(C2243041Cqk c2243041Cqk, C2242181CpM c2242181CpM, C2242581Cq0 c2242581Cq0, C2243301CrA c2243301CrA, C2243581Crc c2243581Crc, C2242401Cpi c2242401Cpi, C2243611Crf c2243611Crf, C2242001Cp4 c2242001Cp4, C2241911Cov c2241911Cov, C2242861CqS c2242861CqS, C2241391Co5 c2241391Co5, C2240871CnF c2240871CnF, C2243171Cqx c2243171Cqx, C2241091Cnb c2241091Cnb, C2241641CoU c2241641CoU, C2242471Cpp c2242471Cpp, C2241771Coh c2241771Coh, C2241271Cnt c2241271Cnt, C2241171Cnj c2241171Cnj, C2240961CnO c2240961CnO, C2241001CnS c2241001CnS, C2241041CnW c2241041CnW, C2243261Cr6 c2243261Cr6, C2242041Cp8 c2242041Cp8, C2240921CnK c2240921CnK, C2240841CnC c2240841CnC, C2244541CtA c2244541CtA, C1CA6 c1ca6, C1CHU c1chu, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ) {
        this(c2243041Cqk, c2242181CpM, c2242581Cq0, c2243301CrA, c2243581Crc, c2242401Cpi, c2243611Crf, c2242001Cp4, c2241911Cov, c2242861CqS, c2241391Co5, c2240871CnF, c2243171Cqx, c2241091Cnb, c2241641CoU, c2242471Cpp, c2241771Coh, c2241271Cnt, c2241171Cnj, c2240961CnO, c2241001CnS, c2241041CnW, c2243261Cr6, c2242041Cp8, c2240921CnK, c2240841CnC, c2244541CtA, c1ca6, c1chu, c2242321Cpa, c2242801CqM, c2242771CqJ, ByteString.EMPTY);
    }

    public C2241941Coy(C2243041Cqk c2243041Cqk, C2242181CpM c2242181CpM, C2242581Cq0 c2242581Cq0, C2243301CrA c2243301CrA, C2243581Crc c2243581Crc, C2242401Cpi c2242401Cpi, C2243611Crf c2243611Crf, C2242001Cp4 c2242001Cp4, C2241911Cov c2241911Cov, C2242861CqS c2242861CqS, C2241391Co5 c2241391Co5, C2240871CnF c2240871CnF, C2243171Cqx c2243171Cqx, C2241091Cnb c2241091Cnb, C2241641CoU c2241641CoU, C2242471Cpp c2242471Cpp, C2241771Coh c2241771Coh, C2241271Cnt c2241271Cnt, C2241171Cnj c2241171Cnj, C2240961CnO c2240961CnO, C2241001CnS c2241001CnS, C2241041CnW c2241041CnW, C2243261Cr6 c2243261Cr6, C2242041Cp8 c2242041Cp8, C2240921CnK c2240921CnK, C2240841CnC c2240841CnC, C2244541CtA c2244541CtA, C1CA6 c1ca6, C1CHU c1chu, C2242321Cpa c2242321Cpa, C2242801CqM c2242801CqM, C2242771CqJ c2242771CqJ, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_card = c2243041Cqk;
        this.picture_card = c2242181CpM;
        this.video_card = c2242581Cq0;
        this.info_card = c2243301CrA;
        this.sticker_card = c2243581Crc;
        this.portrait_card = c2242401Cpi;
        this.bot_answer_card = c2243611Crf;
        this.interactive_notice_card = c2242001Cp4;
        this.bubble_card = c2241911Cov;
        this.share_comment_card = c2242861CqS;
        this.ai_group_shot_card = c2241391Co5;
        this.audio_card = c2240871CnF;
        this.interaction_card = c2243171Cqx;
        this.avatar_duo_card = c2241091Cnb;
        this.game_card = c2241641CoU;
        this.share_repost_card = c2242471Cpp;
        this.visual_poet_user_card = c2241771Coh;
        this.visual_poet_bot_card = c2241271Cnt;
        this.visual_poet_error_card = c2241171Cnj;
        this.markdown_card = c2240961CnO;
        this.call_log_card = c2241001CnS;
        this.public_group_onboarding_card = c2241041CnW;
        this.common_msg_card = c2243261Cr6;
        this.dynamic_card = c2242041Cp8;
        this.business_native_card = c2240921CnK;
        this.streaming_card = c2240841CnC;
        this.streak_cmd = c2244541CtA;
        this.streak_pet_cmd = c1ca6;
        this.tns_data = c1chu;
        this.header = c2242321Cpa;
        this.footer = c2242801CqM;
        this.attachment = c2242771CqJ;
    }
}
