package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XZS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XZS {
    public static final /* synthetic */ int LIZ = 0;

    public static C0XZV LIZ(C0XZU c0xzu, boolean z) {
        C0XZV c0xzv = new C0XZV(z, 0);
        c0xzv.LIZLLL = c0xzu.LIZ;
        c0xzv.LJFF = c0xzu.LIZIZ;
        c0xzv.LJIIJ = c0xzu.LJI;
        c0xzv.LJIIJJI = c0xzu.LJII;
        c0xzv.LJIIL = c0xzu.LJIIIIZZ;
        c0xzv.LJIIIZ = c0xzu.LJFF;
        return c0xzv;
    }

    public static void LIZIZ(C0XZU c0xzu, JSONObject jSONObject) {
        if (jSONObject.has("error_code")) {
            c0xzu.LIZ = jSONObject.optInt("error_code", c0xzu.LIZ);
        } else if (jSONObject.has("code")) {
            c0xzu.LIZ = jSONObject.optInt("code", c0xzu.LIZ);
        }
        c0xzu.LIZIZ = jSONObject.optString("description");
        String strOptString = jSONObject.optString("name");
        if ("connect_switch".equals(strOptString) || "connect_exist".equals(strOptString)) {
            c0xzu.LJI = jSONObject.optString("description");
            c0xzu.LJII = jSONObject.optString("dialog_tips");
            c0xzu.LJIIIIZZ = jSONObject.optString("auth_token");
        }
        if (c0xzu.LIZ == 1075) {
            jSONObject.optLong("apply_time");
            jSONObject.optString("avatar_url");
            jSONObject.optString("nick_name");
            jSONObject.optString("token");
            jSONObject.optLong("cancel_time");
        }
        if (c0xzu.LIZ == 1041) {
            jSONObject.optString("screen_name");
            jSONObject.optString("avatar_url");
            jSONObject.optString("last_login_time");
            jSONObject.optString("mobile");
            jSONObject.optString("platform_screen_name_current");
            jSONObject.optString("platform_screen_name_conflict");
        }
    }

    public static C0XO3 LIZJ(JSONObject jSONObject, JSONObject jSONObject2) {
        C0XO3 c0xo3 = new C0XO3(jSONObject, jSONObject2);
        c0xo3.LIZ();
        return c0xo3;
    }
}
