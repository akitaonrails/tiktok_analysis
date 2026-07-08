package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562560M4o {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r4) {
        /*
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r4.creativeModel
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            java.lang.String r1 = r0.saveDraftScene
            int r0 = r1.hashCode()
            switch(r0) {
                case -521944235: goto L1f;
                case -123656968: goto L29;
                case 361712407: goto L3c;
                case 818879405: goto L46;
                case 888516267: goto L32;
                case 1676731405: goto L50;
                default: goto Ld;
            }
        Ld:
            r3 = 5
        Le:
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel r2 = r4.getAILivePhotoModel()
            kotlin.jvm.internal.AwS23S0001000_8 r1 = new kotlin.jvm.internal.AwS23S0001000_8
            r0 = 11
            r1.<init>(r3, r0)
            com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam r0 = r2.mobParam
            r1.invoke(r0)
            return r3
        L1f:
            java.lang.String r0 = "ai_livephoto_click_loading_sheet"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            r3 = 2
            goto Le
        L29:
            java.lang.String r0 = "clickPopupFromEdit"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            goto Ld
        L32:
            java.lang.String r0 = "clickSheetFromEdit"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
        L3a:
            r3 = 0
            goto Le
        L3c:
            java.lang.String r0 = "auto_save_from_continue_popup"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            r3 = 4
            goto Le
        L46:
            java.lang.String r0 = "ai_livephoto_cancel_edit_auto_save"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            r3 = 1
            goto Le
        L50:
            java.lang.String r0 = "ai_livephoto_publish_auto_save"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld
            r3 = 3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C562560M4o.LIZLLL(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):int");
    }

    public static final void LJ(AILivePhotoModel aILivePhotoModel, EnumC545550LaT enumC545550LaT) {
        UsageStatus usageStatusLJ;
        int i = C545030LZd.LIZ[enumC545550LaT.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    usageStatusLJ = aILivePhotoModel.LJ();
                } else {
                    usageStatusLJ = UsageStatus.FAIL;
                }
            } else {
                usageStatusLJ = UsageStatus.SUCCESS_APPLY;
            }
        } else {
            usageStatusLJ = UsageStatus.LOADING;
        }
        aILivePhotoModel.mobDraftStatus = usageStatusLJ;
    }

    public static final void LIZJ(C0LAB c0lab, AILivePhotoModel aILivePhotoModel, Function0 function0) {
        UsageStatus usageStatusLJ = aILivePhotoModel.mobDraftStatus;
        if (usageStatusLJ == UsageStatus.NOT_APPLY) {
            usageStatusLJ = aILivePhotoModel.LJ();
        }
        C564410MBr.LIZ.getClass();
        c0lab.LIZ(C564410MBr.LIZLLL(usageStatusLJ), "ai_livephoto_status");
        if (aILivePhotoModel.LJI()) {
            c0lab.LIZLLL(aILivePhotoModel.initialDraftSaveType, "initial_ai_livephoto_save_type");
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void LIZ(C0LAB c0lab, AILivePhotoModel aILivePhotoModel, boolean z, boolean z2, Function0 function0) {
        String modelPrompt;
        C564410MBr c564410MBr = C564410MBr.LIZ;
        UsageStatus usageStatusLJ = aILivePhotoModel.LJ();
        c564410MBr.getClass();
        c0lab.LIZ(C564410MBr.LIZLLL(usageStatusLJ), "ai_livephoto_status");
        String strLIZLLL = aILivePhotoModel.LIZLLL();
        if (C123100dR.LIZ(strLIZLLL)) {
            c0lab.LJ("ai_livephoto_recall_way", strLIZLLL);
        }
        PromptModel promptModelLIZJ = aILivePhotoModel.LIZJ();
        c0lab.LIZ(C562580M4q.LIZ(promptModelLIZJ) ? 1 : 0, "is_lora");
        if (z) {
            Pair<String, String> pairLJFF = C0MDL.LJFF(aILivePhotoModel);
            String first = pairLJFF.getFirst();
            String second = pairLJFF.getSecond();
            c0lab.LJ("prompt_text", first);
            c0lab.LJ("prompt_type", second);
            String strLJI = C0MDL.LJI(aILivePhotoModel.LIZJ(), aILivePhotoModel);
            if (strLJI != null) {
                c0lab.LJ("follow_prompt_type", strLJI);
            }
            AIAliveInfo originAIAliveInfo = aILivePhotoModel.consumptionModel.getOriginAIAliveInfo();
            if (originAIAliveInfo != null && (modelPrompt = originAIAliveInfo.getModelPrompt()) != null) {
                c0lab.LJ("origin_ai_alive_prompt", modelPrompt);
            }
        }
        c0lab.LIZ(promptModelLIZJ.isPreInputPrompt ? 1 : 0, "is_preinput_prompt");
        if (z2) {
            c0lab.LJ("ai_livephoto_task_id", aILivePhotoModel.LIZIZ().taskId);
            c0lab.LJ("ai_livephoto_server_task_id", aILivePhotoModel.LIZIZ().serverTaskId);
        }
        c0lab.LIZ(aILivePhotoModel.mobParam.generateSidebarType, "ai_livephoto_is_sidebar_entrance");
        PromptPageMobParam promptPageMobParam = aILivePhotoModel.mobParam;
        c0lab.LIZ(promptPageMobParam.isRegeneratePrompt ? 1 : 0, "ai_livephoto_is_edit_prompt_regenerate");
        c0lab.LIZ(promptPageMobParam.isFailTryAgain ? 1 : 0, "ai_livephoto_is_fail_try_again");
        Integer num = promptPageMobParam.lastFailReason;
        if (num != null) {
            c0lab.LIZ(num.intValue(), "last_fail_reason");
        }
        Boolean bool = promptPageMobParam.aiAliveChangePhoto;
        if (bool != null) {
            c0lab.LIZ(bool.booleanValue() ? 1 : 0, "ai_alive_change_photo");
        }
        if (C528260Kng.LIZ()) {
            c0lab.LIZ(C0LXU.LIZ(Source.EDIT_AI_LIVE_PHOTO.getSource(), false).quotaRemain, "process_cnt");
        }
        if (function0 != null) {
            function0.invoke();
        }
    }
}
