package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCPromptInfo;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0EsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378330EsR {
    public static final AIGenerationType LIZ(AIGCPromptInfo aIGCPromptInfo) {
        String str = aIGCPromptInfo.type;
        int iHashCode = str.hashCode();
        if (iHashCode != 102573) {
            if (iHashCode != 113144) {
                if (iHashCode == 3144138 && str.equals("fl2v")) {
                    return AIGenerationType.AI_TRANSITION;
                }
            } else if (str.equals("t2v")) {
                return AIGenerationType.TEXT_TO_VIDEO;
            }
        } else if (str.equals("i2v")) {
            return AIGenerationType.IMAGE_TO_VIDEO;
        }
        return AIGenerationType.NONE;
    }

    public static final AIGCGenerationParam LIZIZ(AIGCGenerationParam aIGCGenerationParam) {
        if (aIGCGenerationParam.businessType != AIGCBusinessType.AI_EXTEND || aIGCGenerationParam.i2vSlotID.length() == 0 || (aIGCGenerationParam.appendMode && aIGCGenerationParam.inheritEditProperties)) {
            return aIGCGenerationParam;
        }
        return AIGCGenerationParam.LIZ(aIGCGenerationParam, null, null, null, null, null, null, true, 0, true, null, null, null, null, -327681, 7);
    }
}
