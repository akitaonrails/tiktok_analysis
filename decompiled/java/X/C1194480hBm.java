package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hBm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194480hBm extends AbstractC1194490hBn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Context contextLIZLLL;
        Context context;
        String containerID;
        String str = "";
        InterfaceC1194500hBo interfaceC1194500hBo = (InterfaceC1194500hBo) xBaseParamModel;
        C1152790g6X c1152790g6X = new C1152790g6X(interfaceC1194500hBo.getShoppingTaskParams(), interfaceC1194500hBo.getLynxSchema());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            contextLIZLLL = interfaceC634840OvC.LIZLLL();
            context = interfaceC634840OvC.getContext();
        } else {
            contextLIZLLL = null;
            context = null;
        }
        if (contextLIZLLL == null) {
            contextLIZLLL = context;
        }
        if (contextLIZLLL == null) {
            new Object() { // from class: X.0hBr
            }.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "open_shopping_page_error");
            jSONObject.put("message", "context is null");
            C20684815ws.LJIJ("commercialize_shopping_task", jSONObject);
            C2382909Vj.LIZ(completionBlock, -1, "invalid_context", null, 4);
            return;
        }
        try {
            C1169340gXE.LIZ(contextLIZLLL, c1152790g6X);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1194510hBp.class, containerID), "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1194530hBr c1194530hBr = new Object() { // from class: X.0hBr
            };
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            c1194530hBr.getClass();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("action", "open_shopping_page_error");
            jSONObject2.put("message", str);
            C20684815ws.LJIJ("commercialize_shopping_task", jSONObject2);
            C2382909Vj.LIZ(completionBlock, -1, "open_shop_page_failed", null, 4);
        }
    }
}
