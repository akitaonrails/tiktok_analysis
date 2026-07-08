package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1CC2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CC2 {
    public static final C1CC3 LIZ = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).MN2();

    public static void LIZ(String str, Throwable th) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIILLIIL(str, th);
    }

    public static void LIZIZ(String str, Throwable th, Map map) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIILIIL(str, th, map);
    }

    public static void LJII(int i, String str, Map map) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LIZ(i, str, map);
    }

    public static void LJIIIIZZ(String str, int i, JSONObject jSONObject) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.monitorStatus(str, i, jSONObject);
    }

    public static void LJIIIZ(int i, long j, String str) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIILJJIL(i, j, str);
    }

    public static void LJIIL(int i, String str, JSONObject jSONObject) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJFF(i, str, jSONObject);
    }

    public static void LIZJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZ.vn(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LIZLLL(String str, Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LIZJ(str, map, map2, map3);
    }

    public static void LJ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c1cc3.LJIIIZ(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJFF(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        LIZ.LJIIIIZZ(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJI(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIILL(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LJIIJ(int i, long j, String str, JSONObject jSONObject) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIJJ(i, j, str, jSONObject);
    }

    public static void LJIIJJI(int i, String str, Map map, long j) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJ(i, str, map, j);
    }

    public static void LJIILIIL(int i, long j, String str, Map map) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIIL(i, j, str, map);
    }

    public static void LJIILJJIL(int i, int i2, String str, Map map) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJI(i, i2, str, map);
    }

    public static void LJIILL(int i, int i2, String str, JSONObject jSONObject) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIJI(i, i2, str, jSONObject);
    }

    public static void LJIILLIIL(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C1CC3 c1cc3 = LIZ;
        if (c1cc3 == null) {
            return;
        }
        c1cc3.LJIL(str, str2, jSONObject, jSONObject2, jSONObject3);
    }
}
