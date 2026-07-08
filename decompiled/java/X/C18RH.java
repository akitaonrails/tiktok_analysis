package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.18RH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18RH extends C18RG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        C18RI c18ri = (C18RI) xBaseParamModel;
        String entranceInfo = c18ri.getEntranceInfo();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        String strLIZIZ = C848530XQl.LIZIZ(C848530XQl.LIZ, view, entranceInfo);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_append_entrance_info_get_bcm_chain_jsb", false)) {
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            String btm = c18ri.getBtm();
            PageFinder pageFinderVia = PageFinder.via(view);
            C212367188v c212367188v = BcmParams.Companion;
            Map<String, Object> bcm = c18ri.getBcm();
            c212367188v.getClass();
            String bcmChainStandardStringByFinder = btmSDK.getBcmChainStandardStringByFinder(btm, pageFinderVia, C212367188v.LIZJ(bcm));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C18RJ.class, containerID);
            C18RJ c18rj = (C18RJ) xBaseModelLIZJ;
            c18rj.setEntranceInfo(strLIZIZ);
            c18rj.setBcmChain(bcmChainStandardStringByFinder);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            containerID = interfaceC634840OvC3.getContainerID();
        }
        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C18RJ.class, containerID);
        ((C18RJ) xBaseModelLIZJ2).setEntranceInfo(strLIZIZ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
    }
}
