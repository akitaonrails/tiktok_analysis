package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Y7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C869190Y7x {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC869180Y7w.values().length];
        try {
            iArr[EnumC869180Y7w.SUCCESS_WITH_SAVED_MSG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC869180Y7w.SUCCESS_WITH_SAVED_MSG_TOO_NEW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC869180Y7w.SUCCESS_WITH_SAVED_MSG_TOO_OLD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC869180Y7w.SUCCESS_WITHOUT_SAVED_MSG.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC869180Y7w.FAIL_WITH_API_CALL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC869180Y7w.FAIL_WITH_DB_INSERT.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
