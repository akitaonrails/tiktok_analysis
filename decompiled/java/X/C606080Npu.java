package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Npu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606080Npu extends AbstractC606090Npv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC606100Npw interfaceC606100Npw = (InterfaceC606100Npw) xBaseParamModel;
        String str = "";
        if (interfaceC606100Npw.getKeys().isEmpty()) {
            C2382909Vj.LIZ(completionBlock, -3, "empty key or unsupported key type in params", null, 4);
            return;
        }
        try {
            String str2 = C463630IGb.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            JSONObject jSONObject = new JSONObject(str2);
            HashMap map = new HashMap();
            for (InterfaceC828580Weu interfaceC828580Weu : interfaceC606100Npw.getKeys()) {
                Object objOpt = jSONObject.opt(interfaceC828580Weu.getKey());
                if (objOpt != null) {
                    map.put(interfaceC828580Weu.getKey(), objOpt);
                }
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC606070Npt.class, containerID);
            ((InterfaceC606070Npt) xBaseModelLIZJ).setSettings(map);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            C2382909Vj.LIZ(completionBlock, C386801es.DEFAULT, str, null, 4);
        }
    }
}
