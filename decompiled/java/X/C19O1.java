package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19O1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C19O1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C19O3.values().length];
        try {
            iArr[C19O3.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C19O3.WRAP_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C19O3.MATCH_PARENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C19O3.MATCH_CONSTRAINT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
