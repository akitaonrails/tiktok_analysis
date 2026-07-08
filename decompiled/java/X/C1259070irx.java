package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0irx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1259070irx {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1259080iry.values().length];
        try {
            iArr[EnumC1259080iry.NORMAL_POST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1259080iry.PRIVATE_POST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1259080iry.REPOST_TAB.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1259080iry.COLLECT_TAB.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1259080iry.LIKE_TAB.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[EnumC1259080iry.CAMEO_TAB.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        try {
            iArr[EnumC1259080iry.UNKNOWN.ordinal()] = 7;
        } catch (NoSuchFieldError e7) {
            TryCatchGuardChecker.doCheck(e7);
        }
        LIZ = iArr;
    }
}
