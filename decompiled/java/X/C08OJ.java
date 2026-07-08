package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08OJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C08OJ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C08OK.values().length];
        try {
            iArr[C08OK.ROW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C08OK.US.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C08OK.EU.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
