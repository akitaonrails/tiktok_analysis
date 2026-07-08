package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.067M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C067M {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C067L.values().length];
        try {
            iArr[C067L.SINGLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C067L.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C067L.BUSINESS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
