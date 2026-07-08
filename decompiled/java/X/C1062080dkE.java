package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0dkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062080dkE extends AbstractC1062090dkF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1062100dkG interfaceC1062100dkG = (InterfaceC1062100dkG) xBaseParamModel;
        String email = interfaceC1062100dkG.getEmail();
        if (email == null) {
            email = "";
        }
        String subject = interfaceC1062100dkG.getSubject();
        if (subject == null) {
            subject = "";
        }
        String content = interfaceC1062100dkG.getContent();
        if (content == null) {
            content = "";
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = null;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            String[] strArr = {email};
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(UriProtector.parse("mailto:"));
            C2429209fW.LIZ().appendDataFlowId(intent, 1207964163);
            intent.putExtra("android.intent.extra.EMAIL", strArr);
            intent.putExtra("android.intent.extra.SUBJECT", subject);
            intent.putExtra("android.intent.extra.TEXT", content);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP2tYdHEzzAfthIz0NZY48uFCHphyK5sfFCWL2/y8eo=", null));
            }
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1062110dkH.class, containerID), "");
            return;
        }
        completionBlock.onFailure(0, "", null);
    }
}
