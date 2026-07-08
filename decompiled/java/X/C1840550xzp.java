package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0xzp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840550xzp extends AbstractC1840560xzq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextLIZ;
        ComponentName componentName;
        String containerID;
        InterfaceC1840580xzs interfaceC1840580xzs = (InterfaceC1840580xzs) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (contextLIZ = interfaceC634840OvC.getContext()) == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        Map<String, String> map = C2410709cX.LIZ;
        String str = C2410709cX.LIZ.get(interfaceC1840580xzs.getWidgetId());
        if (str == null) {
            componentName = null;
        } else {
            componentName = new ComponentName(contextLIZ.getPackageName(), str);
        }
        if (componentName == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown widgetId: ");
            sbLIZ.append(interfaceC1840580xzs.getWidgetId());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        try {
            int length = AppWidgetManager.getInstance(contextLIZ).getAppWidgetIds(componentName).length;
            boolean z = true;
            if (length == 0) {
                z = false;
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1840570xzr.class, containerID);
            ((InterfaceC1840570xzr) xBaseModelLIZJ).setInstalled(Boolean.valueOf(z));
            completionBlock.onSuccess((InterfaceC1840570xzr) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "check install status error";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
