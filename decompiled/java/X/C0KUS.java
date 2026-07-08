package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KUS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0KUS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0KUR.values().length];
        try {
            iArr[C0KUR.BEFORE_LOAD_START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0KUR.LOAD_SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0KUR.LOAD_FAIL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0KUR.IS_LOADING.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
