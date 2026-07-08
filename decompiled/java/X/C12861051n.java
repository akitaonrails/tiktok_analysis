package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.051n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12861051n {
    public static final C12861051n LIZIZ = new C12861051n();
    public final Map<String, Long> LIZ = new LinkedHashMap();

    public final void LIZ(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((LinkedHashMap) this.LIZ).clear();
            Map<String, Long> map = this.LIZ;
            if (map != null) {
                map.put("player_try_play", Long.valueOf(jElapsedRealtime));
            }
        }
    }
}
