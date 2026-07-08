package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostOpenDepend;

/* JADX INFO: renamed from: X.0zHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1889890zHP extends AbstractC1889880zHO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        IHostOpenDepend iHostOpenDepend;
        InterfaceC1889900zHQ interfaceC1889900zHQ = (InterfaceC1889900zHQ) xBaseParamModel;
        String channel = interfaceC1889900zHQ.getChannel();
        if (channel.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "channel is null", null, 4);
            return;
        }
        String accessKey = interfaceC1889900zHQ.getAccessKey();
        if (accessKey.length() == 0) {
            C2382909Vj.LIZ(completionBlock, 0, "accessKey is null", null, 4);
            return;
        }
        boolean enableDownloadAutoRetry = interfaceC1889900zHQ.getEnableDownloadAutoRetry();
        boolean zIsLazy = interfaceC1889900zHQ.isLazy();
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostOpenDepend = c1874950ytJ.LJIIJ) != null && iHostOpenDepend.updateGecko(accessKey, channel, zIsLazy, new C09ZL() { // from class: X.0zHN
            @Override // X.C09ZL
            public final void LIZIZ() {
                CompletionBlock<InterfaceC1889920zHS> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1889920zHS.class);
                ((InterfaceC1889920zHS) xBaseModelLIZ).setStatusCode(3);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "the channel has been moved to black list and not be allowed to move out");
            }

            @Override // X.C09ZL
            public final void LIZJ() {
                CompletionBlock<InterfaceC1889920zHS> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1889920zHS.class);
                ((InterfaceC1889920zHS) xBaseModelLIZ).setStatusCode(1);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "needUpdate");
            }

            @Override // X.C09ZL
            public final void LIZLLL() {
                CompletionBlock<InterfaceC1889920zHS> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1889920zHS.class);
                ((InterfaceC1889920zHS) xBaseModelLIZ).setStatusCode(4);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "request for non-lazy channel and resource exist");
            }

            @Override // X.C09ZL
            public final void LJ() {
                CompletionBlock<InterfaceC1889920zHS> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1889920zHS.class);
                ((InterfaceC1889920zHS) xBaseModelLIZ).setStatusCode(0);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "skipUpdate for local version is already up-to-date");
            }

            @Override // X.C09ZL
            public final void LJFF() {
                CompletionBlock<InterfaceC1889920zHS> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1889920zHS.class);
                ((InterfaceC1889920zHS) xBaseModelLIZ).setStatusCode(2);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "abortUpdate for requested channel is not in lazy channels or doesn't exist with host accesskey");
            }

            @Override // X.C09ZL
            public final void LIZ(Exception exc) {
                CompletionBlock<InterfaceC1889920zHS> completionBlock2 = completionBlock;
                String message = exc.getMessage();
                if (message == null) {
                    message = "updateGecko exception";
                }
                C2382909Vj.LIZ(completionBlock2, 0, message, null, 4);
            }
        }, enableDownloadAutoRetry) != null) {
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "updateGecko ability is not implemented", null, 4);
    }
}
