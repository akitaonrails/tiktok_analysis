package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0MJT, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0MJT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0MJU.values().length];
        try {
            iArr[C0MJU.REVERSE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0MJU.FILTER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0MJU.FLASH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0MJU.M_BEAUTY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
