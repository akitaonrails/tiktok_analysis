package X;

import Y.AObjectS320S0200000_34;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220931BwB extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220931BwB(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "readZipEntryBuffer", "readZipEntryBuffer(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        JSONObject jSONObject2 = jSONObject;
        Integer num2 = num;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        c2220331BvD.getClass();
        if (jSONObject2 != null && num2 != null) {
            C2221021BwK c2221021BwKLJJIIJ = c2220331BvD.LJJIIJ(jSONObject2);
            if (c2221021BwKLJJIIJ == null) {
                return c2220331BvD.LJIIIZ(num2.intValue(), true);
            }
            c2220331BvD.LIZ.LIZ.LJJIIZ(c2221021BwKLJJIIJ.LIZ, c2221021BwKLJJIIJ.LIZIZ, c2221021BwKLJJIIJ.LIZJ, c2221021BwKLJJIIJ.LIZLLL, new AObjectS320S0200000_34(c2220331BvD, num2, 1));
            return C2220181Buy.LJ;
        }
        return C2220181Buy.LIZLLL;
    }
}
