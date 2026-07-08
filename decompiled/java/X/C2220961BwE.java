package X;

import Y.AObjectS89S0101000_34;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BwE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220961BwE extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C2220961BwE(C2220331BvD c2220331BvD) {
        super(2, c2220331BvD, C2220331BvD.class, "readZipEntry", "readZipEntry(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        C2221021BwK c2221021BwKLJJIIJ = c2220331BvD.LJJIIJ(jSONObject);
        if (c2221021BwKLJJIIJ == null) {
            return c2220331BvD.LJIIIZ(iIntValue, true);
        }
        c2220331BvD.LIZ.LIZ.LJJIIZ(c2221021BwKLJJIIJ.LIZ, c2221021BwKLJJIIJ.LIZIZ, c2221021BwKLJJIIJ.LIZJ, c2221021BwKLJJIIJ.LIZLLL, new AObjectS89S0101000_34(c2220331BvD, iIntValue, 11));
        return C2220181Buy.LJ;
    }
}
