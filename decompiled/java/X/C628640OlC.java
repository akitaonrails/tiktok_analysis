package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.search.pages.result.entitycard.config.CacheConfig;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OlC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628640OlC {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(368));
    public static final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public static final ConcurrentHashMap<String, C01S9<C0O7A<C628380Okm>>> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(369));

    public static C0O7A LIZ(String str) {
        C01GW c01gw = C628660OlE.LIZIZ;
        if (!((CacheConfig) c01gw.getValue()).enableCache) {
            return null;
        }
        C01GW c01gw2 = LIZ;
        C628650OlD c628650OlD = (C628650OlD) ((LruCache) c01gw2.getValue()).get(str);
        if (c628650OlD == null) {
            return null;
        }
        if (System.currentTimeMillis() - c628650OlD.LIZIZ > ((CacheConfig) c01gw.getValue()).cacheExpireTime) {
            ((LruCache) c01gw2.getValue()).remove(str);
            return null;
        }
        return c628650OlD.LIZ;
    }
}
