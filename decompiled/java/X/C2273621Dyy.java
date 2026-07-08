package X;

import android.os.SystemClock;
import com.bytedance.otis.resource.psi.ResourceContentionConfig;
import com.bytedance.otis.resource.psi.ResourcePsiListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1Dyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273621Dyy {
    public final C2273631Dyz LIZ;
    public final ResourceContentionConfig LIZIZ;
    public final ResourcePsiListener LIZJ;
    public final ConcurrentHashMap<String, C2273681Dz4> LIZLLL = new ConcurrentHashMap<>();

    public final void LIZ() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        Iterator<Map.Entry<String, C2273681Dz4>> it2 = this.LIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            if (jUptimeMillis - it2.next().getValue().LIZIZ > this.LIZIZ.sceneMaxMs) {
                it2.remove();
            }
        }
    }

    public final void LIZIZ(C2273651Dz1 c2273651Dz1) {
        for (Map.Entry<String, C2273681Dz4> entry : this.LIZLLL.entrySet()) {
            C2273681Dz4 value = entry.getValue();
            if (value != null) {
                this.LIZLLL.put(entry.getKey(), new C2273681Dz4(value.LIZ.LIZLLL(c2273651Dz1), value.LIZIZ));
            }
        }
    }

    public final void LIZJ(String str, C2214701Bm8 c2214701Bm8) {
        C2273611Dyx c2273611DyxLJIIIIZZ;
        if (str == null) {
            return;
        }
        Set<String> set = this.LIZIZ.sceneAllowList;
        if (set != null && !set.contains(str)) {
            return;
        }
        LIZ();
        if (c2214701Bm8 != null && c2214701Bm8.LIZ()) {
            C2273631Dyz c2273631Dyz = this.LIZ;
            synchronized (c2273631Dyz.LIZ) {
                try {
                    c2273611DyxLJIIIIZZ = new C2273611Dyx(c2214701Bm8.LIZ, c2214701Bm8.LIZIZ, c2273631Dyz.LIZIZ, c2273631Dyz.LIZJ, c2273631Dyz.LIZLLL, c2214701Bm8.LJFF, c2214701Bm8.LIZLLL, c2214701Bm8.LJ, c2214701Bm8.LIZJ, c2214701Bm8.LJI, c2214701Bm8.LJII, c2273631Dyz.LJIIJJI, c2273631Dyz.LJIILIIL, c2273631Dyz.LJIILL, -1L, -1L, -1L, -1L, -1L, -1L, c2273631Dyz.LJIJJ, c2273631Dyz.LJIJJLI, c2273631Dyz.LJIL, c2273631Dyz.LJJ, c2273631Dyz.LJJI, c2273631Dyz.LJJIIZI, c2273631Dyz.LJJIJ, c2273631Dyz.LJJIJIIJI, c2273631Dyz.LJJIJIIJIL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            c2273611DyxLJIIIIZZ = this.LIZ.LJIIIIZZ();
        }
        this.LIZLLL.put(str, new C2273681Dz4(c2273611DyxLJIIIIZZ, SystemClock.uptimeMillis()));
    }

    public C2273621Dyy(C2273631Dyz c2273631Dyz, ResourceContentionConfig resourceContentionConfig, C2273691Dz5 c2273691Dz5) {
        this.LIZ = c2273631Dyz;
        this.LIZIZ = resourceContentionConfig;
        this.LIZJ = c2273691Dz5;
    }
}
