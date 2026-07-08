package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0s7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1614950s7x {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC1614730s7b.values().length];
        try {
            iArr[EnumC1614730s7b.AUTO_RENEW_CANCELED.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[EnumC1614730s7b.ACTIVE_SUBSCRIBER.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
