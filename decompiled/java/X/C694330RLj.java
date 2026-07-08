package X;

import com.ss.android.ugc.feed.platform.cell.interact.hotspot.FeedUnifiedSpacingOptimizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RLj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694330RLj {
    public static final C694330RLj LIZ = new C694330RLj();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C694340RLk());

    public static boolean LIZ() {
        FeedUnifiedSpacingOptimizeConfig feedUnifiedSpacingOptimizeConfig = (FeedUnifiedSpacingOptimizeConfig) LIZIZ.getValue();
        if (feedUnifiedSpacingOptimizeConfig != null) {
            return Intrinsics.LJFF(feedUnifiedSpacingOptimizeConfig.enableAdjustTiming, Boolean.TRUE);
        }
        return false;
    }
}
