package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;

/* JADX INFO: renamed from: X.0FOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C389480FOw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AIGenerationType.values().length];
        try {
            iArr[AIGenerationType.IMAGE_TO_VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AIGenerationType.AI_TRANSITION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
