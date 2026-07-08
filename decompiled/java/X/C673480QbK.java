package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0QbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673480QbK {
    public static boolean LIZ;

    public static void LIZ(String str, String str2, String str3, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, str));
        if (str2 != null) {
            C0OFE.LIZ("error_code", str2);
        }
        if (str3 != null) {
            C0OFE.LIZ("error_msg", str3);
        }
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_ec_search_pre_code_cache_trace", mapLJIIJ);
    }
}
