package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import com.ss.android.ugc.aweme.theater.model.WritableAITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569160MTy {
    public static final C569160MTy LIZ = new C569160MTy();

    /* JADX WARN: Removed duplicated region for block: B:60:0x0106 A[PHI: r13
      0x0106: PHI (r13v2 java.lang.String) = (r13v0 java.lang.String), (r13v3 java.lang.String) binds: [B:59:0x0104, B:57:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo LIZJ(X.C548260Leq r29) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C569160MTy.LIZJ(X.0Leq):com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationInputInfo");
    }

    public static CreativeModel LIZ(IAITheaterCreationLauncher.EnterParams enterParams, boolean z) {
        CreativeModel creativeModel;
        AIGC.AICreationSceneName aICreationSceneName;
        LandingModel landingModel;
        CreativeModel creativeModel2 = enterParams.creativeModel;
        if (creativeModel2 == null) {
            creativeModel = new CreativeModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -1, 2097151, null);
        } else {
            creativeModel = creativeModel2;
        }
        if (z) {
            creativeModel.creativeInfo = new CreativeInfo(null, 0, null, 7, null);
        }
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            new AwS587S0100000_8(creativeModel, 645).invoke(aITheaterModel.getCreationModel().sessionModel);
            return creativeModel;
        }
        LIZIZ(creativeModel, enterParams);
        AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
        if (aIGCEntranceInfo != null) {
            aICreationSceneName = aIGCEntranceInfo.sceneName;
        } else {
            aICreationSceneName = null;
        }
        if (Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.PROACTIVE_CRT_CREATE.INSTANCE) && creativeModel2 != null && (landingModel = creativeModel2.landingModel) != null) {
            creativeModel.landingModel.defaultLandingCreateTab = landingModel.defaultLandingCreateTab;
        }
        return creativeModel;
    }

    public static void LIZIZ(CreativeModel creativeModel, IAITheaterCreationLauncher.EnterParams enterParams) {
        AIGCSocialModel aIGCSocialModel;
        AIGCEntranceInfo aIGCEntranceInfo;
        AIGC.RefPageName refPageName;
        AITheaterConsumptionModel aITheaterConsumptionModel = null;
        String str = null;
        AITheaterCreationModel aITheaterCreationModel = new AITheaterCreationModel(new AITheaterSessionModel(null, creativeModel.creativeInfo.getCreationId(), creativeModel.creativeInfo.getVersion(), Source.AI_THEATER.getSource(), 1, null), new WritableAITheaterGenerationModel(null, null, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194303, null));
        AIGCBusinessModelSet aIGCBusinessModelSet = creativeModel.aigcBusinessModel;
        if (enterParams != null) {
            aITheaterConsumptionModel = enterParams.consumptionModel;
        }
        if (enterParams != null) {
            aIGCSocialModel = enterParams.socialParams;
        } else {
            aIGCSocialModel = null;
        }
        aIGCBusinessModelSet.aiTheaterModel = new AITheaterModel(aITheaterCreationModel, aITheaterConsumptionModel, new AITheaterExtraModel(aIGCSocialModel, false, false, null, null, null, false), null, 8, null);
        EventData eventData = creativeModel.eventData;
        if (enterParams != null && (aIGCEntranceInfo = enterParams.entranceInfo) != null && (refPageName = aIGCEntranceInfo.refPageName) != null) {
            str = refPageName.value;
        }
        eventData.enterFrom = str;
    }

    public static CreativeModel LIZLLL(CreativeModel creativeModel, C548260Leq c548260Leq, AIGCSocialModel aIGCSocialModel) {
        Map mapLJIILLIIL = null;
        if (creativeModel.aigcBusinessModel.aiTheaterModel == null) {
            LIZIZ(creativeModel, null);
        }
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel == null) {
            return null;
        }
        AITheaterSessionModel aITheaterSessionModel = aITheaterModel.getCreationModel().sessionModel;
        List<InputBlock> list = c548260Leq.LIZ;
        List<Pair<MentionDataItem, MentionDataItem>> list2 = c548260Leq.LIZJ;
        if (list2 != null) {
            mapLJIILLIIL = C2097608Jq.LJIILLIIL(list2);
        }
        WritableAITheaterGenerationModel writableAITheaterGenerationModel = new WritableAITheaterGenerationModel(list, mapLJIILLIIL, null, null, null, null, null, null, null, null, null, 0, 0L, 0L, null, null, 0L, 0, null, null, null, null, 4194300, null);
        List<MediaModel> list3 = c548260Leq.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
        for (MediaModel mediaModel : list3) {
            String strLJFF = mediaModel.LJFF();
            if (!C123100dR.LIZ(strLJFF) || strLJFF == null) {
                strLJFF = mediaModel.originLocalUriPath;
            }
            arrayList.add(strLJFF);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (C123100dR.LIZ((String) obj)) {
                arrayList2.add(obj);
            }
        }
        writableAITheaterGenerationModel.mediaPathList = arrayList2;
        C547670Ldt c547670Ldt = C547670Ldt.LIZ;
        List<InputBlock> list4 = c548260Leq.LIZ;
        c547670Ldt.getClass();
        String strLIZLLL = C547670Ldt.LIZLLL(list4);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        writableAITheaterGenerationModel.promptText = strLIZLLL;
        aITheaterModel.setCreationModel(new AITheaterCreationModel(aITheaterSessionModel, writableAITheaterGenerationModel));
        aITheaterModel.getContextModel().aigcCreationInputInfo = LIZJ(c548260Leq);
        aITheaterModel.getExtraModel().socialParams = aIGCSocialModel;
        return creativeModel;
    }
}
