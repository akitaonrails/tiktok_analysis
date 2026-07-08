package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.15sR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public /* synthetic */ class C20657315sR {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC20657015sO.values().length];
        try {
            iArr[EnumC20657015sO.SHOWED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC20657015sO.DISMISSED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC20657015sO.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[EnumC20657015sO.IGNORED.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
