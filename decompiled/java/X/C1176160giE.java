package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0giE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public /* synthetic */ class C1176160giE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1176180giG.values().length];
        try {
            iArr[EnumC1176180giG.NO_INTERNET.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1176180giG.SOMETHING_WRONG.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1176180giG.EMPTY.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1176180giG.FAR_FROM_HOTEL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
