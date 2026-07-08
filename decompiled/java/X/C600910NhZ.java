package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0NhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600910NhZ extends AbstractC600880NhW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextL3;
        InterfaceC600890NhX interfaceC600890NhX = (InterfaceC600890NhX) xBaseParamModel;
        if (TextUtils.isEmpty(interfaceC600890NhX.getSchema())) {
            completionBlock.onFailure(0, "schema is empty", null);
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (contextL3 = C786410Ut5.L3(activityLJFF)) != null) {
            ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LIZ(contextL3, interfaceC600890NhX.getSchema());
            completionBlock.onFailure(1, "open the promote page", null);
        } else {
            completionBlock.onFailure(0, "context is null", null);
        }
    }
}
