package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Q0N, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0N {
    public static final Map<C0N0Y, String> LIZ = new LinkedHashMap();

    public static void LIZ(C0N0Y c0n0y, String str) {
        if (c0n0y == null) {
            return;
        }
        if (C0Q0O.LIZ < 0) {
            C0Q0O.LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "search_player_crosstalk_opt_v2", true);
        }
        if (C0Q0O.LIZ == 1) {
            LIZ.put(c0n0y, str);
            if (C650560PfS.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("enter detail page, shared playerManger:");
                sbLIZ.append(c0n0y);
                sbLIZ.append('.');
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
