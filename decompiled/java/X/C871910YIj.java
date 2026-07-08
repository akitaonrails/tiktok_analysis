package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0YIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C871910YIj {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0YMR.values().length];
        LIZ = iArr;
        try {
            iArr[C0YMR.NEW_DIRECT_PUSH_NOTIFY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[C0YMR.MARK_READ_NOTIFY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[C0YMR.NEW_INPUT_STATUS_NOTIFY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            LIZ[C0YMR.BIZ_DIRECT_PUSH_NOTIFY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
    }
}
