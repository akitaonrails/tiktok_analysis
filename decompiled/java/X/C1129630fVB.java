package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0fVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1129630fVB {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1129590fV7.values().length];
        try {
            iArr[EnumC1129590fV7.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1129590fV7.READY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1129590fV7.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC1129590fV7.IDLE.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
