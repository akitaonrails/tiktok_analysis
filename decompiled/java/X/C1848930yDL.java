package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1848930yDL extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1848930yDL(C1848770yD5 c1848770yD5) {
        super(2, c1848770yD5, C1848770yD5.class, "getStorageInfoSync", "getStorageInfoSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        num.intValue();
        return ((C1848770yD5) this.receiver).LIZJ();
    }
}
