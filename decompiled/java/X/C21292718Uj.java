package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS9S1500000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21292718Uj {
    public static boolean LIZ(C19EG c19eg, C18UJ c18uj, String str, Function0 function0, AwS147S1200000_32 awS147S1200000_32, int i) {
        String str2;
        int iLJIJ;
        AIChatGenNode aIChatGenNodeLIZLLL;
        AIChatTrackingConfig aIChatTrackingConfig;
        String promptType;
        AwS147S1200000_32 awS147S1200000_322 = awS147S1200000_32;
        Integer num = null;
        if ((i & 32) != 0) {
            awS147S1200000_322 = null;
        }
        if (C21163117rp.LIZIZ().LIZJ() && !C21163117rp.LIZIZ().LJFF()) {
            AIChatGenChatRoomModel aIChatGenChatRoomModel = c18uj.LJ.chatRoomModel;
            if (aIChatGenChatRoomModel != null) {
                str2 = aIChatGenChatRoomModel.entranceType;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, "comment")) {
                if (C0C64.LJIILLIIL().LJIJ(31744, 0, "comment_ai_chat_new_user_show_exit_dialog", true) == 0) {
                    iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "comment_ai_chat_exit_cancel_generation", true);
                } else {
                    iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "comment_ai_chat_new_user_show_exit_dialog", true);
                }
                C869590Y9l c869590Y9lLJIILJJIL = C21163117rp.LIZIZ().LJIILJJIL();
                if (c869590Y9lLJIILJJIL != null) {
                    aIChatGenNodeLIZLLL = C18UO.LIZLLL(c869590Y9lLJIILJJIL);
                } else {
                    aIChatGenNodeLIZLLL = null;
                }
                if (iLJIJ != 0) {
                    if (iLJIJ == 2) {
                        C21163117rp.LIZIZ = c18uj;
                        C21163117rp.LIZIZ().LJIILIIL("");
                    }
                } else {
                    C18UP.LIZ.getClass();
                    C0LAB c0lab = new C0LAB();
                    AIChatGenChatRoomModel aIChatGenChatRoomModel2 = c18uj.LJ.chatRoomModel;
                    if (aIChatGenChatRoomModel2 != null) {
                        c0lab.LJ("shoot_way", aIChatGenChatRoomModel2.shootWay);
                        c0lab.LJ("shoot_enter_method", aIChatGenChatRoomModel2.enterMethod);
                    }
                    if (aIChatGenNodeLIZLLL != null) {
                        AIChatGenPrompt prompt = aIChatGenNodeLIZLLL.getPrompt();
                        if (prompt != null) {
                            promptType = prompt.getPromptType();
                        } else {
                            promptType = null;
                        }
                        c0lab.LJ("vp_prompt_type", promptType);
                        String contextPreloadImageSource = aIChatGenNodeLIZLLL.getContextPreloadImageSource();
                        if (contextPreloadImageSource != null) {
                            c0lab.LJ("preload_image_status", contextPreloadImageSource);
                        }
                        Integer contextUserUploadImageCount = aIChatGenNodeLIZLLL.getContextUserUploadImageCount();
                        if (contextUserUploadImageCount != null) {
                            c0lab.LJ("upload_image_status", String.valueOf(contextUserUploadImageCount.intValue()));
                        }
                    }
                    AIChatPageConfig aIChatPageConfig = c18uj.LJI;
                    if (aIChatPageConfig != null && (aIChatTrackingConfig = aIChatPageConfig.tracking) != null) {
                        num = aIChatTrackingConfig.awemeType;
                    }
                    c0lab.LJ("aweme_type", String.valueOf(num));
                    C20684815ws.LJIILLIIL("ttcrt_vp_retention_popup_show", c0lab.LIZ);
                    if (C0DHG.LIZ() && C1388190mED.LIZ(c19eg) != null) {
                        C632670Orh.LIZIZ(c19eg, new C19719212De(-1509403445, new C1A44(c18uj, str, aIChatGenNodeLIZLLL, awS147S1200000_322, function0, null), true));
                        return true;
                    }
                    C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
                    c1397580mTM.LJI(C555520LqY.LIZIZ(2131837139));
                    c1397580mTM.LIZIZ(C555520LqY.LIZIZ(2131837138));
                    C985403tE.LIZ(c1397580mTM, new AwS9S1500000_32(c18uj, (C18UJ) str, (String) aIChatGenNodeLIZLLL, (AIChatGenNode) awS147S1200000_322, (Function0<Boolean>) function0, (Function0<Unit>) null, (Function0<Unit>) 1));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                    return true;
                }
            }
        }
        return false;
    }
}
