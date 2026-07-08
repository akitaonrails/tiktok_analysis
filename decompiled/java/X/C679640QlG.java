package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0QlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679640QlG extends AbstractC679650QlH {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String str;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC679660QlI.class, containerID);
        InterfaceC679660QlI interfaceC679660QlI = (InterfaceC679660QlI) xBaseModelLIZJ;
        Pair[] pairArr = new Pair[1];
        if (((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).hitTopTabExpExperiment()) {
            str = "homepage_mall";
        } else {
            str = "mall";
        }
        pairArr[0] = new Pair("enter_from", str);
        interfaceC679660QlI.setTrackParams(C2097608Jq.LJIIJ(pairArr));
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
