package X;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS279S0000000_33;

/* JADX INFO: renamed from: X.1AEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176121AEo {
    public static final LruCache<String, Pair<Bitmap.Config, Map<String, Object>>> LIZ = new LruCache<>(30);
    public static Bitmap.Config LIZIZ;
    public static Map<String, ? extends Object> LIZJ;
    public static final Pair LIZLLL;
    public static long LJ;

    static {
        Bitmap.Config config = Bitmap.Config.RGB_565;
        LIZIZ = config;
        LIZLLL = new Pair(config, null);
    }

    public static Pair LIZ(UrlModel urlModel) {
        String uri;
        String uri2;
        Pair<Bitmap.Config, Map<String, Object>> pair;
        String str = C0B1U.LIZIZ;
        if (C703302op.LIZ(str)) {
            String str2 = "";
            if (urlModel == null || (uri = urlModel.getUri()) == null) {
                uri = "";
            }
            boolean z = C277050AtT.LIZIZ;
            if (z && (pair = LIZ.get(uri)) != null) {
                return pair;
            }
            if (System.currentTimeMillis() - LJ > Mp4ScreenVideoLoadTimeout.CONTROL) {
                C326690CrL.LIZ.runStrategy(new C1306400k6I(str), AFwS279S0000000_33.get$arr$(386));
            }
            if (z) {
                LruCache<String, Pair<Bitmap.Config, Map<String, Object>>> lruCache = LIZ;
                if (urlModel != null && (uri2 = urlModel.getUri()) != null) {
                    str2 = uri2;
                }
                lruCache.put(str2, new Pair<>(LIZIZ, LIZJ));
            }
            return new Pair(LIZIZ, LIZJ);
        }
        return LIZLLL;
    }
}
