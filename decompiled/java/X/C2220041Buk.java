package X;

import Y.AObjectS301S0200000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Buk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220041Buk extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220041Buk(C2220051Bul c2220051Bul) {
        super(2, c2220051Bul, C2220051Bul.class, "getDeviceInfoSync", "getDeviceInfoSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.1BuH] */
    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        num.intValue();
        C2219681BuA c2219681BuA = ((C2220051Bul) this.receiver).LIZ.LJFF;
        c2219681BuA.getClass();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C2219751BuH(0);
        C23250099c.LJ(C23271099x.INSTANCE, new C05DD(c2219681BuA, new AObjectS301S0200000_34(c2219681BuA, c259800zU, 0), null));
        C2219751BuH c2219751BuH = (C2219751BuH) c259800zU.element;
        JSONObject jSONObjectPut = new JSONObject().put("abi", c2219751BuH.LIZ).put("deviceAbi", c2219751BuH.LIZIZ).put("benchmarkLevel", c2219751BuH.LIZJ).put("brand", c2219751BuH.LIZLLL).put("model", c2219751BuH.LJ).put("system", c2219751BuH.LJFF).put("platform", c2219751BuH.LJI).put("cpuType", c2219751BuH.LJII).put("memorySize", c2219751BuH.LJIIIIZZ).put("errMsg", "getDeviceInfo:ok");
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        return C2220191Buz.LIZIZ(jSONObjectPut);
    }
}
