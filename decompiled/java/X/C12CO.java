package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.12CO, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public /* synthetic */ class C12CO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C12CP.values().length];
        try {
            iArr[C12CP.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C12CP.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
