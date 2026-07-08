package X;

import com.benchmark.IBTCHApplog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18aK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21309418aK {
    public static InterfaceC21309518aL LIZ;

    public static synchronized void LIZJ(InterfaceC21309518aL interfaceC21309518aL) {
        LIZ = interfaceC21309518aL;
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append(C786410Ut5.J3(jSONObject));
            C2188811AlT.LIZIZ(sbLIZ);
            C806930Vl5.LIZ("ByteBench AppLogCenter");
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(": param is null");
            C2188811AlT.LIZIZ(sbLIZ2);
            C806930Vl5.LJ("ByteBench AppLogCenter");
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("sdk_version", "2.0.10-1");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC21309518aL interfaceC21309518aL = LIZ;
        if (interfaceC21309518aL != null) {
            interfaceC21309518aL.onEvent(str, jSONObject);
            return;
        }
        IBTCHApplog iBTCHApplog = (IBTCHApplog) ServiceManager.get().getService(IBTCHApplog.class);
        if (iBTCHApplog == null) {
            return;
        }
        iBTCHApplog.onEvent();
    }

    public static void LIZIZ(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = null;
        }
        C806930Vl5.LIZ("ByteBench AppLogCenternot json");
        LIZ(str, jSONObject);
    }
}
