package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0I3T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C0I3T {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0YUT.values().length];
        try {
            iArr[C0YUT.RECALLED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0YUT.NOT_EXIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0YUT.DELETED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0YUT.VIOLATIVE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
