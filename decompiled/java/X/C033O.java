package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.033O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C033O {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C03CR.values().length];
        try {
            iArr[C03CR.US_COMBINED_SKU.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C03CR.SEA_COMBINED_SKU.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C03CR.US_FULL_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
