package X;

import com.facebook.FacebookSdk;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1BJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJ6 {
    public final synchronized C1489030oqr LIZ() {
        C1BJK c1bjk = (C1BJK) ((ConcurrentHashMap) C1BJL.LIZJ).get(FacebookSdk.LIZLLL());
        if (c1bjk == null) {
            return C1489030oqr.LJI.LIZ();
        }
        return c1bjk.LJ;
    }
}
