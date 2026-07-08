package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C516130KLz {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0KM0.values().length];
        try {
            iArr[C0KM0.PRE_CHECK_ACCOUNT_MISMATCH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0KM0.PRE_CHECK_STORE_ACCOUNT_MISMATCH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0KM0.PRE_CHECK_PAYMENT_METHOD_MISMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
