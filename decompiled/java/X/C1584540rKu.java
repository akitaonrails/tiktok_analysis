package X;

import com.ss.android.ugc.aweme.experiment.TabPreloadTimingConfig;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584540rKu {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(128));

    public static TabPreloadTimingConfig LIZ() {
        return (TabPreloadTimingConfig) LIZ.getValue();
    }

    public static boolean LIZIZ() {
        TabPreloadTimingConfig tabPreloadTimingConfigLIZ;
        if (LIZ() == null) {
            return false;
        }
        TabPreloadTimingConfig tabPreloadTimingConfigLIZ2 = LIZ();
        return ((tabPreloadTimingConfigLIZ2 == null || tabPreloadTimingConfigLIZ2.topTabPreloadConfig == null) && ((tabPreloadTimingConfigLIZ = LIZ()) == null || tabPreloadTimingConfigLIZ.bottomTabPreloadConfig == null)) ? false : true;
    }
}
