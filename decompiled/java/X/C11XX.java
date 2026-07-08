package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.11XX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C11XX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C11XV.values().length];
        try {
            iArr[C11XV.CLAIM.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C11XV.FOLLOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C11XV.USE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
