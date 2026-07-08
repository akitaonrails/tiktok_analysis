package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DHC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C0DHC {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C0DHB.values().length];
        try {
            iArr[C0DHB.IN_FLOW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C0DHB.OUT_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
