package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0X4P, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0X4P {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0X4Q.values().length];
        try {
            iArr[C0X4Q.RELAUNCH_TASK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0X4Q.RELAUNCH_POPUP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
