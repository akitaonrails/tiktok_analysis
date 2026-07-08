package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xrL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final /* synthetic */ class C1835290xrL extends C2217421BqW implements Function1<JSONObject, Unit> {
    public C1835290xrL(Object obj) {
        super(1, obj, C1835270xrJ.class, "sendJsEventMethod", "sendJsEventMethod(Lorg/json/JSONObject;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        InterfaceC634840OvC interfaceC634840OvC = ((AbstractC1549150qPp) this.receiver).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC634840OvC.sendEvent("downloadMediaStatusChange", jSONObject2);
        } else {
            C389001fE.LIZ("downloadMediaStatusChange", jSONObject2, System.currentTimeMillis(), false);
        }
        return Unit.LIZ;
    }
}
