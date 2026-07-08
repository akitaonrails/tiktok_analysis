package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WsD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836830WsD extends AbstractC836840WsE {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC836850WsF interfaceC836850WsF = (InterfaceC836850WsF) xBaseParamModel;
        String logType = interfaceC836850WsF.getLogType();
        String containerID = null;
        if (TextUtils.isEmpty(logType)) {
            C2382909Vj.LIZ(completionBlock, 0, "log_type is empty", null, 4);
            return;
        }
        String service = interfaceC836850WsF.getService();
        if (TextUtils.equals(logType, "service_monitor") && TextUtils.isEmpty(service)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service is required while log_type=");
            sbLIZ.append(logType);
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object objOpt = interfaceC836850WsF.toJSON().opt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (objOpt != null) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, objOpt);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            Object objOpt2 = interfaceC836850WsF.toJSON().opt("value");
            if (objOpt2 != null) {
                jSONObject.put("value", objOpt2);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C794420VEi.LIZIZ(logType, service, jSONObject);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC836860WsG.class, containerID), "");
    }
}
