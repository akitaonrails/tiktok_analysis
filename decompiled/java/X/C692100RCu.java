package X;

import com.ss.android.ugc.feed.performance.FeedComponentPerfSettingsData;
import java.util.List;

/* JADX INFO: renamed from: X.0RCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692100RCu {
    public static final double LIZ;
    public static final List<String> LIZIZ;

    static {
        C01GW c01gw = C692110RCv.LIZIZ;
        LIZ = ((FeedComponentPerfSettingsData) c01gw.getValue()).samplingRate;
        LIZIZ = ((FeedComponentPerfSettingsData) c01gw.getValue()).paramConfig;
    }
}
