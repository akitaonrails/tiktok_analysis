package X;

import com.bytedance.crash.monitor.CacheManager;
import com.bytedance.crash.monitor.k;
import java.util.Map;

/* JADX INFO: renamed from: X.0VeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802790VeP extends C802680VeE {
    public static final C802410Vdn LJIILL = new C802410Vdn();

    @Override // com.bytedance.crash.monitor.f
    public Map<String, Object> LIZJ() {
        return null;
    }

    public C802790VeP() {
        super(LJIILL);
    }

    @Override // com.bytedance.crash.monitor.f
    public final RunnableC801900Vcy LJ() {
        RunnableC801900Vcy runnableC801900VcyLIZJ = k.LIZJ();
        runnableC801900VcyLIZJ.LLILZ = this;
        return runnableC801900VcyLIZJ;
    }

    public final C803540Vfc LJIIZILJ(long j) {
        CacheManager cacheManager = this.LJIIL;
        if (cacheManager.LJFF == null) {
            cacheManager.LJFF = CacheManager.CachedVersion.getCurrent(cacheManager.LIZ);
        }
        return cacheManager.LJFF.getAfter(cacheManager.LIZ, j);
    }

    public C802790VeP(String str, String str2, long j) {
        super(LJIILL, str, str2, j);
        C0VX9.LJII(j, 0L, 0L, str2);
    }
}
