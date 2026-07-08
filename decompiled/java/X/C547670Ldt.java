package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AITheaterGenerateConfigExp;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.InputImage;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.creative.model.common.PromptJsonModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterExtraModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ldt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547670Ldt {
    public static final C547670Ldt LIZ = new C547670Ldt();

    public static String LIZLLL(List list) {
        PromptJsonModel promptJsonModel;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            String strLIZJ = null;
            if (it2.hasNext()) {
                InputBlock inputBlock = (InputBlock) it2.next();
                String str = inputBlock.type;
                if (Intrinsics.LJFF(str, "mention")) {
                    String value = C0LXI.CAMEO_ID.getValue();
                    MentionDataItem mentionDataItem = inputBlock.userItem;
                    if (mentionDataItem != null) {
                        strLIZJ = mentionDataItem.cameoId;
                    }
                    promptJsonModel = new PromptJsonModel(value, strLIZJ);
                } else if (Intrinsics.LJFF(str, "image")) {
                    String value2 = C0LXI.IMAGE.getValue();
                    InputImage inputImage = inputBlock.inputImage;
                    if (inputImage != null) {
                        strLIZJ = inputImage.path;
                    }
                    promptJsonModel = new PromptJsonModel(value2, strLIZJ);
                } else {
                    promptJsonModel = new PromptJsonModel(C0LXI.TEXT.getValue(), inputBlock.content);
                }
                arrayList.add(promptJsonModel);
            } else {
                try {
                    strLIZJ = C2292508yZ.LIZJ(arrayList);
                    return strLIZJ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return strLIZJ;
                }
            }
        }
    }

    public static Map LIZIZ(AITheaterModel aITheaterModel, IAITheaterCreationLauncher.EnterParams enterParams) throws JSONException {
        String str;
        AIGC.AICreationSceneName aICreationSceneName;
        String str2;
        MentionDataItem mentionDataItem;
        AIGC.AICreationSceneName aICreationSceneName2;
        String value;
        if (aITheaterModel == null) {
            return C2097608Jq.LJ();
        }
        AITheaterGenerationModel aITheaterGenerationModel = aITheaterModel.getCreationModel().generationModel;
        AITheaterConsumptionModel consumptionModel = aITheaterModel.getConsumptionModel();
        AITheaterExtraModel extraModel = aITheaterModel.getExtraModel();
        AIGCSocialModel aIGCSocialModel = null;
        if (extraModel != null) {
            aIGCSocialModel = extraModel.socialParams;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AIGCEntranceInfo aIGCEntranceInfo = enterParams.entranceInfo;
        String str3 = "ai_theater_unknown";
        if (aIGCEntranceInfo == null || (str = aIGCEntranceInfo.shootWay) == null) {
            str = "ai_theater_unknown";
        }
        linkedHashMap.put("shoot_way", str);
        linkedHashMap.put("creation_id", aITheaterModel.getCreationModel().sessionModel.creationId);
        AIGCEntranceInfo aIGCEntranceInfo2 = enterParams.entranceInfo;
        if (aIGCEntranceInfo2 != null && (aICreationSceneName2 = aIGCEntranceInfo2.sceneName) != null && (value = aICreationSceneName2.getValue()) != null) {
            str3 = value;
        }
        linkedHashMap.put("create_channel", str3);
        String str4 = "";
        if (consumptionModel != null) {
            String str5 = consumptionModel.remixVideoId;
            if (str5 == null) {
                str5 = "";
            }
            linkedHashMap.put("remix_item_id", str5);
            Map<MentionDataItem, MentionDataItem> mapKN = aITheaterGenerationModel.KN();
            if (mapKN != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<MentionDataItem, MentionDataItem> entry : mapKN.entrySet()) {
                    if (entry.getKey() != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                if (!linkedHashMap2.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        String str6 = ((MentionDataItem) entry2.getKey()).cameoId;
                        if (C123100dR.LIZ(str6)) {
                            jSONObject.put(str6, ((MentionDataItem) entry2.getValue()).cameoId);
                        }
                    }
                    linkedHashMap.put("replace_cameo_id", C786410Ut5.J3(jSONObject));
                }
            }
        }
        AIGCEntranceInfo aIGCEntranceInfo3 = enterParams.entranceInfo;
        if (aIGCEntranceInfo3 != null && (aICreationSceneName = aIGCEntranceInfo3.sceneName) != null) {
            AIGC.RefPageName.CameoManagePage.INSTANCE.getClass();
            if (C549110LgD.LIZ(aICreationSceneName) && aIGCSocialModel != null) {
                List<MentionDataItem> list = aIGCSocialModel.peerCameoInfo;
                if (list == null || (mentionDataItem = (MentionDataItem) C13LP.LJJJLL(list)) == null || (str2 = mentionDataItem.uid) == null) {
                    str2 = "";
                }
                linkedHashMap.put("dm_user_id", str2);
                String str7 = aIGCSocialModel.conversationShortId;
                if (str7 != null) {
                    str4 = str7;
                }
                linkedHashMap.put("dm_conversation_short_id", str4);
            }
        }
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getGenerationExtra: ");
        sbLIZ.append(linkedHashMap);
        c547140Ld2.LIZJ("AITheaterGenerationUtils", C2188811AlT.LIZIZ(sbLIZ));
        return linkedHashMap;
    }

    public static InputBlock LJ(PromptJsonModel promptJsonModel, List list) {
        String str = promptJsonModel.type;
        Object obj = null;
        if (Intrinsics.LJFF(str, C0LXI.CAMEO_ID.getValue())) {
            String str2 = promptJsonModel.content;
            if (str2 == null) {
                return null;
            }
            C547680Ldu c547680Ldu = InputBlock.Companion;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((MentionDataItem) next).cameoId, str2)) {
                    obj = next;
                    break;
                }
            }
            MentionDataItem mentionDataItem = (MentionDataItem) obj;
            if (mentionDataItem == null) {
                mentionDataItem = new MentionDataItem(null, null, null, null, 0L, str2, null, 1, Boolean.FALSE, null, null, null, Boolean.FALSE);
            }
            c547680Ldu.getClass();
            return C547680Ldu.LIZIZ(mentionDataItem);
        }
        if (Intrinsics.LJFF(str, C0LXI.IMAGE.getValue())) {
            String str3 = promptJsonModel.content;
            if (str3 == null) {
                return null;
            }
            C547680Ldu c547680Ldu2 = InputBlock.Companion;
            InputImage inputImage = new InputImage(str3, -1, -1, -1L, "", null);
            c547680Ldu2.getClass();
            return C547680Ldu.LIZ(inputImage);
        }
        if (!Intrinsics.LJFF(str, C0LXI.TEXT.getValue())) {
            return null;
        }
        return new InputBlock("text", promptJsonModel.content, null, null, null, false);
    }

    public static String LIZ(Integer num, String str, String str2) {
        int i;
        if (C123100dR.LIZ(str2)) {
            return str2;
        }
        if (Intrinsics.LJFF(str, "CHECK_CAMEO_PERMISSION")) {
            i = 2131826175;
        } else if (!C560970LzL.LIZIZ() || (num != null && num.intValue() == -47364)) {
            i = 2131826231;
        } else if (Intrinsics.LJFF(str, "QUOTA") && num != null && num.intValue() == 5) {
            i = 2131826232;
        } else if ((Intrinsics.LJFF(str, "SERVER") || Intrinsics.LJFF(str, "PROGRESS")) && C13LP.LJJJJ(num, C547120Ld0.LIZIZ)) {
            i = 2131826188;
        } else {
            i = 2131826227;
        }
        return C20642515q3.LJI(i);
    }

    public static String LIZJ(Context context, long j, long j2) {
        AITheaterGenerateConfigExp.AITheaterGenerateConfig aITheaterGenerateConfigLIZ = AITheaterGenerateConfigExp.LIZ();
        if (!aITheaterGenerateConfigLIZ.showRemainTimeEnable) {
            return null;
        }
        if (j2 / LSPassThroughRecordSizeConfig.DEFAULT <= aITheaterGenerateConfigLIZ.showRemainTimeEdge) {
            return null;
        }
        float fMax = Math.max(1.0f, (float) Math.ceil((j / r3) / 60.0f));
        float f = 60;
        float f2 = fMax / f;
        float f3 = 24;
        float f4 = f2 / f3;
        if (f4 >= 1.0f) {
            return context.getString(2131826200, String.valueOf((int) f4), String.valueOf((int) (f2 % f3)), String.valueOf((int) (fMax % f)));
        }
        if (f2 >= 1.0f) {
            return context.getString(2131826201, String.valueOf((int) f2), String.valueOf((int) (fMax % f)));
        }
        return context.getString(2131826202, String.valueOf(Math.max((int) Math.ceil(AITheaterGenerateConfigExp.LIZ().showRemainTimeMin / 60.0f), (int) fMax)));
    }
}
