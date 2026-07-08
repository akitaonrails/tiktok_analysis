package X;

import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.PipoPrefetchEventConfig;
import defpackage.l5;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725860v0q implements InterfaceC1548020qO0 {
    public static final PipoPrefetchEventConfig LIZ;

    static {
        PipoPrefetchEventConfig pipoPrefetchEventConfig = l5.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoPrefetchEventConfig pipoPrefetchEventConfig2 = l5.LIZ;
        PipoPrefetchEventConfig pipoPrefetchEventConfig3 = (PipoPrefetchEventConfig) settingsManagerLIZLLL.LJIIIIZZ("pipo_prefetch_event_config", PipoPrefetchEventConfig.class, pipoPrefetchEventConfig2);
        if (pipoPrefetchEventConfig3 != null) {
            pipoPrefetchEventConfig2 = pipoPrefetchEventConfig3;
        }
        LIZ = pipoPrefetchEventConfig2;
    }

    public static void LJ(Map map) throws JSONException {
        C1717770unn.LIZJ().isDebug();
        List<String> list = LIZ.disabledEvents;
        if (list != null && C13LP.LJJJJ(((LinkedHashMap) map).get("process"), list)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("rd_pipo_universal_container_prefetch", linkedHashMap);
    }

    @Override // X.InterfaceC1548020qO0
    public final void LIZIZ(String str, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "start");
        if (jSONObject != null) {
            linkedHashMap.put("extra", C786410Ut5.J3(jSONObject));
        }
        LJ(linkedHashMap);
    }

    @Override // X.InterfaceC1548020qO0
    public final void LIZ(Long l, String str, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "end");
        linkedHashMap.put("error_code", CardStruct.IStatusCode.DEFAULT);
        if (l != null) {
            l.longValue();
            linkedHashMap.put("duration", l.toString());
        }
        if (jSONObject != null) {
            linkedHashMap.put("extra", C786410Ut5.J3(jSONObject));
        }
        LJ(linkedHashMap);
    }

    @Override // X.InterfaceC1548020qO0
    public final void LIZJ(String str, EnumC1548140qOC enumC1548140qOC, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "end");
        linkedHashMap.put("error_code", String.valueOf(enumC1548140qOC.getErrorCode()));
        linkedHashMap.put("error_message", enumC1548140qOC.getMessage());
        if (jSONObject != null) {
            linkedHashMap.put("extra", C786410Ut5.J3(jSONObject));
        }
        LJ(linkedHashMap);
    }

    @Override // X.InterfaceC1548020qO0
    public final void LIZLLL(String str, Throwable th, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "exception");
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        linkedHashMap.put("error_code", message);
        linkedHashMap.put("error_message", Log.getStackTraceString(th));
        if (jSONObject != null) {
            linkedHashMap.put("extra", C786410Ut5.J3(jSONObject));
        }
        LJ(linkedHashMap);
    }
}
