package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0oqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1488800oqU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("step", str), new Pair("tag", str4), new Pair("vod_scene_tag", str5));
        if (str2 != null) {
            mapLJIIJ.put("step_extra", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("duration", str3);
        }
        C1421105hJ.LIZJ("rd_ec_video_component_step", mapLJIIJ);
    }
}
