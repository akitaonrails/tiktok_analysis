package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.IWebAuthSyncLoginServer;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Map;
import kotlin.jvm.internal.AwS478S0200000_9;

/* JADX INFO: renamed from: X.0Nme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604060Nme extends AbstractC604050Nmd {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        boolean zBooleanValue;
        Boolean bool;
        InterfaceC604070Nmf interfaceC604070Nmf = (InterfaceC604070Nmf) xBaseParamModel;
        IWebAuthSyncLoginServer iWebAuthSyncLoginServer = (IWebAuthSyncLoginServer) ServiceManager.get().getService(IWebAuthSyncLoginServer.class);
        String startUrl = interfaceC604070Nmf.getStartUrl();
        String targetUrl = interfaceC604070Nmf.getTargetUrl();
        String state = interfaceC604070Nmf.getState();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Object obj = null;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        Map<String, Object> extra = interfaceC604070Nmf.getExtra();
        if (extra != null) {
            obj = extra.get("shouldUseCustomTabs");
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        iWebAuthSyncLoginServer.LIZIZ(startUrl, targetUrl, state, activityLIZLLL, zBooleanValue, new AwS478S0200000_9(completionBlock, (CompletionBlock<InterfaceC604040Nmc>) this, (C604060Nme) 0));
    }
}
