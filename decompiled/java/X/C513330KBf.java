package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KBf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C513330KBf {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC513410KBn.values().length];
        try {
            iArr[EnumC513410KBn.INCORRECT_TIKTOK_OR_GP_ACCOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC513410KBn.INCORRECT_GP_ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
