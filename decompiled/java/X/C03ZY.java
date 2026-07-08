package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03ZY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C03ZY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C03ZZ.values().length];
        try {
            iArr[C03ZZ.HIDE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[C03ZZ.EXPAND.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
