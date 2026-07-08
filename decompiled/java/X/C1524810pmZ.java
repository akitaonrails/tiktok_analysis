package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524810pmZ extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524810pmZ(C1525160pn8 c1525160pn8) {
        super(2, c1525160pn8, C1525160pn8.class, "downloadFile", "downloadFile(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        num.intValue();
        C1525160pn8 c1525160pn8 = (C1525160pn8) this.receiver;
        c1525160pn8.getClass();
        int iIncrementAndGet = C1524520pm6.LIZ.incrementAndGet();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1524760pmU(c1525160pn8, jSONObject, iIncrementAndGet, null), 3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("downloadTaskId", iIncrementAndGet);
        return new C2220181Buy(new C1525410pnX(true, jSONObject2, null, null), 0);
    }
}
