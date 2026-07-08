package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0r1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1572410r1L {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1582650rHr.values().length];
        try {
            iArr[EnumC1582650rHr.POLLING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1582650rHr.HIGH_VALUE_FOLLOW_RELATIONSHIP.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
