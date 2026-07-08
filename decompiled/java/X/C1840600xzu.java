package X;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.marketing.widget.WidgetPinReceiver;
import java.util.Map;

/* JADX INFO: renamed from: X.0xzu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840600xzu extends AbstractC1840610xzv {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        String containerID;
        String str;
        String containerID2;
        InterfaceC1840630xzx interfaceC1840630xzx = (InterfaceC1840630xzx) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID3 = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
            return;
        }
        C1840680y02 c1840680y02 = C1840680y02.LIZ;
        String installTrackInfo = interfaceC1840630xzx.getInstallTrackInfo();
        c1840680y02.getClass();
        C1840680y02.LIZLLL(installTrackInfo, "direct_install");
        if (Build.VERSION.SDK_INT < 26) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID3 = interfaceC634840OvC2.getContainerID();
            }
            InterfaceC1840620xzw interfaceC1840620xzw = (InterfaceC1840620xzw) C1909107dp.LIZJ(InterfaceC1840620xzw.class, containerID3);
            interfaceC1840620xzw.setStatus("unsupported_api");
            interfaceC1840620xzw.setAccepted(Boolean.FALSE);
            completionBlock.onSuccess(interfaceC1840620xzw, "");
            return;
        }
        Map<String, String> map = C2410709cX.LIZ;
        String str2 = C2410709cX.LIZ.get(interfaceC1840630xzx.getWidgetId());
        if (str2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("unknown widgetId: ");
            sbLIZ.append(interfaceC1840630xzx.getWidgetId());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        ComponentName componentName = new ComponentName(context.getPackageName(), str2);
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (!appWidgetManager.isRequestPinAppWidgetSupported()) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    containerID2 = interfaceC634840OvC3.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1840620xzw.class, containerID2);
                InterfaceC1840620xzw interfaceC1840620xzw2 = (InterfaceC1840620xzw) xBaseModelLIZJ;
                interfaceC1840620xzw2.setStatus("not_supported");
                interfaceC1840620xzw2.setAccepted(Boolean.FALSE);
                completionBlock.onSuccess((InterfaceC1840620xzw) xBaseModelLIZJ, "");
                return;
            }
            WidgetPinReceiver.Companion.getClass();
            boolean zRequestPinAppWidget = appWidgetManager.requestPinAppWidget(componentName, null, PendingIntent.getBroadcast(context, 0, new Intent(context, (Class<?>) WidgetPinReceiver.class), 201326592));
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            if (interfaceC634840OvC4 != null) {
                containerID = interfaceC634840OvC4.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1840620xzw.class, containerID);
            InterfaceC1840620xzw interfaceC1840620xzw3 = (InterfaceC1840620xzw) xBaseModelLIZJ2;
            if (zRequestPinAppWidget) {
                str = "success";
            } else {
                str = "request_rejected";
            }
            interfaceC1840620xzw3.setStatus(str);
            interfaceC1840620xzw3.setAccepted(Boolean.valueOf(zRequestPinAppWidget));
            completionBlock.onSuccess((InterfaceC1840620xzw) xBaseModelLIZJ2, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "request direct install error";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
    }
}
