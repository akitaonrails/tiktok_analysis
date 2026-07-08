package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01WL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01WL implements InterfaceC1524005xu<C01WM> {
    public static final C01WL LIZ = new C01WL();

    @Override // X.InterfaceC1524005xu
    public final String LIZ() {
        return "upc_business_visit_v2";
    }

    @Override // X.InterfaceC1524005xu
    public final void LIZIZ(C01WM c01wm, Integer num, Map map) throws JSONException {
        Number number;
        String curUserId;
        AccountUserService accountUserServiceLJIIJ;
        C01WM c01wm2 = c01wm;
        if (c01wm2 != null) {
            String str = c01wm2.LIZ;
            Map<?, ?> map2 = c01wm2.LIZIZ;
            Object obj = null;
            if (map2 != null) {
                obj = map2.get("sample_rate");
            }
            if ((obj instanceof Number) && (number = (Number) obj) != null) {
                double dDoubleValue = number.doubleValue();
                if (dDoubleValue > 0.0d && dDoubleValue <= 1.0d && AbstractC19994813Le.Default.nextDouble(0.0d, 1.0d) < dDoubleValue) {
                    JSONObject jSONObject = new JSONObject(C2097908Jt.LIZJ(new Pair(Scene.SCENE_SERVICE, str)));
                    Map<?, ?> map3 = c01wm2.LIZJ;
                    if (map3 != null) {
                        C1227904rF.LIZ.getClass();
                        jSONObject.put("extra", C1227904rF.LJI(map3));
                    }
                    jSONObject.put("time_stamp", System.currentTimeMillis());
                    IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
                    if (iAccountService != null && (accountUserServiceLJIIJ = iAccountService.LJIIJ()) != null) {
                        curUserId = accountUserServiceLJIIJ.getCurUserId();
                    } else {
                        curUserId = "";
                    }
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("user_id", curUserId));
                    c1227904rF.getClass();
                    jSONObject.put("user", C1227904rF.LJI(mapLIZJ));
                    C20684815ws.LJIJ("upc_business_visit", jSONObject);
                }
            }
        }
    }
}
