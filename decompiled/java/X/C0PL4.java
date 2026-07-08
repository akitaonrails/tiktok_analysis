package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PL4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C0PL4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0PL5.values().length];
        try {
            iArr[C0PL5.INFLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0PL5.OUTFLOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
