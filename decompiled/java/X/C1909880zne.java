package X;

import Y.ARunnableS119S0100000_19;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909880zne {
    public static final ExecutorService LIZ;

    static {
        new LinkedHashSet();
        LIZ = C786410Ut5.h4();
    }

    public static void LJ(Function0 function0) {
        LIZ.execute(new ARunnableS119S0100000_19(function0, 133));
    }

    public static void LIZIZ(String str, Map map) {
        LIZLLL("tako_data_render_start", C2097908Jt.LIZJ(new Pair("template_id", str)), map, C1910150zo5.LIZ());
    }

    public static void LIZ(long j, String str, Map map) {
        LIZLLL("tako_data_render_end", C2097608Jq.LJIIIIZZ(new Pair("template_id", str), new Pair("duration", String.valueOf(j))), map, C1910150zo5.LIZ());
    }

    public static void LIZJ(String str, String str2, String str3, int i) {
        Map mapLJ;
        if ((i & 2) != 0) {
            str2 = "other_error";
        }
        C14NP c14npLIZ = null;
        if ((i & 8) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i & 16) != 0) {
            c14npLIZ = C1910150zo5.LIZ();
        }
        LIZLLL("nimble_error", C2097608Jq.LJIIIIZZ(new Pair("template_id", str), new Pair("code", str2), new Pair("msg", str3)), mapLJ, c14npLIZ);
    }

    public static void LIZLLL(String str, Map map, Map map2, InterfaceC1866500yfg interfaceC1866500yfg) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map2);
        linkedHashMap.putAll(map);
        interfaceC1866500yfg.LIZ(str, linkedHashMap);
    }
}
