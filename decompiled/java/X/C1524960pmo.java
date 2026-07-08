package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524960pmo extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524960pmo(C1524940pmm c1524940pmm) {
        super(2, c1524940pmm, C1524940pmm.class, "createUDPSocket", "createUDPSocket(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        num.intValue();
        this.receiver.getClass();
        int iIncrementAndGet = C1524520pm6.LIZ.incrementAndGet();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("socketId", iIncrementAndGet);
        return new C2220181Buy(new C1525410pnX(true, jSONObject2, null, null), 0);
    }
}
