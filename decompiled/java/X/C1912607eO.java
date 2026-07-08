package X;

import android.net.Uri;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.07eO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1912607eO {
    public final LruCache<String, Map<String, Object>> LIZ = new LruCache<>(50);

    public final Map<String, Object> LIZ(String str) {
        try {
            Uri uri = UriProtector.parse(str);
            String host = uri.getHost();
            String path = uri.getPath();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(host);
            sbLIZ.append(path);
            return this.LIZ.get(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
