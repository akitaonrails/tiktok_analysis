package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15V5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C15V5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C15V4.values().length];
        try {
            iArr[C15V4.PAGE_BUILD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C15V4.PAGE_APPEAR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C15V4.DATA_BUILD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
