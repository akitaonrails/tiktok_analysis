package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1514630pW9 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1514620pW8.values().length];
        try {
            iArr[EnumC1514620pW8.Info.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1514620pW8.Warn.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1514620pW8.Error.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
