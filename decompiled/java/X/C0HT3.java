package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HT3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C0HT3 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0HT2.values().length];
        try {
            iArr[C0HT2.IMAGE_FETCH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0HT2.QUOTA_CHECK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0HT2.TNS_CHECK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0HT2.TASK_SUBMISSION.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C0HT2.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C0HT2.NETWORK_EXCEPTION.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
