package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KRP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KRP extends C0KRQ {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        Context context;
        String iapId = ((C0KRR) xBaseParamModel).getIapId();
        if (iapId != null && iapId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "iapId is empty", null, 4);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(UriProtector.parse("https://play.google.com/store/account/subscriptions").buildUpon().appendQueryParameter("sku", iapId).appendQueryParameter("package", ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context().getApplicationInfo().packageName).build());
        intent.setPackage("com.android.vending");
        ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207965953);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf/N/ILzSAUv4UmvRvfF6qbZrPV/QrE8H7TrGJR7dkZ0p4u01wsf3RjQkg9561cwlRDH3AAR2eK+rt", null));
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C0KRS.class, null), "");
    }
}
