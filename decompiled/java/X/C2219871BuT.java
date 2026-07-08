package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219871BuT extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219871BuT(C2219971Bud c2219971Bud) {
        super(2, c2219971Bud, C2219971Bud.class, "vibrateLong", "vibrateLong(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        String str;
        int iIntValue = num.intValue();
        C2219971Bud c2219971Bud = (C2219971Bud) this.receiver;
        if (!c2219971Bud.LIZIZ.LIZ) {
            C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
            return C2220191Buz.LIZ("vibrateLong:fail app in pause");
        }
        EnumC1488940oqi enumC1488940oqiLJLJJLL = c2219971Bud.LIZ.LJFF.LJLJJLL(EnumC2219721BuE.LONG);
        if (enumC1488940oqiLJLJJLL == EnumC1488940oqi.OK) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errMsg", "vibrateLong:ok");
            C2220181Buy c2220181Buy2 = C2220181Buy.LIZJ;
            C2220181Buy c2220181BuyLIZIZ = C2220191Buz.LIZIZ(jSONObject2);
            c2219971Bud.LIZJ.LJJLIIJ(Integer.valueOf(iIntValue), c2220181BuyLIZIZ);
            return c2220181BuyLIZIZ;
        }
        if (enumC1488940oqiLJLJJLL == EnumC1488940oqi.UNSUPPORTED) {
            str = "unsupported";
        } else {
            str = "unknown error";
        }
        C2220181Buy c2220181Buy3 = C2220181Buy.LIZJ;
        C2220181Buy c2220181BuyLIZ = C2220191Buz.LIZ("vibrateLong:fail ".concat(str));
        c2219971Bud.LIZJ.LJJLIIJ(Integer.valueOf(iIntValue), c2220181BuyLIZ);
        return c2220181BuyLIZ;
    }
}
