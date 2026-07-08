package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public /* synthetic */ class C1789690wfn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1789700wfo.values().length];
        try {
            iArr[EnumC1789700wfo.PAYMENT_CHANNEL_APPLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1789700wfo.PAYMENT_CHANNEL_CASH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
