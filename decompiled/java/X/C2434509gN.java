package X;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09gN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2434509gN extends AbstractC2434609gO {
    public static boolean LIZJ(int i, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String host;
        if (str == null || str.length() == 0) {
            return false;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url")) != null && (host = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getHost()) != null && a0.LJJIIZI(host, "ticketmaster.evyy.net", false)) {
                    return true;
                }
                return false;
            }
            String scheme = UriProtector.parse(str).getScheme();
            if (scheme == null) {
                return false;
            }
            return a0.LJJIIZI(scheme, "ticketmaster", false);
        }
        String host2 = UriProtector.parse(str).getHost();
        if (host2 == null) {
            return false;
        }
        return a0.LJJIIZI(host2, "ticketmaster.evyy.net", false);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC2434709gP interfaceC2434709gP = (InterfaceC2434709gP) xBaseParamModel;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            String appPackageName = interfaceC2434709gP.getAppPackageName();
            if (!TextUtils.isEmpty(appPackageName)) {
                try {
                    C786410Ut5.Y3(activityLJFF.getPackageManager(), appPackageName, 0);
                    z = true;
                } catch (PackageManager.NameNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    z = false;
                }
            } else {
                z = false;
            }
            String containerID = null;
            if (z) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setPackage(interfaceC2434709gP.getAppPackageName());
                C2429209fW.LIZ().appendDataFlowId(intent, 1207969025);
                if (LIZJ(0, interfaceC2434709gP.getUniversalLink())) {
                    intent.setData(UriProtector.parse(interfaceC2434709gP.getUniversalLink()));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLJFF, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activityLJFF);
                    C2204961BRm.LJIILLIIL(activityLJFF, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR0Tfg0bCFPfvNQcIrr2GdPNPNW9pmTjU0=", null));
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2434809gQ.class, containerID);
                    ((InterfaceC2434809gQ) xBaseModelLIZJ).setAppInstalled(1);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
                if (LIZJ(1, interfaceC2434709gP.getDeeplink())) {
                    intent.setData(UriProtector.parse(interfaceC2434709gP.getDeeplink()));
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLJFF, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, activityLJFF);
                    C2204961BRm.LJIILLIIL(activityLJFF, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkR0Tfg0bCFPfvNQcIrr2GdPNPNW9pmTjU0=", null));
                    InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC2 != null) {
                        containerID = interfaceC634840OvC2.getContainerID();
                    }
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC2434809gQ.class, containerID);
                    ((InterfaceC2434809gQ) xBaseModelLIZJ2).setAppInstalled(1);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                    return;
                }
                if (LIZJ(2, interfaceC2434709gP.getSchema())) {
                    SmartRouter.buildRoute(activityLJFF, interfaceC2434709gP.getSchema()).open();
                    InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                    if (interfaceC634840OvC3 != null) {
                        containerID = interfaceC634840OvC3.getContainerID();
                    }
                    XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(InterfaceC2434809gQ.class, containerID);
                    ((InterfaceC2434809gQ) xBaseModelLIZJ3).setAppInstalled(0);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "");
                    return;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(ActivityStack.getTopActivity());
                c1389890mGx.LJIIIZ(2131829440);
                c1389890mGx.LJIIJJI();
                return;
            }
            if (LIZJ(2, interfaceC2434709gP.getSchema())) {
                SmartRouter.buildRoute(activityLJFF, interfaceC2434709gP.getSchema()).open();
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID = interfaceC634840OvC4.getContainerID();
                }
                XBaseModel xBaseModelLIZJ4 = C1909107dp.LIZJ(InterfaceC2434809gQ.class, containerID);
                ((InterfaceC2434809gQ) xBaseModelLIZJ4).setAppInstalled(0);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ4, "");
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(ActivityStack.getTopActivity());
            c1389890mGx2.LJIIIZ(2131829440);
            c1389890mGx2.LJIIJJI();
        }
    }
}
