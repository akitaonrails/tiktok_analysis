package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DDA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public /* synthetic */ class C1DDA {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C1DD8.values().length];
        try {
            iArr[C1DD8.LIKE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C1DD8.DISLIKE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C1DD8.SWIPE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
