package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.config.SearchVideoPrefetchConfig;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Pu1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659590Pu1 {
    public static final C659590Pu1 LIZ = new C659590Pu1();
    public static final SearchVideoPrefetchConfig LIZIZ = new SearchVideoPrefetchConfig(false, false, false, false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(528));

    public static boolean LIZ() {
        C01GW c01gw = LIZJ;
        return (((SearchVideoPrefetchConfig) c01gw.getValue()).enableNormalPrefetch || ((SearchVideoPrefetchConfig) c01gw.getValue()).enablePressedPrefetch || ((SearchVideoPrefetchConfig) c01gw.getValue()).enableNormalPrepare || ((SearchVideoPrefetchConfig) c01gw.getValue()).enablePressedPrepare) ? false : true;
    }
}
