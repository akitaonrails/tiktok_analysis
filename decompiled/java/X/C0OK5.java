package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0OK5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C0OK5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0OK6.values().length];
        try {
            iArr[C0OK6.INLINE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0OK6.TIPS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0OK6.CONTENT.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
