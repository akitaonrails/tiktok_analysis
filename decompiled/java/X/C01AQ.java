package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.01AQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class C01AQ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C01AP.values().length];
        try {
            iArr[C01AP.ALL_GIFTS.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C01AP.INCLUDE_HIDDEN_GIFTS.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
