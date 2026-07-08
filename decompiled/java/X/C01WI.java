package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01WI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01WI implements InterfaceC1524005xu<String> {
    public static final C01WI LIZ = new C01WI();

    @Override // X.InterfaceC1524005xu
    public final String LIZ() {
        return "upc_business_visit";
    }

    @Override // X.InterfaceC1524005xu
    public final void LIZIZ(String str, Integer num, Map map) throws JSONException {
        Map mapLJ;
        double dIntValue;
        AccountUserService accountUserServiceLJIIJ;
        String str2 = str;
        String curUserId = "";
        try {
            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WQ
            }.getType();
            C1227904rF c1227904rF = C1227904rF.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            c1227904rF.getClass();
            mapLJ = (Map) C1227904rF.LIZJ(str2, type);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get(Scene.SCENE_SERVICE);
        if ((obj instanceof String) && obj != null) {
            Object obj2 = map.get("sample_rate");
            if (obj2 instanceof Double) {
                dIntValue = ((Number) obj2).doubleValue();
            } else if (!(obj2 instanceof Integer)) {
                return;
            } else {
                dIntValue = ((Number) obj2).intValue();
            }
            if (dIntValue > 0.0d && dIntValue <= 1.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) < dIntValue) {
                JSONObject jSONObject = new JSONObject(C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, obj)));
                Object obj3 = mapLJ.get("log_extra");
                if ((obj3 instanceof Map) && obj3 != null) {
                    C1227904rF.LIZ.getClass();
                    jSONObject.put("extra", C1227904rF.LJI(obj3));
                }
                jSONObject.put("time_stamp", System.currentTimeMillis());
                IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                    curUserId = accountUserServiceLJIIJ.getCurUserId();
                }
                C1227904rF c1227904rF2 = C1227904rF.LIZ;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("user_id", curUserId));
                c1227904rF2.getClass();
                jSONObject.put("user", C1227904rF.LJI(mapLIZJ));
                C20684815ws.LJIJ("upc_business_visit", jSONObject);
            }
        }
    }
}
