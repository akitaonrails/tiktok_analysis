package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1059940dgm extends AbstractC1059960dgo {
    @C14EU
    public final void onEvent(C848460XQe c848460XQe) {
        String str = c848460XQe.LIZ;
        JSONObject jSONObject = c848460XQe.LIZIZ;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC634840OvC.sendEvent("H5_nativeEvent", jSONObject2);
        }
        EventBus.LIZLLL().LJJI(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r14, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r15, X.EnumC1063300dmC r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1059940dgm.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
