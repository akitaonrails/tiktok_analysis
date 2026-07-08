package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.jedi.ECJediViewModel;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0vfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750910vfF extends AbstractC1750920vfG {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        ECJediViewModel eCJediViewModel;
        ECJediViewModel eCJediViewModel2;
        Activity activityLIZLLL;
        View view;
        Map<String, Object> mapLJ;
        Map<String, Object> mapLJ2;
        InterfaceC1750930vfH interfaceC1750930vfH = (InterfaceC1750930vfH) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            eCJediViewModel = (PdpViewModel) interfaceC634840OvC.LIZIZ(PdpViewModel.class);
        } else {
            eCJediViewModel = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            eCJediViewModel2 = (SeaPdpViewModel) interfaceC634840OvC2.LIZIZ(SeaPdpViewModel.class);
        } else {
            eCJediViewModel2 = null;
        }
        if (eCJediViewModel == null) {
            eCJediViewModel = eCJediViewModel2;
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 != null) {
            activityLIZLLL = interfaceC634840OvC3.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        if (!(activityLIZLLL instanceof C19EG)) {
            activityLIZLLL = null;
        }
        InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
        if (interfaceC634840OvC4 != null) {
            view = interfaceC634840OvC4.getView();
        } else {
            view = null;
        }
        if (activityLIZLLL != null && eCJediViewModel != null && view != null) {
            if (eCJediViewModel instanceof PdpViewModel) {
                PdpViewModel pdpViewModel = (PdpViewModel) eCJediViewModel;
                if (interfaceC1750930vfH.getDaInfo() != null) {
                    pdpViewModel.LLZLL = interfaceC1750930vfH.getDaInfo();
                }
                String daInfo = interfaceC1750930vfH.getDaInfo();
                C1053804Ae c1053804Ae = pdpViewModel.LLILZIL;
                String btmCode = interfaceC1750930vfH.getBtmCode();
                if (btmCode != null) {
                    mapLJ2 = c1053804Ae.LIZ.LIZ(btmCode);
                } else {
                    c1053804Ae.getClass();
                    mapLJ2 = C2097608Jq.LJ();
                }
                PdpViewModel.jS2(pdpViewModel, view, 1, daInfo, mapLJ2, 12);
            } else if (eCJediViewModel instanceof SeaPdpViewModel) {
                SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) eCJediViewModel;
                if (interfaceC1750930vfH.getDaInfo() != null) {
                    seaPdpViewModel.LLLZLL = interfaceC1750930vfH.getDaInfo();
                }
                String daInfo2 = interfaceC1750930vfH.getDaInfo();
                C1053804Ae c1053804Ae2 = seaPdpViewModel.LLLLL;
                String btmCode2 = interfaceC1750930vfH.getBtmCode();
                if (btmCode2 != null) {
                    mapLJ = c1053804Ae2.LIZ.LIZ(btmCode2);
                } else {
                    c1053804Ae2.getClass();
                    mapLJ = C2097608Jq.LJ();
                }
                SeaPdpViewModel.tS2(seaPdpViewModel, view, daInfo2, mapLJ, null, null, null, null, 1996);
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1750940vfI.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "jsb state error", null, 4);
    }
}
