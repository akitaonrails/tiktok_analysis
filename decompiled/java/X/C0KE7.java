package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KE7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0KE7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC514050KDz.values().length];
        try {
            iArr[EnumC514050KDz.PRE_CHECK_STATUS_INCORRECT_APP_STORE_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC514050KDz.PRE_CHECK_STATUS_INCORRECT_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC514050KDz.PRE_CHECK_STATUS_INCORRECT_PAYMENT_CHANNEL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
