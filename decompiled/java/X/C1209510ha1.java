package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.InsightsEligibilityStatus;

/* JADX INFO: renamed from: X.0ha1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public /* synthetic */ class C1209510ha1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[InsightsEligibilityStatus.values().length];
        LIZ = iArr;
        try {
            iArr[InsightsEligibilityStatus.NOT_AVAILABLE_NEW.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            LIZ[InsightsEligibilityStatus.NOT_AVAILABLE_TTL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
