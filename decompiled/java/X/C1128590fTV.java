package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fTV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128590fTV {
    public static int LIZJ;
    public static int LJ;
    public static long LJFF;
    public static int LJI;
    public static int LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static long LJIILIIL;
    public static long LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static long LJJ;
    public static long LJJI;
    public static long LJJIFFI;
    public static long LJJII;
    public static long LJJIII;
    public static long LJJIIJ;
    public static int LJJIIJZLJL;
    public static int LJJIIZ;
    public static int LJJIIZI;
    public static int LJJIJ;
    public static int LJJIJIIJI;
    public static int LJJIJLIJ;
    public static long LJJIL;
    public static long LJJIZ;
    public static long LJJJ;
    public static final C1128590fTV LIZ = new C1128590fTV();
    public static final ConcurrentHashMap<Integer, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZLLL = "";
    public static boolean LJIIL = true;
    public static final HashMap<Long, Boolean> LJJIJIIJIL = new HashMap<>();
    public static final HashMap<Long, Boolean> LJJIJIL = new HashMap<>();
    public static final HashMap<Long, Boolean> LJJIJL = new HashMap<>();
    public static long LJJJI = Long.MAX_VALUE;
    public static long LJJJIL = Long.MAX_VALUE;
    public static long LJJJJ = Long.MAX_VALUE;

    public static void LIZ() {
        LJJIII = 0L;
        LJJIIJ = 0L;
        LJJIIJZLJL = 0;
        LJJIIZ = 0;
        LJJIIZI = 0;
        LJJIJ = 0;
        LJJIZ = 0L;
        LJJJ = 0L;
        LJJJI = Long.MAX_VALUE;
        LJJJIL = Long.MAX_VALUE;
        LJJJJ = Long.MAX_VALUE;
        LJJIJIIJI = 0;
        LJJIJIIJIL.clear();
        LJJIJIL.clear();
        LJJIJL.clear();
        LJJIJLIJ = 0;
        LJJIL = 0L;
        LJ = 0;
        LJFF = 0L;
        LJI = 0;
        LJII = 0;
        LIZJ = 0;
        LIZLLL = "";
        LJIIIIZZ = 0L;
        LJIIIZ = 0L;
        LJIIJ = 0L;
        LJIIJJI = 0L;
        LJIILIIL = 0L;
        LJIILJJIL = 0L;
        LJIILL = 0L;
        LJIILLIIL = 0L;
        LJIIZILJ = 0L;
        LJIJ = 0L;
        LJIJI = 0L;
        LJIJJ = 0L;
        LJIJJLI = 0L;
        LJIL = 0L;
        LJJ = 0L;
        LJJI = 0L;
        LJJIFFI = 0L;
        LJJII = 0L;
        LIZIZ.clear();
    }

    public static long LIZJ() {
        return Math.min(LJJJI, Math.min(LJJJJ, LJJJIL)) - C1130100fVw.LIZ.LJII;
    }

    public static String LIZLLL() {
        long j = LJJJI;
        long j2 = LJJJJ;
        if (j <= j2 && j <= LJJJIL) {
            return "success";
        }
        if (j2 <= j && j2 <= LJJJIL) {
            return "panel_dismiss";
        }
        long j3 = LJJJIL;
        return (j3 > j || j3 > j2) ? "success" : "scroll";
    }

    public static final int LIZIZ(int i) {
        Integer num = LIZIZ.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static final void LJ(Map<Integer, Integer> map) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = LIZIZ;
        concurrentHashMap.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Integer) entry.getValue()).intValue() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        concurrentHashMap.putAll(linkedHashMap);
    }
}
