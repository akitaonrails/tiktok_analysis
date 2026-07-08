package X;

import Y.AfS34S1000000_15;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveSdkSeiMonitorDelayIntervalSetting;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ayD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955430ayD {
    public static C11JF LIZ;

    public static final boolean LIZ() {
        return Intrinsics.LJFF(C954660awy.LJIIJJI, "quick_match") || Intrinsics.LJFF(C954660awy.LJIIJJI, "quick_recommend") || Intrinsics.LJFF(C954660awy.LJIIJJI, "quick_recommend_during_cohost");
    }

    public static final boolean LIZIZ() {
        return !(C915980Zwa.LJIIIZ().k0() == EnumC958900b3o.NONE || C915980Zwa.LJII().LLI().isLinked()) || Intrinsics.LJFF(C954660awy.LJIIJJI, "quick_recommend") || Intrinsics.LJFF(C954660awy.LJIIJJI, "quick_recommend_during_cohost");
    }

    public static void LJII() {
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        if (size <= 1) {
            C954660awy.LJIIJ = "one_apply";
        } else if (size == 2) {
            C954660awy.LJIIJ = "two_apply_two";
        }
    }

    public static void LIZJ(long j) {
        boolean z;
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logConnectionAnchorTurnOverForApply, APPLY, rivalUserId=");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ("MultiCoHostMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C955440ayE c955440ayE = new C955440ayE();
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (c954460aweLLILL.LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        if (z && C915980Zwa.LJI().LIZ().LLI() == EnumC955660aya.APPLY) {
            c955440ayE.LJIIL(1, "is_invited_by_self", true);
        } else {
            c955440ayE.LJIIL(0, "is_invited_by_self", true);
        }
        c955440ayE.LJJIFFI(null);
        c955440ayE.LJIJJLI("apply_linked");
    }

    public static void LIZLLL(long j) {
        boolean z;
        boolean z2;
        EnumC950200apm enumC950200apm;
        EnumC950200apm enumC950200apm2;
        C943870afZ c943870afZLLIFFJFJJ;
        C943870afZ enterFrom;
        C954460awe c954460aweLLILL = C915980Zwa.LJII().LLILL(j);
        if (c954460aweLLILL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("logConnectionAnchorTurnOverForApply, APPLY, rivalUserId=");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ("MultiCoHostMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        String strLIZJ = C955410ayB.LIZJ(C915200ZvK.LIZ(Integer.valueOf(c954460aweLLILL.LJJIJL)));
        if (strLIZJ.length() <= 0 && ((c943870afZLLIFFJFJJ = C915980Zwa.LJI().LIZ().LLIFFJFJJ(Integer.valueOf(c954460aweLLILL.LJJIJL))) == null || (strLIZJ = c943870afZLLIFFJFJJ.LIZ) == null || strLIZJ.length() <= 0)) {
            strLIZJ = C955410ayB.LIZJ(C915980Zwa.LJI().LIZ().LJIILLIIL());
            if (strLIZJ.length() <= 0 && ((enterFrom = C915980Zwa.LJI().LIZ().getEnterFrom()) == null || (strLIZJ = enterFrom.LIZ) == null || strLIZJ.length() <= 0)) {
                strLIZJ = "";
            }
        }
        C954660awy.LJI = strLIZJ;
        C955440ayE c955440ayE = new C955440ayE();
        AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
        if (c954460aweLLILL.LJIIJJI()) {
            z = true;
        } else {
            z = false;
        }
        if (z && c954460aweLLILL.LJJIIZI) {
            c955440ayE.LJIIL(1, "is_invited_by_self", true);
        } else {
            c955440ayE.LJIIL(0, "is_invited_by_self", true);
        }
        if (c954460aweLLILL.LJIIJJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (((enumC950200apm = c954460aweLLILL.LJJIIZ) != null && enumC950200apm.isInviting()) || ((enumC950200apm2 = c954460aweLLILL.LJJIIZ) != null && enumC950200apm2.isInvitingMe()))) {
            c955440ayE.LJIIL(1, "is_from_invitation", true);
        } else {
            c955440ayE.LJIIL(0, "is_from_invitation", true);
        }
        c955440ayE.LJIIL(CardStruct.IStatusCode.DEFAULT, "is_appended_item", true);
        c955440ayE.LJJIFFI(strLIZJ);
        c955440ayE.LJIJJLI("invite_linked");
    }

    public static final void LJIIIIZZ(String str) {
        C11JF c11jf = LIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startSeiReceiveCountDown, scene = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiCoHostMonitorHelper", C2188811AlT.LIZIZ(sbLIZ));
        LIZ = (C11JF) C11NZ.LJLJJLL(LiveSdkSeiMonitorDelayIntervalSetting.INSTANCE.getValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS34S1000000_15(str, 6), new C09JN() { // from class: X.0ayw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MultiCoHostMonitorHelper@ec80.startSeiReceiveCountDown$2");
                C11JF c11jf2 = C955430ayD.LIZ;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                C1C7U.LIZIZ("MultiCoHostMonitorHelper@ec80.startSeiReceiveCountDown$2");
            }
        });
    }

    public static void LJFF(long j, long j2, String str) {
        boolean z;
        C915980Zwa.LJII().jn1();
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        new C955440ayE().LJJIJIIJIL(j, C955410ayB.LIZJ(null), str, z);
    }

    public static void LJI(boolean z, C955590ayT c955590ayT, String str) {
        boolean z2;
        EnumC961090b7L enumC961090b7L;
        C961660b8G c961660b8G;
        long jLJIILIIL = C950220apo.LJIILIIL(c955590ayT.LJ);
        C915980Zwa.LJII().jn1();
        if (jLJIILIIL > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            C955440ayE c955440ayE = new C955440ayE();
            long ownerUserId = c955590ayT.LJ.getOwnerUserId();
            String strLIZJ = C955410ayB.LIZJ(c955590ayT.LJI);
            C961720b8M c961720b8M = c955590ayT.LIZLLL;
            if (c961720b8M != null && (c961660b8G = c961720b8M.LIZ) != null) {
                enumC961090b7L = c961660b8G.LJ;
            } else {
                enumC961090b7L = null;
            }
            c955440ayE.LJJII(ownerUserId, strLIZJ, str, z2, enumC961090b7L);
            return;
        }
        new C955440ayE().LJJIJIIJIL(c955590ayT.LJ.getOwnerUserId(), C955410ayB.LIZJ(c955590ayT.LJI), str, z2);
    }

    public static void LJ(boolean z, int i, long j, LinkLayerMessage linkLayerMessage) {
        String str;
        if (i > 0 && linkLayerMessage != null) {
            String str2 = "";
            if (z) {
                C955440ayE c955440ayE = new C955440ayE();
                AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "rival_user_id", Long.valueOf(j), true);
                c955440ayE.LJIIL(Integer.valueOf(i), "block_type", true);
                AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "message_id", Long.valueOf(linkLayerMessage.getMessageId()), true);
                if (i != 3) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i == 9) {
                                str = "in_match_process";
                            } else if (i != 17) {
                                str = "";
                            } else {
                                str = "mic_room";
                            }
                        } else {
                            str = "not_connected";
                        }
                    } else {
                        str = "processing_invite";
                    }
                } else {
                    str = "multi_permmision_not_support";
                }
                if (str.length() == 0) {
                    if (i == 11) {
                        str2 = "multi_live_connecting";
                    } else if (i == 13) {
                        str2 = "open_camera_dialog_showing";
                    } else if (i == 14) {
                        str2 = "draw_and_guess";
                    } else if (i == 16) {
                        str2 = "in_match_process";
                    } else if (i == 17) {
                        str2 = "mic_room";
                    } else if (i == 28) {
                        str2 = "in_take_stage_process";
                    } else if (i == 29) {
                        str2 = "in_catch_beans";
                    }
                    str = str2;
                }
                AbstractC962030b8r.LJIIJ(c955440ayE.LIZLLL, "block_type_string", str, true);
                c955440ayE.LJJIFFI(null);
                c955440ayE.LJIJJLI("apply_popup_block");
                return;
            }
            C955440ayE c955440ayE2 = new C955440ayE();
            AbstractC962030b8r.LJIIJ(c955440ayE2.LIZLLL, "rival_user_id", Long.valueOf(j), true);
            c955440ayE2.LJIIL(Integer.valueOf(i), "block_type", true);
            AbstractC962030b8r.LJIIJ(c955440ayE2.LIZLLL, "message_id", Long.valueOf(linkLayerMessage.getMessageId()), true);
            if (i == 11) {
                str2 = "multi_live_connecting";
            } else if (i == 13) {
                str2 = "open_camera_dialog_showing";
            } else if (i == 14) {
                str2 = "draw_and_guess";
            } else if (i == 16) {
                str2 = "in_match_process";
            } else if (i == 17) {
                str2 = "mic_room";
            } else if (i == 28) {
                str2 = "in_take_stage_process";
            } else if (i == 29) {
                str2 = "in_catch_beans";
            }
            AbstractC962030b8r.LJIIJ(c955440ayE2.LIZLLL, "block_type_string", str2, true);
            c955440ayE2.LJJIFFI(null);
            c955440ayE2.LJIJJLI("invite_popup_block");
        }
    }
}
