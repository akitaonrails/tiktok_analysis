package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bum, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220061Bum extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220061Bum(C2220051Bul c2220051Bul) {
        super(2, c2220051Bul, C2220051Bul.class, "getWindowInfo", "getWindowInfo(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        num.intValue();
        C2219691BuB c2219691BuBLJLIIL = ((C2220051Bul) this.receiver).LIZ.LJFF.LJLIIL();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("top", c2219691BuBLJLIIL.LJIIJ.LIZ).put("bottom", c2219691BuBLJLIIL.LJIIJ.LIZIZ).put("left", c2219691BuBLJLIIL.LJIIJ.LIZJ).put("right", c2219691BuBLJLIIL.LJIIJ.LIZLLL).put("width", c2219691BuBLJLIIL.LJIIJ.LJ).put("height", c2219691BuBLJLIIL.LJIIJ.LJFF);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("screenWidth", c2219691BuBLJLIIL.LIZ).put("screenHeight", c2219691BuBLJLIIL.LIZIZ).put("windowWidth", c2219691BuBLJLIIL.LIZJ).put("windowHeight", c2219691BuBLJLIIL.LIZLLL).put("pixelRatio", Float.valueOf(c2219691BuBLJLIIL.LJFF)).put("safeArea", jSONObject2).put("statusBarHeight", c2219691BuBLJLIIL.LJIJI).put("screenTop", 0).put("errMsg", "getWindowInfo:ok");
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        return C2220191Buz.LIZIZ(jSONObject3);
    }
}
