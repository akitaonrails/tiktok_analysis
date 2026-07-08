package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09Qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2369309Qd {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Long l, String str, String str2, String str3) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(Scene.SCENE_SERVICE, str), new Pair("stage", str2));
        if (str3 != null) {
            mapLJIIJ.put("request_threshold", str3);
        }
        if (l != null) {
            mapLJIIJ.put("duration", String.valueOf(l.longValue()));
        }
        C1421105hJ.LIZJ("rd_tiktokec_search_out_of_app_diversion", mapLJIIJ);
    }
}
