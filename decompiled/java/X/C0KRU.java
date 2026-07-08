package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KRU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KRU extends AbstractC2382209Vc {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        JSONObject json = xBaseParamModel.toJSON();
        String strOptString = json.optString("type");
        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(json, "args");
        int iHashCode = strOptString.hashCode();
        if (iHashCode != -1853762817) {
            if (iHashCode != -858688242) {
                if (iHashCode == 1821543916 && strOptString.equals("monitorStatus")) {
                    C1CC2.LJIIIIZZ(jSONObject.optString("service"), jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), jSONObject.optJSONObject("ext_json"));
                }
            } else if (strOptString.equals("monitorDuration")) {
                String strOptString2 = jSONObject.optString("service");
                long jOptLong = jSONObject.optLong("duration");
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ext_json");
                C1CC3 c1cc3 = C1CC2.LIZ;
                if (c1cc3 != null) {
                    c1cc3.LJIIJJI(strOptString2, jOptLong, jSONObjectOptJSONObject);
                }
            }
        } else if (strOptString.equals("monitorStatusAndDuration")) {
            C1CC2.LJIIJ(jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS), jSONObject.optLong("duration"), jSONObject.optString("service"), jSONObject.optJSONObject("ext_json"));
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC2382309Vd.class, null), "");
    }
}
