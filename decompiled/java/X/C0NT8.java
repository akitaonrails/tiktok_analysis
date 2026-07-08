package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NT8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NT8 {
    public static JSONObject LJ;
    public static String LJFF;
    public static boolean LJIIIZ;
    public static int LJIILIIL;
    public static final C0NT8 LIZ = new C0NT8();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static long LJI = -1;
    public static long LJII = -1;
    public static long LJIIIIZZ = -1;
    public static final Map<String, Integer> LJIIJ = new HashMap();
    public static final Map<String, Boolean> LJIIJJI = new HashMap();
    public static final Set<String> LJIIL = new HashSet();

    public static void LJIIJJI() {
        LJIIIZ = false;
    }

    public static boolean LIZ(String str) {
        Integer num = (Integer) ((HashMap) LJIIJ).get(str);
        if (num != null && num.intValue() == 0) {
            return true;
        }
        return false;
    }

    public static int LIZIZ(String str) {
        Integer num = (Integer) ((HashMap) LJIIJ).get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static void LIZJ(Aweme aweme) {
        LinkedHashMap linkedHashMap;
        if (LJIIIZ || aweme == null) {
            return;
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(LIZLLL, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() < 4) {
            return;
        }
        try {
            HashMap map = (HashMap) C117800ca.LIZIZ(LJ);
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            linkedHashMap = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("enter_from", (String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        c2344009Gk.LJIIIIZZ("event_page", (String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        c2344009Gk.LJIIIIZZ("request_page", (String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
        c2344009Gk.LJIIIIZZ("click_position", (String) ListProtector.get(listLJJLIIIJILLIZJL, 3));
        c2344009Gk.LJIIIIZZ("task_id", LJFF);
        c2344009Gk.LJII(linkedHashMap);
        C20684815ws.LJIILLIIL("livesdk_live_center_video_watched", c2344009Gk.LIZ);
    }

    public static void LJFF(String str) {
        LJFF = str;
    }

    public static void LJI(String str) {
        LIZIZ = str;
    }

    public static void LJII(String str) {
        LIZJ = str;
    }

    public static void LJIIIIZZ(String str) {
        LIZLLL = str;
    }

    public static void LJIIIZ(JSONObject jSONObject) {
        LJ = jSONObject;
    }

    public static void LIZLLL(Aweme aweme, boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        long j;
        if (aweme == null || !C0NT9.LIZ.contains(LIZIZ)) {
            return;
        }
        JSONObject jSONObject = LJ;
        Object obj4 = null;
        if (jSONObject != null) {
            obj = jSONObject.get("ban_time");
        } else {
            obj = null;
        }
        JSONObject jSONObject2 = LJ;
        if (jSONObject2 != null) {
            obj2 = jSONObject2.get("ban_type");
        } else {
            obj2 = null;
        }
        JSONObject jSONObject3 = LJ;
        if (jSONObject3 != null) {
            obj3 = jSONObject3.get("ban_reason");
        } else {
            obj3 = null;
        }
        JSONObject jSONObject4 = LJ;
        if (jSONObject4 != null) {
            obj4 = jSONObject4.get("is_underage");
        }
        if (z) {
            j = LJIIIIZZ;
        } else {
            j = (LJII - LJI) % LJIIIIZZ;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LIZIZ);
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("video_id", aid);
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LIZLLL(j, "watch_duration");
        c2344009Gk.LIZLLL(LJIIIIZZ, "video_duration");
        c2344009Gk.LJ(obj, "ban_time");
        c2344009Gk.LJ(obj2, "ban_type");
        c2344009Gk.LJ(obj3, "ban_reason");
        c2344009Gk.LJ(obj4, "is_underage");
        C20684815ws.LJIILLIIL("livesdk_tutorial_video_play_duration", c2344009Gk.LIZ);
        if (z) {
            LJI = System.currentTimeMillis();
        }
    }

    public static void LJ(Aweme aweme, boolean z) {
        LinkedHashMap linkedHashMap;
        String str;
        String str2;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(LIZLLL, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() < 4) {
            return;
        }
        Integer numValueOf = null;
        try {
            HashMap map = (HashMap) C117800ca.LIZIZ(LJ);
            linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), ((Map.Entry) obj).getValue().toString());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            linkedHashMap = null;
        }
        if (aweme.getAid() != null) {
            numValueOf = Integer.valueOf(LIZIZ(aweme.getAid()));
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("anchor_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        c2344009Gk.LJIIIIZZ("enter_from", (String) ListProtector.get(listLJJLIIIJILLIZJL, 0));
        c2344009Gk.LJIIIIZZ("event_page", (String) ListProtector.get(listLJJLIIIJILLIZJL, 1));
        c2344009Gk.LJIIIIZZ("request_page", (String) ListProtector.get(listLJJLIIIJILLIZJL, 2));
        c2344009Gk.LJII(linkedHashMap);
        c2344009Gk.LJIIIIZZ("task_id", String.valueOf(LJFF));
        if (z) {
            str = "show";
        } else {
            str = "click";
        }
        c2344009Gk.LJIIIIZZ("event_type", str);
        if (numValueOf != null && numValueOf.intValue() == 1) {
            str2 = "completed";
        } else {
            str2 = "not_completed";
        }
        c2344009Gk.LJIIIIZZ("task_status", str2);
        C20684815ws.LJIILLIIL("livesdk_live_center_bottom_bar", c2344009Gk.LIZ);
    }

    public static void LJIIJ(int i, String str) {
        ((HashMap) LJIIJ).put(str, Integer.valueOf(i));
    }
}
