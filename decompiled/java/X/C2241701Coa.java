package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Coa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2241701Coa {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC2241721Coc.values().length];
        try {
            iArr[EnumC2241721Coc.TASK_STATUS_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC2241721Coc.TASK_STATUS_IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC2241721Coc.TASK_STATUS_RECALL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC2241721Coc.TASK_STATUS_EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC2241721Coc.TASK_STATUS_UNSUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC2241711Cob.values().length];
        try {
            iArr2[EnumC2241711Cob.TASK_STATUS_UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr2[EnumC2241711Cob.TASK_STATUS_IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        try {
            iArr2[EnumC2241711Cob.TASK_STATUS_RECALL.ordinal()] = 3;
        } catch (NoSuchFieldError e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        try {
            iArr2[EnumC2241711Cob.TASK_STATUS_EXPIRED.ordinal()] = 4;
        } catch (NoSuchFieldError e9) {
            TryCatchGuardChecker.doCheck(e9);
        }
        try {
            iArr2[EnumC2241711Cob.TASK_STATUS_UNSUPPORTED.ordinal()] = 5;
        } catch (NoSuchFieldError e10) {
            TryCatchGuardChecker.doCheck(e10);
        }
        LIZIZ = iArr2;
    }
}
