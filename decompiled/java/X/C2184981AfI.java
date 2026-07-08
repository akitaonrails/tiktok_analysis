package X;

import android.os.SystemClock;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1AfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184981AfI {
    public final double LIZ;
    public final ThreadLocal<C2185011AfL> LIZIZ = new ThreadLocal<>();
    public final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();
    public final Set<String> LIZLLL = ConcurrentHashMap.newKeySet();
    public final Set<String> LJ = ConcurrentHashMap.newKeySet();

    public C2184981AfI(double d) {
        this.LIZ = d;
    }

    public final void LIZ(String str) {
        if (str != null && str.length() != 0) {
            this.LIZIZ.set(new C2185011AfL(SystemClock.currentThreadTimeMillis(), SystemClock.elapsedRealtime(), str));
        }
    }
}
