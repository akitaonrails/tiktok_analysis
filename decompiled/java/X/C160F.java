package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.160F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C160F {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C160B.values().length];
        try {
            iArr[C160B.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C160B.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
