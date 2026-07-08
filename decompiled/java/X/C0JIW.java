package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JIW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public /* synthetic */ class C0JIW {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0JIV.values().length];
        try {
            iArr[C0JIV.MUTED_UNDER_REVIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0JIV.UNAUTHORIZED_SOUNDS_REMOVED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C0JIV.COULD_NOT_REMOVE_UNAUTHORIZED_SOUNDS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
