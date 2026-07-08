package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.VipSubscriptionStatus;

/* JADX INFO: renamed from: X.0s7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1614650s7T {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VipSubscriptionStatus.values().length];
        try {
            iArr[VipSubscriptionStatus.SUBSCRIPTION_STATUS_ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VipSubscriptionStatus.SUBSCRIPTION_STATUS_CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[VipSubscriptionStatus.SUBSCRIPTION_STATUS_EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        try {
            iArr[VipSubscriptionStatus.SUBSCRIPTION_STATUS_EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        LIZ = iArr;
    }
}
