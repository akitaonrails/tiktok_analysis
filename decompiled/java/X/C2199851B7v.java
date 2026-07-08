package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1B7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199851B7v {
    public final Map<String, C2199841B7u> LIZ = new HashMap();
    public final Map<String, C2199891B7z> LIZIZ = new LinkedHashMap(3);
    public int LIZJ = 3;

    public final boolean LIZIZ(String str) {
        C2199841B7u c2199841B7u = (C2199841B7u) ((HashMap) this.LIZ).get(str);
        if (c2199841B7u == null) {
            return false;
        }
        if (c2199841B7u.LJII) {
            return true;
        }
        if (System.currentTimeMillis() - c2199841B7u.LJ >= C2199761B7m.LJ || !c2199841B7u.LJI) {
            return false;
        }
        return true;
    }

    public final C2199841B7u LIZ(String str, List<HttpHeader> list) {
        C2199841B7u c2199841B7u;
        synchronized (this.LIZ) {
            try {
                c2199841B7u = (C2199841B7u) ((HashMap) this.LIZ).remove(str);
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (c2199841B7u != null) {
            if (C2199661B7c.LJIILIIL(c2199841B7u.LIZIZ, list)) {
                try {
                    c2199841B7u.LIZLLL();
                } catch (InterruptedException th) {
                }
                if (System.currentTimeMillis() - c2199841B7u.LJ < C2199761B7m.LJ && c2199841B7u.LJI) {
                    return c2199841B7u;
                }
            }
            try {
                c2199841B7u.cancel();
                return null;
            } catch (Throwable th2) {
                return null;
            }
        }
        return null;
    }
}
