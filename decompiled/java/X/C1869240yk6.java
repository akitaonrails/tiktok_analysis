package X;

import com.ss.android.ugc.aweme.ab.Config;
import com.ss.android.ugc.aweme.ab.PullConfig;
import com.ss.android.ugc.aweme.ab.PullSegment;
import com.ss.android.ugc.aweme.ab.Range;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0yk6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869240yk6 {
    public static final Config LIZ = new Config(false, false, new ArrayList(), new ArrayList());

    public static PullConfig LIZ(int i) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "live_predict_pre_pull_time_exp", true);
        if (config2 != null) {
            config = config2;
        }
        List<PullSegment> list = config.firstPullSegments;
        if (list != null) {
            ArrayList<PullSegment> arrayList = new ArrayList();
            for (PullSegment pullSegment : list) {
                if (pullSegment.range != null) {
                    arrayList.add(pullSegment);
                }
            }
            for (PullSegment pullSegment2 : arrayList) {
                Range range = pullSegment2.range;
                PullConfig pullConfig = pullSegment2.config;
                long j = range.start;
                long j2 = range.end;
                long j3 = i;
                if (j <= j3 && j3 <= j2) {
                    return pullConfig;
                }
            }
            return null;
        }
        return null;
    }
}
