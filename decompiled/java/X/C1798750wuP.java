package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.launchershortcut.ILauncherShortcutService;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: renamed from: X.0wuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798750wuP extends AbstractC1798740wuO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1798760wuQ interfaceC1798760wuQ = (InterfaceC1798760wuQ) xBaseParamModel;
        C816050Vzn c816050VznLIZLLL = ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LIZLLL("incentive");
        String str = "";
        if (c816050VznLIZLLL == null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1798730wuN.class, null);
            ((InterfaceC1798730wuN) xBaseModelLIZJ).setSuccess(Boolean.FALSE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        ((ILauncherShortcutService) ServiceManager.get().getService(ILauncherShortcutService.class)).LJ(interfaceC1798760wuQ.getType(), interfaceC1798760wuQ.getIcon(), interfaceC1798760wuQ.getLabel(), interfaceC1798760wuQ.getSchema());
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && c816050VznLIZLLL != null) {
            String enterFrom = interfaceC1798760wuQ.getEnterFrom();
            if (enterFrom != null) {
                str = enterFrom;
            }
            c816050VznLIZLLL.LIZ(context, str, new AwS641S0100000_27(completionBlock, (CompletionBlock<InterfaceC1798730wuN>) 136));
        }
    }
}
