package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0EnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C375210EnP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC375200EnO.values().length];
        try {
            iArr[EnumC375200EnO.MODE_9_16.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC375200EnO.MODE_3_4.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC375200EnO.MODE_1_1.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC375200EnO.MODE_4_3.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC375200EnO.MODE_16_9.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC375200EnO.FREE.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC375200EnO.ORIGIN.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
