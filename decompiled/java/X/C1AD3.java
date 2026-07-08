package X;

import com.ss.android.ugc.aweme.ab.PrewarmConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1AD3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AD3 {
    public static final PrewarmConfig LIZ = new PrewarmConfig(false, false, 3, 3000, 2000, 2, 15000, 80.0f, 1000.0f, Mp4ScreenVideoLoadTimeout.CONTROL, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(74));

    public static PrewarmConfig LIZ() {
        return (PrewarmConfig) LIZIZ.getValue();
    }

    public static long LIZIZ() {
        return LIZ().prewarmMaxAgeMs;
    }
}
