package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streaming.api.RetryStrategyComponent;

/* JADX INFO: renamed from: X.0ZgX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public /* synthetic */ class C906030ZgX {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[RetryStrategyComponent.values().length];
        try {
            iArr[RetryStrategyComponent.FIXED_DELAY.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            iArr[RetryStrategyComponent.IMMEDIATE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            iArr[RetryStrategyComponent.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        LIZ = iArr;
    }
}
