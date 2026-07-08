package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0KuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532520KuY {
    public final C2252321DDq LIZ;
    public final AnonymousClass0951 LIZIZ;
    public int LIZJ;
    public final Set<String> LIZLLL;
    public int LJ;
    public final Map<String, Long> LJFF;
    public final Map<String, Long> LJI;
    public List<String> LJII;
    public Set<String> LJIIIIZZ;

    public C532520KuY() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(0);
        this.LIZ = c2252321DDqLIZ;
        this.LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LIZJ = 1;
        this.LIZLLL = new LinkedHashSet();
        this.LJFF = new LinkedHashMap();
        this.LJI = new LinkedHashMap();
        this.LJII = C13BV.INSTANCE;
        this.LJIIIIZZ = C08CX.INSTANCE;
    }

    public final void LIZ(String str) {
        Long lRemove = this.LJFF.remove(str);
        if (lRemove != null) {
            this.LJI.put(str, Long.valueOf(SystemClock.elapsedRealtime() - lRemove.longValue()));
        }
    }
}
