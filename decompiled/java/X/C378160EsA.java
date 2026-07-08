package X;

import Y.AComparatorS24S0000000_5;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCTemplateModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AICreateStylizedType;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378160EsA {
    public static final C378160EsA LIZ = new C378160EsA();

    public static List LIZJ(EditorProAIGCTemplateModel editorProAIGCTemplateModel) {
        EditorProAIGCStylizedAiStage next;
        EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStageCopy;
        if (editorProAIGCTemplateModel != null && editorProAIGCTemplateModel.getAiCreateStylizedType() != 0) {
            Iterator<EditorProAIGCStylizedAiStage> it2 = editorProAIGCTemplateModel.getStylizedAiStages().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getStageIndex() == 0) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStage = next;
            if (editorProAIGCStylizedAiStage == null) {
                editorProAIGCStylizedAiStage = (EditorProAIGCStylizedAiStage) C13LP.LJJJLL(editorProAIGCTemplateModel.getStylizedAiStages());
            }
            if (editorProAIGCStylizedAiStage != null && (editorProAIGCStylizedAiStageCopy = editorProAIGCStylizedAiStage.copy(0, editorProAIGCStylizedAiStage.reqKey, editorProAIGCStylizedAiStage.reqJson, editorProAIGCStylizedAiStage.promptText, editorProAIGCStylizedAiStage.effectId, editorProAIGCStylizedAiStage.outputCount)) != null) {
                if (editorProAIGCTemplateModel != null) {
                    String reqKey = editorProAIGCTemplateModel.getAlgoRaw().getReqKey();
                    if ((!a0.LJJJIL(reqKey)) && reqKey != null) {
                        String reqJson = editorProAIGCTemplateModel.getAlgoRaw().getReqJson();
                        if (a0.LJJJIL(reqJson)) {
                            reqJson = "{}";
                        }
                        String prompt = editorProAIGCTemplateModel.getPrompt();
                        String effectId = editorProAIGCStylizedAiStageCopy.getEffectId();
                        if (!(!a0.LJJJIL(effectId)) || effectId == null) {
                            effectId = CardStruct.IStatusCode.DEFAULT;
                        }
                        return C1697810uHb.LJIIJJI(editorProAIGCStylizedAiStageCopy, new EditorProAIGCStylizedAiStage(1, reqKey, reqJson, prompt, effectId, 1));
                    }
                }
                return C13BV.INSTANCE;
            }
        }
        return C13BV.INSTANCE;
    }

    public static void LIZ(List list, JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        for (EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStage : C13LP.LJLLLL(new AComparatorS24S0000000_5(149), list)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("stage_index", editorProAIGCStylizedAiStage.getStageIndex());
            jSONObject2.put("req_key", editorProAIGCStylizedAiStage.getReqKey());
            jSONObject2.put("req_json", editorProAIGCStylizedAiStage.getReqJson());
            jSONObject2.put("prompt_text", editorProAIGCStylizedAiStage.getPromptText());
            jSONObject2.put("output_count", editorProAIGCStylizedAiStage.getOutputCount());
            if (!a0.LJJJIL(editorProAIGCStylizedAiStage.getEffectId())) {
                jSONObject2.put("effect_id", editorProAIGCStylizedAiStage.getEffectId());
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("stages", jSONArray);
    }

    public static boolean LIZIZ(EditorProAIGCTemplateModel editorProAIGCTemplateModel, Set set, C0CI4 c0ci4) {
        boolean z;
        int aiCreateStylizedType;
        if (c0ci4 == null) {
            z = true;
        } else {
            z = !C0CI3.LIZ().contains(c0ci4.getSceneName());
        }
        if (!z || LIZJ(editorProAIGCTemplateModel).size() < 2) {
            return false;
        }
        C378190EsD c378190EsD = AICreateStylizedType.Companion;
        if (editorProAIGCTemplateModel != null) {
            aiCreateStylizedType = editorProAIGCTemplateModel.getAiCreateStylizedType();
        } else {
            aiCreateStylizedType = 0;
        }
        c378190EsD.getClass();
        int i = C378180EsC.LIZ[C378190EsD.LIZ(aiCreateStylizedType).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return set.contains(Integer.valueOf(C0CIJ.UGC_AI_CREATE_STYLIZED_FL2V.getValue()));
        }
        return set.contains(Integer.valueOf(C0CIJ.UGC_AI_CREATE_STYLIZED_I2V.getValue()));
    }
}
