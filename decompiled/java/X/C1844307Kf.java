package X;

import java.util.HashMap;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07Kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1844307Kf {
    public static final Integer LIZ(String str) {
        HashMap<String, Integer> map;
        HashMap<String, Integer> map2;
        HashMap<String, Integer> map3;
        HashMap<String, Integer> map4;
        HashMap<String, Integer> map5;
        if (C1844207Ke.LIZ) {
            AFwS189S0000000_3.get$arr$(316).getClass();
            C0TKF c0tkf = C0TKA.LIZ;
        }
        int iIntValue = ((Number) C1844207Ke.LIZIZ.getValue()).intValue();
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3) {
                    if (iIntValue != 4) {
                        if (iIntValue != 5) {
                            return null;
                        }
                        if (!C1844207Ke.LIZJ.contains(str) && !C1844207Ke.LIZLLL.contains(str) && !C1844207Ke.LJ.contains(str) && !C1844207Ke.LJI.contains(str)) {
                            map5 = C1844207Ke.LJIIIIZZ;
                        } else {
                            map5 = C1844207Ke.LJII;
                        }
                        return map5.get(str);
                    }
                    if (!C1844207Ke.LIZJ.contains(str) && !C1844207Ke.LIZLLL.contains(str) && !C1844207Ke.LJ.contains(str) && !C1844207Ke.LJFF.contains(str)) {
                        map4 = C1844207Ke.LJIIIIZZ;
                    } else {
                        map4 = C1844207Ke.LJII;
                    }
                    return map4.get(str);
                }
                if (!C1844207Ke.LIZJ.contains(str) && !C1844207Ke.LIZLLL.contains(str) && !C1844207Ke.LJ.contains(str)) {
                    map3 = C1844207Ke.LJIIIIZZ;
                } else {
                    map3 = C1844207Ke.LJII;
                }
                return map3.get(str);
            }
            if (!C1844207Ke.LIZJ.contains(str) && !C1844207Ke.LIZLLL.contains(str)) {
                map2 = C1844207Ke.LJIIIIZZ;
            } else {
                map2 = C1844207Ke.LJII;
            }
            return map2.get(str);
        }
        if (C1844207Ke.LIZJ.contains(str)) {
            map = C1844207Ke.LJII;
        } else {
            map = C1844207Ke.LJIIIIZZ;
        }
        return map.get(str);
    }
}
