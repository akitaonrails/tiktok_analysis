package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241931Cox {
    public static final BaseTemplate LIZ(ByteString byteString, int i) {
        try {
            C2241941Coy c2241941CoyDecode = C2241941Coy.ADAPTER.decode(byteString);
            C2242321Cpa c2242321Cpa = c2241941CoyDecode.header;
            C2242801CqM c2242801CqM = c2241941CoyDecode.footer;
            C2242771CqJ c2242771CqJ = c2241941CoyDecode.attachment;
            if (i != 3001) {
                switch (i) {
                    case 1801:
                        break;
                    case 1802:
                        C2242181CpM c2242181CpM = c2241941CoyDecode.picture_card;
                        if (c2242181CpM == null) {
                            return null;
                        }
                        return C2242161CpK.LIZIZ(c2242181CpM, c2242321Cpa, c2242801CqM, c2242771CqJ);
                    case 1803:
                        C2242581Cq0 c2242581Cq0 = c2241941CoyDecode.video_card;
                        if (c2242581Cq0 == null) {
                            return null;
                        }
                        return C2242611Cq3.LIZ(c2242581Cq0, c2242321Cpa, c2242801CqM, c2242771CqJ);
                    case 1804:
                        C2243301CrA c2243301CrA = c2241941CoyDecode.info_card;
                        if (c2243301CrA == null) {
                            return null;
                        }
                        return C2243311CrB.LIZ(c2243301CrA, c2242321Cpa, c2242801CqM, c2242771CqJ);
                    case 1805:
                        C2243581Crc c2243581Crc = c2241941CoyDecode.sticker_card;
                        if (c2243581Crc == null) {
                            return null;
                        }
                        return C2243571Crb.LJIIIIZZ(c2243581Crc, c2242321Cpa, c2242801CqM, c2242771CqJ);
                    case 1806:
                        C2242401Cpi c2242401Cpi = c2241941CoyDecode.portrait_card;
                        if (c2242401Cpi == null) {
                            return null;
                        }
                        return C2242421Cpk.LIZ(c2242401Cpi, c2242321Cpa, c2242801CqM, c2242771CqJ);
                    default:
                        switch (i) {
                            case 1808:
                                C2242001Cp4 c2242001Cp4 = c2241941CoyDecode.interactive_notice_card;
                                if (c2242001Cp4 == null) {
                                    return null;
                                }
                                return C2241981Cp2.LIZ(c2242001Cp4, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1809:
                                C2242581Cq0 c2242581Cq02 = c2241941CoyDecode.video_card;
                                if (c2242581Cq02 == null) {
                                    return null;
                                }
                                return C2242571Cpz.LIZIZ(c2242581Cq02, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1810:
                                C2241911Cov c2241911Cov = c2241941CoyDecode.bubble_card;
                                if (c2241911Cov == null) {
                                    return null;
                                }
                                return C2241921Cow.LIZ(c2241911Cov, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1811:
                                C2242861CqS c2242861CqS = c2241941CoyDecode.share_comment_card;
                                if (c2242861CqS == null) {
                                    return null;
                                }
                                return C2242881CqU.LIZ(c2242861CqS, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1812:
                                C2241391Co5 c2241391Co5 = c2241941CoyDecode.ai_group_shot_card;
                                if (c2241391Co5 == null) {
                                    return null;
                                }
                                return C2241401Co6.LIZ(c2241391Co5, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1813:
                                C2240871CnF c2240871CnF = c2241941CoyDecode.audio_card;
                                if (c2240871CnF == null) {
                                    return null;
                                }
                                return C2240861CnE.LIZ(c2240871CnF, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1814:
                                C2243171Cqx c2243171Cqx = c2241941CoyDecode.interaction_card;
                                if (c2243171Cqx == null) {
                                    return null;
                                }
                                return C2243161Cqw.LIZ(c2243171Cqx, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1815:
                                C2241091Cnb c2241091Cnb = c2241941CoyDecode.avatar_duo_card;
                                if (c2241091Cnb == null) {
                                    return null;
                                }
                                return C2241101Cnc.LIZ(c2241091Cnb, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1816:
                                C2241641CoU c2241641CoU = c2241941CoyDecode.game_card;
                                if (c2241641CoU == null) {
                                    return null;
                                }
                                return C2241661CoW.LIZ(c2241641CoU, c2242321Cpa, c2242801CqM);
                            case 1817:
                                C2242471Cpp c2242471Cpp = c2241941CoyDecode.share_repost_card;
                                if (c2242471Cpp == null) {
                                    return null;
                                }
                                return C2242431Cpl.LIZ(c2242471Cpp, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1818:
                                C2242581Cq0 c2242581Cq03 = c2241941CoyDecode.video_card;
                                if (c2242581Cq03 == null) {
                                    return null;
                                }
                                return C2242601Cq2.LIZ(c2242581Cq03, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1819:
                                C2241771Coh c2241771Coh = c2241941CoyDecode.visual_poet_user_card;
                                if (c2241771Coh == null) {
                                    return null;
                                }
                                return C2241781Coi.LIZ(c2241771Coh, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1820:
                                C2241271Cnt c2241271Cnt = c2241941CoyDecode.visual_poet_bot_card;
                                if (c2241271Cnt == null) {
                                    return null;
                                }
                                return C2241281Cnu.LIZ(c2241271Cnt, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1821:
                                C2241171Cnj c2241171Cnj = c2241941CoyDecode.visual_poet_error_card;
                                if (c2241171Cnj == null) {
                                    return null;
                                }
                                return C2241161Cni.LIZ(c2241171Cnj, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1822:
                                C2240961CnO c2240961CnO = c2241941CoyDecode.markdown_card;
                                if (c2240961CnO == null) {
                                    return null;
                                }
                                return C2240981CnQ.LIZ(c2240961CnO, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1823:
                                C2241001CnS c2241001CnS = c2241941CoyDecode.call_log_card;
                                if (c2241001CnS == null) {
                                    return null;
                                }
                                return C2241021CnU.LIZ(c2241001CnS, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            case 1824:
                                C2241041CnW c2241041CnW = c2241941CoyDecode.public_group_onboarding_card;
                                if (c2241041CnW == null) {
                                    return null;
                                }
                                return C2241061CnY.LIZ(c2241041CnW, c2242321Cpa, c2242801CqM, c2242771CqJ);
                            default:
                                switch (i) {
                                    case 2000:
                                        C2242041Cp8 c2242041Cp8 = c2241941CoyDecode.dynamic_card;
                                        if (c2242041Cp8 == null) {
                                            return null;
                                        }
                                        return C2241971Cp1.LIZ(c2242041Cp8, c2242321Cpa, c2242801CqM, c2242771CqJ);
                                    case 2001:
                                        C2240921CnK c2240921CnK = c2241941CoyDecode.business_native_card;
                                        if (c2240921CnK == null) {
                                            return null;
                                        }
                                        return C2240941CnM.LIZ(c2240921CnK, c2242321Cpa, c2242801CqM, c2242771CqJ);
                                    case 2002:
                                        C2240841CnC c2240841CnC = c2241941CoyDecode.streaming_card;
                                        if (c2240841CnC == null) {
                                            return null;
                                        }
                                        return C2240731Cn1.LIZ(c2240841CnC, c2242321Cpa, c2242801CqM, c2242771CqJ);
                                    default:
                                        return null;
                                }
                        }
                }
            }
            C2243041Cqk c2243041Cqk = c2241941CoyDecode.image_card;
            if (c2243041Cqk == null) {
                return null;
            }
            return C2243031Cqj.LIZ(c2243041Cqk, c2242321Cpa, c2242801CqM, c2242771CqJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public static final BaseTemplate LIZIZ(int i, String str) {
        BaseTemplate baseTemplateLIZ = null;
        try {
            ByteString byteStringLIZJ = C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(str, 0));
            if (byteStringLIZJ.size() > 0) {
                baseTemplateLIZ = LIZ(byteStringLIZJ, i);
                return baseTemplateLIZ;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        return baseTemplateLIZ;
    }

    public static final <TemplateType extends BaseTemplate> TemplateType LIZJ(C869590Y9l c869590Y9l, Class<TemplateType> cls) {
        BaseTemplate baseTemplateLIZ;
        if (c869590Y9l.getContentPB() != null && c869590Y9l.getContentPB().size() > 0) {
            baseTemplateLIZ = LIZ(c869590Y9l.getContentPB(), c869590Y9l.getMsgType());
        } else {
            baseTemplateLIZ = null;
        }
        if (!cls.isInstance(baseTemplateLIZ)) {
            return null;
        }
        return cls.cast(baseTemplateLIZ);
    }

    public static final BaseTemplate LIZLLL(ByteString byteString, Class cls) {
        if (byteString != null && byteString.size() > 0) {
            BaseTemplate baseTemplateLIZ = LIZ(byteString, 2000);
            if (cls.isInstance(baseTemplateLIZ)) {
                return (BaseTemplate) cls.cast(baseTemplateLIZ);
            }
            return null;
        }
        return null;
    }
}
