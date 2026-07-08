package X;

import com.ss.android.ugc.aweme.search.service.ecom.ab.LynxPrefetchConfig;

/* JADX INFO: renamed from: X.0P5N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P5N {
    public static final C0P5N LIZ = new C0P5N();
    public static final LynxPrefetchConfig LIZIZ;

    static {
        LynxPrefetchConfig lynxPrefetchConfig = new LynxPrefetchConfig(false, false, false, 0L, false, 8, false);
        LynxPrefetchConfig lynxPrefetchConfig2 = (LynxPrefetchConfig) C0C64.LJIILLIIL().LJJII(LynxPrefetchConfig.class, lynxPrefetchConfig, "search_new_preload_lynx", true);
        if (lynxPrefetchConfig2 != null) {
            lynxPrefetchConfig = lynxPrefetchConfig2;
        }
        LIZIZ = lynxPrefetchConfig;
    }
}
