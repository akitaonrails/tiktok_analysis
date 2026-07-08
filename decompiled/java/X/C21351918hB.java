package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18hB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class C21351918hB extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C21351918hB(C2220051Bul c2220051Bul) {
        super(2, c2220051Bul, C2220051Bul.class, "getSystemInfoSync", "getSystemInfoSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        num.intValue();
        return ((C2220051Bul) this.receiver).LIZ();
    }
}
