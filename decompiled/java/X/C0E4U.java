package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0E4U, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public /* synthetic */ class C0E4U {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0E4V.values().length];
        try {
            iArr[C0E4V.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0E4V.CIRCLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0E4V.CIRCLE_V2.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
