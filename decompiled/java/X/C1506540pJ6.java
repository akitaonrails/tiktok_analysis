package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0pJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506540pJ6 extends AbstractC1506500pJ2 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        boolean z;
        String str;
        ICommerceMediaService iCommerceMediaService;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1506510pJ3.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        InterfaceC1506510pJ3 interfaceC1506510pJ3 = (InterfaceC1506510pJ3) xBaseModelLIZJ;
        ICommerceMediaService iCommerceMediaService2 = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null);
        if (iCommerceMediaService2 != null && iCommerceMediaService2.LJ()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((iCommerceMediaService = (ICommerceMediaService) PluggableExtentionKt.pluggableSpi$default(ICommerceMediaService.class, false, false, false, 14, null)) == null || !iCommerceMediaService.LJIIJ())) {
            str = "";
        } else {
            str = "commerce";
        }
        interfaceC1506510pJ3.setScene(str);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
