package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.199F, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C199F {
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
        try {
            iArr[C199E.STANDARD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
