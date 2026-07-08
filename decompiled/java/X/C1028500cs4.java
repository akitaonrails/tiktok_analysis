package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;

/* JADX INFO: renamed from: X.0cs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1028500cs4 extends AbstractC1028510cs5 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1028520cs6 interfaceC1028520cs6 = (InterfaceC1028520cs6) xBaseParamModel;
        IAdLandPageSurveyService iAdLandPageSurveyService = (IAdLandPageSurveyService) PluggableExtentionKt.pluggableSpi$default(IAdLandPageSurveyService.class, false, false, false, 14, null);
        if (iAdLandPageSurveyService != null) {
            iAdLandPageSurveyService.LIZJ(interfaceC1028520cs6.getSurveyId());
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1028530cs7.class, containerID), "");
    }
}
