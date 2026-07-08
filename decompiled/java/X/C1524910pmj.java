package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524910pmj extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524910pmj(C1524780pmW c1524780pmW) {
        super(2, c1524780pmW, C1524780pmW.class, "operateSocket", "operateSocket(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        int iIntValue = num.intValue();
        return ((C1524780pmW) this.receiver).LIZJ(iIntValue, jSONObject);
    }
}
