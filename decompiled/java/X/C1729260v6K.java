package X;

import com.bytedance.scene.Scene;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0v6K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729260v6K {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3) {
        int i4;
        if ((i3 & 2) != 0) {
            str2 = null;
        }
        if ((i3 & 4) != 0) {
            str3 = null;
        }
        if ((i3 & 8) != 0) {
            str4 = null;
        }
        if ((i3 & 16) != 0) {
            str5 = null;
        }
        if ((i3 & 32) != 0) {
            str6 = null;
        }
        if ((i3 & 128) != 0) {
            i = -1;
        }
        if ((i3 & 256) != 0) {
            i4 = -1;
        } else {
            i4 = 0;
        }
        if ((i3 & 512) != 0) {
            i2 = -1;
        }
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("_billboardId:");
        sbLIZ.append(str7);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("step", str), new Pair("step_extra", C2188811AlT.LIZIZ(sbLIZ)), new Pair("source", String.valueOf(str3)), new Pair(Scene.SCENE_SERVICE, String.valueOf(str4)), new Pair("billboard_type", String.valueOf(i)), new Pair("container_type", String.valueOf(i4)), new Pair("action_type", String.valueOf(i2)), new Pair("room_id", String.valueOf(str5)), new Pair("author_id", String.valueOf(str6)), new Pair("is_client", "1"));
        c1507790pL7.getClass();
        C1507790pL7.LIZJ("rd_tiktokec_billboard_step_event", mapLJIIIIZZ);
    }
}
