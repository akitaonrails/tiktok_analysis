package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01FO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C01FO {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C01FV.values().length];
        try {
            iArr[C01FV.GUEST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C01FV.AUDIENCE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
