package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZZW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0ZZW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0ZZV.values().length];
        try {
            iArr[C0ZZV.ERROR_CODE_AGE_RESTRICTION.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_LCC_RESTRICTION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_REGION_BLOCK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_RESTRICTED_MODE_CHILD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_RESTRICTED_MODE_PARENT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_EC_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_EC_LIMIT_RM_PARENT.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr[C0ZZV.ERROR_CODE_EC_LIMIT_RM_CHILD.ordinal()] = 8;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        LIZ = iArr;
    }
}
