package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.commercialize.shoppingtask.api.IShoppingTaskHostService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0dIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044910dIX extends AbstractC1044920dIY {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1044930dIZ interfaceC1044930dIZ = (InterfaceC1044930dIZ) xBaseParamModel;
        IShoppingTaskHostService iShoppingTaskHostService = (IShoppingTaskHostService) PluggableExtentionKt.pluggableSpi$default(IShoppingTaskHostService.class, false, false, false, 14, null);
        if (iShoppingTaskHostService != null) {
            iShoppingTaskHostService.LIZIZ(new C1867807Tg(interfaceC1044930dIZ.getAccessKey(), interfaceC1044930dIZ.getChannelList()));
        }
    }
}
