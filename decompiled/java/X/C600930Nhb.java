package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0Nhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600930Nhb extends AbstractC600920Nha {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextL3;
        InterfaceC600940Nhc interfaceC600940Nhc = (InterfaceC600940Nhc) xBaseParamModel;
        if (TextUtils.isEmpty(interfaceC600940Nhc.getSchema())) {
            completionBlock.onFailure(0, "schema is empty", null);
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (contextL3 = C786410Ut5.L3(activityLJFF)) != null) {
            ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIJLIJ(contextL3, interfaceC600940Nhc.getSchema());
            completionBlock.onFailure(1, "preload the promote page", null);
        } else {
            completionBlock.onFailure(0, "context is null", null);
        }
    }
}
