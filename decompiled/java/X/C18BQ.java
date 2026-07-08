package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BQ {
    public static final /* synthetic */ int LIZ = 0;

    public static C21242818Be LIZ(PageFinder pageFinder, Map map) {
        boolean zLJIL;
        BcmParams bcmParams;
        JSONObject jSONObject;
        Map<String, ? extends Object> map2;
        Boolean bool;
        C18CK.LIZLLL("FE_setBcmParams", new AwS576S0100000_32(map, (Map<String, ? extends Object>) 903));
        if (pageFinder.isEmpty()) {
            return new C21242818Be(4, "pageFinder is empty", false);
        }
        Object obj = map.get("bcm");
        Object obj2 = map.get("clear_old_value");
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
            zLJIL = bool.booleanValue();
        } else {
            zLJIL = C18CS.LIZ.LIZLLL().LJIL();
        }
        if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
            bcmParams = new BcmParams();
            bcmParams.merge(map2);
        } else {
            bcmParams = new BcmParams();
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            bcmParams.merge(jSONObject);
        }
        try {
            if (!zLJIL) {
                C18BV.LIZ.appendPageParams(pageFinder, "ecom_entrance", bcmParams);
            } else {
                C18BV.LIZ.setPageParams(pageFinder, "ecom_entrance", bcmParams);
            }
            return new C21242818Be(6, null, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C21242818Be(4, "setPageParams(clearOld=" + zLJIL + ") raise Exception: " + e.getMessage(), false);
        }
    }
}
