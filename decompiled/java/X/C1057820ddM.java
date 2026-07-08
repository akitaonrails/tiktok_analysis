package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ddM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057820ddM extends AbstractC1057830ddN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1057850ddP interfaceC1057850ddP = (InterfaceC1057850ddP) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", interfaceC1057850ddP.getPhoneNumber(), null));
            intent.putExtra("sms_body", interfaceC1057850ddP.getContent());
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964163);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activityLIZLLL, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activityLIZLLL);
            C2204961BRm.LJIILLIIL(activityLIZLLL, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbo/C1TNahjga4ycgRyXuKk15JPjGuNjWPo8GfKGRn7R6709YzTA4iilp", null));
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1057840ddO.class, null);
            InterfaceC1057840ddO interfaceC1057840ddO = (InterfaceC1057840ddO) xBaseModelLIZJ;
            interfaceC1057840ddO.setCode(1);
            interfaceC1057840ddO.setMsg("");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "activity ref is released!", null, 4);
    }
}
