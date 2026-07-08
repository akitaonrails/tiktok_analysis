package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.04CE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C04CE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C04CF.values().length];
        try {
            iArr[C04CF.REVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C04CF.DESCRIPTION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
