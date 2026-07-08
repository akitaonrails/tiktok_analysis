package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725050uzX implements InterfaceC1725100uzc {
    public final String LIZ;
    public final String LIZIZ;

    public final void LIZJ(Map map) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put("product", this.LIZ);
        linkedHashMap.put("locale", this.LIZIZ);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        C1713870uhV.LIZ("rd_pipo_error_code_sdk", linkedHashMap2);
        C1717770unn.LIZJ().isDebug();
    }

    public C1725050uzX(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC1725100uzc
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
        LIZJ(linkedHashMap);
    }

    @Override // X.InterfaceC1725100uzc
    public final void LIZIZ(String str, EnumC1725040uzW enumC1725040uzW, JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("process", str);
        linkedHashMap.put("step", "end");
        linkedHashMap.put("error_code", String.valueOf(enumC1725040uzW.getErrorCode()));
        linkedHashMap.put("error_message", enumC1725040uzW.getMessage());
        if (jSONObject != null) {
            linkedHashMap.put("extra", C786410Ut5.J3(jSONObject));
        }
        LIZJ(linkedHashMap);
    }
}
