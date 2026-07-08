package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01EM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C01EM {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C01EL.values().length];
        try {
            iArr[C01EL.START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C01EL.END.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
