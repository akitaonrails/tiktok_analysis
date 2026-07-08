package X;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.opensdkservice.IOpenIABService;
import kotlin.jvm.internal.AwS400S0200000_34;

/* JADX INFO: renamed from: X.1Ax9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196051Ax9 extends AbstractC2194381AuS {
    public CompletionBlock<InterfaceC2194561Auk> LLILLL;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        Activity activityLIZLLL2;
        String url;
        InterfaceC2194541Aui interfaceC2194541Aui = (InterfaceC2194541Aui) xBaseParamModel;
        this.LLILLL = completionBlock;
        String clientKey = interfaceC2194541Aui.getClientKey();
        String clientKey2 = interfaceC2194541Aui.getClientKey();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        C1236610iHj.LIZIZ(clientKey, "auth_js_start", "20000", C1236610iHj.LIZ(clientKey2, true, activityLIZLLL instanceof ActivityC2196911AyX), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
        String clientKey3 = interfaceC2194541Aui.getClientKey();
        String scope = interfaceC2194541Aui.getScope();
        String state = interfaceC2194541Aui.getState();
        interfaceC2194541Aui.getResponseType();
        C2198611B3b c2198611B3b = new C2198611B3b(clientKey3, scope, state, interfaceC2194541Aui.getUseSheet(), interfaceC2194541Aui.getDisableAutoAuth(), interfaceC2194541Aui.getGetStatusOnly(), interfaceC2194541Aui.getEnterMethod());
        InterfaceC1069010dvP interfaceC1069010dvPLIZLLL = ((IOpenIABService) ServiceManager.get().getService(IOpenIABService.class)).LIZLLL();
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && (activityLIZLLL2 = interfaceC634840OvC2.LIZLLL()) != null) {
            View view = interfaceC634840OvC2.getView();
            String str = "";
            if (view instanceof C1537710q7N) {
                url = ((C1537710q7N) interfaceC634840OvC2.getView()).getRawUrl();
            } else {
                if (!(view instanceof WebView)) {
                    url = "";
                    str = url;
                    interfaceC1069010dvPLIZLLL.LIZ(activityLIZLLL2, c2198611B3b, str, null, false, false, new AwS400S0200000_34(interfaceC2194541Aui, this, 43));
                }
                url = ((WebView) interfaceC634840OvC2.getView()).getUrl();
            }
            if (url != null) {
                str = url;
            }
            interfaceC1069010dvPLIZLLL.LIZ(activityLIZLLL2, c2198611B3b, str, null, false, false, new AwS400S0200000_34(interfaceC2194541Aui, this, 43));
        }
    }
}
