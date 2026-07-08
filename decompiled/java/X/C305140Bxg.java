package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExploreHotCacheWeakNetworkConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Bxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305140Bxg {
    public static final ExploreHotCacheWeakNetworkConfig LIZ = new ExploreHotCacheWeakNetworkConfig(false, false, 2, 6, 86400, Mp4ScreenVideoLoadTimeout.CONTROL);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2534));

    public static ExploreHotCacheWeakNetworkConfig LIZ() {
        return (ExploreHotCacheWeakNetworkConfig) LIZIZ.getValue();
    }

    public static final boolean LIZIZ() {
        return LIZ().enable;
    }
}
