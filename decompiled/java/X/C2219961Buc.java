package X;

import Y.AObjectS301S0200000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Buc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219961Buc extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219961Buc(C2220001Bug c2220001Bug) {
        super(2, c2220001Bug, C2220001Bug.class, "getBatteryInfoSync", "getBatteryInfoSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.1Buj] */
    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        num.intValue();
        C2219681BuA c2219681BuA = ((C2220001Bug) this.receiver).LIZ.LJFF;
        c2219681BuA.getClass();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C2220031Buj();
        C23250099c.LJ(C23271099x.INSTANCE, new C05DD(c2219681BuA, new AObjectS301S0200000_34(c2219681BuA, c259800zU, 6), null));
        C2220031Buj c2220031Buj = (C2220031Buj) c259800zU.element;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errMsg", "getBatteryInfo:ok");
        jSONObject2.put("level", c2220031Buj.LIZ);
        jSONObject2.put("isCharging", c2220031Buj.LIZIZ);
        jSONObject2.put("isLowPowerModeEnabled", c2220031Buj.LIZJ);
        C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
        return C2220191Buz.LIZIZ(jSONObject2);
    }
}
