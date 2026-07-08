package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.ghouse.cache.GCacheItemMeta;

/* JADX INFO: renamed from: X.0NGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591060NGe extends CacheEntry {
    public final GCacheItemMeta LJ;

    public C591060NGe(GCacheItemMeta gCacheItemMeta) {
        super(gCacheItemMeta.aid, gCacheItemMeta.creationDate, gCacheItemMeta.sortKey, null, gCacheItemMeta.videoFilePath, gCacheItemMeta.source, gCacheItemMeta.shelfLifeMS, false, false, gCacheItemMeta.sortScore, gCacheItemMeta.sortSnapshot, gCacheItemMeta.cacheBitrate);
        this.LJ = gCacheItemMeta;
    }
}
