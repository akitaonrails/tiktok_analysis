package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1A15, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public /* synthetic */ class C1A15 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1A14.values().length];
        try {
            iArr[C1A14.INIT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1A14.INIT_FOLD_RECHARGE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1A14.INIT_FOLD_EXCHANGE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C1A14.FOLD.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        try {
            iArr[C1A14.UNFOLD.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        try {
            iArr[C1A14.NO_FOLD.ordinal()] = 6;
        } catch (NoSuchFieldError e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        LIZ = iArr;
    }
}
