package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;

/* JADX INFO: renamed from: X.0KTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518170KTv {
    public static final C518170KTv LIZ = new C518170KTv();

    public static long LIZLLL(Map map, String str, int i) {
        Map map2 = map;
        if ((i & 4) != 0) {
            map2 = null;
        }
        return LJ("call_jsb", "native", str, null, map2, 16);
    }

    public static long LJ(String str, String str2, String str3, String str4, Map map, int i) {
        String str5 = str4;
        String str6 = str3;
        String str7 = str2;
        if ((i & 2) != 0) {
            str7 = "native";
        }
        Map map2 = null;
        if ((i & 4) != 0) {
            str6 = null;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        if ((i & 32) == 0) {
            map2 = map;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LIZ.getClass();
        LIZ(str, "start", null, str7, str6, str5, null, null, null, null, null, map2);
        return jElapsedRealtime;
    }

    public static void LIZJ(String str, String str2, long j, String str3, String str4, String str5, Map map, int i) {
        Map map2 = map;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        if ((i & 16) != 0) {
            str8 = null;
        }
        if ((i & 32) != 0) {
            str7 = null;
        }
        if ((i & 64) != 0) {
            str6 = null;
        }
        if ((i & 128) != 0) {
            map2 = null;
        }
        LIZIZ("call_jsb", str2, j, "native", str, null, str8, str7, str6, map2, 64);
    }

    public static void LIZIZ(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i) {
        String str9 = str8;
        String str10 = str6;
        String str11 = str5;
        String str12 = str4;
        String str13 = str7;
        String str14 = str3;
        if ((i & 8) != 0) {
            str14 = "native";
        }
        Map map2 = null;
        if ((i & 16) != 0) {
            str12 = null;
        }
        if ((i & 32) != 0) {
            str11 = null;
        }
        if ((i & 128) != 0) {
            str10 = null;
        }
        if ((i & 256) != 0) {
            str13 = null;
        }
        if ((i & 512) != 0) {
            str9 = null;
        }
        if ((i & 1024) == 0) {
            map2 = map;
        }
        C518170KTv c518170KTv = LIZ;
        Long lValueOf = Long.valueOf(j);
        c518170KTv.getClass();
        LIZ(str, "end", str2, str14, str12, str11, null, lValueOf, str10, str13, str9, map2);
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, String str8, String str9, String str10, Map map) {
        String str11;
        Number number;
        String str12;
        String str13;
        String str14;
        Number number2;
        Number number3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action", str);
        c2344009Gk.LJIIIIZZ("phase", str2);
        c2344009Gk.LJIIIIZZ("report_from", str4);
        if (str3 != null) {
            c2344009Gk.LJFF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        }
        if (str5 != null) {
            c2344009Gk.LJFF("jsb_name", str5);
        }
        if (str6 != null) {
            c2344009Gk.LJFF("stage", str6);
        }
        if (str7 != null) {
            c2344009Gk.LJFF("load_source", str7);
        }
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue(), "duration");
        }
        if (str8 != null) {
            c2344009Gk.LJFF("error_code", str8);
        }
        if (str9 != null) {
            c2344009Gk.LJFF("error_message", C13LN.LJZL(256, str9));
        }
        if (str10 != null) {
            c2344009Gk.LJFF("error_type", str10);
        }
        if (map != null) {
            Object obj = map.get("business_line");
            if ((obj instanceof Number) && (number3 = (Number) obj) != null) {
                c2344009Gk.LIZJ(number3.intValue(), "business_line");
            }
            Object obj2 = map.get(Scene.SCENE_SERVICE);
            if (obj2 instanceof String) {
                str11 = (String) obj2;
            } else {
                str11 = null;
            }
            if (str11 != null && str11.length() > 0) {
                c2344009Gk.LJFF(Scene.SCENE_SERVICE, str11);
            }
            Object obj3 = map.get("schema_version");
            if ((obj3 instanceof Number) && (number2 = (Number) obj3) != null) {
                c2344009Gk.LIZJ(number2.intValue(), "schema_version");
            }
            Object obj4 = map.get("enter_from");
            if ((obj4 instanceof String) && (str14 = (String) obj4) != null && str14.length() > 0) {
                c2344009Gk.LJFF("enter_from", str14);
            }
            Object obj5 = map.get("creator_id");
            if ((obj5 instanceof String) && (str13 = (String) obj5) != null && str13.length() > 0) {
                c2344009Gk.LJFF("creator_id", str13);
            }
            Object obj6 = map.get("spu_id");
            if ((obj6 instanceof String) && (str12 = (String) obj6) != null && str12.length() > 0) {
                c2344009Gk.LJFF("spu_id", str12);
            }
            Object obj7 = map.get("lynx_load_template_start");
            if ((obj7 instanceof Number) && (number = (Number) obj7) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - number.longValue();
                if (jCurrentTimeMillis >= 0) {
                    c2344009Gk.LIZLLL(jCurrentTimeMillis, "lynx_duration");
                }
            }
        }
        C20684815ws.LJIILLIIL("pgc_iap_perf", c2344009Gk.LIZ);
    }
}
