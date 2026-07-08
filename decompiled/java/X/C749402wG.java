package X;

import com.ss.android.ugc.aweme.feed.ab.FeedLynxCardConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.02wG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C749402wG {
    public static final FeedLynxCardConfig LIZ = new FeedLynxCardConfig(false, null, 3, null);
    public static final C01GW LIZIZ;
    public static final boolean LIZJ;
    public static final List<Integer> LIZLLL;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(337));
        LIZIZ = c01gwLIZIZ;
        LIZJ = ((FeedLynxCardConfig) c01gwLIZIZ.getValue()).enableFixBindReset;
        LIZLLL = ((FeedLynxCardConfig) c01gwLIZIZ.getValue()).whiteListForIgnoreErrorCode;
    }
}
