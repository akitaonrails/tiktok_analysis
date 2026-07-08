package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCBusinessType;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;

/* JADX INFO: renamed from: X.0Erm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377920Erm {
    public static final AIGCGenerationParam LIZ(AIGCGenerationParam aIGCGenerationParam, int i) {
        if (i <= 0 || aIGCGenerationParam.businessType != AIGCBusinessType.AI_EXTEND || aIGCGenerationParam.maxPipAppendDurationMs == i) {
            return aIGCGenerationParam;
        }
        return AIGCGenerationParam.LIZ(aIGCGenerationParam, null, null, null, null, null, null, false, i, false, null, null, null, null, -131073, 7);
    }
}
