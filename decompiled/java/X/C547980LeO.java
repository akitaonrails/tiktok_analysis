package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCreationResultInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.create.MentionService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;
import com.ss.android.ugc.aweme.feed.model.Avatar;
import com.ss.android.ugc.aweme.feed.model.CameoAssetInfo;
import com.ss.android.ugc.aweme.feed.model.CameoInfo;
import com.ss.android.ugc.aweme.feed.model.ImageThumb;
import com.ss.android.ugc.aweme.feed.model.UserBaseInfo;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterContextModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterSessionModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LeO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547980LeO {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final List<MentionDataItem> LIZJ(AITheaterModel aITheaterModel) {
        ?? arrayList;
        MentionDataItem mentionDataItem;
        AITheaterConsumptionModel consumptionModel = aITheaterModel.getConsumptionModel();
        List<CameoInfo> list = null;
        if (consumptionModel != null) {
            list = consumptionModel.cameoInfos;
        }
        Map<MentionDataItem, MentionDataItem> mapKN = aITheaterModel.getCreationModel().generationModel.KN();
        if (list != null) {
            arrayList = new ArrayList();
            for (CameoInfo cameoInfo : list) {
                if (cameoInfo != null) {
                    MentionDataItem mentionDataItemLJIIJ = LJIIJ(cameoInfo);
                    if (mapKN != null && (mentionDataItem = mapKN.get(mentionDataItemLJIIJ)) != null) {
                        mentionDataItemLJIIJ = mentionDataItem;
                    } else if (mentionDataItemLJIIJ != null) {
                    }
                    arrayList.add(mentionDataItemLJIIJ);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        List<InputBlock> listH1 = aITheaterModel.getCreationModel().generationModel.H1();
        ArrayList arrayList2 = new ArrayList();
        Iterator<InputBlock> it2 = listH1.iterator();
        while (it2.hasNext()) {
            MentionDataItem mentionDataItem2 = it2.next().userItem;
            if (mentionDataItem2 != null) {
                arrayList2.add(mentionDataItem2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        return C13LP.LJJJJI(arrayList3);
    }

    public static final List<String> LIZLLL(AITheaterModel aITheaterModel) {
        AITheaterGenerationModel aITheaterGenerationModel = aITheaterModel.getCreationModel().generationModel;
        ArrayList arrayList = null;
        if (!C546670LcH.LIZIZ(aITheaterGenerationModel) && !C546670LcH.LIZ(aITheaterGenerationModel)) {
            return null;
        }
        List<MentionDataItem> listLIZJ = LIZJ(aITheaterModel);
        if (listLIZJ != null) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (MentionDataItem mentionDataItem : listLIZJ) {
                if (hashSet.add(mentionDataItem.uid)) {
                    arrayList2.add(mentionDataItem);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = ((MentionDataItem) it2.next()).iconUrl;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static final String LJ(CreativeModel creativeModel) {
        AITheaterModel aITheaterModel;
        AITheaterContextModel contextModel;
        AIGCEntranceInfo aIGCEntranceInfo;
        if (!LJIIIIZZ(creativeModel, C13BV.INSTANCE) || (aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel) == null || (contextModel = aITheaterModel.getContextModel()) == null || (aIGCEntranceInfo = contextModel.aigcEntranceInfo) == null) {
            return null;
        }
        return aIGCEntranceInfo.enterFrom;
    }

    public static final String LJFF(CreativeModel creativeModel) {
        String str;
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel == null || (str = aITheaterModel.getCreationModel().sessionModel.traceId) == null) {
            return C547160Ld4.LIZIZ();
        }
        return str;
    }

    public static final boolean LJI(AITheaterModel aITheaterModel) {
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        if (aITheaterModel == null || (creationModel = aITheaterModel.getCreationModel()) == null || (aITheaterGenerationModel = creationModel.generationModel) == null || !C546670LcH.LIZJ(aITheaterGenerationModel)) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(AITheaterModel aITheaterModel) {
        List<MentionDataItem> listLIZJ = LIZJ(aITheaterModel);
        if (listLIZJ == null || listLIZJ.isEmpty()) {
            return false;
        }
        Iterator<MentionDataItem> it2 = listLIZJ.iterator();
        while (it2.hasNext()) {
            if (!Intrinsics.LJFF(it2.next().relationType, "MySelf")) {
                return true;
            }
        }
        return false;
    }

    public static final void LJIIIZ(AITheaterModel aITheaterModel) {
        boolean z;
        String strValueOf;
        AITheaterGenerationModel aITheaterGenerationModel = aITheaterModel.getCreationModel().generationModel;
        if (aITheaterGenerationModel.getStatus() == UsageStatus.SUCCESS_APPLY) {
            z = true;
        } else {
            z = false;
        }
        AITheaterContextModel contextModel = aITheaterModel.getContextModel();
        String serverTaskId = aITheaterGenerationModel.getServerTaskId();
        long durationMs = aITheaterGenerationModel.getDurationMs();
        if (z) {
            strValueOf = null;
        } else {
            strValueOf = String.valueOf(aITheaterGenerationModel.getErrorCode());
        }
        AIGCCreationResultInfo aIGCCreationResultInfo = new AIGCCreationResultInfo(Boolean.valueOf(z), strValueOf, durationMs, serverTaskId, EnumC547660Lds.UNKNOWN.getValue());
        if (z) {
            aIGCCreationResultInfo.genType = EnumC547660Lds.SYNCHRONOUS.getValue();
        }
        contextModel.aigcCreationResultInfo = aIGCCreationResultInfo;
    }

    public static final MentionDataItem LJIIJ(CameoInfo cameoInfo) {
        String userId;
        String nickname;
        String str;
        String uniqId;
        String cameoId;
        String str2;
        Avatar avatar;
        ImageThumb imageThumb;
        List<String> urlList;
        UserBaseInfo userBaseInfo = cameoInfo.getUserBaseInfo();
        String userId2 = null;
        if (userBaseInfo != null) {
            userId = userBaseInfo.getUserId();
        } else {
            userId = null;
        }
        UserBaseInfo userBaseInfo2 = cameoInfo.getUserBaseInfo();
        if (userBaseInfo2 != null) {
            nickname = userBaseInfo2.getNickname();
        } else {
            nickname = null;
        }
        UserBaseInfo userBaseInfo3 = cameoInfo.getUserBaseInfo();
        if (userBaseInfo3 != null && (avatar = userBaseInfo3.getAvatar()) != null && (imageThumb = avatar.getImageThumb()) != null && (urlList = imageThumb.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
        } else {
            str = null;
        }
        UserBaseInfo userBaseInfo4 = cameoInfo.getUserBaseInfo();
        if (userBaseInfo4 != null) {
            uniqId = userBaseInfo4.getUniqId();
        } else {
            uniqId = null;
        }
        CameoAssetInfo cameoAssetInfo = cameoInfo.getCameoAssetInfo();
        if (cameoAssetInfo != null) {
            cameoId = cameoAssetInfo.getCameoId();
        } else {
            cameoId = null;
        }
        Long followers = cameoInfo.getFollowers();
        C546890Lcd.LIZ.getClass();
        MentionService mentionServiceLIZJ = C546890Lcd.LIZJ();
        UserBaseInfo userBaseInfo5 = cameoInfo.getUserBaseInfo();
        if (userBaseInfo5 != null) {
            userId2 = userBaseInfo5.getUserId();
        }
        if (mentionServiceLIZJ.LIZIZ(userId2)) {
            str2 = "MySelf";
        } else {
            str2 = "Friend";
        }
        return new MentionDataItem(str, nickname, userId, uniqId, followers, cameoId, str2, 1, Boolean.FALSE, null, null, null, Boolean.FALSE);
    }

    public static final void LIZ(CreativeModel creativeModel, CreativeModel creativeModel2) {
        AITheaterModel aITheaterModel;
        if (creativeModel2 != null && (aITheaterModel = creativeModel2.aigcBusinessModel.aiTheaterModel) != null) {
            AIGCBusinessModelSet aIGCBusinessModelSet = creativeModel.aigcBusinessModel;
            AITheaterModel aITheaterModelLIZIZ = LIZIZ(aITheaterModel, creativeModel.creativeInfo, true);
            aITheaterModelLIZIZ.getExtraModel().originCreativeId = creativeModel2.creativeInfo.getCreationId();
            aITheaterModelLIZIZ.getExtraModel().originCreativeVersion = Integer.valueOf(creativeModel2.creativeInfo.getVersion());
            aIGCBusinessModelSet.aiTheaterModel = aITheaterModelLIZIZ;
        }
    }

    public static final boolean LJIIIIZZ(CreativeModel creativeModel, List<String> list) {
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel == null || !LJI(aITheaterModel)) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C546300Lbg.LIZ(creativeModel));
        arrayList.addAll(list);
        if (arrayList.isEmpty()) {
            return LJI(aITheaterModel);
        }
        return C546710LcL.LIZIZ(aITheaterModel.getCreationModel(), arrayList);
    }

    public static final AITheaterModel LIZIZ(AITheaterModel aITheaterModel, CreativeInfo creativeInfo, boolean z) {
        AITheaterConsumptionModel consumptionModel;
        AITheaterCreationModel creationModel = aITheaterModel.getCreationModel();
        AITheaterCreationModel aITheaterCreationModel = new AITheaterCreationModel(new AITheaterSessionModel(null, creativeInfo.getCreationId(), creativeInfo.getVersion(), aITheaterModel.getCreationModel().sessionModel.source, 1, null), creationModel.generationModel);
        if (z) {
            consumptionModel = aITheaterModel.getConsumptionModel();
        } else {
            consumptionModel = null;
        }
        return aITheaterModel.copy(aITheaterCreationModel, consumptionModel, new AITheaterExtraModel(aITheaterModel.getExtraModel().socialParams, false, false, null, null, null, false), aITheaterModel.contextModel);
    }
}
