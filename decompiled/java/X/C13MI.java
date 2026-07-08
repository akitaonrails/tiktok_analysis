package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13MI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public /* synthetic */ class C13MI {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C13MH.values().length];
        try {
            iArr[C13MH.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C13MH.INFO.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C13MH.DEBUG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
