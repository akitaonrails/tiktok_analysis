package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0egG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1098060egG {
    public static final C1098060egG LIZ = new C1098060egG();
    public static C1098020egC LIZIZ;

    public static long LIZ(long j, long j2) {
        if (j == -1 || j2 < j) {
            return -1L;
        }
        return j2 - j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0egC] */
    public static C1098020egC LIZIZ() {
        C1098020egC c1098020egC = LIZIZ;
        if (c1098020egC != null) {
            return c1098020egC;
        }
        ?? r0 = new C1098000egA() { // from class: X.0egC
            {
                this.LIZIZ = "live_goal_indicator";
                this.LJ = "lynx";
            }
        };
        LIZIZ = r0;
        return r0;
    }

    public final void LIZLLL() {
        C1098020egC c1098020egCLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098020egCLIZIZ.LJFF, c1098020egCLIZIZ.LJI);
        HashMap map = new HashMap(c1098020egCLIZIZ.LIZIZ());
        map.put("duration", Long.valueOf(jLIZ));
        LIZJ(this, "live_goal_data_filtered", map);
    }

    public final void LJ() {
        C1098020egC c1098020egCLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098020egCLIZIZ.LJII, c1098020egCLIZIZ.LJIIIIZZ);
        HashMap map = new HashMap(c1098020egCLIZIZ.LIZIZ());
        map.put("duration", Long.valueOf(jLIZ));
        map.put("action_completed_status", 1);
        LIZJ(this, "container_create", map);
    }

    public final void LJII() {
        C1098020egC c1098020egCLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098020egCLIZIZ.LJIIJ, c1098020egCLIZIZ.LJIIJJI);
        long jLIZ2 = LIZ(c1098020egCLIZIZ.LJII, c1098020egCLIZIZ.LJIIJJI);
        HashMap map = new HashMap(c1098020egCLIZIZ.LIZIZ());
        map.put("duration", Long.valueOf(jLIZ));
        map.put("duration_from_create", Long.valueOf(jLIZ2));
        LIZJ(this, "container_destroy_in_next_room", map);
    }

    public final void LJI(Map<String, Object> map) {
        String string;
        C1098020egC c1098020egCLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098020egCLIZIZ.LJIIIZ, c1098020egCLIZIZ.LJIIJ);
        HashMap map2 = new HashMap(c1098020egCLIZIZ.LIZIZ());
        map2.put("duration_from_create", Long.valueOf(LIZ(c1098020egCLIZIZ.LJII, c1098020egCLIZIZ.LJIIJ)));
        map2.put("duration", Long.valueOf(jLIZ));
        map2.put("action_completed_status", 1);
        LIZJ(this, "container_load", map2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("goal_indicator_render_success");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            c474500IjALIZ.LJJII(string, key);
        }
        c474500IjALIZ.LJJII(Long.valueOf(LIZ(c1098020egCLIZIZ.LJII, c1098020egCLIZIZ.LJIIJ)), "duration");
        c474500IjALIZ.LIZ();
    }

    public final void LJFF(String str, Map<String, Object> map) {
        String str2;
        String string;
        C1098020egC c1098020egCLIZIZ = LIZIZ();
        long jLIZ = LIZ(c1098020egCLIZIZ.LJIIIZ, c1098020egCLIZIZ.LJIIJ);
        HashMap map2 = new HashMap(c1098020egCLIZIZ.LIZIZ());
        map2.put("duration", Long.valueOf(jLIZ));
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        map2.put("error_message", str2);
        map2.put("action_completed_status", 0);
        LIZJ(this, "container_load", map2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("goal_indicator_render_fail");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            c474500IjALIZ.LJJII(string, key);
        }
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "error_message");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ(c1098020egCLIZIZ.LJII, c1098020egCLIZIZ.LJIIJ)), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(C1098060egG c1098060egG, String str, Map map) {
        String string;
        c1098060egG.getClass();
        HashMap map2 = (HashMap) map;
        map2.put("action", str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("goal_indicator_all_in_one");
        for (Map.Entry entry : map2.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                string = value.toString();
            } else {
                string = null;
            }
            c474500IjALIZ.LJJII(string, str2);
        }
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }
}
