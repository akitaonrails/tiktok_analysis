package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenAlgoModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18US, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18US {
    public static final C18US LIZ = new C18US();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        AIChatGenNode aIChatGenNodeLIZLLL;
        String promptType;
        String vpModel;
        String generateModel;
        AIChatGenChatRoomModel aIChatGenChatRoomModel;
        EditPreviewInfo editPreviewInfo = videoPublishEditModel.getEditPreviewInfo();
        String intentionModel = null;
        if (editPreviewInfo != null && (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && (aIChatGenNodeLIZLLL = interfaceC1429470nInLJFF.LIZLLL(videoPublishEditModel.creativeModel, editPreviewInfo, C1428470nHB.LJJZZI(videoPublishEditModel))) != null) {
            String str = "1";
            c0lab.LJ("is_visual_poet", "1");
            AIChatGenPrompt prompt = aIChatGenNodeLIZLLL.getPrompt();
            if (prompt != null) {
                promptType = prompt.getPromptType();
            } else {
                promptType = null;
            }
            c0lab.LJ("vp_prompt_type", promptType);
            AIChatGenAlgoModel modelInfo = aIChatGenNodeLIZLLL.getModelInfo();
            if (modelInfo != null) {
                vpModel = modelInfo.getVpModel();
            } else {
                vpModel = null;
            }
            c0lab.LJ("vp_model", vpModel);
            AIChatGenAlgoModel modelInfo2 = aIChatGenNodeLIZLLL.getModelInfo();
            if (modelInfo2 != null) {
                generateModel = modelInfo2.getGenerateModel();
            } else {
                generateModel = null;
            }
            c0lab.LJ("generate_model", generateModel);
            AIChatGenAlgoModel modelInfo3 = aIChatGenNodeLIZLLL.getModelInfo();
            if (modelInfo3 != null) {
                intentionModel = modelInfo3.getIntentionModel();
            }
            c0lab.LJ("intention_model", intentionModel);
            c0lab.LJ("vp_task_id", aIChatGenNodeLIZLLL.getTaskId());
            Integer numIsHistoryPhoto = aIChatGenNodeLIZLLL.isHistoryPhoto();
            if (numIsHistoryPhoto != null) {
                c0lab.LIZ(numIsHistoryPhoto.intValue(), "is_history_photo");
            }
            Integer numIsVpGenerateResultShow = aIChatGenNodeLIZLLL.isVpGenerateResultShow();
            if (numIsVpGenerateResultShow != null) {
                c0lab.LIZ(numIsVpGenerateResultShow.intValue(), "is_vp_generate_result_show");
            }
            AIChatGenModel aIChatGenModel = videoPublishEditModel.creativeModel.aiChatGenModel;
            if (aIChatGenModel != null && (aIChatGenChatRoomModel = aIChatGenModel.chatRoomModel) != null) {
                c0lab.LJ("shoot_way", aIChatGenChatRoomModel.shootWay);
                c0lab.LJ("shoot_enter_method", aIChatGenChatRoomModel.enterMethod);
                c0lab.LIZ(aIChatGenChatRoomModel.quota, "vp_process_cnt");
                if (!Intrinsics.LJFF(aIChatGenChatRoomModel.isNewUser, Boolean.TRUE)) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c0lab.LJ("is_vp_new_user", str);
            }
        }
    }
}
