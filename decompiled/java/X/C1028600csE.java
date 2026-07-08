package X;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0csE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028600csE extends AbstractC1028610csF {
    public static Map LIZJ(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objLIZJ = jSONObject.get(next);
            if ((objLIZJ instanceof JSONObject) && (objLIZJ = LIZJ((JSONObject) objLIZJ)) == null) {
                objLIZJ = C2097608Jq.LJ();
            }
            linkedHashMap.put(next, objLIZJ);
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AwemeRawAd awemeRawAd;
        View view;
        String containerID;
        View view2;
        Uri uri;
        Set<String> queryParameterNames;
        C1035880d3y c1035880d3y;
        Aweme aweme;
        JSONObject jSONObjectLJIILJJIL = ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJIILJJIL();
        IAdAutofillService iAdAutofillService = (IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class);
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (c1019830ce5LIZ != null && (aweme = c1019830ce5LIZ.LJIIL) != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        boolean zLIZIZ = iAdAutofillService.LIZIZ(awemeRawAd);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (view instanceof WebKitView) {
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ != null && (c1035880d3y = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class)) != null) {
                zLIZIZ = ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LIZIZ(c1035880d3y.getAwemeRawAd());
            } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_non_ad_autofill", true, true)) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    view2 = interfaceC634840OvC3.getView();
                } else {
                    view2 = null;
                }
                String url = ((WebView) view2).getUrl();
                if (url != null && (uri = UriProtector.parse(url)) != null && (queryParameterNames = UriProtector.getQueryParameterNames(uri)) != null && queryParameterNames.contains("room_id")) {
                    zLIZIZ = ((IAdAutofillService) ServiceManager.get().getService(IAdAutofillService.class)).LJFF();
                }
            }
        }
        if (zLIZIZ) {
            InterfaceC1028620csG interfaceC1028620csG = (InterfaceC1028620csG) C1909107dp.LIZJ(InterfaceC1028620csG.class, null);
            interfaceC1028620csG.setContactInfo(LIZJ(jSONObjectLJIILJJIL));
            interfaceC1028620csG.setEnableAutofillV2(Boolean.valueOf(C305310Bxx.LIZ()));
            completionBlock.onSuccess(interfaceC1028620csG, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
    }
}
