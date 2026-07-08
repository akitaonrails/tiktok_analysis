package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS68S1000000_17;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092650eXX {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C0JT6 LIZ(String str) {
        switch (str.hashCode()) {
            case 18096540:
                if (!str.equals("publish_screen")) {
                    return null;
                }
                return InterfaceC1093700eZE.Uf;
            case 552555053:
                if (!str.equals("capsule")) {
                    return null;
                }
                return InterfaceC1093700eZE.Tf;
            case 620466616:
                if (!str.equals("guide_gift_bubble")) {
                    return null;
                }
                return InterfaceC1093700eZE.Vf;
            case 1311830723:
                if (!str.equals("room_info_entrance")) {
                    return null;
                }
                return InterfaceC1093700eZE.Wf;
            default:
                return null;
        }
    }

    public static List LIZIZ(String str, String str2) {
        boolean z;
        String str3;
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C13BV.INSTANCE;
        }
        C0JT6 c0jt6LIZ = LIZ(str);
        if (c0jt6LIZ == null) {
            return C13BV.INSTANCE;
        }
        Map map = (Map) c0jt6LIZ.LIZ();
        if (map != null && (str3 = (String) map.get(str2)) != null) {
            try {
                JSONArray jSONArray = new JSONArray(str3);
                C13DV c13dv = new C13DV(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        c13dv.add(new C1092660eXY(jSONObjectOptJSONObject.optLong("time_ts", 0L), jSONObjectOptJSONObject.optString("uid", ""), jSONObjectOptJSONObject.optString("anchor_id", ""), jSONObjectOptJSONObject.optBoolean("operation_complete", false)));
                    }
                }
                return C1697820uHc.LIZ(c13dv);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return C13BV.INSTANCE;
            }
        }
        return C13BV.INSTANCE;
    }

    public static void LIZJ(int i, DataChannel dataChannel, String str, String str2, boolean z) {
        AwS68S1000000_17 awS68S1000000_17;
        if (str2.length() == 0 || dataChannel == null) {
            return;
        }
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        String strValueOf2 = String.valueOf(C500260Jjc.LIZIZ(dataChannel));
        if (i == 1) {
            awS68S1000000_17 = new AwS68S1000000_17(strValueOf, 3);
        } else {
            awS68S1000000_17 = new AwS68S1000000_17(strValueOf2, 4);
        }
        if (z) {
            List<C1092660eXY> listLIZIZ = LIZIZ(str, str2);
            if (!(listLIZIZ instanceof Collection) || !listLIZIZ.isEmpty()) {
                for (C1092660eXY c1092660eXY : listLIZIZ) {
                    if (((Boolean) awS68S1000000_17.invoke(c1092660eXY)).booleanValue() && c1092660eXY.LIZLLL) {
                        return;
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("uid", strValueOf);
        jSONObject.put("anchor_id", strValueOf2);
        jSONObject.put("time_ts", System.currentTimeMillis());
        if (z) {
            jSONObject.put("operation_complete", true);
        }
        C0JT6 c0jt6LIZ = LIZ(str);
        if (c0jt6LIZ == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) c0jt6LIZ.LIZ();
        if (map != null && (!map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        String str3 = (String) linkedHashMap.get(str2);
        if (str3 == null) {
            str3 = "[]";
        }
        JSONArray jSONArray = new JSONArray(str3);
        jSONArray.put(jSONObject);
        linkedHashMap.put(str2, jSONArray.toString());
        c0jt6LIZ.LIZJ(linkedHashMap);
    }
}
