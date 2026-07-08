package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524920pmk extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524920pmk(C1524780pmW c1524780pmW) {
        super(2, c1524780pmW, C1524780pmW.class, "socketSend", "socketSend(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        int iIntValue = num.intValue();
        C1524780pmW c1524780pmW = (C1524780pmW) this.receiver;
        c1524780pmW.getClass();
        JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
        jSONObject2.put("operationType", "send");
        return c1524780pmW.LIZJ(iIntValue, jSONObject2);
    }
}
