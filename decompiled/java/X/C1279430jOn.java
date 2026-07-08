package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279430jOn {
    public C1279450jOp LIZ;

    public final void LJ() {
        if (this.LIZ == null) {
            C1279450jOp c1279450jOp = new C1279450jOp();
            this.LIZ = c1279450jOp;
            c1279450jOp.LIZ = new C1279440jOo();
        }
    }

    public final JSONObject LIZ() {
        LJ();
        String strLIZ = C1279440jOo.LIZ("https://rtc-sg.tiktokv.com/");
        String str = TextUtils.isEmpty(strLIZ) ? "https://rtc-sg.tiktokv.com/" : strLIZ;
        String strLIZ2 = C1279440jOo.LIZ("https://rtcpc-access-sg.tiktokv.com/");
        String str2 = TextUtils.isEmpty(strLIZ2) ? "https://rtcpc-access-sg.tiktokv.com/" : strLIZ2;
        String strLIZ3 = C1279440jOo.LIZ("https://rtc-access-sg.tiktokv.com/");
        String str3 = TextUtils.isEmpty(strLIZ3) ? "https://rtc-access-sg.tiktokv.com/" : strLIZ3;
        String strLIZ4 = C1279440jOo.LIZ("https://rtc-logger-va.tiktokv.com/");
        String str4 = TextUtils.isEmpty(strLIZ4) ? "https://rtc-logger-va.tiktokv.com/" : strLIZ4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ(str4));
        sbLIZ.append("report");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        try {
            if (!TextUtils.isEmpty(null)) {
                return new JSONObject((String) null);
            }
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("config_hosts", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONObject.put("access_hosts", jSONArray2);
            jSONObject.put("rtc.log_sdk_websocket_url", strLIZIZ);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final ArrayList<String> LIZJ() {
        LJ();
        String strLIZ = C1279440jOo.LIZ("https://rtcpc-access-sg.tiktokv.com/");
        String str = TextUtils.isEmpty(strLIZ) ? "https://rtcpc-access-sg.tiktokv.com/" : strLIZ;
        String strLIZ2 = C1279440jOo.LIZ("https://rtc-access-sg.tiktokv.com/");
        String str2 = TextUtils.isEmpty(strLIZ2) ? "https://rtc-access-sg.tiktokv.com/" : strLIZ2;
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        arrayList.add(str2);
        return arrayList;
    }

    public final String LIZLLL() {
        LJ();
        String strLIZ = C1279440jOo.LIZ("https://rtc-logger-va.tiktokv.com/");
        String str = TextUtils.isEmpty(strLIZ) ? "https://rtc-logger-va.tiktokv.com/" : strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZIZ(str));
        sbLIZ.append("report");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.contains("http://")) {
                return str.replace("http", "wss");
            }
            if (!str.contains("https://")) {
                return str;
            }
            return str.replace("https", "wss");
        }
        return str;
    }
}
