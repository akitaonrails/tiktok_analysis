package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d3V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035590d3V extends AbstractC1035600d3W {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(356));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iHashCode;
        View view;
        InterfaceC1035610d3X interfaceC1035610d3X = (InterfaceC1035610d3X) xBaseParamModel;
        String containerID = null;
        int iIntValue = 0;
        if (Intrinsics.LJFF(interfaceC1035610d3X.isAppo(), 1)) {
            Number adPopupWebviewHash = interfaceC1035610d3X.getAdPopupWebviewHash();
            if (adPopupWebviewHash != null) {
                iIntValue = adPopupWebviewHash.intValue();
            }
            C1440005kM.LIZ(new C1035440d3G(iIntValue, true));
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1035620d3Y.class, containerID), "");
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && (view = interfaceC634840OvC2.getView()) != null) {
            iHashCode = view.hashCode();
        } else {
            iHashCode = 0;
        }
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LLILLL.getValue();
        if (iAdLandingPagePopUpService != null && iAdLandingPagePopUpService.LJIJI()) {
            C1440005kM.LIZ(new C602130NjX("closeTuxSheet"));
        } else {
            IAdLandingPagePopUpService iAdLandingPagePopUpService2 = (IAdLandingPagePopUpService) this.LLILLL.getValue();
            if (iAdLandingPagePopUpService2 != null && iAdLandingPagePopUpService2.LJII()) {
                C1440005kM.LIZ(new C602130NjX("closeFullScreen"));
            } else {
                C1440005kM.LIZ(new C1035440d3G(iHashCode, Intrinsics.LJFF(interfaceC1035610d3X.isWebView(), 1)));
            }
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            containerID = interfaceC634840OvC3.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1035620d3Y.class, containerID), "");
    }
}
