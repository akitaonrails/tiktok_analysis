package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C2215471BnN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2215461BnM.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC2215461BnM.INT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC2215461BnM.FLOAT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
