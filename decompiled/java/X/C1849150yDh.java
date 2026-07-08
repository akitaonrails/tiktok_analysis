package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1849150yDh extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1849150yDh(C1849390yE5 c1849390yE5) {
        super(2, c1849390yE5, C1849390yE5.class, "setStorageSync", "setStorageSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        String string;
        JSONObject jSONObject2 = jSONObject;
        num.intValue();
        C1849390yE5 c1849390yE5 = (C1849390yE5) this.receiver;
        c1849390yE5.getClass();
        if (jSONObject2.has("key") && !jSONObject2.isNull("key")) {
            if (!jSONObject2.has("data")) {
                return C2220181Buy.LIZLLL;
            }
            Object objOpt = jSONObject2.opt("key");
            if (objOpt instanceof String) {
                string = (String) objOpt;
            } else if (objOpt instanceof Number) {
                string = objOpt.toString();
            } else {
                return C2220181Buy.LIZLLL;
            }
            C1849210yDn c1849210yDnLIZ = c1849390yE5.LIZ();
            if (c1849210yDnLIZ != null) {
                Object objOpt2 = jSONObject2.opt("data");
                c1849210yDnLIZ.LJFF();
                return c1849210yDnLIZ.LJIL(objOpt2, string).LIZ();
            }
            return C2220181Buy.LIZJ;
        }
        return C2220181Buy.LIZLLL;
    }
}
