package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838690WvD extends AbstractC838710WvF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        boolean z;
        InterfaceC838700WvE interfaceC838700WvE = (InterfaceC838700WvE) xBaseParamModel;
        String logType = interfaceC838700WvE.getLogType();
        if (logType != null && logType.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "log_type is empty", null, 4);
            return;
        }
        String service = interfaceC838700WvE.getService();
        if (TextUtils.equals(logType, "service_monitor") && (service == null || service.length() == 0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service is required while log_type=");
            sbLIZ.append(logType);
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (interfaceC838700WvE.getStatus() != null) {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, interfaceC838700WvE.getStatus());
        }
        if (interfaceC838700WvE.getValue() != null) {
            jSONObject.put("value", interfaceC838700WvE.getValue());
        }
        C794420VEi.LIZIZ(logType, service, jSONObject);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC838720WvG.class, containerID), "");
    }
}
