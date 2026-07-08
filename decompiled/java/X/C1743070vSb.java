package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743070vSb {
    public static final /* synthetic */ C1743070vSb LIZ = new C1743070vSb();
    public static final InterfaceC2661011f LIZIZ = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    public static String LIZ(Map map) {
        Object obj;
        try {
            if (map != null) {
                obj = map.get("bcm_standard_track");
            } else {
                obj = null;
            }
            JSONObject jSONObjectOptJSONObject = new JSONObject(String.valueOf(obj)).optJSONObject("track_param");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("bcm_coupon_id", "");
                if (strOptString != null) {
                    return strOptString;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return "";
    }
}
