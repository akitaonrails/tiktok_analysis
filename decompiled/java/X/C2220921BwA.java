package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class C2220921BwA extends C2217421BqW implements InterfaceC1631620sYq<JSONObject, Map<String, ? extends byte[]>, Integer, C2220181Buy> {
    public C2220921BwA(C2220331BvD c2220331BvD) {
        super(3, c2220331BvD, C2220331BvD.class, "readZipEntryBufferSync", "readZipEntryBufferSync(Lorg/json/JSONObject;Ljava/util/Map;Ljava/lang/Integer;)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final C2220181Buy invoke(JSONObject jSONObject, Map<String, ? extends byte[]> map, Integer num) {
        int iIntValue;
        JSONObject jSONObject2 = jSONObject;
        Integer num2 = num;
        C2220331BvD c2220331BvD = (C2220331BvD) this.receiver;
        if (jSONObject2 == null) {
            c2220331BvD.getClass();
            return C2220181Buy.LIZLLL;
        }
        C2221021BwK c2221021BwKLJJIIJ = c2220331BvD.LJJIIJ(jSONObject2);
        if (c2221021BwKLJJIIJ == null) {
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = -1;
            }
            return c2220331BvD.LJIIIZ(iIntValue, false);
        }
        return C2220331BvD.LJII(c2220331BvD.LIZ.LIZ.LJIIIIZZ(c2221021BwKLJJIIJ.LIZ, c2221021BwKLJJIIJ.LIZLLL, c2221021BwKLJJIIJ.LIZIZ, c2221021BwKLJJIIJ.LIZJ), true);
    }
}
