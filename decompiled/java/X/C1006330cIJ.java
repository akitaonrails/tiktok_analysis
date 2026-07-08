package X;

import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: renamed from: X.0cIJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006330cIJ {
    public static final C1006330cIJ LIZ = new C1006330cIJ();

    public static void LIZ(C2344009Gk c2344009Gk, Map map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static void LIZIZ(String str, Map map) {
        C08S3.LIZ.getClass();
        C08S3.LIZJ(str, map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("emit ");
        sbLIZ.append(str);
        sbLIZ.append(" params=");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public static void LIZJ(C1006340cIK c1006340cIK, EnumC1006320cII enumC1006320cII) {
        ?? BooleanValue;
        Long l = C1006360cIM.LIZIZ.get(Long.valueOf(c1006340cIK.LIZ));
        long j = 0;
        if (l != null) {
            long jCurrentTimeMillis = (System.currentTimeMillis() - l.longValue()) / 1000;
            if (jCurrentTimeMillis >= 0) {
                j = jCurrentTimeMillis;
            }
        }
        Boolean bool = C1006360cIM.LIZJ.get(Long.valueOf(c1006340cIK.LIZ));
        if (bool != null) {
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        ?? c2344009Gk = new C2344009Gk();
        String str = c1006340cIK.LIZIZ;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("minis_id", str);
        LIZ(c2344009Gk, c1006340cIK.LIZJ);
        c2344009Gk.LJIIIIZZ("click_position", enumC1006320cII.getValue());
        c2344009Gk.LIZLLL(j, "stay_duration");
        c2344009Gk.LIZJ(BooleanValue, "is_first_show");
        LIZIZ("tm_playable_card_click", c2344009Gk.LIZ);
    }

    public static void LIZLLL(String str, Map map, EnumC1006610cIl enumC1006610cIl, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("minis_id", str);
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, enumC1006610cIl.getValue());
        c2344009Gk.LIZJ(z ? 1 : 0, "has_displayed");
        LIZ(c2344009Gk, map);
        LIZIZ("tm_playable_card_delete", c2344009Gk.LIZ);
    }

    public static void LJ(String str, Map map, C00GC c00gc, Integer num, String str2, Long l) {
        int iIntValue;
        long jLongValue;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("minis_id", str);
        c2344009Gk.LIZJ(c00gc.getValue(), "result");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "error_code");
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("error_msg", str2);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c2344009Gk.LIZLLL(jLongValue, "load_duration");
        LIZ(c2344009Gk, map);
        LIZIZ("tm_playable_card_preload_result", c2344009Gk.LIZ);
    }
}
