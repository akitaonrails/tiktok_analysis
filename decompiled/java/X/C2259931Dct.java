package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Dct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C2259931Dct {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC2259921Dcs.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC2259921Dcs.NEVER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[EnumC2259921Dcs.ALWAYS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[EnumC2259921Dcs.EXCEPTZERO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
