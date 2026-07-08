package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0E4D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C0E4D {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0E4C.values().length];
        try {
            iArr[C0E4C.VIBRATE_IMPACT_LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0E4C.VIBRATE_NOTIFICATION_ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
