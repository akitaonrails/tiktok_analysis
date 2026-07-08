package X;

import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671610QVz {
    public static boolean LIZIZ;
    public static C671600QVy LIZ = new C671600QVy();
    public static boolean LIZJ = true;
    public static boolean LIZLLL = true;
    public static volatile long LJ = -1;
    public static volatile long LJFF = -1;

    public static void LIZIZ() throws JSONException {
        C671600QVy c671600QVy = LIZ;
        c671600QVy.getClass();
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject = new JSONObject();
        c671600QVy.LIZ(jSONObject);
        jSONObject.put(Scene.SCENE_SERVICE, "error");
        jSONObject.put("reason", "parse_schema_failed");
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("rd_tiktokec_search_half_screen_trace", jSONObject);
    }

    public static void LIZJ() {
        C671600QVy c671600QVy = new C671600QVy();
        if (LJ != -1 && LJFF != -1) {
            c671600QVy.LJIIIZ = LJ;
            c671600QVy.LJIIJ = LJFF;
        }
        LIZ = c671600QVy;
        LIZIZ = false;
        LJ = -1L;
        LJFF = -1L;
    }

    public static void LIZ(C0QW1 c0qw1, Integer num, Function1 function1) {
        C671600QVy c671600QVy = LIZ;
        c671600QVy.getClass();
        if (c0qw1.getSequence() > c671600QVy.LIZIZ.getSequence()) {
            switch (C0QW0.LIZ[c0qw1.ordinal()]) {
                case 1:
                    if (c671600QVy.LIZIZ == C0QW1.NOT_INIT) {
                        c671600QVy.LIZIZ = c0qw1;
                        if (function1 != null) {
                            function1.invoke(c671600QVy);
                        }
                    }
                    break;
                case 2:
                    if ((c671600QVy.LJIIIZ == -1 || c671600QVy.LJIIJ == -1) && function1 != null) {
                        function1.invoke(c671600QVy);
                    }
                    break;
                case 3:
                    if (c671600QVy.LIZIZ == C0QW1.CLICK) {
                        c671600QVy.LIZIZ = c0qw1;
                        if (function1 != null) {
                            function1.invoke(c671600QVy);
                        }
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    if (c671600QVy.LIZIZ != C0QW1.NOT_INIT && c671600QVy.LIZ == -1) {
                        c671600QVy.LIZIZ = c0qw1;
                        if (function1 != null) {
                            function1.invoke(c671600QVy);
                        }
                    }
                    break;
                case 7:
                    if (c671600QVy.LIZIZ != C0QW1.NOT_INIT) {
                        int i = c671600QVy.LIZ;
                        if (num != null && i == num.intValue()) {
                            c671600QVy.LIZIZ = c0qw1;
                            if (function1 != null) {
                                function1.invoke(c671600QVy);
                            }
                            c671600QVy.LIZIZ("performance", AFwS241S0000000_10.get$arr$(622));
                            LIZJ = false;
                        }
                    }
                    break;
            }
        }
        if (c0qw1 == C0QW1.MEANINGFUL) {
            LIZLLL = false;
        }
    }
}
