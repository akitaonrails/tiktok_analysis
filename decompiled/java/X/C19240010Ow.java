package X;

import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.10Ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19240010Ow {
    public static final C19240010Ow LIZ = new C19240010Ow();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(576));

    public static void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("name", str);
        LIZJ("config_name_error", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("reason", str);
        LIZJ("config_value_error", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, Map map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", params: ");
        sbLIZ.append(map);
        C1911410zq7.LIZ("config_track", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL(str, map);
    }

    public static void LIZLLL(long j, String str, String str2, boolean z) {
        if (z) {
            ((Map) LIZIZ.getValue()).put(str, Long.valueOf(System.currentTimeMillis()));
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "config_id");
        c2344009Gk.LJIIIIZZ("name", str);
        c2344009Gk.LJIIIIZZ("hit_filter", str2);
        c2344009Gk.LJ(Boolean.valueOf(z), "run");
        LIZJ("page_ability_start", c2344009Gk.LIZ);
    }
}
