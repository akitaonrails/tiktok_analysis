package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JHO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0JHO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0JHN.values().length];
        try {
            iArr[C0JHN.NEW_TASK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0JHN.RESTART_FAILED_TASK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
