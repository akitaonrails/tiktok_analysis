package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vTF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743470vTF extends AbstractC1743550vTN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        SystemClock.elapsedRealtime();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        C1743460vTE c1743460vTELIZJ = ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZJ(view);
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1743480vTG.class, null);
        InterfaceC1743480vTG interfaceC1743480vTG = (InterfaceC1743480vTG) xBaseModelLIZJ;
        interfaceC1743480vTG.set_bottom(Boolean.valueOf(c1743460vTELIZJ.LIZ));
        interfaceC1743480vTG.setDistance(Integer.valueOf(c1743460vTELIZJ.LIZIZ));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
