package X;

import com.ss.android.ugc.aweme.app.SharePrefCache;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MzY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586580MzY {
    public static boolean LIZJ() {
        C01GW c01gw = C1779306xz.LIZ;
        return C1781506yL.LIZ ? ((Boolean) C1779306xz.LIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "is_break_resume_check_enabled", true, true);
    }

    public static boolean LIZLLL() {
        C01GW c01gw = C1779306xz.LIZ;
        return C1781506yL.LIZ ? ((Boolean) C1779306xz.LIZIZ.getValue()).booleanValue() : C0C64.LJIILLIIL().LJIIIZ(31744, "is_force_request_validation", true, false);
    }

    public static boolean LJ() {
        if (!C1781506yL.LIZ) {
            return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ies_route", true, true);
        }
        if (C302480BtO.LIZ == null) {
            C302480BtO.LIZ = Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "enable_ies_route", true, true));
        }
        return C302480BtO.LIZ.booleanValue();
    }

    public static boolean LJFF() {
        if (!SharePrefCache.inst().getVideoPreload().LIZ().booleanValue()) {
            return false;
        }
        C844470XAv.LIZ.getClass();
        return C0XJA.LIZ(C844470XAv.LIZ()) || SharePrefCache.inst().getWeakNetPreLoadSwitch().LIZ().intValue() == 1;
    }

    public static C2241008qG LIZ(C2241008qG c2241008qG) {
        c2241008qG.LIZLLL("playerType", C1483410ohn.LJLJJI().getPlayerType().toString());
        c2241008qG.LIZLLL("from", "PlayerCommonParamManager");
        c2241008qG.LIZ(Boolean.valueOf(LIZJ()), "is_break_resume_check_enabled");
        c2241008qG.LIZ(Boolean.valueOf(LIZLLL()), "is_force_request_validation");
        c2241008qG.LIZ(Boolean.valueOf(LJ()), "is_play_link_select_enabled");
        c2241008qG.LIZ(Boolean.valueOf(LJFF()), "is_preload_enabled");
        c2241008qG.LIZ(SharePrefCache.inst().getVideoPreload().LIZ(), "need_pre_load_in_settings");
        c2241008qG.LIZIZ(SharePrefCache.inst().getWeakNetPreLoadSwitch().LIZ(), "weak_net_pre_load_switch_in_settings");
        c2241008qG.LIZ(Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "use_video_cache_http_dns", true, false)), "use_video_cache_http_dns");
        c2241008qG.LIZ(Boolean.FALSE, "video_cache_use_ttnet");
        return c2241008qG;
    }

    public static void LIZIZ(JSONObject jSONObject) {
        jSONObject.put("playerType", C1483410ohn.LJLJJI().getPlayerType().toString());
        jSONObject.put("from", "PlayerCommonParamManager");
        jSONObject.put("is_break_resume_check_enabled", LIZJ());
        jSONObject.put("is_force_request_validation", LIZLLL());
        jSONObject.put("is_play_link_select_enabled", LJ());
        jSONObject.put("is_preload_enabled", LJFF());
        jSONObject.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().LIZ());
        jSONObject.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().LIZ());
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "use_ttnet", true) != 1) {
            z = false;
        }
        jSONObject.put("video_cache_use_ttnet", z);
    }
}
