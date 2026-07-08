package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0wmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793820wmS extends AbstractC1793810wmR {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1793830wmT interfaceC1793830wmT = (InterfaceC1793830wmT) xBaseParamModel;
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).setProductId(interfaceC1793830wmT.getProductId());
        if (TextUtils.isEmpty(interfaceC1793830wmT.getProductId())) {
            C2382909Vj.LIZ(completionBlock, 0, "product_id is null!", null, 4);
        } else {
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1793840wmU.class, null), "");
        }
    }
}
