package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0yyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878160yyU extends AbstractC1878140yyS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1878150yyT interfaceC1878150yyT = (InterfaceC1878150yyT) xBaseParamModel;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Android currentContext is null", null, 4);
            return;
        }
        String enterFrom = interfaceC1878150yyT.getInfo().getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        Bundle bundle = new Bundle();
        bundle.putInt("email_source", EnumC1237810iJf.GENERAL_POPUP_OPTIONAL.getValue());
        bundle.putBoolean("show_success_toast", false);
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJII().bindEmail(activityLJFF, enterFrom, "click_email", bundle, false, new C19334710kb(completionBlock, this, 6));
    }
}
