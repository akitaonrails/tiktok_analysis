package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C03YZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC861003Ya.values().length];
        try {
            iArr[EnumC861003Ya.ENABLE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC861003Ya.ADD.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC861003Ya.ENABLE_AND_ADD.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC861003Ya.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
