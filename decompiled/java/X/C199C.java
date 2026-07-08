package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.199C, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C199C {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C199E.values().length];
        try {
            iArr[C199E.SINGLE_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C199E.SINGLE_TASK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
