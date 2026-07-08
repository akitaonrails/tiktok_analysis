package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OYS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public /* synthetic */ class C0OYS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0OYT.values().length];
        try {
            iArr[C0OYT.STATUS_EXPAND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0OYT.STATUS_EXPAND_MORE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0OYT.STATUS_COLLAPSE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0OYT.STATUS_LOADING.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C0OYT.STATUS_INVISIBLE.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        LIZ = iArr;
    }
}
