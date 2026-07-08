package X;

import android.app.Activity;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0lyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378750lyz extends AbstractC1058320deA {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(627));

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(InterfaceC1058350deD interfaceC1058350deD, CompletionBlock completionBlock) {
        InterfaceC1877250yx1 interfaceC1877250yx1LIZ;
        Integer numValueOf;
        String strLJJLIIIJ;
        Object kitView;
        T url;
        WebView webView;
        T tLJ;
        Set<Map.Entry<String, Object>> setEntrySet;
        InterfaceC1877240yx0 interfaceC1877240yx0;
        InterfaceC1395520mQ2 interfaceC1395520mQ2LJFF = C2195221Avo.LJFF();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (interfaceC1877240yx0 = (InterfaceC1877240yx0) interfaceC634840OvC.LIZIZ(InterfaceC1877240yx0.class)) != null) {
            interfaceC1877250yx1LIZ = interfaceC1877240yx0.LIZ();
        } else {
            interfaceC1877250yx1LIZ = null;
        }
        if (interfaceC1395520mQ2LJFF != null && interfaceC1058350deD != null) {
            String title = interfaceC1058350deD.getTitle();
            String subtitle = interfaceC1058350deD.getSubtitle();
            String imageUrl = interfaceC1058350deD.getImageUrl();
            String clientKey = interfaceC1058350deD.getClientKey();
            Map<String, Object> queryParams = interfaceC1058350deD.getQueryParams();
            Number templateType = interfaceC1058350deD.getTemplateType();
            if (templateType != null) {
                numValueOf = Integer.valueOf(templateType.intValue());
            } else {
                numValueOf = null;
            }
            C1378610lyl c1378610lyl = new C1378610lyl(numValueOf, title, subtitle, imageUrl, clientKey, queryParams);
            Activity activityLIZLLL = C2195221Avo.LIZLLL();
            if (queryParams != null && (setEntrySet = queryParams.entrySet()) != null) {
                strLJJLIIIJ = C13LP.LJJLIIIJ(setEntrySet, "&", "", "", 0, null, null, 56);
            } else {
                strLJJLIIIJ = null;
            }
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            if (C2197221Az2.LIZ(c1378610lyl.LIZLLL)) {
                if (interfaceC1877250yx1LIZ != null) {
                    tLJ = interfaceC1877250yx1LIZ.LJ();
                } else {
                    tLJ = 0;
                }
                c259800zU.element = tLJ;
            } else {
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = C2195221Avo.LJII();
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII != null) {
                    kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII.getKitView();
                } else {
                    kitView = null;
                }
                if ((kitView instanceof WebKitView) && (webView = (WebView) kitView) != null) {
                    url = webView.getUrl();
                } else {
                    url = 0;
                }
                c259800zU.element = url;
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1467205ok(CoroutineExceptionHandler.LJJLIL, completionBlock, activityLIZLLL))), null, null, new C1378680lys(interfaceC1058350deD, this, c1378610lyl, c259800zU, strLJJLIIIJ, completionBlock, null), 3);
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "current page container not minis", null, 4);
        }
        C2382909Vj.LIZ(completionBlock, 0, "data fetch error", null, 4);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC1058350deD) xBaseParamModel, completionBlock);
    }
}
