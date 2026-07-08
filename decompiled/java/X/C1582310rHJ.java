package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3FeedsScrollConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rHJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582310rHJ {
    public static final FriendsV3FeedsScrollConfig LIZ = new FriendsV3FeedsScrollConfig(false, 0.76f, 0.0f, 0, 2000, 6000, 1.2f, 1.4f, -1);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(635));

    public static FriendsV3FeedsScrollConfig LIZIZ() {
        return (FriendsV3FeedsScrollConfig) LIZIZ.getValue();
    }

    public static int LIZ(int i) {
        float f;
        int iAbs = Math.abs(i);
        if (LIZIZ().flingStrategy == 1) {
            int i2 = LIZIZ().flingLowThreshold;
            int i3 = LIZIZ().flingHighThreshold;
            if (i3 <= i2 || iAbs <= i2) {
                f = LIZIZ().flingLowFactor;
            } else if (iAbs >= i3) {
                f = LIZIZ().flingHighFactor;
            } else {
                f = (((iAbs - i2) / (i3 - i2)) * (LIZIZ().flingHighFactor - LIZIZ().flingLowFactor)) + LIZIZ().flingLowFactor;
            }
        } else {
            f = LIZIZ().flingFactor;
        }
        int i4 = (int) (i * f);
        int i5 = LIZIZ().flingMaxVelocity;
        if (i5 > 0) {
            return C13LZ.LJ(i4, -i5, i5);
        }
        return i4;
    }
}
