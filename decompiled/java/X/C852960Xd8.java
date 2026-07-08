package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Xd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C852960Xd8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC852910Xd3.values().length];
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_FIND_PASSWORD.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_BIND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC852910Xd3.INPUT_PHONE_MODIFY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC852910Xd3.REGISTER_OR_LOGIN_FORCE_VERIFY_PHONE_INPUT_PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
