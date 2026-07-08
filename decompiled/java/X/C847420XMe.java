package X;

import java.util.Collection;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847420XMe {
    public static JSONObject LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C847430XMf LIZLLL = new C847430XMf(null, false);
    public static final C847430XMf LJ = new C847430XMf(null, false);
    public static final C847430XMf LJFF = new C847430XMf(null, false);
    public static final C847430XMf LJI = new C847430XMf(null, false);
    public static boolean LJII = false;
    public static boolean LJIIIIZZ = false;
    public static boolean LJIIIZ = false;
    public static boolean LJIIJ = false;
    public static boolean LJIIJJI = false;
    public static boolean LJIIL = false;
    public static boolean LJIILIIL = false;
    public static boolean LJIILJJIL = false;
    public static final Collection<String> LJIILL = Collections.singletonList("/passport/");

    public static void LIZ() {
        JSONObject jSONObjectLJFF = C847400XMc.LJFF();
        JSONObject jSONObjectOptJSONObject = jSONObjectLJFF != null ? jSONObjectLJFF.optJSONObject("xtoken_safe_save_config") : null;
        if (LIZ != jSONObjectOptJSONObject) {
            LIZ = jSONObjectOptJSONObject;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("settings=");
            sbLIZ.append(LIZ);
            C847400XMc.LJIIIZ("TokenSaveManager", C2188811AlT.LIZIZ(sbLIZ));
            JSONObject jSONObject = LIZ;
            if (jSONObject != null) {
                LIZIZ = jSONObject.optBoolean("enable", false);
                LIZJ = LIZ.optBoolean("block_enable", false);
                LIZLLL.LIZLLL(LIZ.optJSONArray("domain_suffix"));
                LJ.LIZLLL(LIZ.optJSONArray("path_prefix"));
                LJFF.LIZLLL(LIZ.optJSONArray("exclude_domain_suffix"));
                LJI.LIZLLL(LIZ.optJSONArray("exclude_path_prefix"));
                LJII = LIZ.optBoolean("check_aid", false);
                LJIIIIZZ = LIZ.optBoolean("check_uid", false);
                LJIIIZ = LIZ.optBoolean("check_xtoken", false);
                LJIIJ = LIZ.optBoolean("block_invalid_aid", false);
                LJIIJJI = LIZ.optBoolean("block_invalid_path", false);
                LJIIL = LIZ.optBoolean("block_invalid_domain", false);
                LJIILIIL = LIZ.optBoolean("block_invalid_uid", false);
                LJIILJJIL = LIZ.optBoolean("block_invalid_request_xtoken", false);
                return;
            }
            LIZIZ = false;
            LIZJ = false;
            LIZLLL.LIZLLL(null);
            LJ.LIZLLL(null);
            LJFF.LIZLLL(null);
            LJI.LIZLLL(null);
            LJII = false;
            LJIIIIZZ = false;
            LJIIIZ = false;
            LJIIJ = false;
            LJIIJJI = false;
            LJIIL = false;
            LJIILIIL = false;
            LJIILJJIL = false;
        }
    }
}
