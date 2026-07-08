package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1849280yDu extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1849280yDu(C1849390yE5 c1849390yE5) {
        super(2, c1849390yE5, C1849390yE5.class, "getStorageInfoSync", "getStorageInfoSync(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws Throwable {
        num.intValue();
        C1849210yDn c1849210yDnLIZ = ((C1849390yE5) this.receiver).LIZ();
        if (c1849210yDnLIZ != null) {
            c1849210yDnLIZ.LJFF();
            return c1849210yDnLIZ.LJIIIZ().LIZ();
        }
        return C2220181Buy.LIZJ;
    }
}
