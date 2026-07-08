package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0iOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1241080iOw {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1241070iOv.values().length];
        try {
            iArr[EnumC1241070iOv.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1241070iOv.INIT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1241070iOv.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1241070iOv.NO_RESULT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[EnumC1241070iOv.FAIL.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
