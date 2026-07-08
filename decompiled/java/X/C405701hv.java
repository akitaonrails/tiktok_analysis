package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C405701hv {
    public static long LIZ;
    public static int LIZIZ;
    public static String LIZJ;
    public static int LIZLLL;
    public static WeakReference<DataChannel> LJ;
    public static Map<String, Integer> LJFF = new LinkedHashMap();
    public static int LJI = 1;
    public static int LJII = 1;
    public static String LJIIIIZZ = "";
    public static String LJIIIZ = "";

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C405701hv.LIZ():java.util.Map");
    }

    public static void LIZIZ(int i, int i2, String str, String str2) {
        if (!Intrinsics.LJFF(LIZJ, "end") && !Intrinsics.LJFF(LIZJ, "start") && !Intrinsics.LJFF(LIZJ, str)) {
            LIZIZ++;
        }
        if (Intrinsics.LJFF(str, "up") && i2 == LJI) {
            i2 = 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_adaptive_strategy");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ), "start_session");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "end_session");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZIZ), "session_group_id");
        c474500IjALIZ.LJJII(LIZJ, "session_from_status");
        c474500IjALIZ.LJJII(str, "session_to_status");
        c474500IjALIZ.LJJII("live_host_video", "name");
        c474500IjALIZ.LJJII("live", Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "perf_score");
        c474500IjALIZ.LJJII(Integer.valueOf(LIZLLL), "from_level");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "to_level");
        c474500IjALIZ.LJJII(str2, "component_list");
        c474500IjALIZ.LIZ();
        LIZ = jCurrentTimeMillis;
        LIZJ = str;
        LIZLLL = i2;
    }
}
