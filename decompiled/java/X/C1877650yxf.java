package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1877650yxf extends AbstractC1877620yxc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        int i;
        Context context;
        Activity activityLIZ;
        Map<String, String> mapLJ;
        InterfaceC1877640yxe interfaceC1877640yxe = (InterfaceC1877640yxe) xBaseParamModel;
        if (Intrinsics.LJFF(interfaceC1877640yxe.getEnterType(), 3)) {
            i = 5;
        } else {
            i = -1;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            JSONObject jSONObject = new JSONObject(interfaceC1877640yxe.getUser());
            String string = JSONObjectProtectorUtils.getString(jSONObject, "id_str");
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "avatar_url");
            jSONObject.put("uid", string);
            JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "follow_info");
            jSONObject.put("follow_status", JSONObjectProtectorUtils.getInt(jSONObject3, "follow_status"));
            jSONObject.put("live_push_notification_status", JSONObjectProtectorUtils.getInt(jSONObject3, "push_status"));
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "avatar_medium");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("url_list", jSONArray);
            jSONObject.put("avatar_medium", jSONObject4);
            JSONArray jSONArray2 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "avatar_large");
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("url_list", jSONArray2);
            jSONObject.put("avatar_large", jSONObject5);
            JSONArray jSONArray3 = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "avatar_thumb");
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("url_list", jSONArray3);
            jSONObject.put("avatar_thumb", jSONObject6);
            String strJ3 = C786410Ut5.J3(jSONObject);
            Object logInfo = interfaceC1877640yxe.getLogInfo();
            if (!(logInfo instanceof Map) || (mapLJ = (Map) logInfo) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            iHostAction.showNotificationTipDialogForSubJSB(activityLIZ, strJ3, mapLJ, i, new InterfaceC1877670yxh() { // from class: X.0yxb
                @Override // X.InterfaceC1877670yxh
                public final void LIZ(int i2) {
                    InterfaceC1877600yxa interfaceC1877600yxa = (InterfaceC1877600yxa) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1877600yxa.class));
                    interfaceC1877600yxa.setNotificationStatus(Integer.valueOf(i2));
                    completionBlock.onSuccess(interfaceC1877600yxa, "");
                }
            });
        }
    }
}
