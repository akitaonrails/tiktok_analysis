package X;

import android.text.TextUtils;
import com.bytedance.pia.core.cache.IPiaCacheProvider;

/* JADX INFO: renamed from: X.1BNI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BNI {
    public static final boolean LIZ(C1BNJ c1bnj) {
        IPiaCacheProvider.CacheConfig cacheConfig = c1bnj.LIZJ;
        Number number = cacheConfig.expire;
        String str = cacheConfig.version;
        String str2 = c1bnj.LIZIZ;
        if (number == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || number.longValue() <= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }
}
