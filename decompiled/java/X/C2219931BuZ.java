package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219931BuZ extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219931BuZ(C2219991Buf c2219991Buf) {
        super(2, c2219991Buf, C2219991Buf.class, "getClipboardData", "getClipboardData(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        int iIntValue = num.intValue();
        C2219991Buf c2219991Buf = (C2219991Buf) this.receiver;
        String str = c2219991Buf.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("data", str);
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        c2219991Buf.LIZ.LJJLIIJ(Integer.valueOf(iIntValue), C2220191Buz.LIZIZ(jSONObject2));
        return C2220181Buy.LJ;
    }
}
