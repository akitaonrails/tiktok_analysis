package X;

import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0PBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C640690PBb {
    public static final C640690PBb LIZ = new C640690PBb();
    public static final AsyncLoadConfig LIZIZ;

    static {
        AsyncLoadConfig asyncLoadConfig = new AsyncLoadConfig(false, false, false, false, false, false, true, null, null, new HashSet(), 50L, 20, 2, 0L);
        AsyncLoadConfig asyncLoadConfig2 = (AsyncLoadConfig) C0C64.LJIILLIIL().LJJII(AsyncLoadConfig.class, asyncLoadConfig, "search_async_preload", true);
        if (asyncLoadConfig2 != null) {
            asyncLoadConfig = asyncLoadConfig2;
        }
        LIZIZ = asyncLoadConfig;
    }
}
