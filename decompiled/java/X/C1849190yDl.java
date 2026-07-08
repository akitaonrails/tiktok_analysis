package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1849190yDl extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1849190yDl(C1849390yE5 c1849390yE5) {
        super(2, c1849390yE5, C1849390yE5.class, "getStorage", "getStorage(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        C1849390yE5 c1849390yE5 = (C1849390yE5) this.receiver;
        C23250099c.LIZLLL(c1849390yE5.LIZ, null, null, new C1849200yDm(jSONObject, c1849390yE5, iIntValue, null), 3);
        return C2220181Buy.LJ;
    }
}
