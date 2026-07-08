package X;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WK0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WK0 {
    public static volatile C0WKC LIZ;

    public static C0WKC LIZ(final Context context) {
        HandlerThread handlerThread = new HandlerThread("wschannel");
        handlerThread.start();
        C0WK9 c0wk9 = new C0WK9();
        C0WK6 c0wk6 = new C0WK6(context, c0wk9);
        C0WKC c0wkc = new C0WKC(context, C786410Ut5.W2(handlerThread), new C0WKF(context) { // from class: X.0WJz
            public final Context LIZ;

            @Override // X.C0WKF
            public final Map<Integer, IWsApp> LIZIZ() {
                JSONArray jSONArray;
                int length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                try {
                    String strLIZJ = C0WFY.LIZIZ(this.LIZ).LIZ.LIZJ("ws_apps");
                    Logger.debug();
                    if (TextUtils.isEmpty(strLIZJ) || (length = (jSONArray = new JSONArray(strLIZJ)).length()) <= 0) {
                        return linkedHashMap;
                    }
                    ArrayList<Integer> arrayListLIZ = C0WFY.LIZIZ(this.LIZ).LIZ();
                    Logger.debug();
                    for (int i = 0; i < length; i++) {
                        new C821330WJv();
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        SsWsApp ssWsApp = new SsWsApp();
                        ssWsApp.LIZ(jSONObjectOptJSONObject);
                        if (LIZJ(ssWsApp) && !arrayListLIZ.contains(Integer.valueOf(ssWsApp.getChannelId()))) {
                            linkedHashMap.put(Integer.valueOf(ssWsApp.getChannelId()), ssWsApp);
                        }
                    }
                    Logger.debug();
                    return linkedHashMap;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return linkedHashMap;
                }
            }

            {
                this.LIZ = context;
            }

            public static boolean LIZJ(IWsApp iWsApp) {
                if (iWsApp == null || iWsApp.getChannelId() <= 0 || iWsApp.getAppId() <= 0 || C2093608Ic.LJ(iWsApp.getAppKey()) || iWsApp.getAppVersion() <= 0 || iWsApp.ZL().isEmpty() || C2093608Ic.LJ(iWsApp.getDeviceId()) || iWsApp.pf() <= 0 || C2093608Ic.LJ(iWsApp.getInstallId()) || iWsApp.getPlatform() != 0) {
                    return false;
                }
                return true;
            }

            @Override // X.C0WKF
            public final void LIZ(Map<Integer, IWsApp> map) {
                if (map == null) {
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                synchronized (WsChannelService.class) {
                    try {
                        for (Map.Entry entry : ((ConcurrentHashMap) map).entrySet()) {
                            try {
                                if (LIZJ((IWsApp) entry.getValue())) {
                                    jSONArray.put(((IWsApp) entry.getValue()).LJLIIIL());
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                try {
                    C0WFY c0wfyLIZIZ = C0WFY.LIZIZ(this.LIZ);
                    String string = jSONArray.toString();
                    C0WFS c0wfs = c0wfyLIZIZ.LIZ;
                    c0wfs.getClass();
                    C0WFV c0wfv = new C0WFV(c0wfs.LIZ);
                    c0wfv.LIZIZ.put("ws_apps", string);
                    c0wfv.LIZIZ();
                } catch (Exception e2) {
                }
            }
        }, c0wk9, c0wk6, new C0WK1(context, new WeakHandler(C786410Ut5.W2(handlerThread), new WeakHandler.IHandler() { // from class: X.0WFj
            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
            }
        })));
        c0wk6.LJ = c0wkc;
        return c0wkc;
    }
}
