package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0iL8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1238720iL8 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1238710iL7.values().length];
        try {
            iArr[EnumC1238710iL7.GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1238710iL7.REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1238710iL7.NOT_DETERMINED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
