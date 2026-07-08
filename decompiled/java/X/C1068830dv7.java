package X;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068830dv7 extends AbstractC747960TVq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        JSONObject jSONObject;
        JSONObject jSONObjectOptJSONObject;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z;
        boolean z2;
        InterfaceC747980TVs interfaceC747980TVs = (InterfaceC747980TVs) xBaseParamModel;
        Map<String, Object> params = interfaceC747980TVs.getParams();
        Integer numValueOf3 = null;
        if (params != null) {
            jSONObject = new JSONObject(params);
            jSONObjectOptJSONObject = jSONObject.optJSONObject("info");
        } else {
            jSONObject = null;
            jSONObjectOptJSONObject = null;
        }
        String eventName = interfaceC747980TVs.getEventName();
        int iHashCode = eventName.hashCode();
        if (iHashCode != -1039715581) {
            if (iHashCode != -838846263) {
                if (iHashCode == 1439261618 && eventName.equals("autofill")) {
                    C1068840dv8.LIZ(true);
                    return;
                }
                return;
            }
            if (!eventName.equals("update")) {
                return;
            }
            if (jSONObject != null) {
                numValueOf = Integer.valueOf(jSONObject.optInt("refer"));
                numValueOf2 = Integer.valueOf(jSONObject.optInt("op"));
            } else {
                numValueOf = null;
                numValueOf2 = null;
            }
            C1068840dv8.LIZ(false);
            C1068840dv8.LIZ.getClass();
            if (numValueOf != null && numValueOf.intValue() == 2 && numValueOf2 != null && numValueOf2.intValue() == 0) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_source", "autofill_project");
                c2344009Gk.LJIIIIZZ("website_url", C1068840dv8.LIZIZ);
                C20684815ws.LJIILLIIL("edit_contact_info_client", c2344009Gk.LIZ);
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null) {
                return;
            }
            View view = interfaceC634840OvC.getView();
            Context context = interfaceC634840OvC.getContext();
            if (jSONObject != null) {
                numValueOf3 = Integer.valueOf(jSONObject.optInt("popupType"));
            }
            if (numValueOf != null && numValueOf.intValue() == 2) {
                z = false;
            } else {
                z = true;
            }
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            AwS591S0100000_12 awS591S0100000_12 = new AwS591S0100000_12(completionBlock, (CompletionBlock<InterfaceC747950TVp>) 1199);
            if (view == null || context == null) {
                return;
            }
            ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIIIIZZ(view, EnumC1059300dfk.TTOP, 0, numValueOf3, jSONObjectOptJSONObject, z, z2, awS591S0100000_12);
            return;
        }
        if (!eventName.equals("notNow")) {
            return;
        }
        C1068840dv8.LIZ(false);
        if (jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("requestId", "");
        Integer numValueOf4 = Integer.valueOf(jSONObject.optInt("refer"));
        if (strOptString == null || strOptString.length() == 0 || numValueOf4 == null) {
            return;
        }
        int iIntValue = numValueOf4.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                return;
            }
            C1068840dv8.LJ.put(strOptString, Boolean.TRUE);
            return;
        }
        C1068840dv8.LIZLLL.put(strOptString, Boolean.TRUE);
    }
}
