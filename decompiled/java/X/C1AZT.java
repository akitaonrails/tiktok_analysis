package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AZT, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C1AZT {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1AZU.values().length];
        try {
            iArr[C1AZU.Unknown.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1AZU.Inner.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1AZU.Cross.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
