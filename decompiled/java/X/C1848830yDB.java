package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1848830yDB extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1848830yDB(C1848770yD5 c1848770yD5) {
        super(2, c1848770yD5, C1848770yD5.class, "removeStorageSync", "removeStorageSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        num.intValue();
        C1848770yD5 c1848770yD5 = (C1848770yD5) this.receiver;
        c1848770yD5.getClass();
        if (jSONObject2.has("key") && !jSONObject2.isNull("key")) {
            Object objOpt = jSONObject2.opt("key");
            if (!(objOpt instanceof String)) {
                return C2220181Buy.LIZLLL;
            }
            String str = (String) objOpt;
            C1848740yD2 c1848740yD2LIZIZ = c1848770yD5.LIZIZ();
            if (c1848740yD2LIZIZ != null) {
                return c1848740yD2LIZIZ.LIZIZ(str).LIZ();
            }
            return C2220181Buy.LIZJ;
        }
        return C2220181Buy.LIZLLL;
    }
}
