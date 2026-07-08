package X;

import android.util.Log;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0v1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726450v1n implements InterfaceC1726660v28 {
    public static final C1726450v1n LIZ = new C1726450v1n();
    public static final Map<String, String> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC1726660v28
    public final void LIZ() {
        LJI("init", C2097608Jq.LJ());
    }

    public static void LJ(Map map) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("rd_pipo_security_sdk", linkedHashMap);
        C1717770unn.LIZJ().isOffline();
    }

    @Override // X.InterfaceC1726660v28
    public final void LIZIZ(long j) {
        LJII(j, "init", C2097608Jq.LJ());
    }

    @Override // X.InterfaceC1726660v28
    public final void LIZJ(Throwable th) {
        LJFF("init", th, C2097608Jq.LJ());
    }

    public static void LJI(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "start");
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        LJ(linkedHashMap);
    }

    public static void LIZLLL(String str, Throwable th, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "exception");
        String message = th.getMessage();
        if (message != null) {
            linkedHashMap.put("error_code", message);
        }
        linkedHashMap.put("error_message", Log.getStackTraceString(th));
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        LJ(linkedHashMap);
    }

    public static void LJFF(String str, Throwable th, Map map) {
        String message = th.getMessage();
        if (message != null && message.length() != 0) {
            EnumC1726510v1t[] enumC1726510v1tArrValues = EnumC1726510v1t.values();
            int length = enumC1726510v1tArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC1726510v1t enumC1726510v1t = enumC1726510v1tArrValues[i];
                if (u.LJJIIJZLJL(message, enumC1726510v1t.getMessage(), false)) {
                    message = String.valueOf(enumC1726510v1t.getErrorCode());
                    break;
                }
                i++;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "end");
        linkedHashMap.put("result", "1");
        String str2 = "";
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("error_code", message);
        String message2 = th.getMessage();
        if (message2 != null) {
            str2 = message2;
        }
        linkedHashMap.put("error_message", str2);
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        LJ(linkedHashMap);
    }

    public static void LJII(long j, String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "end");
        linkedHashMap.put("result", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("duration", String.valueOf(j));
        linkedHashMap.putAll(LIZIZ);
        linkedHashMap.putAll(map);
        LJ(linkedHashMap);
    }
}
