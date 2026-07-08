package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0dJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C1045450dJP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1045470dJR.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC1045470dJR.PROGRESS_25P.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC1045470dJR.PROGRESS_50P.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC1045470dJR.PROGRESS_75P.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
