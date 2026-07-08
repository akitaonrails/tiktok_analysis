package X;

import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564410MBr {
    public static final C564410MBr LIZ = new C564410MBr();

    public static int LIZLLL(UsageStatus usageStatus) {
        int i = C558790Lvp.LIZ[usageStatus.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        return 0;
    }

    public static C0LAB LJ(VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        Pair<Integer, Integer> pairLJJIIZ = C1416310mxZ.LJJIIZ(videoPublishEditModel);
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LJ("enter_from", "video_edit_page");
        c0labLJII.LJ("shoot_tab_name", C1428470nHB.LJJIIZI(videoPublishEditModel));
        c0labLJII.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJII.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c0labLJII.LIZ(iIntValue, "video_cnt");
        c0labLJII.LIZ(iIntValue2, "pic_cnt");
        c0labLJII.LIZ(pairLJJIIZ.getFirst().intValue(), "original_video_cnt");
        c0labLJII.LIZ(pairLJJIIZ.getSecond().intValue(), "original_pic_cnt");
        c0labLJII.LIZ(videoPublishEditModel.creativeModel.draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0labLJII.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        return c0labLJII;
    }

    public static C0LAB LJI(VideoPublishEditModel videoPublishEditModel) {
        PromptPageMobParam promptPageMobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        String strLJI = C0MDL.LJI(videoPublishEditModel.getAILivePhotoModel().LIZJ(), videoPublishEditModel.getAILivePhotoModel());
        if (strLJI != null) {
            c0labLJII.LJ("follow_prompt_type", strLJI);
        }
        return c0labLJII;
    }

    public static C0LAB LJII(VideoPublishEditModel videoPublishEditModel) {
        String modelPrompt;
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        c0lab.LIZ(u4.LJLL(videoPublishEditModel) ? 1 : 0, "is_story");
        c0lab.LJ("prompt_type", aILivePhotoModel.LIZJ().LIZJ());
        c0lab.LIZ(videoPublishEditModel.getAILivePhotoModel().mobParam.generateSidebarType, "is_sidebar_entrance");
        String strLJI = C0MDL.LJI(videoPublishEditModel.getAILivePhotoModel().LIZJ(), videoPublishEditModel.getAILivePhotoModel());
        if (strLJI != null) {
            c0lab.LJ("follow_prompt_type", strLJI);
        }
        AIAliveInfo originAIAliveInfo = aILivePhotoModel.consumptionModel.getOriginAIAliveInfo();
        if (originAIAliveInfo != null && (modelPrompt = originAIAliveInfo.getModelPrompt()) != null) {
            c0lab.LJ("origin_ai_alive_prompt", modelPrompt);
        }
        Boolean bool = aILivePhotoModel.mobParam.aiAliveChangePhoto;
        if (bool != null) {
            c0lab.LIZ(bool.booleanValue() ? 1 : 0, "ai_alive_change_photo");
        }
        return c0lab;
    }

    public static void LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0labLJ = LJ(videoPublishEditModel);
        c0labLJ.LIZ(LIZLLL(videoPublishEditModel.getAILivePhotoModel().LJ()), "ai_livephoto_status");
        if (C528260Kng.LIZ()) {
            c0labLJ.LIZ(C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), false).quotaRemain, "process_cnt");
        }
        C20684815ws.LJIILLIIL("click_ai_livephoto_entrance", c0labLJ.LIZ);
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0labLJ = LJ(videoPublishEditModel);
        c0labLJ.LIZ(LIZLLL(videoPublishEditModel.getAILivePhotoModel().LJ()), "ai_livephoto_status");
        C20684815ws.LJIILLIIL("ai_livephoto_entrance_show", c0labLJ.LIZ);
    }

    public static void LIZJ(AILivePhotoModel aILivePhotoModel, C0LAB c0lab) {
        ProgressModel progressModel = aILivePhotoModel.lastFailProgressModel;
        if (progressModel != null) {
            C564410MBr c564410MBr = LIZ;
            UsageStatus usageStatus = progressModel.status;
            c564410MBr.getClass();
            c0lab.LIZ(LIZLLL(usageStatus), "ai_livephoto_status");
            PromptModel promptModel = progressModel.prompt;
            if (promptModel != null) {
                c0lab.LJ("prompt_text", promptModel.promptForAlgorithm);
                c0lab.LJ("prompt_type", promptModel.LIZJ());
                c0lab.LIZ(promptModel.isPreInputPrompt ? 1 : 0, "is_preinput_prompt");
            }
        }
    }

    public static String LJFF(VideoPublishEditModel videoPublishEditModel, PromptModel promptModel) {
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJI.LIZ(C562580M4q.LIZ(promptModel) ? 1 : 0, "is_lora");
        c0labLJI.LJ("prompt_text", promptModel.promptForAlgorithm);
        c0labLJI.LJ("prompt_type", promptModel.LIZJ());
        c0labLJI.LIZ(promptModel.isPreInputPrompt ? 1 : 0, "is_preinput_prompt");
        c0labLJI.LIZ(videoPublishEditModel.getAILivePhotoModel().isFailureRecall ? 1 : 0, "is_fail_regenerate");
        c0labLJI.LIZ(videoPublishEditModel.getAILivePhotoModel().mobParam.isFailTryAgain ? 1 : 0, "is_fail_try_again");
        C0CHQ.LIZ().getApplicationService().getClass();
        c0labLJI.LJ("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c0labLJI.LIZ(u4.LJLL(videoPublishEditModel) ? 1 : 0, "is_story");
        C844470XAv.LIZ.getClass();
        c0labLJI.LJ("app_id", String.valueOf(C844470XAv.LJIIJ));
        c0labLJI.LJ("os", "android");
        c0labLJI.LJ("business_type", "ai_livephoto");
        if (C528260Kng.LIZ()) {
            c0labLJI.LIZ(C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), false).quotaRemain, "process_cnt");
        }
        String strLJI = C0MDL.LJI(promptModel, aILivePhotoModel);
        if (strLJI != null) {
            c0labLJI.LJ("follow_prompt_type", strLJI);
        }
        return C786410Ut5.J3(C2347509Ht.LIZ(c0labLJI.LIZ));
    }

    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel, String str) {
        PromptPageMobParam promptPageMobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LJ("action_type", str);
        c0labLJII.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        if (promptPageMobParam.lastGenerateTime > 0) {
            c0labLJII.LIZIZ(System.currentTimeMillis() - promptPageMobParam.lastGenerateTime, "generate_waiting_duration");
        }
        C20684815ws.LJIILLIIL("ai_livephoto_exit_edit_reminder", c0labLJII.LIZ);
    }

    public static void LJIIJJI(VideoPublishEditModel videoPublishEditModel, PromptModel promptModel) {
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        PromptPageMobParam promptPageMobParam = aILivePhotoModel.mobParam;
        C0LAB c0labLJ = LJ(videoPublishEditModel);
        C562560M4o.LIZ(c0labLJ, aILivePhotoModel, false, false, null);
        c0labLJ.LJ("prompt_type", promptModel.LIZJ());
        c0labLJ.LJ("prompt_text", promptModel.promptForAlgorithm);
        c0labLJ.LIZ(promptModel.isPreInputPrompt ? 1 : 0, "is_preinput_prompt");
        c0labLJ.LIZ(C562580M4q.LIZ(promptModel) ? 1 : 0, "is_lora");
        c0labLJ.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        c0labLJ.LIZ(aILivePhotoModel.isFailureRecall ? 1 : 0, "is_fail_regenerate");
        c0labLJ.LIZ(promptPageMobParam.isFailTryAgain ? 1 : 0, "is_fail_try_again");
        String strLJI = C0MDL.LJI(promptModel, aILivePhotoModel);
        if (strLJI != null) {
            c0labLJ.LJ("follow_prompt_type", strLJI);
        }
        C20684815ws.LJIILLIIL("ai_livephoto_generate", c0labLJ.LIZ);
    }

    public static void LJIILIIL(VideoPublishEditModel videoPublishEditModel, String str) {
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LJ("prompt_type", aILivePhotoModel.LIZJ().LIZJ());
        c0labLJII.LJ("fail_type", str);
        if (aILivePhotoModel.LJFF()) {
            LIZJ(aILivePhotoModel, c0labLJII);
        }
        C20684815ws.LJIILLIIL("ai_livephoto_generating_fail_show", c0labLJII.LIZ);
    }

    public static void LJIIZILJ(VideoPublishEditModel videoPublishEditModel, String str) {
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        PromptPageMobParam promptPageMobParam = aILivePhotoModel.mobParam;
        Pair<String, String> pairLJFF = C0MDL.LJFF(aILivePhotoModel);
        String first = pairLJFF.getFirst();
        String second = pairLJFF.getSecond();
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LJ("action_type", str);
        c0labLJII.LIZ(u4.LJLL(videoPublishEditModel) ? 1 : 0, "is_story");
        c0labLJII.LJ("prompt_text", first);
        c0labLJII.LJ("prompt_type", second);
        c0labLJII.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        String strLIZLLL = aILivePhotoModel.LIZLLL();
        if (C123100dR.LIZ(strLIZLLL)) {
            c0labLJII.LJ("ai_livephoto_recall_way", strLIZLLL);
        }
        C20684815ws.LJIILLIIL("ai_alive_prompt_over_limit", c0labLJII.LIZ);
    }

    public static void LJIJ(VideoPublishEditModel videoPublishEditModel, String str) {
        PromptPageMobParam promptPageMobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LJ("action_type", str);
        c0labLJII.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        if (promptPageMobParam.lastGenerateTime > 0) {
            c0labLJII.LIZIZ(System.currentTimeMillis() - promptPageMobParam.lastGenerateTime, "generate_waiting_duration");
        }
        C20684815ws.LJIILLIIL("ai_livephoto_publish_reminder", c0labLJII.LIZ);
    }

    public static void LJIIL(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        C0LAB c0labLJII = LJII(videoPublishEditModel);
        c0labLJII.LJ("prompt_type", aILivePhotoModel.LIZJ().LIZJ());
        c0labLJII.LJ("fail_type", str);
        c0labLJII.LIZ(i, "action_type");
        if (aILivePhotoModel.LJFF()) {
            LIZJ(aILivePhotoModel, c0labLJII);
        }
        C20684815ws.LJIILLIIL("ai_livephoto_generating_fail_click", c0labLJII.LIZ);
    }

    public static void LJIJI(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        PromptPageMobParam promptPageMobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("action_type", promptPageMobParam.leaveActionType);
        c0labLJI.LIZIZ(System.currentTimeMillis() - promptPageMobParam.lastShowTime, "duration");
        c0labLJI.LIZ(promptPageMobParam.hasInputPrompt ? 1 : 0, "has_input_prompt");
        c0labLJI.LIZ(promptPageMobParam.hasPresetPrompt ? 1 : 0, "has_preset_prompt");
        c0labLJI.LIZ(promptPageMobParam.hasGeneratePrompt ? 1 : 0, "has_generate_prompt");
        if (z) {
            c0labLJI.LIZ(z2 ? 1 : 0, "is_ai_writing");
        }
        C20684815ws.LJIILLIIL("ai_livephoto_generate_page_leave", c0labLJI.LIZ);
    }

    public static void LJIJJ(VideoPublishEditModel videoPublishEditModel, int i, PromptModel promptModel) {
        PromptPageMobParam promptPageMobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LIZ(i, "position");
        c0labLJI.LJ("prompt_text", promptModel.promptForAlgorithm);
        c0labLJI.LJ("prompt_type", promptModel.LIZJ());
        c0labLJI.LIZ(C562580M4q.LIZ(promptModel) ? 1 : 0, "is_lora");
        c0labLJI.LIZIZ(System.currentTimeMillis() - promptPageMobParam.lastShowTime, "duration");
        c0labLJI.LIZ(promptPageMobParam.hasGeneratePromptReturn ? 1 : 0, "has_start_generate_return");
        C20684815ws.LJIILLIIL("ai_livephoto_prompt_click", c0labLJI.LIZ);
    }

    public static void LJIJJLI(VideoPublishEditModel videoPublishEditModel, List list, boolean z) {
        long jCurrentTimeMillis;
        PromptPageMobParam promptPageMobParam = videoPublishEditModel.getAILivePhotoModel().mobParam;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((PromptModel) it2.next()).LIZJ());
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(C13LP.LJJJJI(arrayList), ",", null, null, 0, null, null, 62);
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LJ("prompt_type_list", strLJJLIIIJ);
        if (promptPageMobParam.lastShowTime <= 0) {
            jCurrentTimeMillis = -1;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis() - promptPageMobParam.lastShowTime;
        }
        c0labLJI.LIZIZ(jCurrentTimeMillis, "duration");
        c0labLJI.LIZ(promptPageMobParam.hasInputPrompt ? 1 : 0, "has_input_prompt");
        c0labLJI.LIZ(promptPageMobParam.hasPresetPrompt ? 1 : 0, "has_preset_prompt");
        c0labLJI.LIZ(promptPageMobParam.hasGeneratePrompt ? 1 : 0, "has_generate_prompt");
        c0labLJI.LIZ(promptPageMobParam.hasStartGenerate ? 1 : 0, "has_start_generate");
        c0labLJI.LIZ(promptPageMobParam.isPromptPageShowing ? 1 : 0, "is_generate_page_open");
        c0labLJI.LIZ(z ? 1 : 0, "is_from_cache");
        C20684815ws.LJIILLIIL("ai_livephoto_prompt_return", c0labLJI.LIZ);
    }

    public static void LJIL(VideoPublishEditModel videoPublishEditModel, int i, PromptModel promptModel) {
        long jCurrentTimeMillis = System.currentTimeMillis() - videoPublishEditModel.getAILivePhotoModel().mobParam.lastShowTime;
        C0LAB c0labLJI = LJI(videoPublishEditModel);
        c0labLJI.LIZ(i, "position");
        c0labLJI.LJ("prompt_text", promptModel.promptForAlgorithm);
        c0labLJI.LJ("prompt_type", promptModel.LIZJ());
        c0labLJI.LIZ(C562580M4q.LIZ(promptModel) ? 1 : 0, "is_lora");
        c0labLJI.LIZIZ(jCurrentTimeMillis, "duration");
        C20684815ws.LJIILLIIL("ai_livephoto_prompt_show", c0labLJI.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0LAB] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public static void LJIILJJIL(C564410MBr c564410MBr, VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2, int i) {
        String str;
        ?? r9 = z;
        if ((i & 2) != 0) {
            r9 = 0;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c564410MBr.getClass();
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        Pair<String, Boolean> pair = aILivePhotoModel.mobParam.waitingForPostProcess;
        if (pair != null && (str = aILivePhotoModel.LIZIZ().taskId) != null && Intrinsics.LJFF(pair.getFirst(), str) && pair.getSecond().booleanValue()) {
            return;
        }
        PromptPageMobParam promptPageMobParam = aILivePhotoModel.mobParam;
        ?? LJ = LJ(videoPublishEditModel);
        C562560M4o.LIZ(LJ, aILivePhotoModel, true, true, null);
        LJ.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        LJ.LIZ(aILivePhotoModel.isFailureRecall ? 1 : 0, "is_fail_regenerate");
        LJ.LIZ(promptPageMobParam.isFailTryAgain ? 1 : 0, "is_fail_try_again");
        LJ.LIZ(r9, "is_manual_finish");
        if (promptPageMobParam.lastGenerateTime > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - promptPageMobParam.lastGenerateTime;
            promptPageMobParam.generateDuration = jCurrentTimeMillis;
            LJ.LIZIZ(jCurrentTimeMillis, "generate_duration");
        }
        if (z2 && aILivePhotoModel.LJFF()) {
            LIZJ(aILivePhotoModel, LJ);
        }
        C20684815ws.LJIILLIIL("ai_livephoto_generate_finish_show", LJ.LIZ);
    }

    public static C0LAB LIZ(VideoPublishEditModel videoPublishEditModel, int i, boolean z, boolean z2, boolean z3, Function1 function1) {
        Pair<String, String> pair;
        String strLJI;
        AILivePhotoModel aILivePhotoModel = videoPublishEditModel.getAILivePhotoModel();
        PromptPageMobParam promptPageMobParam = aILivePhotoModel.mobParam;
        if (z2) {
            pair = C0MDL.LJFF(aILivePhotoModel);
        } else {
            pair = new Pair<>("", "");
        }
        String first = pair.getFirst();
        String second = pair.getSecond();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("shoot_enter_method", videoPublishEditModel.getShootEnterMethod());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LIZ(i, "process_cnt");
        c0lab.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "is_edit_prompt_regenerate");
        c0lab.LIZ(LIZLLL(aILivePhotoModel.LJ()), "ai_livephoto_status");
        c0lab.LIZ(promptPageMobParam.isFailTryAgain ? 1 : 0, "is_fail_try_again");
        c0lab.LIZ(aILivePhotoModel.mobParam.generateSidebarType, "is_sidebar_entrance");
        c0lab.LIZ(aILivePhotoModel.isFailureRecall ? 1 : 0, "is_fail_regenerate");
        if (z) {
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        }
        if (z2) {
            c0lab.LJ("prompt_type", second);
            c0lab.LJ("prompt_text", first);
        }
        Integer num = promptPageMobParam.lastFailReason;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "last_fail_reason");
        }
        Boolean bool = promptPageMobParam.aiAliveChangePhoto;
        if (bool != null) {
            c0lab.LIZ(bool.booleanValue() ? 1 : 0, "ai_alive_change_photo");
        }
        if (z3 && (strLJI = C0MDL.LJI(aILivePhotoModel.LIZJ(), aILivePhotoModel)) != null) {
            c0lab.LJ("follow_prompt_type", strLJI);
        }
        function1.invoke(c0lab);
        return c0lab;
    }

    public static void LJIILL(VideoPublishEditModel videoPublishEditModel, ShortVideoContext shortVideoContext, String str, String str2, String str3, String str4) {
        C0LAB c0lab;
        String modelPrompt;
        if (videoPublishEditModel != null) {
            c0lab = LJII(videoPublishEditModel);
        } else if (shortVideoContext != null) {
            c0lab = new C0LAB();
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
            c0lab.LJ("shoot_enter_method", shortVideoContext.enterMethod);
            c0lab.LJ("follow_prompt_type", shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getFollowPromptTypeSafelyBeforeEdit());
            AIAliveInfo originAIAliveInfo = shortVideoContext.creativeModel.aiLivePhotoModel.consumptionModel.getOriginAIAliveInfo();
            if (originAIAliveInfo != null) {
                modelPrompt = originAIAliveInfo.getModelPrompt();
            } else {
                modelPrompt = null;
            }
            c0lab.LJ("origin_ai_alive_prompt", modelPrompt);
        } else {
            c0lab = new C0LAB();
            c0lab.LJ("shoot_way", str3);
            c0lab.LJ("shoot_enter_method", str4);
        }
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("action_type", str);
        C20684815ws.LJIILLIIL("ai_livephoto_guide_popup", c0lab.LIZ);
    }
}
