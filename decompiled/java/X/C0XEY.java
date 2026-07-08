package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XEY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XEY {
    public static final C0XEY LIZ = new C0XEY();
    public static boolean LIZIZ;
    public static long LIZJ;

    public static void LIZIZ(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        boolean z = false;
        jSONObject.put("event_type", 0);
        jSONObject.put("enter_from", str);
        if (C847400XMc.LJI() == null) {
            z = true;
        }
        jSONObject.put("is_token_null", z);
        jSONObject.put("is_login", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin());
        jSONObject.put("network_level", C912260Zqa.LIZIZ.getNqeNetworkLevel().LIZIZ);
        jSONObject.put("ws_manager_type", 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportTriggerConnect], event = ws_connectivity, json = ");
        sbLIZ.append(jSONObject);
        C845400XEk.LIZIZ("WsConnectivityReport", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIJ("ws_connectivity", jSONObject);
    }

    public static void LIZ(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_type", 0);
        jSONObject.put("enter_from", str);
        jSONObject.put("reason", str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[reportActiveReconnect], event = ws_active_reconnect_event, json = ");
        sbLIZ.append(jSONObject);
        C845400XEk.LIZIZ("WsConnectivityReport", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIJ("ws_active_reconnect_event", jSONObject);
    }
}
