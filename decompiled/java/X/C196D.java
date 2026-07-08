package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.196D, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C196D {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C196B.values().length];
        try {
            iArr[C196B.GIF.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C196B.LOTTIE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
