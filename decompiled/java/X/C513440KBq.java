package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C513440KBq {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC513420KBo.values().length];
        try {
            iArr[EnumC513420KBo.INCORRECT_TIKTOK_OR_GP_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC513420KBo.INCORRECT_GP_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC513420KBo.INCORRECT_PAYMENT_CHANNEL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC513420KBo.INCORRECT_PRECHECK_UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
