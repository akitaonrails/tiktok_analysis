package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IEvent;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481630oev {
    public static void LIZLLL(boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = null;
        LIZIZ(jSONObject, null, false);
        if (jSONObject.length() <= 0) {
            return;
        }
        if (C1474810oTv.LJJLI()) {
            Object obj = jSONObject.get("play_sess");
            if (obj instanceof String) {
                str = (String) obj;
            }
            ((Integer) jSONObject.get("video_play_end")).intValue();
            ((Integer) jSONObject.get("video_request")).intValue();
            ((Integer) jSONObject.get("video_play_quality")).intValue();
            ((Integer) jSONObject.get("video_request_response")).intValue();
            C1482340og4.LIZIZ().getClass();
            C1482340og4.LIZJ(jSONObject, str, z);
            return;
        }
        IEvent iEventLIZJ = C1475000oUE.LIZJ();
        if (iEventLIZJ == null) {
            return;
        }
        iEventLIZJ.onEvent("play_session_events", jSONObject);
    }

    public static JSONObject LIZ(HashMap map, EnumC1481810ofD enumC1481810ofD) {
        JSONObject jSONObject;
        if (map != null && map.containsKey(enumC1481810ofD.name())) {
            String str = (String) map.get(enumC1481810ofD.name());
            if (str != null) {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = null;
            }
            jSONObject.length();
            return jSONObject;
        }
        return new JSONObject();
    }

    public static void LIZJ(String str, JSONObject jSONObject) throws JSONException {
        int i;
        int i2;
        HashMap<String, String> mapLIZLLL = ((C1481640oew) C1481590oer.LIZ()).LIZLLL(str);
        JSONObject jSONObjectLIZ = LIZ(mapLIZLLL, EnumC1481810ofD.VIDEO_REQUEST);
        JSONObject jSONObjectLIZ2 = LIZ(mapLIZLLL, EnumC1481810ofD.VIDEO_PLAY_QUALITY);
        JSONObject jSONObjectLIZ3 = LIZ(mapLIZLLL, EnumC1481810ofD.VIDEO_REQUEST_RESPONSE);
        if (jSONObjectLIZ3.length() > 0) {
            Iterator<String> itKeys = jSONObjectLIZ3.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectLIZ3.get(next));
            }
        }
        if (jSONObjectLIZ.length() > 0) {
            Iterator<String> itKeys2 = jSONObjectLIZ.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObject.put(next2, jSONObjectLIZ.get(next2));
            }
        }
        if (jSONObjectLIZ2.length() > 0) {
            Iterator<String> itKeys3 = jSONObjectLIZ2.keys();
            while (itKeys3.hasNext()) {
                String next3 = itKeys3.next();
                jSONObject.put(next3, jSONObjectLIZ2.get(next3));
            }
        }
        if (jSONObject.length() == 0) {
            return;
        }
        int i3 = 1;
        if (jSONObjectLIZ.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("video_request", i);
        if (jSONObjectLIZ2.length() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject.put("video_play_quality", i2);
        if (jSONObjectLIZ3.length() <= 0) {
            i3 = 0;
        }
        jSONObject.put("video_request_response", i3);
    }

    public static void LIZIZ(JSONObject jSONObject, String str, boolean z) throws JSONException {
        HashMap<String, String> mapLIZLLL;
        int i;
        int i2;
        int size;
        if (!z && ((C1481640oew) C1481590oer.LIZ()).LIZIZ.size() <= 0) {
            return;
        }
        int i3 = 0;
        if (!z) {
            C1481640oew c1481640oew = (C1481640oew) C1481590oer.LIZ();
            if (c1481640oew.LIZIZ.isEmpty()) {
                mapLIZLLL = null;
            } else {
                String first = c1481640oew.LIZIZ.getFirst();
                c1481640oew.LIZIZ.remove(0);
                mapLIZLLL = c1481640oew.LIZ(first);
                InterfaceC1481930ofP interfaceC1481930ofPLIZIZ = c1481640oew.LIZIZ(first);
                if (interfaceC1481930ofPLIZIZ != null) {
                    interfaceC1481930ofPLIZIZ.LIZ();
                }
                if (!TextUtils.isEmpty(first) && c1481640oew.LJ.containsKey(first)) {
                    c1481640oew.LJ.remove(first);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SimConvergeServiceImpl->read:  [api-2] sessionID = ");
                sbLIZ.append(first);
                sbLIZ.append(", the number of events = ");
                if (mapLIZLLL != null) {
                    size = mapLIZLLL.size();
                } else {
                    size = -1;
                }
                sbLIZ.append(size);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        } else {
            mapLIZLLL = ((C1481640oew) C1481590oer.LIZ()).LIZLLL(str);
        }
        JSONObject jSONObjectLIZ = LIZ(mapLIZLLL, EnumC1481810ofD.VIDEO_REQUEST);
        JSONObject jSONObjectLIZ2 = LIZ(mapLIZLLL, EnumC1481810ofD.VIDEO_PLAY_QUALITY);
        JSONObject jSONObjectLIZ3 = LIZ(mapLIZLLL, EnumC1481810ofD.VIDEO_REQUEST_RESPONSE);
        if (jSONObjectLIZ.length() > 0) {
            Iterator<String> itKeys = jSONObjectLIZ.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectLIZ.get(next));
            }
        }
        if (jSONObjectLIZ2.length() > 0) {
            Iterator<String> itKeys2 = jSONObjectLIZ2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                jSONObject.put(next2, jSONObjectLIZ2.get(next2));
            }
        }
        if (jSONObjectLIZ3.length() > 0) {
            Iterator<String> itKeys3 = jSONObjectLIZ3.keys();
            while (itKeys3.hasNext()) {
                String next3 = itKeys3.next();
                jSONObject.put(next3, jSONObjectLIZ3.get(next3));
            }
        }
        if (jSONObject.length() == 0) {
            return;
        }
        jSONObject.put("video_play_end", z ? 1 : 0);
        if (jSONObjectLIZ.length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        jSONObject.put("video_request", i);
        if (jSONObjectLIZ2.length() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        jSONObject.put("video_play_quality", i2);
        if (jSONObjectLIZ3.length() > 0) {
            i3 = 1;
        }
        jSONObject.put("video_request_response", i3);
    }
}
