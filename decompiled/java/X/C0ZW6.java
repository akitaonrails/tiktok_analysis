package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0ZW6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C0ZW6 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0ZW4.values().length];
        try {
            iArr[C0ZW4.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0ZW4.BLUR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0ZW4.MOSAIC.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
