package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.03xU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public /* synthetic */ class C1011803xU {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1011903xV.values().length];
        try {
            iArr[EnumC1011903xV.LOG_VIEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1011903xV.LOG_WHEN_SHOW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[EnumC1011903xV.SEND_LOG.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
