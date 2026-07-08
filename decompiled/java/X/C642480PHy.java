package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0PHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C642480PHy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC642470PHx.values().length];
        try {
            iArr[EnumC642470PHx.REBIND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC642470PHx.OUT_LOAD_MORE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC642470PHx.INNER_LOAD_MORE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
