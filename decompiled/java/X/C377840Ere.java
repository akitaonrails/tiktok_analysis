package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;

/* JADX INFO: renamed from: X.0Ere, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C377840Ere {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[AIGCGenerationParamType.values().length];
        try {
            iArr[AIGCGenerationParamType.T2I_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[AIGCGenerationParamType.I2I_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[AIGCGenerationParamType.I2V_TYPE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[AIGCGenerationParamType.FL2V_TYPE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
