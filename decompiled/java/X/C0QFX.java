package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QFX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public /* synthetic */ class C0QFX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0QFY.values().length];
        try {
            iArr[C0QFY.IS_FOLDED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0QFY.NOT_FOLDED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0QFY.FOLLOW_IS_FOLD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
