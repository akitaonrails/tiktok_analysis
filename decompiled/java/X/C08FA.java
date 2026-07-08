package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08FA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08FA {
    public static final LruCache<Uri, Map<String, String>> LIZ = new LruCache<>(((Number) C275170AqR.LIZJ.getValue()).intValue());
    public static final Map<String, String> LIZIZ = Collections.emptyMap();
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static volatile boolean LJ = false;
    public static volatile boolean LJFF = false;

    public static Map LIZ(Uri uri) {
        Map<String, String> map;
        if (uri == null) {
            return LIZIZ;
        }
        LruCache<Uri, Map<String, String>> lruCache = LIZ;
        synchronized (lruCache) {
            try {
                Map<String, String> map2 = lruCache.get(uri);
                if (map2 != null) {
                    return map2;
                }
                try {
                    String encodedQuery = uri.getEncodedQuery();
                    if (TextUtils.isEmpty(encodedQuery)) {
                        synchronized (lruCache) {
                            try {
                                map = LIZIZ;
                                lruCache.put(uri, map);
                            } finally {
                            }
                        }
                        return map;
                    }
                    HashMap map3 = new HashMap();
                    for (String str : encodedQuery.split("&")) {
                        int iIndexOf = str.indexOf("=");
                        if (iIndexOf != -1) {
                            map3.put(Uri.decode(str.substring(0, iIndexOf)), Uri.decode(str.substring(iIndexOf + 1)));
                        } else {
                            map3.put(Uri.decode(str), "");
                        }
                    }
                    LruCache<Uri, Map<String, String>> lruCache2 = LIZ;
                    synchronized (lruCache2) {
                        try {
                            lruCache2.put(uri, map3);
                        } finally {
                        }
                    }
                    return map3;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return LIZIZ;
                }
                TryCatchGuardChecker.doCheck(e);
                return LIZIZ;
            } finally {
            }
        }
    }
}
