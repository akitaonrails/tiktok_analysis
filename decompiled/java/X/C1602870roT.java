package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0roT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602870roT {
    public static final Map<String, C1602880roU> LIZ = new LinkedHashMap();

    public static void LIZIZ(String str) {
        C1602880roU c1602880roU = new C1602880roU(str);
        c1602880roU.LIZIZ = System.currentTimeMillis();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("nu_trigger_scene", str);
        c2344009Gk.LIZJ(C1481060oe0.LIZLLL, "play_count");
        C19249910Sr.LIZIZ.LIZIZ(c2344009Gk, "nu_feed_request");
        LIZ.put(str, c1602880roU);
    }

    public static void LIZ(String str, List list) {
        int size;
        C1602880roU c1602880roU = (C1602880roU) ((LinkedHashMap) LIZ).get(str);
        if (c1602880roU != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - c1602880roU.LIZIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("nu_trigger_scene", c1602880roU.LIZ);
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
            c2344009Gk.LIZJ(C1481060oe0.LIZLLL, "play_count");
            if (list != null) {
                size = list.size();
            } else {
                size = 0;
            }
            c2344009Gk.LIZJ(size, "item_count");
            C19249910Sr.LIZIZ.LIZIZ(c2344009Gk, "nu_feed_request_response");
        }
        if (Intrinsics.LJFF(str, "cold_initial")) {
            C19254610Um.LIZIZ.LIZJ().LJFF();
        }
    }
}
