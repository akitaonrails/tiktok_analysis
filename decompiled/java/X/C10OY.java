package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.10OY, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C10OY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C10OZ.values().length];
        try {
            iArr[C10OZ.UNLOGIN.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C10OZ.NEW_USER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C10OZ.OLD_USER.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
