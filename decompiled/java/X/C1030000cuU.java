package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.landpage.popup.IAdLandingPagePopUpService;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cuU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030000cuU extends AbstractC1030010cuV {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(174));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IAdLandingPagePopUpService iAdLandingPagePopUpService = (IAdLandingPagePopUpService) this.LLILLL.getValue();
        if (iAdLandingPagePopUpService != null && iAdLandingPagePopUpService.LJIJI()) {
            C1440005kM.LIZ(new C602130NjX("closeTuxSheet"));
            return;
        }
        IAdLandingPagePopUpService iAdLandingPagePopUpService2 = (IAdLandingPagePopUpService) this.LLILLL.getValue();
        if (iAdLandingPagePopUpService2 != null && iAdLandingPagePopUpService2.LJII()) {
            C1440005kM.LIZ(new C602130NjX("closeFullScreen"));
            return;
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        String containerID = null;
        if (activityLJFF != null) {
            C988570bpf.LIZ.getClass();
            if (C1041070dCL.LIZ() != null) {
                C1028210crb.LJJI(activityLJFF);
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1030030cuX.class, containerID), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "not fragmentActivity", null, 4);
    }
}
