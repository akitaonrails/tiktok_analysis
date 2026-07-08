package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0zsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912930zsZ {
    public static final C1912930zsZ LIZ = new C1912930zsZ();
    public static final Map<C10NW, C1912940zsa> LIZIZ = new LinkedHashMap();
    public static long LIZJ;
    public static long LIZLLL;

    public static C1912940zsa LIZ(C10NW c10nw) {
        Map<C10NW, C1912940zsa> map = LIZIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        if (linkedHashMap.get(c10nw) == null) {
            map.put(c10nw, new C1912940zsa(0));
        }
        return (C1912940zsa) linkedHashMap.get(c10nw);
    }

    public static void LIZIZ(C1912950zsb c1912950zsb) {
        if (c1912950zsb == null || c1912950zsb.LIZJ > 0) {
            return;
        }
        c1912950zsb.LIZJ = SystemClock.elapsedRealtime();
    }

    public static void LIZJ(C1912950zsb c1912950zsb) {
        if (c1912950zsb == null || c1912950zsb.LIZIZ > 0) {
            return;
        }
        c1912950zsb.LIZIZ = SystemClock.elapsedRealtime();
    }

    public static void LIZLLL(C10NW c10nw) {
        LinkedHashMap linkedHashMap;
        C1912940zsa c1912940zsaLIZ = LIZ(c10nw);
        if (c1912940zsaLIZ != null) {
            if (c1912940zsaLIZ.LJIIIIZZ) {
                return;
            }
            LIZ.getClass();
            linkedHashMap = new LinkedHashMap();
            C1912950zsb c1912950zsb = c1912940zsaLIZ.LIZ;
            linkedHashMap.put(c1912950zsb.LIZ, String.valueOf(c1912950zsb.LIZJ - c1912950zsb.LIZIZ));
            C1912950zsb c1912950zsb2 = c1912940zsaLIZ.LIZIZ;
            linkedHashMap.put(c1912950zsb2.LIZ, String.valueOf(c1912950zsb2.LIZJ - c1912950zsb2.LIZIZ));
            C1912950zsb c1912950zsb3 = c1912940zsaLIZ.LIZJ;
            linkedHashMap.put(c1912950zsb3.LIZ, String.valueOf(c1912950zsb3.LIZJ - c1912950zsb3.LIZIZ));
            C1912950zsb c1912950zsb4 = c1912940zsaLIZ.LIZLLL;
            linkedHashMap.put(c1912950zsb4.LIZ, String.valueOf(c1912950zsb4.LIZJ - c1912950zsb4.LIZIZ));
            C1912950zsb c1912950zsb5 = c1912940zsaLIZ.LJ;
            linkedHashMap.put(c1912950zsb5.LIZ, String.valueOf(c1912950zsb5.LIZJ - c1912950zsb5.LIZIZ));
            C1912950zsb c1912950zsb6 = c1912940zsaLIZ.LJFF;
            linkedHashMap.put(c1912950zsb6.LIZ, String.valueOf(c1912950zsb6.LIZJ - c1912950zsb6.LIZIZ));
            C1912950zsb c1912950zsb7 = c1912940zsaLIZ.LJI;
            linkedHashMap.put(c1912950zsb7.LIZ, String.valueOf(c1912950zsb7.LIZJ - c1912950zsb7.LIZIZ));
            C1912950zsb c1912950zsb8 = c1912940zsaLIZ.LJII;
            linkedHashMap.put(c1912950zsb8.LIZ, String.valueOf(c1912950zsb8.LIZJ - c1912950zsb8.LIZIZ));
            linkedHashMap.put("component_type", c10nw.getDesc());
            C10SV.LIZIZ(C10H5.NUJ_STEP_FLUENCY, linkedHashMap);
        } else {
            linkedHashMap = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FLUENCYTRACKER_");
        sbLIZ.append(c10nw);
        C1911410zq7.LIZ(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(linkedHashMap));
        if (c1912940zsaLIZ != null) {
            c1912940zsaLIZ.LJIIIIZZ = true;
        }
    }
}
