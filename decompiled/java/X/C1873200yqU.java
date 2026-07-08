package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yqU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873200yqU extends AbstractC1873170yqR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        String containerID;
        InterfaceC1063720dms interfaceC1063720dms;
        View view;
        WebView webView;
        C1063730dmt c1063730dmt;
        View view2;
        InterfaceC1873180yqS interfaceC1873180yqS = (InterfaceC1873180yqS) xBaseParamModel;
        if (interfaceC1873180yqS.getEventName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
            return;
        }
        String eventName = interfaceC1873180yqS.getEventName();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            containerID = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            interfaceC1063720dms = (InterfaceC1063720dms) interfaceC634840OvC2.LIZIZ(InterfaceC1063720dms.class);
        } else {
            interfaceC1063720dms = null;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            view = interfaceC634840OvC3.getView();
        } else {
            view = null;
        }
        if (view instanceof WebView) {
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                view2 = interfaceC634840OvC4.getView();
            } else {
                view2 = null;
            }
            webView = (WebView) view2;
        } else {
            webView = null;
        }
        if (interfaceC1063720dms == null) {
            c1063730dmt = null;
        } else {
            c1063730dmt = new C1063730dmt(interfaceC1063720dms);
        }
        C1548820qPI.LJIIIZ(new C085L(containerID, jCurrentTimeMillis, c1063730dmt, webView), eventName);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1873190yqT.class, null), "");
    }
}
