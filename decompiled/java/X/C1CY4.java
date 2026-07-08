package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1CY4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public /* synthetic */ class C1CY4 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1CXI.values().length];
        try {
            iArr[C1CXI.Unknown.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1CXI.Guest.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1CXI.Host.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
