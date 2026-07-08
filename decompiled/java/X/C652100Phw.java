package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;

/* JADX INFO: renamed from: X.0Phw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652100Phw extends AbstractC652110Phx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        String containerID;
        InterfaceC652120Phy interfaceC652120Phy = (InterfaceC652120Phy) xBaseParamModel;
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            Fragment fragmentLIZ = C946803n0.LIZ(view);
            if (fragmentLIZ != null) {
                C19EG activity = fragmentLIZ.getActivity();
                if (activity != null) {
                    ((ActivityCardThemeViewModel) C679340Qkm.LIZIZ(fragmentLIZ, activity).get(ActivityCardThemeViewModel.class)).LLILZ = (interfaceC652120Phy.getStartPoint().floatValue() + interfaceC652120Phy.getEndPoint().floatValue()) / 2.0f;
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    } else {
                        containerID = null;
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC652130Phz.class, containerID), "");
                    return;
                }
                throw new NullPointerException("no activity");
            }
            throw new NullPointerException("no fragment");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "no err msg";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
