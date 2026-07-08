package X;

import Y.AObjectS301S0200000_34;
import Y.AObjectS89S0101000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bua, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219941Bua extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219941Bua(C2220021Bui c2220021Bui) {
        super(2, c2220021Bui, C2220021Bui.class, "getScreenBrightness", "getScreenBrightness(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2220021Bui c2220021Bui = (C2220021Bui) this.receiver;
        C2219681BuA c2219681BuA = c2220021Bui.LIZ.LJFF;
        AObjectS89S0101000_34 aObjectS89S0101000_34 = new AObjectS89S0101000_34(c2220021Bui, iIntValue, 29);
        c2219681BuA.getClass();
        c2219681BuA.LJJZZIII(new AObjectS301S0200000_34(c2219681BuA, aObjectS89S0101000_34, 9));
        return C2220181Buy.LJ;
    }
}
