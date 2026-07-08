package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18F8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public /* synthetic */ class C18F8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C18F7.values().length];
        try {
            iArr[C18F7.Background.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C18F7.BackProcess.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
