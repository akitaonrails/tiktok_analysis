package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03MA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C03MA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C03M9.values().length];
        try {
            iArr[C03M9.NO_ADDRESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C03M9.INVALID_ADDRESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C03M9.NO_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C03M9.INVALID_PAYMENT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
