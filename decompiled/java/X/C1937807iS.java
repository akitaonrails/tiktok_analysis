package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07iS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C1937807iS {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1980507pL.values().length];
        try {
            iArr[EnumC1980507pL.PATH_RULE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1980507pL.PARAM_RULE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1980507pL.REGEX_RULE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
