package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0IIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C464150IIb {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0IIZ.values().length];
        LIZ = iArr;
        try {
            iArr[C0IIZ.VeLivePlayerRotation90.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[C0IIZ.VeLivePlayerRotation180.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            LIZ[C0IIZ.VeLivePlayerRotation270.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }
}
