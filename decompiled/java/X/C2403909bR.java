package X;

import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2403909bR {
    public static String LIZ = "https://i.isnssdk.com/monitor/collect/c/logcollect";

    public static boolean LIZ(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, InterfaceC2404009bS interfaceC2404009bS) {
        String strJ3;
        try {
            IHttpService iHttpService = (IHttpService) C792590V7h.LIZ(IHttpService.class);
            HashMap map = new HashMap();
            map.put(Scene.SCENE_SERVICE, str4);
            InterfaceC2403509bN interfaceC2403509bNBuildMultipartUpload = iHttpService.buildMultipartUpload(LIZ, "UTF-8", false, map);
            interfaceC2403509bNBuildMultipartUpload.LIZ("aid", str);
            interfaceC2403509bNBuildMultipartUpload.LIZ("verify_info", C2404209bU.LIZ());
            interfaceC2403509bNBuildMultipartUpload.LIZ("device_id", str2);
            interfaceC2403509bNBuildMultipartUpload.LIZ("os", "Android");
            interfaceC2403509bNBuildMultipartUpload.LIZ("process_name", str3);
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C0VSJ c0vsj = new C0VSJ(it2.next());
                if (c0vsj.exists()) {
                    HashMap map2 = new HashMap();
                    map2.put("logtype", "alog");
                    map2.put(Scene.SCENE_SERVICE, str4);
                    map2.put("env", "params.txt");
                    interfaceC2403509bNBuildMultipartUpload.LIZJ(c0vsj, c0vsj.getName(), map2);
                }
            }
            HashMap map3 = new HashMap();
            map3.put("filetype", "common_params");
            map3.put("logtype", "env");
            if (jSONObject == null) {
                strJ3 = null;
            } else {
                strJ3 = C786410Ut5.J3(jSONObject);
            }
            if (TextUtils.isEmpty(strJ3)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("defaultData", "none commonParams");
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                strJ3 = C786410Ut5.J3(jSONObject2);
            }
            interfaceC2403509bNBuildMultipartUpload.LIZIZ("params.txt", strJ3, map3);
            C2403609bO c2403609bOFinish = interfaceC2403509bNBuildMultipartUpload.finish();
            try {
                if (c2403609bOFinish.LIZJ == null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("ALOG_UPLOAD_RESPONSE", "null");
                    jSONObject3.put("ALOG_UPLOAD_STATUS", c2403609bOFinish.LIZ);
                    interfaceC2404009bS.LIZ(false, 11, null, jSONObject3);
                    return false;
                }
                JSONObject jSONObject4 = new JSONObject(new String(c2403609bOFinish.LIZJ));
                if (jSONObject4.optInt("errno", -1) == 200) {
                    String strOptString = jSONObject4.optString("message");
                    if (!"long escape".equals(strOptString) && !"drop data".equals(strOptString)) {
                        interfaceC2404009bS.LIZ(true, -1, null, jSONObject4);
                        return true;
                    }
                    interfaceC2404009bS.LIZ(false, 13, null, jSONObject4);
                    return false;
                }
                interfaceC2404009bS.LIZ(false, 6, null, jSONObject4);
                return false;
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                interfaceC2404009bS.LIZ(false, 7, e2, null);
                return false;
            }
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            interfaceC2404009bS.LIZ(false, 8, e3, null);
            return false;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            interfaceC2404009bS.LIZ(false, 10, e4, null);
            return false;
        }
    }
}
