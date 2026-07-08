package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NHG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NHG {
    public static final C0NHH LIZ(CacheEntry cacheEntry) {
        String strLJJZZIII;
        String strLJJLJ;
        C0N9C c0n9c = C0N9C.GOLDEN_HOUSE;
        String str = cacheEntry.key;
        String str2 = cacheEntry.videoFilePath;
        if (str2 != null && (strLJJLJ = a0.LJJLJ('/', str2, "")) != null) {
            strLJJZZIII = a0.LJJZZIII('.', strLJJLJ, "");
        } else {
            strLJJZZIII = null;
        }
        return new C0NHH(c0n9c, str, strLJJZZIII, cacheEntry.value, cacheEntry.source, cacheEntry.shelfLifeMS, cacheEntry.creationDate, cacheEntry, cacheEntry.LIZIZ, cacheEntry.LIZJ);
    }

    public static final CacheEntry LIZIZ(C0NHH c0nhh) {
        Object obj = c0nhh.LJII;
        if (obj instanceof CacheEntry) {
            CacheEntry cacheEntry = (CacheEntry) obj;
            if (cacheEntry == null) {
                return new CacheEntry("", 0L, 0L, null, "", "", 0L, false, false, -1.0f, "", 0);
            }
            return cacheEntry;
        }
        String str = c0nhh.LIZIZ;
        long j = c0nhh.LJI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Aweme aweme = c0nhh.LIZLLL;
        String str2 = c0nhh.LJ;
        if (str2 == null) {
            str2 = "";
        }
        return new CacheEntry(str, j, jCurrentTimeMillis, aweme, "", str2, c0nhh.LJFF, true, false, c0nhh.LJIIIIZZ, c0nhh.LJIIIZ, 0);
    }
}
