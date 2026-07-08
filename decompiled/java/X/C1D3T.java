package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1D3T, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C1D3T {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1D3S.values().length];
        try {
            iArr[C1D3S.PRE_LAYOUT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1D3S.PRE_DECODE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1D3S.PRELOAD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C1D3S.SSR.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
