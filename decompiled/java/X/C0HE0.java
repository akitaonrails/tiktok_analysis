package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0HE0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class C0HE0 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC437610HDz.values().length];
        try {
            iArr[EnumC437610HDz.BIG.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC437610HDz.MID_A.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC437610HDz.SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC437610HDz.MID_B.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
