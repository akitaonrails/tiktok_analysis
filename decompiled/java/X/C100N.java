package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.100N, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public /* synthetic */ class C100N {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C100L.values().length];
        try {
            iArr[C100L.POPUP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C100L.TOAST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
