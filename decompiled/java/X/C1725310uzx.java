package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.lang.ref.Reference;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725310uzx extends AbstractC1725340v00 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        String containerID;
        InterfaceC1725400v06 interfaceC1725400v06 = (InterfaceC1725400v06) xBaseParamModel;
        String parameter = interfaceC1725400v06.getParameter();
        String value = interfaceC1725400v06.getValue();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        Reference reference = (Reference) ((LinkedHashMap) C1725300uzw.LLJILJILJ).get(containerID);
        if (reference != null) {
            C1725300uzw c1725300uzw = (C1725300uzw) reference.get();
            if (c1725300uzw != null) {
                if (Intrinsics.LJFF(parameter, "pipo_jump_schema_when_close")) {
                    c1725300uzw.LLILLL = value;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1725390v05.class, null);
                    ((InterfaceC1725390v05) xBaseModelLIZJ).setSuccess(Boolean.TRUE);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    LIZJ(containerID, null, parameter, value, true);
                } else {
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1725390v05.class, null);
                    InterfaceC1725390v05 interfaceC1725390v05 = (InterfaceC1725390v05) xBaseModelLIZJ2;
                    interfaceC1725390v05.setSuccess(Boolean.FALSE);
                    interfaceC1725390v05.setErrorReason("parameter is not supported");
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                    LIZJ(containerID, "parameter is not supported", parameter, value, false);
                    return;
                }
            }
            if (reference.get() != null) {
                return;
            }
        }
        XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC1725390v05.class, null);
        InterfaceC1725390v05 interfaceC1725390v052 = (InterfaceC1725390v05) xBaseModelLIZJ3;
        interfaceC1725390v052.setSuccess(Boolean.FALSE);
        interfaceC1725390v052.setErrorReason("can not find the callback reference");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "");
        LIZJ(containerID, "can not find the callback reference", parameter, value, false);
    }

    public static void LIZJ(String str, String str2, String str3, String str4, boolean z) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            jSONObject.put("result", 1);
        } else {
            jSONObject.put("result", 0);
            jSONObject.put("error", str2);
        }
        jSONObject.put("key", str3);
        jSONObject.put("value", str4);
        C1725360v02 c1725360v02 = C1725360v02.LIZ;
        if (str == null) {
            str = "";
        }
        JSONObject jSONObjectLJI = c1725360v02.LIZ(str).LJI();
        if (jSONObjectLJI != null) {
            C1725270uzt.LJ(C1725270uzt.LIZ, "rd_pipo_universal_container_modify_configuration", C1530940pwS.LIZ(jSONObjectLJI, jSONObject), null, 12);
        }
    }
}
