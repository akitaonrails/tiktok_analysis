package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Qgi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676820Qgi {
    public long LIZLLL;
    public int LJFF;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIZILJ;
    public final String LIZ = "performance";
    public final String LIZIZ = "performance_step";
    public String LIZJ = "shop_search_result";
    public final ConcurrentHashMap<String, Integer> LJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LJII = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LJIIIIZZ = new ConcurrentHashMap<>();
    public int LJIIL = -1;
    public String LJIILIIL = "";
    public String LJIILJJIL = "";
    public String LJIILL = "";
    public final int LJIILLIIL = 1;
    public Map<String, Long> LJIJ = new LinkedHashMap();
    public String LJIJI = "";
    public String LJIJJ = "";
    public Map<String, Long> LJIJJLI = new LinkedHashMap();
    public Map<String, Long> LJIL = new LinkedHashMap();

    public final void LIZ(long j, String str) {
        Long lValueOf = Long.valueOf(j - this.LIZLLL);
        ConcurrentHashMap<String, Long> concurrentHashMap = this.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_render");
        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), lValueOf);
    }
}
