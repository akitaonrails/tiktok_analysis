package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.069G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C069G {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C069H.values().length];
        try {
            iArr[C069H.P0.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C069H.P1.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[C069H.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
