package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0otd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1490750otd {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1490770otf.values().length];
        try {
            iArr[EnumC1490770otf.D.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1490770otf.E.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1490770otf.W.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1490770otf.V.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
