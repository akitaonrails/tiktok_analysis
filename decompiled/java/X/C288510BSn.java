package X;

import com.ss.android.ugc.aweme.search.performance.core.config.SearchPlaybackProgressResetConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C288510BSn {
    public static final SearchPlaybackProgressResetConfig LIZ = new SearchPlaybackProgressResetConfig(0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6178));

    public static boolean LIZ() {
        SearchPlaybackProgressResetConfig searchPlaybackProgressResetConfig = (SearchPlaybackProgressResetConfig) LIZIZ.getValue();
        return searchPlaybackProgressResetConfig != null && searchPlaybackProgressResetConfig.enablePlaybackProgressReset == 1;
    }

    public static boolean LIZIZ() {
        SearchPlaybackProgressResetConfig searchPlaybackProgressResetConfig;
        C01GW c01gw = LIZIZ;
        SearchPlaybackProgressResetConfig searchPlaybackProgressResetConfig2 = (SearchPlaybackProgressResetConfig) c01gw.getValue();
        return searchPlaybackProgressResetConfig2 != null && searchPlaybackProgressResetConfig2.enablePlaybackProgressReset == 1 && (searchPlaybackProgressResetConfig = (SearchPlaybackProgressResetConfig) c01gw.getValue()) != null && searchPlaybackProgressResetConfig.enableShowCoverWhenPause == 1;
    }
}
