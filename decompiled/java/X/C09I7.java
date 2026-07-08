package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09I7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public /* synthetic */ class C09I7 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C09I6.values().length];
        try {
            iArr[C09I6.START.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C09I6.COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C09I6.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
