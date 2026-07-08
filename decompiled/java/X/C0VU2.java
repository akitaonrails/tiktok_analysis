package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VU2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0VU2 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0VU1.values().length];
        try {
            iArr[C0VU1.IO.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0VU1.CPU.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
