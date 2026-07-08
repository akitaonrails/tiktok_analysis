package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.159L, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C159L {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C159M.values().length];
        try {
            iArr[C159M.BONUS_IN_PROCESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C159M.TASK_FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C159M.BONUS_FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
