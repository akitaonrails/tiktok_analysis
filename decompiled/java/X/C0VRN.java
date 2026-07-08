package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VRN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public /* synthetic */ class C0VRN {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0VRM.values().length];
        try {
            iArr[C0VRM.CONTRAST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0VRM.CURRENT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
