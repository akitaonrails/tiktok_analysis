package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724420uyW extends AbstractC1724430uyX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1724450uyZ interfaceC1724450uyZ = (InterfaceC1724450uyZ) xBaseParamModel;
        C1724440uyY c1724440uyY = C1724440uyY.LIZ;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        String jsbSecureDataflowId = interfaceC1724450uyZ.getJsbSecureDataflowId();
        c1724440uyY.getClass();
        if (context != null) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("package:");
                sbLIZ.append(context.getPackageName());
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
                intent.addFlags(268435456);
                if (C1724440uyY.LIZ(context, intent)) {
                    if (jsbSecureDataflowId != null) {
                        C1717770unn.LJ().appendDataFlowId(intent, jsbSecureDataflowId);
                    }
                    RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                    C1701330uNH.LIZ(intent, context);
                    C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAySYi7ObkRlGmbAkXVue007M=", null));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
                    intent2.addFlags(268435456);
                    if (C1724440uyY.LIZ(context, intent2)) {
                        if (jsbSecureDataflowId != null) {
                            C1717770unn.LJ().appendDataFlowId(intent2, jsbSecureDataflowId);
                        }
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent2, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent2, context);
                        C2204961BRm.LJJJJJL(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqhc5CAySYi7ObkRlGmbAkXVue007M=", null));
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1724460uya.class, null), "");
    }
}
