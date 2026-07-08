package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.0yrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1873930yrf extends AbstractC1873890yrb {
    public List<String> LLILLL;
    public CompletionBlock<InterfaceC1873910yrd> LLILZ;

    public C1873930yrf() {
        C622680Oba.LIZJ(this);
    }

    @C14EU
    public final void onTermsConditionsNextEvent(C1239030iLd c1239030iLd) {
        CompletionBlock<InterfaceC1873910yrd> completionBlock = this.LLILZ;
        if (completionBlock != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873910yrd.class, null);
            ((InterfaceC1873910yrd) xBaseModelLIZJ).setPrevReactIds(this.LLILLL);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        InterfaceC1873900yrc interfaceC1873900yrc = (InterfaceC1873900yrc) xBaseParamModel;
        this.LLILLL = interfaceC1873900yrc.getPrevReactIds();
        String enterFrom = interfaceC1873900yrc.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = "";
        }
        this.LLILZ = completionBlock;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        } else {
            activityLIZLLL = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZLLL, "//change_account_region/kr_terms_conditions");
        smartRouteBuildRoute.withParam("enter_from", enterFrom);
        smartRouteBuildRoute.open();
    }
}
