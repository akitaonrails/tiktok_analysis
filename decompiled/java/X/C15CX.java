package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15CX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C15CX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C15CV.values().length];
        try {
            iArr[C15CV.STRONG_CONTAINER.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C15CV.WEAK_CONTAINER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
