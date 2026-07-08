package X;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0KRW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KRW extends C0KRX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zIsRequestPinAppWidgetSupported;
        Context context;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && Build.VERSION.SDK_INT >= 26) {
            try {
                zIsRequestPinAppWidgetSupported = AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zIsRequestPinAppWidgetSupported = false;
            }
        } else {
            zIsRequestPinAppWidgetSupported = false;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID = interfaceC634840OvC2.getContainerID();
        }
        C0KRY c0kry = (C0KRY) C1909107dp.LIZJ(C0KRY.class, containerID);
        c0kry.setSupported(Boolean.valueOf(zIsRequestPinAppWidgetSupported));
        completionBlock.onSuccess(c0kry, "");
    }
}
