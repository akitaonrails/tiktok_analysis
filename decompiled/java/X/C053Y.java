package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.053Y, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public /* synthetic */ class C053Y {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC12929054d.values().length];
        try {
            iArr[EnumC12929054d.APP.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC12929054d.COLD_START.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC12929054d.LOGIN.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
