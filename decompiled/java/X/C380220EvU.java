package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0EvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380220EvU {
    public static final String LIZ(AIGenerationType aIGenerationType) {
        int i = C380230EvV.LIZ[aIGenerationType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "text_to_video";
                    }
                    throw new C1954807lC();
                }
                return "ai_transition";
            }
            return "image_to_video";
        }
        return "";
    }
}
