package X;

import com.ss.android.ugc.aweme.experiment.FypSlidingToLandingPageConfig;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0S1A, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S1A {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(67));

    public static boolean LIZIZ() {
        FypSlidingToLandingPageConfig fypSlidingToLandingPageConfig = (FypSlidingToLandingPageConfig) LIZ.getValue();
        if (fypSlidingToLandingPageConfig == null || !fypSlidingToLandingPageConfig.isEnable) {
            return false;
        }
        float f = fypSlidingToLandingPageConfig.slideGestureRange;
        return f > 0.0f && f < 1.0f;
    }

    public static boolean LIZ(float f, int i, boolean z) {
        float fLIZLLL = 0.0f;
        if (z) {
            float f2 = i;
            FypSlidingToLandingPageConfig fypSlidingToLandingPageConfig = (FypSlidingToLandingPageConfig) LIZ.getValue();
            if (fypSlidingToLandingPageConfig != null) {
                fLIZLLL = C13LZ.LIZLLL(fypSlidingToLandingPageConfig.slideGestureRange, 0.0f, 1.0f);
            }
            if (f <= f2 * fLIZLLL) {
                return true;
            }
            return false;
        }
        float f3 = i;
        float f4 = 1;
        FypSlidingToLandingPageConfig fypSlidingToLandingPageConfig2 = (FypSlidingToLandingPageConfig) LIZ.getValue();
        if (fypSlidingToLandingPageConfig2 != null) {
            fLIZLLL = C13LZ.LIZLLL(fypSlidingToLandingPageConfig2.slideGestureRange, 0.0f, 1.0f);
        }
        if (f >= f3 * (f4 - fLIZLLL)) {
            return true;
        }
        return false;
    }
}
