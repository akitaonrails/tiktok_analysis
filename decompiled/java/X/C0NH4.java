package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.GoldenCacheConfig;

/* JADX INFO: renamed from: X.0NH4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NH4 {
    public static final long LIZ(Aweme aweme) {
        GoldenCacheConfig goldenCacheConfig;
        if (aweme != null && (goldenCacheConfig = aweme.goldenCacheConfig) != null) {
            Long lValueOf = Long.valueOf(goldenCacheConfig.duration);
            if (lValueOf.longValue() > 0) {
                return lValueOf.longValue() * 1000 * 60 * 60;
            }
        }
        return ((Number) C269930Ahz.LIZ.getValue()).longValue();
    }

    public static final long LIZIZ(CacheEntry cacheEntry) {
        Long lValueOf = Long.valueOf(cacheEntry.shelfLifeMS);
        if (lValueOf.longValue() > 0) {
            return lValueOf.longValue();
        }
        return LIZ(cacheEntry.value);
    }
}
