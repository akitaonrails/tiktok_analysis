package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.model.PaidContentVideoListResponse;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0s33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611910s33 {
    public static final C1611910s33 LIZ = new C1611910s33();
    public static final LruCache<Pair<Long, Integer>, Pair<PaidContentVideoListResponse, Long>> LIZIZ;
    public static final LruCache<Long, Integer> LIZJ;

    static {
        C13LE.LIZ(C1611910s33.class).LJI();
        LIZIZ = new LruCache<>(3);
        LIZJ = new LruCache<>(3);
    }

    public static void LIZ(long j) {
        for (Pair<Long, Integer> pair : LIZIZ.snapshot().keySet()) {
            if (pair.getFirst().longValue() == j) {
                LIZIZ.remove(pair);
            }
        }
    }
}
