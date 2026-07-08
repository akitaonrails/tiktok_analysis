package X;

import Y.AObjectS301S0200000_34;
import Y.AObjectS89S0101000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2219951Bub extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2219951Bub(C2220001Bug c2220001Bug) {
        super(2, c2220001Bug, C2220001Bug.class, "getBatteryInfo", "getBatteryInfo(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        int iIntValue = num.intValue();
        C2220001Bug c2220001Bug = (C2220001Bug) this.receiver;
        C2219681BuA c2219681BuA = c2220001Bug.LIZ.LJFF;
        AObjectS89S0101000_34 aObjectS89S0101000_34 = new AObjectS89S0101000_34(c2220001Bug, iIntValue, 2);
        c2219681BuA.getClass();
        c2219681BuA.LJJZZI(new AObjectS301S0200000_34(c2219681BuA, aObjectS89S0101000_34, 1));
        return C2220181Buy.LJ;
    }
}
