package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProAIGCStylizedAiStage;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationSubType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Es6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378120Es6 {
    public static final C381600Exi LIZ(AIGCGenerationParam aIGCGenerationParam) {
        EnumC378140Es8 enumC378140Es8;
        String str = aIGCGenerationParam.generateReqKey;
        EnumC378030Erx enumC378030ErxLIZJ = LIZJ(aIGCGenerationParam.mediaType);
        String str2 = aIGCGenerationParam.imagePath;
        String str3 = aIGCGenerationParam.promptDescription;
        StylePrompt stylePrompt = aIGCGenerationParam.stylePrompt;
        C378470Esf c378470Esf = new C378470Esf(stylePrompt.defaultPrompt, stylePrompt.i2iPrompt);
        String str4 = aIGCGenerationParam.styleEffectId;
        int i = aIGCGenerationParam.duration;
        String str5 = aIGCGenerationParam.aspectRatio;
        List<String> list = aIGCGenerationParam.imagePathList;
        EnumC378310EsP enumC378310EsPLIZIZ = LIZIZ(aIGCGenerationParam.subGenerateType);
        boolean z = aIGCGenerationParam.needsFaceDetect;
        boolean z2 = aIGCGenerationParam.shouldPersistImage;
        String str6 = aIGCGenerationParam.rewriteType;
        int i2 = C378130Es7.LIZJ[aIGCGenerationParam.aiCreateStylizedType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    enumC378140Es8 = EnumC378140Es8.STYLIZED_FL2V;
                } else {
                    throw new C1954807lC();
                }
            } else {
                enumC378140Es8 = EnumC378140Es8.STYLIZED_I2V;
            }
        } else {
            enumC378140Es8 = EnumC378140Es8.NONE;
        }
        List<EditorProAIGCStylizedAiStage> list2 = aIGCGenerationParam.stylizedStages;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (EditorProAIGCStylizedAiStage editorProAIGCStylizedAiStage : list2) {
            arrayList.add(new C381710Ext(editorProAIGCStylizedAiStage.getStageIndex(), editorProAIGCStylizedAiStage.getReqKey(), editorProAIGCStylizedAiStage.getReqJson(), editorProAIGCStylizedAiStage.getPromptText(), editorProAIGCStylizedAiStage.getEffectId(), editorProAIGCStylizedAiStage.getOutputCount()));
        }
        return new C381600Exi(str, enumC378030ErxLIZJ, null, str2, str3, c378470Esf, str4, i, str5, list, enumC378310EsPLIZIZ, z, z2, str6, enumC378140Es8, arrayList, null, null, 1572924);
    }

    public static final EnumC378310EsP LIZIZ(AIGCGenerationSubType aIGCGenerationSubType) {
        int i;
        if (aIGCGenerationSubType != null && (i = C378130Es7.LIZIZ[aIGCGenerationSubType.ordinal()]) != -1) {
            if (i == 1) {
                return EnumC378310EsP.AI_TRANSITION;
            }
            throw new C1954807lC();
        }
        return null;
    }

    public static final EnumC378030Erx LIZJ(AIGCGenerationParamType aIGCGenerationParamType) {
        switch (C378130Es7.LIZ[aIGCGenerationParamType.ordinal()]) {
            case 1:
                return EnumC378030Erx.T2I;
            case 2:
                return EnumC378030Erx.I2I;
            case 3:
                return EnumC378030Erx.T2V;
            case 4:
                return EnumC378030Erx.I2V;
            case 5:
                return EnumC378030Erx.FL2V;
            case 6:
                return EnumC378030Erx.V2V;
            default:
                return EnumC378030Erx.NONE;
        }
    }
}
