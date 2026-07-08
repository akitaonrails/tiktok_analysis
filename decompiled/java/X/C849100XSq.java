package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849100XSq extends AbstractC849110XSr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        boolean z;
        InterfaceC849120XSs interfaceC849120XSs = (InterfaceC849120XSs) xBaseParamModel;
        String logType = interfaceC849120XSs.getLogType();
        if (logType.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "PhoneNumber in the params is empty", null, 4);
            return;
        }
        String service = interfaceC849120XSs.getService();
        if (service == null) {
            service = "";
        }
        if (Intrinsics.LJFF("service_monitor", logType) && service.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("service is required while log_type=");
            sbLIZ.append(logType);
            C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, interfaceC849120XSs.getStatus());
        Map<String, Object> value = interfaceC849120XSs.getValue();
        if (value != null) {
            jSONObject.put("value", new JSONObject(value));
        }
        try {
            if (service.length() != 0) {
                jSONObject.put("service", service);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C793770VBv.LJ(logType, jSONObject);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC849130XSt.class, null), "");
    }
}
