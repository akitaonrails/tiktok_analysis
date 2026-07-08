package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1848820yDA extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1848820yDA(C1848770yD5 c1848770yD5) {
        super(2, c1848770yD5, C1848770yD5.class, "removeStorage", "removeStorage(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        C2220181Buy c2220181BuyLIZ;
        InterfaceC1525090pn1 interfaceC1525090pn1;
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C1848770yD5 c1848770yD5 = (C1848770yD5) this.receiver;
        c1848770yD5.getClass();
        if (jSONObject2.has("key") && !jSONObject2.isNull("key")) {
            Object objOpt = jSONObject2.opt("key");
            if (!(objOpt instanceof String)) {
                c2220181BuyLIZ = C2220181Buy.LIZLLL;
            } else {
                String str = (String) objOpt;
                C1848740yD2 c1848740yD2LIZIZ = c1848770yD5.LIZIZ();
                if (c1848740yD2LIZIZ != null) {
                    c2220181BuyLIZ = c1848740yD2LIZIZ.LIZIZ(str).LIZ();
                } else {
                    c2220181BuyLIZ = C2220181Buy.LIZJ;
                }
            }
        } else {
            c2220181BuyLIZ = C2220181Buy.LIZLLL;
        }
        C1848840yDC c1848840yDC = c1848770yD5.LIZ;
        if (c1848840yDC != null && (interfaceC1525090pn1 = c1848840yDC.LIZIZ) != null) {
            interfaceC1525090pn1.LJJLIIJ(Integer.valueOf(iIntValue), c2220181BuyLIZ);
        }
        return c2220181BuyLIZ;
    }
}
