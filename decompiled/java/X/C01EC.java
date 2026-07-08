package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01EC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C01EC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C01EB.values().length];
        try {
            iArr[C01EB.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C01EB.ONGOING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C01EB.FINISH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
