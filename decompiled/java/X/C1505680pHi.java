package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505680pHi extends AbstractC1505660pHg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        C843920X8s c843920X8sJe0;
        Context context;
        InterfaceC1505670pHh interfaceC1505670pHh = (InterfaceC1505670pHh) xBaseParamModel;
        String impressionURL = interfaceC1505670pHh.getTrackingURLs().getImpressionURL();
        String appID = interfaceC1505670pHh.getAppID();
        String roomID = interfaceC1505670pHh.getRoomID();
        String taskID = interfaceC1505670pHh.getTaskID();
        String anchorID = interfaceC1505670pHh.getAnchorID();
        String gameID = interfaceC1505670pHh.getGameID();
        String viewReportScene = interfaceC1505670pHh.getViewReportScene();
        String str = "";
        if (viewReportScene == null) {
            viewReportScene = "";
        }
        String packageName = interfaceC1505670pHh.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        String gameName = interfaceC1505670pHh.getGameName();
        if (gameName != null) {
            str = gameName;
        }
        interfaceC1505670pHh.getSiteID();
        interfaceC1505670pHh.getSourceID();
        C843940X8u c843940X8u = new C843940X8u(impressionURL, appID, roomID, taskID, anchorID, gameID, viewReportScene, packageName, str, null, null, 6144);
        IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
        if (iGamePartnershipService != null && (c843920X8sJe0 = iGamePartnershipService.Je0()) != null) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            c843920X8sJe0.LJIIL(context, c843940X8u, new C0X8U() { // from class: X.0pFz
                @Override // X.C0X8U
                public final void LIZ(String str2, boolean z) {
                    if (z) {
                        CompletionBlock<InterfaceC1504600pFy> completionBlock2 = completionBlock;
                        this.getClass();
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1504600pFy.class, null);
                        ((InterfaceC1504600pFy) xBaseModelLIZJ).setCode(1);
                        completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                        return;
                    }
                    C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
                }
            });
        }
    }
}
