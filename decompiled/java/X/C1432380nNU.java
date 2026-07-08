package X;

import com.ss.android.ugc.aweme.experiment.StoryWeakNetworkImageWebpConfig;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nNU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432380nNU {
    public static final StoryWeakNetworkImageWebpConfig LIZ = new StoryWeakNetworkImageWebpConfig(false, 0, false, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(63));

    public static final boolean LIZ(long j) {
        int i;
        StoryWeakNetworkImageWebpConfig storyWeakNetworkImageWebpConfig = (StoryWeakNetworkImageWebpConfig) LIZIZ.getValue();
        if (storyWeakNetworkImageWebpConfig.enable && storyWeakNetworkImageWebpConfig.useWebpOnWeakNetwork && (i = storyWeakNetworkImageWebpConfig.speedThresholdKbps) > 0 && j > 0 && j < i) {
            return true;
        }
        return false;
    }
}
