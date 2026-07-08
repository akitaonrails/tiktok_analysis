package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03CI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CI {
    public static final Map<String, Object> LIZ = C2097608Jq.LJ();

    public static boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, Object> map = LIZ;
        Map<String, Object> map2 = (Map) c0c64LJIILLIIL.LJJII(Map.class, map, "logistic_move_up_config", true);
        if (map2 != null) {
            map = map2;
        }
        return Intrinsics.LJFF(map.get("shipping_and_user_right_move_up"), Boolean.TRUE);
    }
}
