package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19JC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C19JC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C19JE.values().length];
        LIZ = iArr;
        try {
            iArr[C19JE.TRANSLATE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[C19JE.SCALE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
