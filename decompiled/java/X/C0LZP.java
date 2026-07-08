package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0LZP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public /* synthetic */ class C0LZP {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0LZU.values().length];
        try {
            iArr[C0LZU.OLD_FRAMEWORK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0LZU.NEW_FRAMEWORK.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0LZU.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
