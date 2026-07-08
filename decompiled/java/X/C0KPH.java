package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KPH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0KPH {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[C0KPI.values().length];
        try {
            iArr[C0KPI.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0KPI.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0KPI.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0KPI.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C0KPI.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
        int[] iArr2 = new int[C0KM0.values().length];
        try {
            iArr2[C0KM0.PRE_CHECK_FAILURE.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[C0KM0.PRE_CHECK_ACCOUNT_MISMATCH.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[C0KM0.PRE_CHECK_STORE_ACCOUNT_MISMATCH.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[C0KM0.PRE_CHECK_PAYMENT_METHOD_MISMATCH.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[C0KM0.PRE_CHECK_UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZIZ = iArr2;
    }
}
