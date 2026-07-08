package X;

import Y.AObjectS103S0101000_34;
import Y.AObjectS408S0100000_34;
import java.util.Locale;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219911BuX extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219911BuX(C2220011Buh c2220011Buh) {
        super(2, c2220011Buh, C2220011Buh.class, "setDeviceOrientation", "setDeviceOrientation(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        int iIntValue = num.intValue();
        C2220011Buh c2220011Buh = (C2220011Buh) this.receiver;
        c2220011Buh.getClass();
        if (!jSONObject2.has("value")) {
            C21346018gE c21346018gE = c2220011Buh.LIZIZ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            C2220181Buy c2220181Buy = C2220181Buy.LIZLLL;
            c21346018gE.LJJLIIJ(numValueOf, c2220181Buy);
            return c2220181Buy;
        }
        Intrinsics.LJFF(jSONObject2.optString("value", "").toLowerCase(Locale.ROOT), "landscape");
        C2219681BuA c2219681BuA = c2220011Buh.LIZ.LJFF;
        AObjectS103S0101000_34 aObjectS103S0101000_34 = new AObjectS103S0101000_34(c2220011Buh, iIntValue, 6);
        c2219681BuA.getClass();
        c2219681BuA.LJJZZIII(new AObjectS408S0100000_34(aObjectS103S0101000_34, 5));
        return C2220181Buy.LIZLLL;
    }
}
