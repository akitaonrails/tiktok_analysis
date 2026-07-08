package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParamType;

/* JADX INFO: renamed from: X.0EtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C378950EtR {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[C0E9W.values().length];
        try {
            iArr[C0E9W.AI_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0E9W.AI_EXTEND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC379010EtX.values().length];
        try {
            iArr2[EnumC379010EtX.INIT.ordinal()] = 1;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr2[EnumC379010EtX.INIT_OTHER.ordinal()] = 2;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr2[EnumC379010EtX.GENERATE_CLICKED.ordinal()] = 3;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr2[EnumC379010EtX.GENERATE_FAIL.ordinal()] = 4;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[AIGCGenerationParamType.values().length];
        try {
            iArr3[AIGCGenerationParamType.T2V_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr3[AIGCGenerationParamType.I2V_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr3[AIGCGenerationParamType.FL2V_TYPE.ordinal()] = 3;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        LIZJ = iArr3;
    }
}
