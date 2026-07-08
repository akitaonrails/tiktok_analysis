package X;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.AwS141S1100000_27;

/* JADX INFO: renamed from: X.0wsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797600wsY extends AbstractC1797580wsW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        InterfaceC1797590wsX interfaceC1797590wsX = (InterfaceC1797590wsX) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (view != null && view.getContext() != null) {
            C1797630wsb c1797630wsb = new Object() { // from class: X.0wsb
            };
            Context context = view.getContext();
            String message = interfaceC1797590wsX.getMessage();
            String actionText = interfaceC1797590wsX.getActionText();
            c1797630wsb.getClass();
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZIZ(message);
            C985403tE.LIZ(c1397580mTM, new AwS141S1100000_27(actionText, context, 11));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1797610wsZ.class, null);
            InterfaceC1797610wsZ interfaceC1797610wsZ = (InterfaceC1797610wsZ) xBaseModelLIZJ;
            interfaceC1797610wsZ.setCode(1);
            interfaceC1797610wsZ.setMsg("success show alert");
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "jsb state error, view or context null", null, 4);
    }
}
