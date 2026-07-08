package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0bxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public /* synthetic */ class C993690bxv {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC993680bxu.values().length];
        try {
            iArr[EnumC993680bxu.REPOSTED_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC993680bxu.PROFILE_TAB_REPOSTED_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
