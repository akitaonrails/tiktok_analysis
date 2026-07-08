package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1304460k3A extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1304460k3A(C1304480k3C c1304480k3C) {
        super(2, c1304480k3C, C1304480k3C.class, "performanceNowTime", "performanceNowTime(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        num.intValue();
        this.receiver.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", System.currentTimeMillis());
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        return C2220191Buz.LIZIZ(jSONObject2);
    }
}
