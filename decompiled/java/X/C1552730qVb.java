package X;

import android.os.SystemClock;
import com.tiktok.geckox.ng.model.Event;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552730qVb {
    public final Event LIZ;
    public final long LIZIZ = SystemClock.elapsedRealtime();
    public long LIZJ;
    public long LIZLLL;
    public Map<C1552740qVc, C1552590qVN> LJ;

    public C1552730qVb(Event event) {
        this.LIZ = event;
    }

    public final C1552590qVN LIZ(C1552740qVc c1552740qVc) {
        Map<C1552740qVc, C1552590qVN> map = this.LJ;
        if (map != null) {
            return (C1552590qVN) ((LinkedHashMap) map).get(c1552740qVc);
        }
        return null;
    }
}
