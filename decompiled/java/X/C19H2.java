package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19H2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C19H2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C19H3.values().length];
        try {
            iArr[C19H3.SAMPLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C19H3.ENABLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C19H3.DISABLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
