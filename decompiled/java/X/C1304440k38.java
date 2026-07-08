package X;

import com.bytedance.amg.minigameruntime.api.IClientAdapterService;
import com.bytedance.vmsdk.worker.JsWorker;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1304440k38 extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1304440k38(C1304480k3C c1304480k3C) {
        super(2, c1304480k3C, C1304480k3C.class, "triggerGC", "triggerGC(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) {
        JsWorker jsWorker;
        num.intValue();
        C1304480k3C c1304480k3C = (C1304480k3C) this.receiver;
        IClientAdapterService iClientAdapterServiceLIZIZ = c1304480k3C.LIZ.LIZ.LIZIZ();
        if (iClientAdapterServiceLIZIZ != null && iClientAdapterServiceLIZIZ.isRemoteDebugMode()) {
            C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
            return C2220191Buz.LIZ("triggerGC:fail not support in remote debug mode");
        }
        C21346018gE c21346018gE = c1304480k3C.LIZ.LIZJ;
        if (!c21346018gE.LJII.get() && (jsWorker = c21346018gE.LJ) != null) {
            jsWorker.triggerGC();
            JSONObject jSONObject2 = new JSONObject();
            C2220181Buy c2220181Buy2 = C2220181Buy.LIZJ;
            return C2220191Buz.LIZIZ(jSONObject2);
        }
        C2220181Buy c2220181Buy3 = C2220181Buy.LIZJ;
        return C2220191Buz.LIZ("triggerGC:fail js worker unavailable");
    }
}
