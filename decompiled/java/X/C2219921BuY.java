package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219921BuY extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219921BuY(C2219991Buf c2219991Buf) {
        super(2, c2219991Buf, C2219991Buf.class, "setClipboardData", "setClipboardData(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2219991Buf c2219991Buf = (C2219991Buf) this.receiver;
        c2219991Buf.getClass();
        c2219991Buf.LIZIZ = jSONObject.optString("data", "");
        JSONObject jSONObject2 = new JSONObject();
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        c2219991Buf.LIZ.LJJLIIJ(Integer.valueOf(iIntValue), C2220191Buz.LIZIZ(jSONObject2));
        return C2220181Buy.LJ;
    }
}
