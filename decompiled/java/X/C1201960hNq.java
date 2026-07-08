package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hNq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201960hNq {
    public static final void LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        HashMap<String, String> map;
        String str;
        PoiData poiData = creativeModel.poiPostDataFromSchema;
        if (poiData != null && (map = poiData.poiExtraData) != null) {
            PoiMobParam poiMobParam = poiData.mobParam;
            if (poiMobParam != null) {
                str = poiMobParam.enterMethod;
            } else {
                str = null;
            }
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    c0lab.LJ(entry.getKey(), entry.getValue());
                }
                if (str != null && true == C1533950q1J.LJ(str)) {
                    c0lab.LJ("poi_enter_method", str);
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LIZIZ(CreativeModel creativeModel, C0LAB c0lab) {
        String lsAllianceExtraJsonStr = creativeModel.poiLynxInfoModel.getLsAllianceExtraJsonStr();
        if (lsAllianceExtraJsonStr == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(lsAllianceExtraJsonStr);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt instanceof String) {
                    c0lab.LJ(next, (String) objOpt);
                } else if (objOpt instanceof Long) {
                    c0lab.LIZIZ(((Number) objOpt).longValue(), next);
                } else if (objOpt instanceof Integer) {
                    c0lab.LIZ(((Number) objOpt).intValue(), next);
                } else if (objOpt instanceof Double) {
                    c0lab.LIZLLL(objOpt, next);
                } else if (objOpt instanceof Float) {
                    c0lab.LIZJ((Float) objOpt, next);
                } else {
                    c0lab.LIZLLL(objOpt, next);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZJ(CreativeModel creativeModel, C0LAB c0lab) {
        Integer num;
        String str;
        PoiMobParam poiMobParam = creativeModel.poiMobParams;
        if (poiMobParam != null && (str = poiMobParam.useMethod) != null) {
            c0lab.LJ("use_method", str);
        }
        PoiMobParam poiMobParam2 = creativeModel.poiMobParams;
        if (poiMobParam2 != null && (num = poiMobParam2.displayIndex) != null) {
            c0lab.LIZ(num.intValue(), "display_index");
        }
    }
}
