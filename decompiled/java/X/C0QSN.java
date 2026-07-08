package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QSN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C0QSN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0QSM.values().length];
        try {
            iArr[C0QSM.NOT_FROM_MALL_UG_OR_REVERT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0QSM.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0QSM.GO_TO_GENERAL_SEARCH.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[C0QSM.GO_TO_MALL_SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
