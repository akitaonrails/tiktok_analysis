package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21313318ax extends AbstractC748210TWp {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        boolean z;
        String containerID;
        InterfaceC748220TWq interfaceC748220TWq = (InterfaceC748220TWq) xBaseParamModel;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle btm:");
            sbLIZ.append(interfaceC748220TWq.getBtm());
            sbLIZ.append(" params:");
            sbLIZ.append(interfaceC748220TWq.getPassthroughParams());
            sbLIZ.append(" isInitial:");
            sbLIZ.append(interfaceC748220TWq.isInitial());
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            PageFinder pageFinderVia = PageFinder.via(view);
            C21313718b1 c21313718b1 = C21313718b1.LIZ;
            Map<String, Object> passthroughParams = interfaceC748220TWq.getPassthroughParams();
            if (!interfaceC748220TWq.isInitial()) {
                z = true;
            } else {
                z = false;
            }
            c21313718b1.getClass();
            if (C296990BkX.LIZ()) {
                JSONObject jSONObjectLIZ = C051S.LIZ(passthroughParams);
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                BcmParams bcmParams = new BcmParams();
                C21313418ay.LIZ(bcmParams, pageFinderVia, jSONObjectLIZ, z);
                btmSDK.setBcmPageParams(pageFinderVia, bcmParams, Boolean.FALSE);
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC748190TWn.class);
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
            ((InterfaceC748190TWn) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "unexpected error", null, 4);
            C1205490hTX.LIZ.LJ(EnumC21315318bH.PT_SETTINGS_ERROR, e);
        }
    }
}
