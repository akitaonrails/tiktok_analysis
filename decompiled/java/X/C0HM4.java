package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HM4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C0HM4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0HM5.values().length];
        try {
            iArr[C0HM5.FLASH_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0HM5.FLASH_ON.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0HM5.FLASH_AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
