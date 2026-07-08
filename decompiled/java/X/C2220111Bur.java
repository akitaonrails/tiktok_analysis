package X;

import Y.AObjectS301S0200000_34;
import Y.AObjectS89S0101000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220111Bur extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220111Bur(C2220051Bul c2220051Bul) {
        super(2, c2220051Bul, C2220051Bul.class, "getSystemSetting", "getSystemSetting(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        int iIntValue = num.intValue();
        C2220051Bul c2220051Bul = (C2220051Bul) this.receiver;
        C2219681BuA c2219681BuA = c2220051Bul.LIZ.LJFF;
        AObjectS89S0101000_34 aObjectS89S0101000_34 = new AObjectS89S0101000_34(c2220051Bul, iIntValue, 22);
        c2219681BuA.getClass();
        c2219681BuA.LJJZZI(new AObjectS301S0200000_34(c2219681BuA, aObjectS89S0101000_34, 2));
        return C2220181Buy.LJ;
    }
}
