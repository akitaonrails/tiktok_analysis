package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12Dw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19721012Dw implements InterfaceC2193001AsE {
    public static JSONObject LIZJ(C19720512Dr c19720512Dr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enter_from", "personal_homepage");
        jSONObject.put("token_type", "inspiration");
        if (c19720512Dr != null) {
            jSONObject.put("inspiration_result_id", c19720512Dr.LJ);
            jSONObject.put("inspiration_keyword", c19720512Dr.LIZ);
            jSONObject.put("inspiration_reco_id", c19720512Dr.LJIIIIZZ);
            jSONObject.put("debug_info", c19720512Dr.LJFF);
            jSONObject.put("activity_name", c19720512Dr.LJIILL);
            jSONObject.put(Scene.SCENE_SERVICE, c19720512Dr.LJIIIZ);
            jSONObject.put("topic_type", c19720512Dr.LJIIJ);
        }
        return jSONObject;
    }

    public static final void LIZLLL(long j, C19720512Dr c19720512Dr) {
        try {
            JSONObject jSONObjectLIZJ = LIZJ(c19720512Dr);
            jSONObjectLIZJ.put("cost", j);
            C20684815ws.LJIJ("search_inspiration_banner_freq_control_cost", jSONObjectLIZJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackFreqControlCost: cost=");
            sbLIZ.append(j);
            sbLIZ.append("ms");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2193001AsE
    public final void LIZ(long j, C19720512Dr c19720512Dr) {
        try {
            JSONObject jSONObjectLIZJ = LIZJ(c19720512Dr);
            jSONObjectLIZJ.put("cost", j);
            C20684815ws.LJIJ("search_inspiration_banner_data_fetching_cost", jSONObjectLIZJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackDataFetchingCost: cost=");
            sbLIZ.append(j);
            sbLIZ.append("ms");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC2193001AsE
    public final void LIZIZ(String str, String str2, long j, C19720512Dr c19720512Dr) {
        try {
            JSONObject jSONObjectLIZJ = LIZJ(c19720512Dr);
            jSONObjectLIZJ.put("update_type", str);
            jSONObjectLIZJ.put("version", str2);
            jSONObjectLIZJ.put("cost", j);
            C20684815ws.LJIJ("search_inspiration_banner_overall_update_cost", jSONObjectLIZJ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trackOverallUpdateCost: updateType=");
            sbLIZ.append(str);
            sbLIZ.append(", version=");
            sbLIZ.append(str2);
            sbLIZ.append(", cost=");
            sbLIZ.append(j);
            sbLIZ.append("ms");
            C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
