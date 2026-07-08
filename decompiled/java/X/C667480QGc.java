package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C667480QGc {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0QGW.values().length];
        try {
            iArr[C0QGW.ROUND.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0QGW.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
