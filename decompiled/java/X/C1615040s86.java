package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.model.VipSubscriptionCycleType;

/* JADX INFO: renamed from: X.0s86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public /* synthetic */ class C1615040s86 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[VipSubscriptionCycleType.values().length];
        try {
            iArr[VipSubscriptionCycleType.SUBSCRIPTION_CYCLE_TYPE_WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[VipSubscriptionCycleType.SUBSCRIPTION_CYCLE_TYPE_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        LIZ = iArr;
    }
}
